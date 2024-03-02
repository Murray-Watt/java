package org.mwatt.tutorial.lambda;
import org.junit.jupiter.api.Test;

import java.util.function.*;

@SuppressWarnings({"Convert2MethodRef", "ConstantValue", "CodeBlock2Expr", "unused"})
public class LambdaTest {

    @Test
    public void lambdaExpressionNoParamAndExpression() {
        // Runnable
        Runnable r = () -> System.out.println("Hello, Lambda!");
        r.run();
    }

    // parameter -> expression
    @Test
    public void lambdaExpressionSingleParamAndExpression() {
        // Consumer
        Consumer<String> c = (s) -> System.out.println(s);
        c.accept("Hello, Lambda!");
        c.andThen((s) -> System.out.println(s)).accept("Hello, Lambda!");
    }

    // (parameter1, parameter2) -> expression
    @Test
    public void lambdaExpressionMultipleParamsAndExpression() {
        BiConsumer<String, String> bc = (s1, s2) -> System.out.println(s1 + s2);
        bc.accept("Hello, ", "Lambda!");

        BiFunction<String, String, String> bf = (s1, s2) -> s1 + s2;
        System.out.println(bf.apply("Hello, ", "Lambda!"));

        BiPredicate<String, String> bp = (s1, s2) -> s1.equals(s2);
        System.out.println(bp.test("Hello, ", "Lambda!"));

        BinaryOperator<String> bo = (s1, s2) -> s1 + s2;
        System.out.println(bo.apply("Hello, ", "Lambda!"));
    }

    @Test
    public void curriedFunction() {
        Function<Integer, Function<Integer, Integer>> add = x -> y -> {return x + y;};
        Function<Integer, Integer> add2 = add.apply(2);
        System.out.println(add2.apply(3));
    }

    @FunctionalInterface
    public interface MyFunctionalInterface {
        void myMethod();
    }

    public void lambdaExpressionFunctionalInterface() {
        MyFunctionalInterface f = () -> System.out.println("Hello, Lambda!");
        f.myMethod();
    }

    public static void main(String[] args) {
        LambdaTest test = new LambdaTest();
        test.lambdaExpressionNoParamAndExpression();
        test.lambdaExpressionSingleParamAndExpression();
        test.lambdaExpressionMultipleParamsAndExpression();
        test.curriedFunction();
    }
}

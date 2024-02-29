package org.mwatt.tutorial.variables;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.function.Consumer;

@SuppressWarnings({"unused", "UnnecessaryLocalVariable", "PointlessArithmeticExpression", "ConstantValue", "CommentedOutCode"})
public class LocalVariableTypeInferenceTest {
    Double pi = 3.14159;
    // var x = 10; // Cannot use 'var' on field declaration
    static int a = 10;  // Cannot use 'var' on field declaration

    @Test
    public void variablesExamples() {
        var instance = new LocalVariableTypeInferenceTest();
        Object nullObject = null;
        var var = nullObject;
        var anArray = new int[10];

        var i = 1; // variable i is inferred as int
        var j = 2.0; // j is inferred as double
        var k = 3.0f/2; // k is inferred as float
        byte b = 4;
        var l = 0+b; // l is inferred as int
        var list = new ArrayList<>();
        var list2 = new ArrayList<String>();
        var anArray2 = new String[5];
        list.add("Hello");
        list.add(5);

        var o = list.getFirst(); // o is inferred as Object



        System.out.println("pi: " + instance.pi);

        // Not allowed
        // var j;                          // Cannot infer type for local variable j
        // var j = 20, k = 30;             // Cannot use in compound declaration
        // var j, k = 40;                  // Cannot infer type for local variable j
        // var newVar = null;              // Cannot use null for (cannot infer type) local variable newVar
        // var maArray = {"A", "B", "C"};  // Ca not use var with array initializer
        // var[] maArray = new int[10]      // Cannot use var array declaration

    }

    // Cannot use 'var' on method return type
    //    public static var getVar() {
    //        return new var();
    //    }

    // Cannot use 'var' on method parameter
    //    public static void setVar(var var) {
    //    }

    @Test
    public void inLambdaExpression() {
        Runnable runnable = () -> {
            var x = 10;
            System.out.println("value of x is: " + x);
        };

        var consumer1 = (Consumer<String>) (s) -> System.out.println("value of s is: " + s);

        Consumer<String> consumer2 = (s) -> System.out.println("value of s is: " + s);

        runnable.run();
        consumer1.accept("Hello");
        consumer2.accept("Hello");
    }

    @Test
    public void varLoops() {
        for (var i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        int[] numbers = {1, 2, 3, 4, 5};
        for (var number : numbers) {
            System.out.println("number: " + number);
        }
    }
}

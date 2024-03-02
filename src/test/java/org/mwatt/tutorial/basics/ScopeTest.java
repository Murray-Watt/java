package org.mwatt.tutorial.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings({"unused", "divzero", "SpellCheckingInspection"})
public class ScopeTest {

    @SuppressWarnings("LombokGetterMayBeUsed")
    enum AgeCategory {
        PUPPY(0,2, "puppy"),
        ADULT(3,5, "adult"),
        SENIOR(6,Integer.MAX_VALUE, "senior"),
        UNKNOWN(-1, -1,"unknown");

        // Instance and Class scope
        private final int minAge;
        private final int maxAge;
        private final String categoryName;

        AgeCategory(int minAge, int maxAge, String categoryName) {
            this.minAge = minAge;
            this.maxAge = maxAge;
            this.categoryName = categoryName;
        }

        public int getMaxAge() {
            return maxAge;
        }

        public String toString() {
            return categoryName;
        }

        public static String getAgeDescription(int age) {
            AgeCategory category = ageToCategory(age);
            String categoryName = category.categoryName;

            if (category != UNKNOWN) {
                // Block scope
                int midAge = (category.minAge + category.maxAge) / 2;
                String qualifier = (age < midAge) ? "younger-" : (age == midAge || age == midAge + 1) ? "" : "older-";
                categoryName = qualifier + categoryName;
            }

            return "a " + age + " year old (" + categoryName + ")";
        }

        public static AgeCategory ageToCategory(int age) {
            AgeCategory[] categories = AgeCategory.values();

            AgeCategory result = UNKNOWN;

            if (age != -1) {
                for (/*Loop scope */ AgeCategory category : categories) {
                    // local loop scope
                    int maxAge = Math.min(category.getMaxAge(), category.minAge + 15);
                    if (category.minAge <= age && age <= maxAge) {
                        result = category;
                    }
                }
            }

            return result;
        }
    }

    @SuppressWarnings("LombokSetterMayBeUsed")
    static class Pet {
        // Class scope
        static String species = "Unknown Species";
        String name;
        int age;

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSpecies() {
            return species;
        }

        public String getDescription() {
            String ageDescription = AgeCategory.getAgeDescription(age);

            return name + " is " + ageDescription + " " + getSpecies();
        }

        protected Pet() {
            this.name = "UNKNOWN";
            this.age = -1;
        }

        protected Pet(String name) {
            this.name = name;
            this.age = -1;
        }

        protected Pet(int age) {
            this.name = "UNKNOWN";
            this.age = age;
        }

        protected Pet(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Dog extends Pet {
        protected static String SPECIES_NAME = "Canis Familiaris";

        static {
            species = SPECIES_NAME;
        }

        public Dog() {
            super();
        }

        public Dog(String name) {
            super(name);
        }

        public Dog(int age) {
            super(age);
        }

        public Dog(String name, int age) {
            super(name, age);
        }
    }

    @Test
    public void classScope() {
        Dog phido = new Dog("Phido", 3);
        Dog rover = new Dog("Rover");
        Dog fido = new Dog(5);
        Dog foundling = new Dog();


        System.out.println(phido.getDescription());
        assertEquals("Phido is a 3 year old (younger-adult) Canis Familiaris", phido.getDescription());

        System.out.println(rover.getDescription());
        assertEquals("Rover is a -1 year old (unknown) Canis Familiaris", rover.getDescription());
        rover.setAge(5);
        System.out.println(foundling.getDescription());
        assertEquals("Rover is a 5 year old (adult) Canis Familiaris", rover.getDescription());


        System.out.println(fido.getDescription());
        assertEquals("UNKNOWN is a 5 year old (adult) Canis Familiaris", fido.getDescription());
        fido.setName("Fido");
        assertEquals("Fido is a 5 year old (adult) Canis Familiaris", fido.getDescription());

        System.out.println(foundling.getDescription());
        assertEquals("UNKNOWN is a -1 year old (unknown) Canis Familiaris", foundling.getDescription());
        foundling.setName("Lassie");
        System.out.println(foundling.getDescription());
        assertEquals("Lassie is a -1 year old (unknown) Canis Familiaris", foundling.getDescription());
        foundling.setAge(7);
        System.out.println(foundling.getDescription());
        assertEquals("Lassie is a 7 year old (older-senior) Canis Familiaris", foundling.getDescription());
    }


    static class OuterClass {
        int x = 10;
        int y = 5;

        class MiddleClass {
            int x = 20;

            class InnerClass {
                int x = 30;

                public void printX() {
                    System.out.println("x:" + x);
                    System.out.println("this.x:" + this.x);
                    System.out.println("MiddleClass.this.x:" + MiddleClass.this.x);
                    System.out.println("OuterClass.this.x:" + OuterClass.this.x);
                }

                public void printY() {
                    System.out.println("y:" + y);
                    System.out.println("OuterClass.this.y:" + OuterClass.this.y);
                }
            }
        }
    }

    @Test
    public void nestedScope() {
        OuterClass.MiddleClass.InnerClass inner = new OuterClass().new MiddleClass().new InnerClass();
        inner.printX();
        inner.printY();
    }

    @Test
    public void tryCatchFinallyScope() {
        try {
            // Block scope
            int y = 0;
            int x = 1 / y;
        } catch (/* */ ArithmeticException e) {
            // Block scope
            String exceptionMessage = e.getMessage();
            System.out.println(exceptionMessage);
        } finally {
            // Block scope
            int x = Integer.MAX_VALUE;
            System.out.println("Finally " + x);
        }
    }
}

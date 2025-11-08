package tryCatchQuestions;

public class ReturnInTryFinally {

    // Example to demonstrate return statement in try and finally block
    // Return statement in finally block overrides the return statement in try block
    public static int testMethod() {
        int x=10;
        try {
            System.out.println("In Try Block");
            return x;
        } finally {
            System.out.println("In Finally Block");
            x = 20;
            return x;
        }
    }
    public static void main(String[] args) {
        System.out.println(testMethod());
    }
}

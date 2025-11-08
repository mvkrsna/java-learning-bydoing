package tryCatchQuestions;

public class FinalFinallyFinalizeExample {
    public static void main(String[] args) {
        // final Keyword with methods and variables
        final int constantValue = 100;
        System.out.println("Final Variable: " + constantValue);

        // finally Block Example
        try {
            System.out.println("In Try Block");
        } finally {
            System.out.println("In Finally Block");
        }

        // Finalize Method Example
        FinalFinallyFinalizeExample obj = new FinalFinallyFinalizeExample();
        obj = null;
        System.gc(); // Suggests JVM to run garbage collector
    }
}

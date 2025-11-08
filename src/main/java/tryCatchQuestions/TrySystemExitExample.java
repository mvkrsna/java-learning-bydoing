package tryCatchQuestions;

public class TrySystemExitExample {

    // Example to demonstrate System.exit() in try block
    // finally block will not be executed if System.exit() is called in try block
    public static void main(String[] args) {
        try {
            System.out.println("In Try Block");
            System.exit(0);
        } finally {
            System.out.println("In Finally Block");
        }
    }
}

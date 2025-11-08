package tryCatchQuestions;

public class NestedTryCatchQuestions {

    public static void main(String[] args) {

        try {
            try {
                int value = 10/0;
                System.out.println("Inner Try Block");
            } catch(ArithmeticException e) {
                System.out.println("Arithmetic Exception Caught");
            }
            int array[] = {1,2,3};
            System.out.println(array[5]);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

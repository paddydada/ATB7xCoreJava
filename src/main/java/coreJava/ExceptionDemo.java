package coreJava;

public class ExceptionDemo {

    public static void main(String[] args) {
        int b = 7;
        int c = 0; // This will cause ArithmeticException

        try {
            // This line will throw an ArithmeticException (division by zero)
            int k = b / c;

            // Uncommenting the next line will throw IndexOutOfBoundsException
            // int arr[] = new int[5];
            // System.out.println(arr[7]); // This will throw an IndexOutOfBoundsException

        } catch (ArithmeticException et) {
            // Catches the ArithmeticException (division by zero)
        } catch (IndexOutOfBoundsException ets) {
            // Catches the IndexOutOfBoundsException (invalid array index)
            System.out.println("I caught the IndexOutOfBounds/Exception");

        } catch (Exception e) {
            // This block catches all other exceptions (generic)
            System.out.println("I caught a general error/exception");
        } finally {
            // This block is always executed, whether an exception is thrown or not
            System.out.println("Delete cookies (finally block)");
        }
    }
    }

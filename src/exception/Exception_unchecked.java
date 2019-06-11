package exception;

public class Exception_unchecked {

    /*In the handleExceptions method, handle all unchecked exceptions.
You need to use the printStack method to display the stack trace of each exception that occurs.
You can only use one try-catch block.*/

    public static void main(String[] args) {
        handleExceptions(new  Exception_unchecked());
    }

    public static void handleExceptions( Exception_unchecked obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (NullPointerException e) {
            printStack(e);
        }catch (IndexOutOfBoundsException e){
            printStack(e);
        }catch (NumberFormatException e){
            printStack(e);
        }

    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}


package exception;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.rmi.RemoteException;

public class Exception_checked {
    /*In the handleExceptions method, handle all checked exceptions.
You need to display the checked exception that occurs.
You can only use one try-catch block.*/

    public static void main(String[] args) {
        handleExceptions(new Exception_checked());

    }

    public static void handleExceptions(Exception_checked obj) {

        try {
            obj.method1();
            obj.method2();
            obj.method3();

        } catch (RemoteException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NoSuchFieldException e) {
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}



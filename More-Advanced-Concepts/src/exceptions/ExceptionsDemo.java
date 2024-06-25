package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// exception is an object that provides information about an error
// checked, unchecked, error
public class ExceptionsDemo {
    public static void show() {
        var account = new Account();
        try {
            account.withdraw(20);
        } catch (AccountException e) {
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }
}

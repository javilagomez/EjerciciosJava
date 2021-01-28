package ClaseII_PracticaJavaTT;

import java.io.IOException;

public class PasswordFuerte extends Password{
    public PasswordFuerte() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-_+=()]).{8,20}$");
    }
}

package ClaseII_PracticaJavaTT;

public class PasswordIntermedio extends Password{
    public PasswordIntermedio() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$");
    }
}

package ClaseII_PracticaJavaTT;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        Password passSimple = new PasswordSimple();
        Password passInter = new PasswordIntermedio();
        Password passFuerte = new PasswordFuerte();

        System.out.print("Ingresa tu contraseña: ");
        String pass = scan.next();

        System.out.print("Para formato de contraseña simple: ");
        passSimple.setValue(pass);
        System.out.print("Para formato de contraseña intermedia: ");
        passInter.setValue(pass);
        System.out.print("Para formato de contraseña hardcore: ");
        passFuerte.setValue(pass);
    }
}

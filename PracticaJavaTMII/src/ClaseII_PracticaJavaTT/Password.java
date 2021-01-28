package ClaseII_PracticaJavaTT;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    //Pattern pass = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,20}$");
    private String regex;
    boolean validador;

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }

    public Password(String regex) {
        setRegex(regex);
    }

    public void setValue(String pwd){
        Pattern pattern = Pattern.compile(getRegex());
        Matcher matcher = pattern.matcher(pwd);
        validador = matcher.matches();

        if(!validador){
            throw new RuntimeException("La contraseña no cumple con el formato requerido ");
        }
        System.out.println("La contraseña es correcta");
    }

}

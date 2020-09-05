package com.nisum.RegistroUsuario.Validador;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class ValidadorFormato {


    public boolean ValidacionCorreo(String correo){
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);
        boolean email = false;

        if (mather.find() == true) {
            email = true;
        }

        return email;
    }

    /**
     * Método de validación de password
     * @param password
     * @return boolean
     */
    public boolean ValidacionPassword(String password){
        Pattern pattern = Pattern
                .compile("^(?=\\w*\\d)(?=\\w*[A-Z]{1})(?=\\w*[a-z])\\S{5,16}$");

        Matcher mather = pattern.matcher(password);

        boolean retorno = true;

        if (mather.find() == false) {
            retorno = false;
        }

        return retorno;
    }

}
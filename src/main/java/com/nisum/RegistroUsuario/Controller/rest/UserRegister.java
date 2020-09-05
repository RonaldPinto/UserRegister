package com.nisum.RegistroUsuario.Controller.rest;

import com.nisum.RegistroUsuario.Helpers.DataValidator;
import com.nisum.RegistroUsuario.domain.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class UserRegister {

    @Autowired
    private DataValidator validatorDatos;

    @PostMapping("/registroUsuario")
    public Map<String, Object>  getPersonasResponse(@RequestBody Persons personas) {

        return validatorDatos.isValidate(personas);
    }
}

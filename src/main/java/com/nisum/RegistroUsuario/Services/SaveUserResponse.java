package com.nisum.RegistroUsuario.Services;

import org.springframework.stereotype.Service;


@Service
public class SaveUserResponse {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

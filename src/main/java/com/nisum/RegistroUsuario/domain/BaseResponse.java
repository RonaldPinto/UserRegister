package com.nisum.RegistroUsuario.domain;

import com.nisum.RegistroUsuario.Entity.PersonsEntity;

public class BaseResponse {

    private String message;
    private PersonsEntity data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PersonsEntity getData() {
        return data;
    }

    public void setData(PersonsEntity data) {
        this.data = data;
    }
}

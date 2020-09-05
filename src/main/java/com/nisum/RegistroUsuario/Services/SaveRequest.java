package com.nisum.RegistroUsuario.Services;

import com.nisum.RegistroUsuario.Entity.PersonsEntity;
import com.nisum.RegistroUsuario.domain.Persons;
import com.nisum.RegistroUsuario.Repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SaveRequest {

    @Autowired
    private PersonsRepository repo;

    public PersonsEntity saveData(Persons datos, String id) {

        Date dates = new Date();

        PersonsEntity p = new PersonsEntity();

        p.setUserid(id);
        p.setName(datos.getName());
        p.setEmail(datos.getEmail());
        p.setPassword(datos.getPassword());
        p.setNumber(datos.getPhones().get(0).getNumber());
        p.setCitycode(datos.getPhones().get(0).getCitycode());
        p.setContrycode(datos.getPhones().get(0).getContrycode());
        p.setCreated(dates);
        p.setModified(dates);
        p.setLast_login(dates);
        p.setIsactive("Activo");

        repo.save(p);

        return p;
    }
}
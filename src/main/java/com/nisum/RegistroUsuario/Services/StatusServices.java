package com.nisum.RegistroUsuario.Services;

import com.nisum.RegistroUsuario.Entity.StatusEntity;
import com.nisum.RegistroUsuario.Repository.StatusRepository;
import com.nisum.RegistroUsuario.domain.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StatusServices {

    @Autowired
    private StatusRepository statusRepository;

    public String findStatusByHome(String home) {

        String retorno = "disabled";

        StatusEntity status = statusRepository.findByHome(home);

        Optional<StatusEntity> toggles = status!=null?Optional.of(status):Optional.empty();

        if(toggles.isPresent() && toggles.get().getEnabled() == 1){
            retorno = "enable";
        }

        return retorno;
    }
}

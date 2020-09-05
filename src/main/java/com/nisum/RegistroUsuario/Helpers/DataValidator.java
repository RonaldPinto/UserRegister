package com.nisum.RegistroUsuario.Helpers;

import com.nisum.RegistroUsuario.Entity.MailEntity;
import com.nisum.RegistroUsuario.Entity.PersonsEntity;
import com.nisum.RegistroUsuario.Repository.MailRepository;
import com.nisum.RegistroUsuario.Services.SaveRequest;
import com.nisum.RegistroUsuario.Validador.ValidadorFormato;
import com.nisum.RegistroUsuario.domain.BaseResponse;
import com.nisum.RegistroUsuario.domain.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class DataValidator {

    @Autowired
    private ValidadorFormato validadorFormato;

    @Autowired
    private SaveRequest saveRequest;

    @Autowired
    private MailRepository mailRepository;

    private BaseResponse baseResponse;

    private PersonsEntity response;

    private String MensajeErrorFormato = "";

    Map<String, Object> data = new HashMap<>();

    public Map<String, Object> isValidate(Persons personas){
        data.clear();
        if (!validadorFormato.ValidacionCorreo(personas.getEmail())) {

            MensajeErrorFormato = "Formato de correo eléctronio Incorrecto";

        } else if (!validadorFormato.ValidacionPassword(personas.getPassword())) {

            MensajeErrorFormato = "Formato de contraseña incorrecto";

        } else {

            try {
                MailEntity mailEntity = mailRepository.findByEmail(personas.getEmail());

                if(mailEntity != null){

                    MensajeErrorFormato = "Email ya se encuentra registrado";
                }else {

                    final String requestId = UUID.randomUUID().toString();

                    response = saveRequest.saveData(personas, requestId);
                    MensajeErrorFormato="Ingreso Correcto de los correos";
                    data.put("response",response);
                }

            }catch(NullPointerException e){
            System.out.println("este es el error: " + e);
            }

        }

        data.put("Mensaje", MensajeErrorFormato);

        return data;
    }




}

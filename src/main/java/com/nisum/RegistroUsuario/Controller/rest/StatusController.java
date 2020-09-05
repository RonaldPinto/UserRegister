package com.nisum.RegistroUsuario.Controller.rest;

import com.nisum.RegistroUsuario.Services.HttpParamFromHttpHeaderBuilder;
import com.nisum.RegistroUsuario.Services.StatusServices;
import com.nisum.RegistroUsuario.domain.HeaderParams;
import com.nisum.RegistroUsuario.domain.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/private")
public class StatusController {

    @Autowired
    private StatusServices statusServices;

    @Autowired
    private HttpParamFromHttpHeaderBuilder httpParamFromHttpHeaderBuilder;

    @GetMapping("/status")
    public Status status(@RequestHeader HttpHeaders httpHeaders){

        HeaderParams headerParams = httpParamFromHttpHeaderBuilder.fromHttpHeader(httpHeaders);

       String status = statusServices.findStatusByHome(headerParams.getHome());

       Status statusResponse = new Status();

       statusResponse.setStatus(status);

        return statusResponse;
    }

}

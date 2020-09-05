package com.nisum.RegistroUsuario.Services;

import com.nisum.RegistroUsuario.Constants.Constants;
import com.nisum.RegistroUsuario.domain.HeaderParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Component
public class HttpParamFromHttpHeaderBuilder {

    public HeaderParams fromHttpHeader(HttpHeaders httpHeaders) {

        Map<String, String> headerMap = httpHeaders.toSingleValueMap();

        HeaderParams headerParams = new HeaderParams();

        headerParams.setHome(headerMap.get(Constants.X_HOME_HTTP_HEADER));

        return headerParams;
    }


}

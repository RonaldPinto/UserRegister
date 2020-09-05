package com.nisum.RegistroUsuario.Repository;

import com.nisum.RegistroUsuario.Entity.MailEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailRepository extends CrudRepository<MailEntity, String> {

        MailEntity findByEmail(String email);

}

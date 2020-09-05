package com.nisum.RegistroUsuario.Repository;

import com.nisum.RegistroUsuario.Entity.PersonsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends CrudRepository<PersonsEntity, String> {

}

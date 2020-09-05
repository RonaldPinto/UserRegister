package com.nisum.RegistroUsuario.Repository;

import com.nisum.RegistroUsuario.Entity.StatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends CrudRepository<StatusEntity, String> {

    StatusEntity findByHome(String home);
}

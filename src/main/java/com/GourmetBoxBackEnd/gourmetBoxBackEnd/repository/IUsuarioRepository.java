package com.GourmetBoxBackEnd.gourmetBoxBackEnd.repository;

import com.GourmetBoxBackEnd.gourmetBoxBackEnd.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

//    @Query("SELECT * FROM usuario WHERE username = ?1")
//            public Usuario findByNombre(String username);

}

package com.example.crud.repository;

import com.example.crud.entity.CrudUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.Optional;

public interface CrudUserRepository extends JpaRepository<CrudUser, Serializable> {

    Optional<CrudUser> findByEmail(String email);

    Optional<CrudUser> findByPhone(String mobileNumber);
}

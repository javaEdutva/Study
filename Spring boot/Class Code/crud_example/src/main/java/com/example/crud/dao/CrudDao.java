package com.example.crud.dao;

import com.example.crud.entity.CrudUser;

import java.util.List;

public interface CrudDao {

    CrudUser save(CrudUser crudUser);
    List<CrudUser> getAll();
    CrudUser getById(Long id);
    CrudUser update(Long id, CrudUser crudUser);
    void delete(Long id);
    CrudUser isEmailPresent(String email);
    CrudUser isMobileNumberIsPresent(String mobileNumber);

}

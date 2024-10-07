package com.example.crud.service;


import com.example.crud.dto.ResetPasswordDto;
import com.example.crud.entity.CrudUser;

import java.util.List;

public interface CrudService {

    CrudUser save(CrudUser crudUser);
    List<CrudUser> getAll();
    CrudUser getById(Long id);
    CrudUser update(Long id, CrudUser crudUser);
    void delete(Long id);
    String resetPassword(ResetPasswordDto resetPasswordDto);

}

package com.example.crud.service;

import com.example.crud.dao.CrudDaoImpl;
import com.example.crud.dto.ResetPasswordDto;
import com.example.crud.entity.CrudUser;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CRUD-USER")
@Primary
public class CrudServiceImpl implements CrudService {

    private final CrudDaoImpl crudDao;

    public CrudServiceImpl(CrudDaoImpl crudUserRepository) {
        this.crudDao = crudUserRepository;
    }

    // CRUD Methods

    public CrudUser save(CrudUser crudUser) {
        return crudDao.save(crudUser);
    }

    public List<CrudUser> getAll() {
        return crudDao.getAll();
    }

    public CrudUser getById(Long id) {
        return crudDao.getById(id);
    }

    public CrudUser update(Long id, CrudUser crudUser) {
        return crudDao.update(id, crudUser);
    }

    public void delete(Long id) {
        crudDao.delete(id);
    }

    public String resetPassword(ResetPasswordDto resetPasswordDto) {
        CrudUser crudUser = null;

        if(resetPasswordDto.getEmail() != null) {
            crudUser = crudDao.isEmailPresent(resetPasswordDto.getEmail());
        } else if(resetPasswordDto.getMobileNumber() != null) {
            crudUser = crudDao.isMobileNumberIsPresent(resetPasswordDto.getMobileNumber());
        } else {
            throw new RuntimeException("Invalid email or mobile number");
        }

        if(!crudUser.getPassword().equals(resetPasswordDto.getOldPassword())) {
            throw new RuntimeException("Old password does not match");
        }
        crudUser.setPassword(resetPasswordDto.getNewPassword());

        crudDao.save(crudUser);

        return "Update successful";
    }
}

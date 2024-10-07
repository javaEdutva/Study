package com.example.crud.dao;

import com.example.crud.entity.CrudUser;
import com.example.crud.repository.CrudUserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CrudDaoImpl implements CrudDao {

    private final CrudUserRepository crudUserRepository;

    public CrudDaoImpl(CrudUserRepository crudUserRepository) {
        this.crudUserRepository = crudUserRepository;
    }

    // CRUD Methods

    public CrudUser save(CrudUser crudUser) {
        return crudUserRepository.save(crudUser);
    }

    public List<CrudUser> getAll() {
        return crudUserRepository.findAll();
    }

    public CrudUser getById(Long id) {
        return crudUserRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id not found"));
    }

    public CrudUser update(Long id, CrudUser crudUser) {
        CrudUser userObj = getById(id);
        userObj.setFirstName(crudUser.getFirstName());
        userObj.setLastName(crudUser.getLastName());
        return crudUserRepository.save(userObj);
    }

    public void delete(Long id) {
        crudUserRepository.deleteById(id);
    }

    public CrudUser isEmailPresent(String email) {
        return crudUserRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Email not found"));
    }

    public CrudUser isMobileNumberIsPresent(String mobileNumber) {
        return crudUserRepository.findByPhone(mobileNumber)
                .orElseThrow(() -> new RuntimeException("Mobile number not found"));
    }
}

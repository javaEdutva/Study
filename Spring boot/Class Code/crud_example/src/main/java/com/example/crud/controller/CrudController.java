package com.example.crud.controller;


import com.example.crud.dto.ResetPasswordDto;
import com.example.crud.entity.CrudUser;
import com.example.crud.service.CrudService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crud")
public class CrudController {

    private final CrudService crudService;

    public CrudController(@Qualifier("CRUD-USER") CrudService crudUserRepository) {
        this.crudService = crudUserRepository;
    }

    @GetMapping
    public List<CrudUser> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/{id}")
    public CrudUser getById(@PathVariable Long id) {
        return crudService.getById(id);
    }

    @PostMapping
    public CrudUser create(@RequestBody CrudUser crudUser) {
        return crudService.save(crudUser);
    }

    @PutMapping("/{id}")
    public CrudUser update(@PathVariable Long id ,@RequestBody CrudUser crudUser) {
        return crudService.update(id, crudUser);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        crudService.delete(id);
        return "Deleted Completed";
    }

    @PutMapping("/reset-password")
    public String resetPassword(@RequestBody ResetPasswordDto resetPasswordDto) {
        return crudService.resetPassword(resetPasswordDto);
    }

}

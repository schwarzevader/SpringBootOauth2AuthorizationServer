package com.oauth.springbootoauth2authorizationserver.service.imp;

import com.oauth.springbootoauth2authorizationserver.entity.Role;
import com.oauth.springbootoauth2authorizationserver.repositories.RoleRepository;
import com.oauth.springbootoauth2authorizationserver.service.RoleService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleServiceImp implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public void save(Role role){
        roleRepository.save(role);
    }

    public void deleteRole(Long id){
        roleRepository.deleteById(id);
    }

    public void deleteRole(String name){
        roleRepository.deleteByRole(name);
    }


}

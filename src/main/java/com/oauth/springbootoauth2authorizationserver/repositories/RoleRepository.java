package com.oauth.springbootoauth2authorizationserver.repositories;

import com.oauth.springbootoauth2authorizationserver.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    public void  deleteById(Long id);

    public void deleteByRole(String name);
}

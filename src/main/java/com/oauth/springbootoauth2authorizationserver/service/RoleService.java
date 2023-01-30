package com.oauth.springbootoauth2authorizationserver.service;

import com.oauth.springbootoauth2authorizationserver.entity.Role;

public interface RoleService {
    public void save(Role role);

    public void deleteRole(Long id);

    public void deleteRole(String name);
}

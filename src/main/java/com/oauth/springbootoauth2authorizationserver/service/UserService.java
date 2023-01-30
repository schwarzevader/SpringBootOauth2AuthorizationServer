package com.oauth.springbootoauth2authorizationserver.service;

import com.oauth.springbootoauth2authorizationserver.entity.User;

public interface UserService {

    public void save(User user);

    public User findByEmail(String email);

    public User findById(Long id);

    public void deleteUserByEmail (String mail);
    public void deleteUserByPhoneNumber (String phoneNumber);
    public void deleteUserById (Long id);


}

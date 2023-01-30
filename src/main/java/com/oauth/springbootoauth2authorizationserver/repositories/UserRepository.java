package com.oauth.springbootoauth2authorizationserver.repositories;

import com.oauth.springbootoauth2authorizationserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {

    public void deleteUserByEmail (String mail);
    public void deleteUserByPhoneNumber (String phoneNumber);
    public void deleteUserById (Long id);

    public User findByEmail(String mail);

    public User findUserById(Long id);
    public User findByPhoneNumber(String phoneNumber);


}

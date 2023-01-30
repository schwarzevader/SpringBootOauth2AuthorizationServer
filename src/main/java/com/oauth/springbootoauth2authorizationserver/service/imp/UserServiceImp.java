package com.oauth.springbootoauth2authorizationserver.service.imp;

import com.oauth.springbootoauth2authorizationserver.entity.User;
import com.oauth.springbootoauth2authorizationserver.repositories.UserRepository;
import com.oauth.springbootoauth2authorizationserver.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImp implements UserService {
    private UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }

    public User findByEmail(String email){
       return userRepository.findByEmail(email);
    }

    public User findById(Long id){
        return userRepository.findUserById(id);
    }

    public void deleteUserByEmail (String mail){
        userRepository.deleteUserByEmail(mail);
    }
    public void deleteUserByPhoneNumber (String phoneNumber){
        userRepository.deleteUserByPhoneNumber(phoneNumber);
    }
    public void deleteUserById (Long id){
        userRepository.deleteUserById(id);
    }
}

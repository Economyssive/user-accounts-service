package me.nurio.economyssive.users.persistance.services;

import me.nurio.economyssive.users.persistance.entities.UserEntity;
import me.nurio.economyssive.users.persistance.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired private UserRepository userRepository;

    public UserEntity getUser(String email) {
        return userRepository.findByEmail(email);
    }

    public void saveUser(UserEntity user) {
        userRepository.save(user);
    }

}
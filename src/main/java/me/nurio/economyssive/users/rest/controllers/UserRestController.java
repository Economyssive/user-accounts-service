package me.nurio.economyssive.users.rest.controllers;


import me.nurio.economyssive.users.persistance.entities.UserEntity;
import me.nurio.economyssive.users.persistance.services.UserService;
import me.nurio.economyssive.users.rest.responses.UserResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserRestController {

    @Autowired private UserService userService;

    @GetMapping("/{email:[\\w]+}")
    public UserResponse getUserByEmail(String email) {
        UserEntity userEntity = userService.getUser(email);
        UserResponse userResponse = new UserResponse();

        BeanUtils.copyProperties(userEntity, userResponse);
        return userResponse;
    }

}
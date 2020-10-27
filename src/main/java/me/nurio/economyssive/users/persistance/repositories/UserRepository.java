package me.nurio.economyssive.users.persistance.repositories;


import me.nurio.economyssive.users.persistance.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findById(int id);

    UserEntity findByEmail(String email);

    UserEntity findByUsernameContaining(String username);

}
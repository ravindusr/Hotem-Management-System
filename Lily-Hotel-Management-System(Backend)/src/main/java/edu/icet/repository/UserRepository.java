package edu.icet.repository;

import edu.icet.entity.UserEntity;

import java.util.Optional;

public interface UserRepository {

    boolean existsByEmail(String email);

    Optional<UserEntity> findByEmail(String email);
}

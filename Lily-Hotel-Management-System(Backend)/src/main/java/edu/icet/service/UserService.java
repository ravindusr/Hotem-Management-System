package edu.icet.service;

import edu.icet.dto.LoginRequest;
import edu.icet.dto.Response;
import edu.icet.entity.UserEntity;

public interface UserService {

    Response register(UserEntity user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}

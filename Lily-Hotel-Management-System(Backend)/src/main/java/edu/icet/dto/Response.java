package edu.icet.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private int statusCode;
    private String message;
    private String token;
    private String role;
    private String expirationTime;
    private String bookingConfirmationCode;
    private User user;
    private Room room;
    private Booking booking;
    private List<User> userList;
    private List<Room> roomList;
    private List<Booking> bookingList;
}

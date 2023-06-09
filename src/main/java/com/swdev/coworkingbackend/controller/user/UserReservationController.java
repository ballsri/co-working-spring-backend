package com.swdev.coworkingbackend.controller.user;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/user/{userId}/reservation")
public class UserReservationController {
    @GetMapping("/")
    public String getAllUserReservations(@PathVariable String userId){
        return String.format("all user reservations of user %s", userId);
    }

    @PutMapping("/{reservationId}")
    public String updateUserReservation(@PathVariable String userId, @PathVariable String reservationId){
        return String.format("update user %s 's reservation %s", userId, reservationId);
    }

    @DeleteMapping("/{reservationId}")
    public String deleteUserReservation(@PathVariable String userId, @PathVariable String reservationId){
        return String.format("delete user %s 's reservation %s", userId, reservationId);
    }
}

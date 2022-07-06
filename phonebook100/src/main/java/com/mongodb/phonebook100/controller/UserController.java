package com.mongodb.phonebook100.controller;

import com.mongodb.phonebook100.entity.User;
import com.mongodb.phonebook100.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable("id") String id) {
        User user = userService.getById(id);
        if (user != null)
            return ResponseEntity.ok(user);
        return new ResponseEntity("User cannot be found by gıven ıd " +id,HttpStatus.BAD_REQUEST);
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAll(){

        return ResponseEntity.ok(userService.getAll())  ;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable("id") String id){

        return ResponseEntity.ok(userService.deleteUser(id));

    }




    @PostMapping()
    public ResponseEntity<User> save(@RequestBody User user) {
        User savedUser = this.userService.save(user);
        return ResponseEntity.ok(savedUser);
    }


}

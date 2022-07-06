package com.mongodb.phonebook100.service;

import com.mongodb.phonebook100.entity.User;
import com.mongodb.phonebook100.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Override

    public User getById(String id) {

        Optional<User> user = this.userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }
        return null;

    }

    @Override
    public Boolean deleteUser(String id) {
           User user = this.getById(id);
           if (user==null){
               return false;
           }

            userRepository.delete(user);
            return  true;
    }

    @Override
    public List<User> getAll() {

        return this.userRepository.findAll();
    }
}

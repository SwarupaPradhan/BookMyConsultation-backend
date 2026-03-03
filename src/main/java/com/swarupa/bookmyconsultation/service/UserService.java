package com.swarupa.bookmyconsultation.service;

import com.swarupa.bookmyconsultation.entity.User;
import com.swarupa.bookmyconsultation.exception.InvalidInputException;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.UUID;

@Service
public class UserService {

    public User createUser(User newUser) throws InvalidInputException {
        // Example: set creation date as ISO string
        newUser.setCreatedDate(ZonedDateTime.now().toString());

        // Hash password and salt (pseudo code)
        String salt = UUID.randomUUID().toString();
        newUser.setSalt(salt);
        newUser.setPassword(hashPassword(newUser.getPassword(), salt));

        // Save user to DB (repository call)
        // userRepository.save(newUser);

        return newUser;
    }

    private String hashPassword(String password, String salt) {
        // implement hashing logic here
        return password + salt; // placeholder
    }

}

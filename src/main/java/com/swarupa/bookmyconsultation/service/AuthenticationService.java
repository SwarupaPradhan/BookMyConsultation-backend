package com.swarupa.bookmyconsultation.service;

import com.swarupa.bookmyconsultation.entity.User;
import com.swarupa.bookmyconsultation.entity.UserAuthToken;
import org.springframework.stereotype.Service;
import java.time.ZonedDateTime;


@Service
public class AuthenticationService {

    public void authenticate(User user, UserAuthToken userAuthToken) {
        String email = user.getEmail();
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        String mobile = user.getMobile();
        String password = user.getPassword();
        String salt = user.getSalt();

        String accessToken = userAuthToken.getAccessToken();
        ZonedDateTime expiresAt = userAuthToken.getExpiresAt();
        ZonedDateTime logoutAt = userAuthToken.getLogoutAt();

        // Your authentication logic
    }
}

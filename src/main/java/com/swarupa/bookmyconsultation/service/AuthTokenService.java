package com.swarupa.bookmyconsultation.service;

import com.swarupa.bookmyconsultation.entity.User;
import com.swarupa.bookmyconsultation.entity.UserAuthToken;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.UUID;

@Service
public class AuthTokenService {

    public UserAuthToken generateToken(User user) {
        UserAuthToken authTokenEntity = new UserAuthToken();
        authTokenEntity.setUser(user);
        authTokenEntity.setAccessToken(UUID.randomUUID().toString());
        authTokenEntity.setLoginAt(ZonedDateTime.now());
        authTokenEntity.setExpiresAt(ZonedDateTime.now().plusHours(1));

        return authTokenEntity;
    }

    public void logout(UserAuthToken userAuthToken) {
        userAuthToken.setLogoutAt(ZonedDateTime.now());
    }
}

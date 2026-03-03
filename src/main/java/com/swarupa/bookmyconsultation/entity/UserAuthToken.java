package com.swarupa.bookmyconsultation.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.ZonedDateTime;

@Getter
@Setter
@Entity
@Table(name = "user_auth_tokens")
public class UserAuthToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private String accessToken;
    private ZonedDateTime loginAt;
    private ZonedDateTime expiresAt;
    private ZonedDateTime logoutAt;

}

package me.kyj.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class RefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "user_id", nullable = true)
    private Long userId;

    @Column(name = "refresh_token", nullable = false)
    private String refreshtoken;

    public RefreshToken(Long userId, String refreshtoken) {
        this.userId = userId;
        this.refreshtoken = refreshtoken;
    }

    public RefreshToken update(String newRefreshToken) {
        this.refreshtoken = newRefreshToken;
        return this;
    }

}

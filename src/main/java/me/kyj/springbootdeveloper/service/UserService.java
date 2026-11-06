package me.kyj.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.kyj.springbootdeveloper.domain.User;
import me.kyj.springbootdeveloper.dto.AddArticleRequest;
import me.kyj.springbootdeveloper.dto.AddUserRequest;
import me.kyj.springbootdeveloper.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public Long save(AddUserRequest dto) {
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }

}

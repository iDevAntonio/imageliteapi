package io.github.idevantonio.imageliteapi.application.users;

import io.github.idevantonio.imageliteapi.domain.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User mapToUser(UserDTO dto) {
        return User.builder()
                .email(dto.getEmail())
                .username(dto.getName())
                .password(dto.getPassword()).build();
    }
}

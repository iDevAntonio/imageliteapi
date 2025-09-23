package io.github.idevantonio.imageliteapi.domain.service;

import io.github.idevantonio.imageliteapi.domain.AccessToken;
import io.github.idevantonio.imageliteapi.domain.entity.User;

public interface UserService {
    User getByEmail(String email);
    User save(User user);
    AccessToken authenticate(String email, String password);
}

package io.github.idevantonio.imageliteapi.application.users;

import io.github.idevantonio.imageliteapi.domain.AccessToken;
import io.github.idevantonio.imageliteapi.domain.entity.User;
import io.github.idevantonio.imageliteapi.domain.exception.DuplicatedTupleException;
import io.github.idevantonio.imageliteapi.domain.service.UserService;
import io.github.idevantonio.imageliteapi.infra.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository UserRepository;
    @Override
    public User getByEmail(String email) {
        return UserRepository.findByEmail(email);
    }

    @Override
    @Transactional
    public User save(User user) {
        var possibleUser = getByEmail(user.getEmail());
        if (possibleUser != null) {
            throw new DuplicatedTupleException("User Alredy exists!");
        }
        return UserRepository.save(user);
    }

    @Override
    public AccessToken authenticate(String email, String password) {
        return null;
    }
}

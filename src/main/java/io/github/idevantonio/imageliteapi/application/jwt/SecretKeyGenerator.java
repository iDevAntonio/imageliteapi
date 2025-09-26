package io.github.idevantonio.imageliteapi.application.jwt;

import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;

@Component
public class SecretKeyGenerator {

    public SecretKey key;

    public SecretKey getKey() {
        if (key == null) {
            key = Jwts.SIG.HS256.key().build();
        }
        return key;
    }
}

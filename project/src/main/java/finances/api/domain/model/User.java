package finances.api.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
public class User {
    private final UUID id;
    private final String name;
    @Setter
    private String email;
    @Setter
    private String password;

    public User(String name, String email, String password) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be null or blank");
        if (email == null || !email.contains("@")) throw new IllegalArgumentException("Invalid email");

        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.password = password;
    }
}

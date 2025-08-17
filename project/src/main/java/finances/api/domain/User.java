package finances.api.domain;

import lombok.*;

import java.util.UUID;

@Data
public class User {
    private UUID id;
    private String name;
    private String email;
    private String password;
}

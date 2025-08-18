package finances.api.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class UserDTO {
    private UUID id;
    private String name;
    private String email;
}

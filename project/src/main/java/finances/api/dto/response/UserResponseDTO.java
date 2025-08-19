package finances.api.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class UserResponseDTO {
    private UUID id;
    private String name;
    private String email;
}

package finances.api.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class CategoryTransactionResponseDTO {
    private UUID id;
    private String category;
}

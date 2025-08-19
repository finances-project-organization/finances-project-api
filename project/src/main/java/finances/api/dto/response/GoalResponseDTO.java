package finances.api.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@Data
public class GoalResponseDTO {
    private UUID id;
    private Double amount;
    private LocalDate creationDate;
    private LocalDate deadline;
    private String description;
}

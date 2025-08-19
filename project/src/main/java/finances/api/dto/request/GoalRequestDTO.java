package finances.api.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class GoalRequestDTO {
    private Double amount;
    private LocalDate creationDate;
    private LocalDate deadline;
    private String description;
}

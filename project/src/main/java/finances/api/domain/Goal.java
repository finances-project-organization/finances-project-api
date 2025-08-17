package finances.api.domain;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class Goal {
    private UUID id;
    private Double amount;
    private LocalDate creationDate;
    private LocalDate deadline;
    private String description;
}

package finances.api.domain.model;

import java.time.LocalDate;
import java.util.UUID;

public class Goal {
    private UUID id;
    private Double amount;
    private LocalDate creationDate;
    private LocalDate deadline;
    private String description;
    private UUID userId;
}

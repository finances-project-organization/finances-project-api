package finances.api.domain.model;

import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
public class Goal {
    private final UUID id;
    private Double amount;
    private final LocalDate startDate;
    private final LocalDate deadline;
    private String description;
    private final UUID userId;

    public Goal(UUID id, Double amount, LocalDate startDate, LocalDate deadline, String description, UUID userId) {
        if (amount <= 0) throw new IllegalArgumentException("The amount must be positive");
        if (startDate == null || startDate.isBefore(LocalDate.now())) throw new IllegalArgumentException("Invalid start date");
        if (deadline == null || deadline.isBefore(LocalDate.now())) throw new IllegalArgumentException("Date is mandatory");
        if (startDate.isBefore(LocalDate.now())) throw new IllegalArgumentException("Invalid start date");
        if (deadline.isBefore(startDate)) throw new IllegalArgumentException("Deadline cannot be earlier than start date");
        if (userId == null) throw new IllegalArgumentException("User is mandatory");

        this.id = id == null ? UUID.randomUUID() : id;
        this.amount = amount;
        this.startDate = startDate;
        this.deadline = deadline;
        this.description = description != null ? description : "";
        this.userId = userId;
    }

    public void changeAmount(Double amount) {
        if (amount <= 0) throw new IllegalArgumentException("The amount must be positive");
        this.amount = amount;
    }

    public void changeDescription(String description) {
        this.description = description != null ? description : "";
    }
}

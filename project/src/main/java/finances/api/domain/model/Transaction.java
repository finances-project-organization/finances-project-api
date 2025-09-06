package finances.api.domain.model;

import finances.api.enums.TransactionsEnum;
import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
public class Transaction {
    private final UUID id;
    private Double amount;
    private final TransactionsEnum type;
    private final String category;
    private final LocalDate date;
    private String description;
    private final UUID userId;

    public Transaction(UUID id, Double amount, TransactionsEnum type, String category, LocalDate date, String description, UUID userId) {
        if (amount <= 0) throw new IllegalArgumentException("The amount must be positive");
        if (type == null) throw new IllegalArgumentException("Type is mandatory");
        if (category == null || category.isBlank()) throw new IllegalArgumentException("Category is mandatory");
        if (date == null) throw new IllegalArgumentException("Date is mandatory");
        if (userId == null) throw new IllegalArgumentException("User is mandatory");

        this.id = id == null ? UUID.randomUUID() : id;
        this.amount = amount;
        this.type = type;
        this.category = category;
        this.date = date;
        this.description = description != null ? description : "";
        this.userId = userId;
    }

    public void changeAmount(Double amount) {
        if (amount <= 0) throw new IllegalArgumentException("The amount must be positive");
        this.amount = amount;
    }

    public void changeDescription(String description) {
        this.description = (description != null) ? description : "";
    }
}

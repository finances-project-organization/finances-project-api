package finances.api.domain.model;

import finances.api.enums.TransactionsEnum;

import java.time.LocalDate;
import java.util.UUID;

public class Transaction {
    private UUID id;
    private Double amount;
    private TransactionsEnum type;
    private String category;
    private LocalDate date;
    private String description;
    private UUID userId;
}

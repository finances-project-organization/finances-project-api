package finances.api.domain;

import finances.api.enums.TransactionsEnum;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class Transaciton {
    private UUID id;
    private Double amount;
    private TransactionsEnum type;
    private String category;
    private LocalDate date;
    private String description;
}

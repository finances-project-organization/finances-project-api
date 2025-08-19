package finances.api.dto.request;

import finances.api.enums.TransactionsEnum;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class TransactionRequestDTO {
    private Double amount;
    private TransactionsEnum type;
    private UUID categoryTransactionId;
    private LocalDate date;
    private String description;
}

package finances.api.dto.response;

import finances.api.enums.TransactionsEnum;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@Data
public class TransactionResponseDTO {
    private UUID id;
    private Double amount;
    private TransactionsEnum type;
    private String category;
    private LocalDate date;
    private String description;
}

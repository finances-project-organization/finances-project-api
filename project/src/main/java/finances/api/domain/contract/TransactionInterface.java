package finances.api.domain.contract;

import finances.api.domain.model.Transaction;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface TransactionInterface {
    Transaction findById(UUID id);
    List<Transaction> findAllByUserId(UUID userId);
    List<Transaction> findByDate(LocalDate date);
    Transaction update(Transaction transaction);
    void save(Transaction transaction);
    void delete(Transaction transaction);
}

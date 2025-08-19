package finances.api.repository.impl;

import finances.api.domain.contract.TransactionInterface;
import finances.api.domain.model.Transaction;
import finances.api.repository.jpa.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class TransactionImpl implements TransactionInterface {

    private final TransactionRepository repository;

    @Override
    public Transaction findById(UUID id) {
        return null;
    }

    @Override
    public List<Transaction> findAllByUserId(UUID userId) {
        return null;
    }

    @Override
    public List<Transaction> findByDate(LocalDate date) {
        return null;
    }

    @Override
    public Transaction update(Transaction transaction) {
        return null;
    }

    @Override
    public void save(Transaction transaction) {

    }

    @Override
    public void delete(Transaction transaction) {

    }
}

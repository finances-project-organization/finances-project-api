package finances.api.repository.impl;

import finances.api.domain.contract.UserInterface;
import finances.api.domain.model.User;
import finances.api.repository.jpa.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class UserImpl implements UserInterface {

    private final UserRepository repository;

    @Override
    public User findById(UUID id) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public void save(User user) {

    }
}

package finances.api.domain.contract;

import finances.api.domain.model.User;

import java.util.UUID;

public interface UserInterface {
    User findById(UUID id);
    void delete(UUID id);
    User update(User user);
    void save(User user);
}

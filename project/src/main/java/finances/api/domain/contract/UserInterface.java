package finances.api.domain.contract;

import finances.api.domain.model.User;
import finances.api.entity.UserEntity;

import java.util.UUID;

public interface UserInterface {
    User findById(UUID id);
    void delete(UUID id);
    User save(User user);
    User update(User updatedUser, UserEntity dbUser);
}

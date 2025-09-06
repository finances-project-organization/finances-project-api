package finances.api.repository.impl;

import finances.api.domain.contract.UserInterface;
import finances.api.domain.model.User;
import finances.api.entity.UserEntity;
import finances.api.mapper.UserMapper;
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
        UserEntity user = repository.findById(id).orElse(null);
        return user != null ? UserMapper.toUser(user) : null;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = UserMapper.toCreateUserEntity(user);
        UserEntity savedUser = repository.save(userEntity);
        return UserMapper.toUser(savedUser);
    }

    @Override
    public User update(User updatedUser, UserEntity dbUser) {
        UserEntity userEntity = UserMapper.toUpdateUserEntity(updatedUser, dbUser);
        UserEntity savedUser = repository.save(userEntity);
        return UserMapper.toUser(savedUser);
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}

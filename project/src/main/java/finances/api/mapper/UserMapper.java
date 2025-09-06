package finances.api.mapper;

import finances.api.domain.model.User;
import finances.api.dto.request.UserRequestDTO;
import finances.api.entity.UserEntity;

import java.util.Collections;

public class UserMapper {
    public static User toUser(UserEntity user) {
        return User.reconstitute(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPassword()
        );
    }

    public static UserEntity toCreateUserEntity(User user) {
        return new UserEntity(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPassword(),
                Collections.emptyList(),
                Collections.emptyList()
        );
    }

    public static UserEntity toUpdateUserEntity(User updatedUser,UserEntity dbUser) {
        dbUser.setName(updatedUser.getName());
        dbUser.setEmail(updatedUser.getEmail());
        dbUser.setPassword(updatedUser.getPassword());
        return dbUser;
    }

    public static User toUser(UserRequestDTO userRequestDTO) {
        return User.create(
                userRequestDTO.getName(),
                userRequestDTO.getEmail(),
                userRequestDTO.getPassword()
        );
    }
}

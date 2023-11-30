package ssion.ssion.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ssion.ssion.user.dto.UserDTO;
import ssion.ssion.user.model.User;
import ssion.ssion.user.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Long createUser(UserDTO userDTO) {
        User entity = userDTO.toEntity();

        User save = userRepository.save(entity);

        return save.getId();
    }
}

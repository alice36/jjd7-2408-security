package pl.javastart.sechello.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.javastart.sechello.model.User;
import pl.javastart.sechello.model.UserRole;
import pl.javastart.sechello.repository.UserRepository;
import pl.javastart.sechello.repository.UserRoleRepository;

@Service
public class UserService {

    private UserRepository userRepository;
    private UserRoleRepository userRoleRepository;

    private PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, UserRoleRepository userRoleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void addUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        user.setEnabled(true);

        UserRole userRole = new UserRole();
        userRole.setUsername(username);
        userRole.setRole("ROLE_USER");

        userRepository.save(user);
        userRoleRepository.save(userRole);
    }
}

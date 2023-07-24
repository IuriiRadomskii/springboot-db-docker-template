package com.example.reactdemoback;

import com.example.reactdemoback.security.model.entity.User;
import com.example.reactdemoback.security.model.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AllArgsConstructor
@SpringBootApplication
public class ReactDemoBackApplication implements CommandLineRunner {

    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(ReactDemoBackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User(null, "admin", "adminPass", "Sasha", "Kot", "ROLE_ADMIN"));
        userRepository.save(new User(null, "super", "superPass", "Mega", "Chonk", "ROLE_SUPER"));
        userRepository.save(new User(null, "user1", "user1Pass", "Kate", "Kate", "ROLE_USER"));
        userRepository.save(new User(null, "user2", "user2Pass", "Yura", "Yura", "ROLE_USER"));
    }
}

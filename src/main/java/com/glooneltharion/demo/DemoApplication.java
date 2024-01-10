package com.glooneltharion.demo;

import com.glooneltharion.demo.model.User;
import com.glooneltharion.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public DemoApplication(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
       User user = new User();
        user.setName("Gloo");
        user.setPassword(passwordEncoder.encode("123"));
        user.setEmail("gloo@neltharion.com");
        user.setRoles("ROLE_USER");

        //userRepository.save(user);
    }
}

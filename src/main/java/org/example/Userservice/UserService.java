package org.example.Userservice;

public class UserService {
    private EmailService emailService;
    private UserRepository userRepository;

    public UserService(EmailService emailService, UserRepository userRepository) {
        this.emailService = emailService;
        this.userRepository = userRepository;
    }

    public void registerUser(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        userRepository.save(email);
        emailService.sendWelcomeEmail(email);
    }
}

package org.example.Userservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)


class UserServiceTest {

    @Mock
    private UserRepository userRepository;
    @Mock
    private EmailService emailService;
    @InjectMocks
    private UserService userService;

    @Test
    void  userservice(){

      assertThrows(IllegalArgumentException.class,()->userService.registerUser(null));
        assertThrows(IllegalArgumentException.class,()->userService.registerUser("koulopif"));
userService.registerUser("andouemmanuel@gmail.com");
verify(userRepository).save("andouemmanuel@gmail.com");
verify(emailService).sendWelcomeEmail("andouemmanuel@gmail.com");

    }
}
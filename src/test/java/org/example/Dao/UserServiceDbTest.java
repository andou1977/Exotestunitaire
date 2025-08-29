package org.example.Dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserServiceDbTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserServiceDb userServiceDb;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getusername(){
        when(userRepository.findUserById(1L)).thenReturn(new User(1L,"andou"));
        assertEquals("andou",userServiceDb.getUserName(1L));


        assertEquals("Unknown",userServiceDb.getUserName(2L));
    }
}

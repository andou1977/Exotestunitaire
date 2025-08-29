package org.example.ApiRest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserApiServiceTest {


    @Mock
    ApiClient apiClient;

    @InjectMocks
    UserApiService userApiService;


    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }



    @Test
    void fetchuser(){
        when(apiClient.getUserData("C001")).thenReturn("C001");
    assertEquals("C001",userApiService.fetchUser("C001"));
    }

}

package com.example.demo.service;

import com.example.demo.repository.MediaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class MediaServiceTest {

    @Mock
    MediaService mediaService;

    @Test
    void create() {
        Mockito.when(mediaService.create()).thenReturn(new Media);
    }

    @Test
    void read() {

    }

    @Test
    void update() {

    }

    @Test
    void delete() {

    }

}
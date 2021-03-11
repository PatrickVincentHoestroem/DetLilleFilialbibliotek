package com.example.demo.service;

import com.example.demo.model.Media;
import com.example.demo.repository.MediaRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class MediaServiceTest {

    private ArrayList<Media> list;
    Media mockmedia;
    @Mock
    MediaRepository mediaRepository;
    @InjectMocks
    MediaService mediaService;

    @BeforeAll
    void preSetup() {
        mockmedia = new Media("testmedia", "audio", "1234567", 33.33);
        // Mockito.when(mediaRepository.add(mockmedia)).then(list.add(mockmedia));

    }

    @Test
    void create() {
        mediaService.create("testmedia", "audio", "1234567", 33.33);
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
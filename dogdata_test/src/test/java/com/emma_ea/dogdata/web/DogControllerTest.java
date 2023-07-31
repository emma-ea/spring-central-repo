package com.emma_ea.dogdata.web;

import com.emma_ea.dogdata.entity.Dog;
import com.emma_ea.dogdata.service.DogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DogController.class)
class DogControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    DogService service;

    @Test
    public void getAllDogs() throws Exception {
        mockMvc.perform(get("/api/v1/dogs/all"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[]"));

        verify(service, times(1)).retrieveAll();
    }

    @Test
    public void retrieveById() throws Exception {
        Dog mockDog = new Dog();
        mockDog.setId(1L);
        when(service.retrieveById(1L)).thenReturn(java.util.Optional.of(mockDog));

        mockMvc.perform(get("/api/v1/dogs/id").queryParam("id", "1"))
                .andExpect(status().isOk());

        verify(service, times(1)).retrieveById(1L);
    }

}
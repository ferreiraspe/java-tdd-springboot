package com.edson.tdd;

import com.edson.tdd.controller.BookingController;
import com.edson.tdd.repository.BookingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class BookingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    BookingRepository bookingRepository;

    @Test
    public void bookingTestGetAll() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/bookings"))
               .andExpect(MockMvcResultMatchers.status().isOk());
    }
}

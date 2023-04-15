package com.habit.tracker.controller;

import com.habit.tracker.service.HabitService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(SpringExtension.class)
@WebMvcTest(value = HabitTrackerController.class)
class HabitTrackerControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    HabitService habitService;

    @Test
    public void testSaveHabit() throws Exception {
        String uri = "/habit";

        RequestBuilder requestBuilder = MockMvcRequestBuilders.post(uri)
                .content("{\"name\":\"Sumitava\"}")
                .contentType("application/json")
                .accept(MediaType.APPLICATION_JSON_VALUE);
        MvcResult mvcResult = mvc.perform(requestBuilder).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }

}
package com.pruebatecnica.pruebatecnica;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class PruebatecnicaApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() {
    }

    @Test
    void validateControllerMovimiento() throws Exception{
        this.mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("http://localhost:8080/api/movimiento/consultar?fechaInicio=20210512&fechaFinal=20220612&identificacion=123456"))
                .andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("Hello World")));
    }



}

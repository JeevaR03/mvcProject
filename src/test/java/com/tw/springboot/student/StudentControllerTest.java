package com.tw.springboot.student;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import java.util.List;
@RunWith(SpringRunner.class)
@WebMvcTest(value =StudentController.class)
public class StudentControllerTest{
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private StudentService studentService;


    @Test
    public void getStudents() throws Exception{
        Student mockStudent=new Student("Jeeva", "jeevanadar1998@gmail.com");

        String exampleStudentJson = "{\"studentId\":1\"name\":\"Jeeva\",\"studentEmail\":\"jeevanadar1998@gmail.com\"}";
        Mockito.when(studentService.getStudents()).thenReturn((List<Student>) mockStudent);
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/class/students");
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());




    }
}
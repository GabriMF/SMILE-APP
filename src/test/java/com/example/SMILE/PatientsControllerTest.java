// package com.example.SMILE;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;
// import org.mockito.junit.MockitoJUnitRunner;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.test.web.servlet.MockMvc;

// import org.springframework.test.web.servlet.setup.MockMvcBuilders;

// import com.example.SMILE.controllers.PatientsController;
// import com.example.SMILE.services.PatientsService;


// @RunWith(MockitoJUnitRunner.class)
// public class PatientsControllerTest {

//     @Autowired
//     // private MockMvc mockMvc;

//     @InjectMocks
//     private PatientsController patientsController;

//     @Mock
//     PatientsService patientsService;

//     @BeforeEach
//     public void setUp() throws Exception  {
//         MockitoAnnotations.openMocks(this);
//         this.mockMvc = MockMvcBuilders.standaloneSetup(patientsController).build();
//     }

//     @Test
//     public void patientsController_should_have_api_route() throws Exception {
        
//     }

    // @Test
    // public void patientsController_should_have_api_route() throws Exception {
    //     mockMvc.perform(MockMvcRequestBuilders
    //     .get("/api/patients"));
    // }
//}

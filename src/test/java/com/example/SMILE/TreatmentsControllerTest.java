// package com.example.SMILE;

// import static org.mockito.Mockito.when;

// import java.util.ArrayList;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;
// import org.mockito.junit.MockitoJUnitRunner;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import org.springframework.mock.web.MockHttpServletResponse;
// import org.springframework.stereotype.Service;
// import org.springframework.test.web.servlet.MockMvc;

// import org.springframework.test.web.servlet.setup.MockMvcBuilders;

// import com.example.SMILE.controllers.PatientsController;
// import com.example.SMILE.controllers.TreatmentsController;
// import com.example.SMILE.models.Treatments;
// import com.example.SMILE.services.PatientsService;

// import antlr.collections.List;


// @WebMvcTest(TreatmentsController.class)
// @AutoConfigureMockMvc(addFilters = false)
// public class TreatmentsControllerTest {

//     @Autowired
//     private MockMvc mockMvc;

//     @MockBean
//     private TreatmentsController treatmentsController;

//     @Test
//     void should_return_api_and_statusOk() throws Exception  {
//         List<Treatments> list = new ArrayList<>();
//         Treatments treatment1 = new Treatments("U92930304I", "Surgery");
//         Treatments treatment2 = new Treatments("N94895056G", "Smile design");
        
//         treatment1.setId(1L);
//         treatment2.setId(2L);
        
//         list.add(treatment1);
//         list.add(treatment2);

//         when(treatmentsController.getAll()).thenReturn(list);
//         MockHttpServletResponse response = mockMvc.perform(get("api/treatments"));

//     } 


// }

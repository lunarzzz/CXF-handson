package com.pipibing.handson.api;


import com.pipibing.handson.model.Student;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/student")
@Service
public interface StudentService {

    @POST
    @Path("/getStudent")
    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
    Student getStudent(Student a);
}

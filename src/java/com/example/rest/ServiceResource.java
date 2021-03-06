package com.example.rest;

import com.example.object.Person;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Student
 */
@Path("service")
@Stateless
public class ServiceResource {

    @GET
    @Path("getperson/{age}/{firstname}/{lastname}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Person getPerson(
            @PathParam(value = "age") int age, 
            @PathParam(value = "firstname") String firstname, 
            @PathParam(value = "lastname") String lastname) {
        return new Person(age, firstname, lastname);
    }

}

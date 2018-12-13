package com.savemepro.test1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/addContact")
public class AddContactRest {

    @GET
    public String doGet() {
        return "toto";
    }

}

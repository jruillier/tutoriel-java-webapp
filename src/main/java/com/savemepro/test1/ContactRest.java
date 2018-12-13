package com.savemepro.test1;

import javax.ws.rs.*;

@Path("/contact")
public class ContactRest {

    @Path("/add")
    @POST
    @Produces("text/string")
    public String doPost(
            @FormParam("firstName") String nom,
            @FormParam("lastName") String prenom) {
        return nom + " " + prenom + " a bien été pris en compte";
    }

    @Path("/search")
    @GET
    @Produces("text/string")
    public String doGet(
            @QueryParam("search") String search
    ) {
        return "essayons de trouver " + search;
    }

}

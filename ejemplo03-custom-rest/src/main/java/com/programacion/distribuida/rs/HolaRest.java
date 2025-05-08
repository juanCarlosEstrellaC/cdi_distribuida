package com.programacion.distribuida.rs;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/hello")
public class HolaRest {

    //http://127.0.0.1:8080/hello?txt=hola mundo


    @GET
    public String hello(@QueryParam("txt" ) String txt) {
        return txt;
    }
}

package com.programacion.distribuida.rs;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/hello")
public class HolaRest {

    // Esta instancia no corre en "localhost:8080", sino en el puerto 8080, pero en la IP de la máquina
    // donde se ejecuta el programa. En este caso, 127.0.0.1 es la IP de localhost.
    // http://127.0.0.1:8080/hello?txt=hola mundo

    @GET
    public String hello(@QueryParam("txt") String txt) {
        return txt;
    }
}

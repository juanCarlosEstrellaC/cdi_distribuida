package com.programacion.distribuida.service;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@ApplicationScoped
public class ServicioStringImpl implements IServicioString {

    @Inject
    IServicioLog log;

//     @PostConstruct
//     public void init() {
//         log= CDI.current().
//                 select(LogService.class).
//                 get();
//     }
    @Override
    public String convertirTexto(String txt) {
        log.print("Convertiendo: " + txt);
        return txt.toUpperCase();
    }
}

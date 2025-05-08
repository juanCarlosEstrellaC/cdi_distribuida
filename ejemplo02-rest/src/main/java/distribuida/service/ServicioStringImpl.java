package distribuida.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServicioStringImpl implements IServicioString {

    @Override
    public String convertirTexto(String txt) {
        return txt.toUpperCase();
    }
}

package distribuida.rs;

import distribuida.service.IServicioString;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/saludar")
public class HolaRest {

    @Inject
    IServicioString servicioString;

    // http://127.0.0.1:8080/ejemplo02-rest/saludar?txt=holamundo
    @GET
    public String metodoSaludar(@QueryParam("txt") String txt) {
        return servicioString.convertirTexto(txt);
    }
}


/*
1. Descargar TomEE desde su sitio oficial.
2. Editar el archivo `conf/tomcat-users.xml` y descomentar la línea del administrador.
    - Cambiar o agregar las siguientes líneas:
      <role rolename="manager-gui"/>
      <user username="tomcat" password="s3cret" roles="manager-gui"/>
3. Ejecutar el servidor con el comando `catalina run`.
4. Abrir un navegador e ir a la dirección: http://127.0.0.1:8080
5. Seleccionar el archivo `.war` y desplegarlo.
    - El archivo `.war` se encuentra en la ruta: 
      `C:\Users\jcest\OneDrive\Documents\Programacion Distribuida\prog-distribuida-dc\ejemplo02-rest\build\libs`

*/
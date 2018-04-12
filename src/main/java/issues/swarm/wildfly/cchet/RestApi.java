package issues.swarm.wildfly.cchet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author Thomas Herzog <herzog.thomas81@gmail.com>
 * @since 4/12/18
 */
@Path("/")
public interface RestApi {

    @GET
    @Path("/test")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    String test();
}

package issues.swarm.wildfly.cchet.routes;

import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author Thomas Herzog <herzog.thomas81@gmail.com>
 * @since 4/12/18
 */
@ApplicationScoped
public class EmptyRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:test").log("direct:test called");
    }
}

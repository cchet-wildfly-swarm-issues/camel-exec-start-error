package issues.swarm.wildfly.cchet;

import org.apache.camel.ProducerTemplate;
import org.apache.camel.cdi.Uri;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * @author Thomas Herzog <herzog.thomas81@gmail.com>
 * @since 4/12/18
 */
@ApplicationScoped
public class RestImpl implements RestApi {

    @Inject
    @Uri("direct:test")
    private ProducerTemplate template;

    @Override
    public String test() {
        template.requestBody("test");

        return "test";
    }
}

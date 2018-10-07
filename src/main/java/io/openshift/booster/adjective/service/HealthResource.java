package io.openshift.booster.adjective.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.wildfly.swarm.health.Health;
import org.wildfly.swarm.health.HealthStatus;

@Path("/service")
public class HealthResource {

    @GET
    @Health
    @Path("/health")
    public HealthStatus healthCheck() {
        return HealthStatus
                .named("status")
                .withAttribute("details", "We're running!")
                .up();
    }
}
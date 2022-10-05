package cn.wwtianmei;

import cn.wwtianmei.service.ExampleService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {
    @Inject
    ExampleService exampleService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/say")
    public String sayHello(@QueryParam(value = "str") String str) {
        return exampleService.sayHello(str);
    }
}
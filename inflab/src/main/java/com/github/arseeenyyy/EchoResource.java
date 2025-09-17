package com.github.arseeenyyy;

import jakarta.ws.rs.*; 
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/echo") 
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EchoResource {
    @POST
    public Response echoMessage(String message) {
        String responseJson = String.format(
            "{\"originalMessage\": %s, \"echoedMessage\": \"Эхо: %s\"}",
            message, message
        );
        return Response.ok(responseJson).build();   
    } 
} 

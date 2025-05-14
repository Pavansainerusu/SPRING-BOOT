package com.medico.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Medico API",            // Set your API title here
        version = "v1.0",                // Set your API version here
        description = "API documentation for Medico application, which manages patient information and extended details."  // Describe your API's purpose
    ),
    servers = @Server(
        url = "http://localhost:8080",    // The base URL where the API is hosted
        description = "Local server for development"  // Description of this server
    )
)
public class OpenAPIConfig {
    // Additional configurations can be added here if needed
}

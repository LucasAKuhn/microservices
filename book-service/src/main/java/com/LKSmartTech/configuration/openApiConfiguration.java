package com.LKSmartTech.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;

@OpenAPIDefinition(info =
@Info(title = "Book service API",
    version = "v1",
    description = "Documentation of book service API"))
public class openApiConfiguration {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .components(new Components())
                .info(
                    new io.swagger.v3.oas.models.info.Info()
                            .title("Book service API")
                            .version("v1")
                            .license(
                                    new License()
                                            .name("Apache 2.0")
                                            .url("http://springdoc.org")  ));

    }



}

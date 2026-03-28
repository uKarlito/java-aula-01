package br.com.fiap.api_rest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info =
@Info(title = "API de Produtos",
        version = "v1",
        description = "API RESTful de Produtos com Swagger e Validation",
        license = @License(name = "MIT", identifier = "MIT"),
        contact = @Contact(name = "RM564968", email = "rm564968@fiap.com.br")))

public class ApiRestApplication {

<<<<<<< HEAD
    public static void main(String[] args) {

        SpringApplication.run(ApiRestApplication.class, args);
    }
=======
	public static void main(String[] args) {

		SpringApplication.run(ApiRestApplication.class, args);
	}
>>>>>>> 352fdc0074414096001ac728d61e56c640e6e87a

}

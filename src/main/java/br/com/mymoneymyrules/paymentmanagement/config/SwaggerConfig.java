package br.com.mymoneymyrules.paymentmanagement.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI paymentManagementOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Payment Management API")
                        .description("API para gerenciamento de pagamentos e eventos financeiros.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("José Alexandre")
                                .email("seuemail@exemplo.com")
                        ));
    }
}

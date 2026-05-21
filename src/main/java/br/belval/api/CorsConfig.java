package br.belval.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servelet.config.annotation.CorsRegistry;
import org.springframework.web.servelet.config.annotation.WebMvconfigurer;


/**
 * CORS = Cross Origin Resource Sharing /
 *        Compartilhamento Cruzado de Origem de Recurso
 *        
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedOrigins("http://localhost:5173")
		.allowedMethods("Get", "POST", "PUT", "DELETE", "OPTIONS", "PATCH")
		.allowedHeaders("*");
	}

}

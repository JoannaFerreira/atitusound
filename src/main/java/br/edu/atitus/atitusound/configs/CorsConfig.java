package br.edu.atitus.atitusound.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://atitusound-production-a352.up.railway.app",
                        "https://atitusound-production-a352.up.railway.app")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true)
                .maxAge(3600);
    }
}

// @Configuration
// public class CorsConfig {

// @Bean
// public WebMvcConfigurer corsConfigurer() {
// return new WebMvcConfigurer() {
// @Override
// public void addCorsMappings(CorsRegistry registry) {
// registry.addMapping("/**")
// .allowedOrigins("http://atitusound-production-a352.up.railway.app")
// .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
// .allowedHeaders("Origin", "Content-Type", "Accept", "Authorization")
// .allowCredentials(true);
// }
// };
// }
// }

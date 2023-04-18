package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.model.Duck5;
import peaksoft.model.Egg6;
import peaksoft.model.Island2;
import peaksoft.model.Wood3;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
    @Bean
    public static Duck5 getDuck(Egg6 egg){
        return new Duck5(egg);
    }
}
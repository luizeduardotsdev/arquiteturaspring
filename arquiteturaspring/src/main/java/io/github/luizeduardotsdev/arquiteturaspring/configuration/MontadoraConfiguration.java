package io.github.luizeduardotsdev.arquiteturaspring.configuration;

import io.github.luizeduardotsdev.arquiteturaspring.montadora.Motor;
import io.github.luizeduardotsdev.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setLitragem(1.5);
        motor.setModelo("XPTO");
        motor.setTipo(TipoMotor.CARBURADO);
        return motor;
    }
}

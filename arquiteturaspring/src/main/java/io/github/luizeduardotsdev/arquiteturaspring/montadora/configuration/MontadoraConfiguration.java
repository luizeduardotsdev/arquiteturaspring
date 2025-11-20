package io.github.luizeduardotsdev.arquiteturaspring.montadora.configuration;

import io.github.luizeduardotsdev.arquiteturaspring.montadora.Motor;
import io.github.luizeduardotsdev.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    @Primary
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setLitragem(1.5);
        motor.setModelo("XPTO");
        motor.setTipo(TipoMotor.CARBURADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(150);
        motor.setLitragem(2.2);
        motor.setModelo("th-10");
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(190);
        motor.setLitragem(1.5);
        motor.setModelo("KO-2");
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}

package io.github.luizeduardotsdev.arquiteturaspring.api;

import io.github.luizeduardotsdev.arquiteturaspring.montadora.CarroStatus;
import io.github.luizeduardotsdev.arquiteturaspring.montadora.Chave;
import io.github.luizeduardotsdev.arquiteturaspring.montadora.HondaHRV;
import io.github.luizeduardotsdev.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class TesteFabricaController {

    @Autowired
    @Qualifier("motorEletrico")
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
         var carro = new HondaHRV(motor);
         return carro.darPartida(chave);
    }

}

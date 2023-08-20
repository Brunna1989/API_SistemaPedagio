package br.com.brunnadornelles.SistemaPedagio;

import br.com.brunnadornelles.SistemaPedagio.service.PedagioService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class PedagioServiceTest {

    private PedagioService pedagioService;

    @BeforeEach
    public void setup(){
        pedagioService = new PedagioService();
    }

    @Test
    public void consultarPrecos() {
        Map<String, Double> preco = new HashMap<>();
        preco.put("FUSCA",2.11);
        preco.put("CAMINHAO",3.95);
        preco.put("BICICLETA", 0.49);
        preco.put("ONIBUS",1.59);
        preco.put("MOTO",1.00);

        assertEquals(preco, pedagioService.listarTabelaPrecos());
    }

    @Test
    public void calcularTrocoBicicleta() {
        assertEquals(9.51,pedagioService.calcularTroco("Bicicleta" ,10.00));
    }

    @Test
    public void calcularTrocoFusca(){
        assertEquals(97.89,pedagioService.calcularTroco("Fusca" ,100.00));
    }

    @Test
    public void calcularTrocoOnibus(){
        assertEquals(98.41,pedagioService.calcularTroco("Onibus" ,100.00));
    }

    @Test
    public void calcularTrocoMoto(){
        assertEquals(49,pedagioService.calcularTroco("Moto" ,50.00 ));

    }

    @Test
    public void calcularTrocoCaminhao(){
        assertEquals(42.05, pedagioService.calcularTroco("Caminhao",50.00));
    }

    @Test
    public void verificarExcecaoVeiculo() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            pedagioService.calcularTroco("Skate", 10.0);
        });
    }
}
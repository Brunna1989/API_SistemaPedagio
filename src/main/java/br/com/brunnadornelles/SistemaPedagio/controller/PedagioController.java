package br.com.brunnadornelles.SistemaPedagio.controller;

import br.com.brunnadornelles.SistemaPedagio.service.PedagioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/pedagio")
public class PedagioController {

    @Autowired
    private PedagioService pedagioService;

    @GetMapping("/precos")
    public Map<String, Double> listarPrecos(){
        return pedagioService.listarTabelaPrecos();
    }

    @PostMapping("/calcular/{tipoVeiculo}/{valorRecebido}")
    public double calcularTroco(@PathVariable String tipoVeiculo, @PathVariable double valorRecebido){
        return pedagioService.calcularTroco(tipoVeiculo, valorRecebido);
    }
}
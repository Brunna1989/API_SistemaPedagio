package br.com.brunnadornelles.SistemaPedagio.service;

import br.com.brunnadornelles.SistemaPedagio.model.Veiculo;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class PedagioService {

    private Map<Veiculo, Double> tabelaPrecos;
    private final double totalDeEixos = 2;
    private final double valorPorEixo = 2.00;

    public PedagioService() {
        tabelaPrecos = new HashMap<>();
        tabelaPrecos.put(Veiculo.BICICLETA, Veiculo.BICICLETA.getValorPedagio());
        tabelaPrecos.put(Veiculo.MOTO, Veiculo.MOTO.getValorPedagio());
        tabelaPrecos.put(Veiculo.ONIBUS, Veiculo.ONIBUS.getValorPedagio());
        tabelaPrecos.put(Veiculo.FUSCA, Veiculo.FUSCA.getValorPedagio());
        tabelaPrecos.put(Veiculo.CAMINHAO, Veiculo.CAMINHAO.getValorPedagio());
    }

    public Map<String, Double> listarTabelaPrecos(){
        Map<String,Double> tabelaPrecosString = new HashMap<>();
        for(Veiculo veiculo: tabelaPrecos.keySet()){
            tabelaPrecosString.put(veiculo.getTipoVeiculo(), tabelaPrecos.get(veiculo));
        }

        return tabelaPrecosString;
    }

    public double calcularTroco(String tipo, double valor) {
        Veiculo veiculo = null;
        for (Veiculo v : Veiculo.values()) {

            if (v.getTipoVeiculo().equalsIgnoreCase(tipo)) {
                veiculo = v;
                break;
            }
        }

        if (veiculo != null) {
            double troco = valor - veiculo.getValorPedagio();

            if(veiculo == Veiculo.CAMINHAO){
                double valorTotalEixos = (totalDeEixos * valorPorEixo);
                double trocoCaminhao = troco - valorTotalEixos;
                return trocoCaminhao;
            }

            return troco;

        } else{
            throw new IllegalArgumentException("Veículo não encontrado!");
        }
    }
}
package br.com.brunnadornelles.SistemaPedagio.model;

public enum Veiculo {

    BICICLETA("BICICLETA",0.49),
    MOTO("MOTO", 1.00),
    ONIBUS( "ONIBUS", 1.59),
    FUSCA( "FUSCA" , 2.11),
    CAMINHAO("CAMINHAO" , 3.95);

    private double valorPedagio;
    private String tipoVeiculo;

    Veiculo(String tipoVeiculo, double valorPedagio){
        this.tipoVeiculo = tipoVeiculo;
        this.valorPedagio = valorPedagio;
    }

    public double getValorPedagio(){
        return valorPedagio;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
}
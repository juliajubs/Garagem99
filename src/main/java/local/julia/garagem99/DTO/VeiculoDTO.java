package local.julia.garagem99.DTO;

import local.julia.garagem99.entities.Veiculo;

/**
 *
 * @author sesideva
 */
public class VeiculoDTO {

    private long id;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private double km;
    private String linkimagem;

    public VeiculoDTO() {
    }

    public VeiculoDTO(long id, String marca, String modelo, String cor, int ano, double km, String linkimagem) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.km = km;
        this.linkimagem = linkimagem;
    }

    public VeiculoDTO(Veiculo veic) {
        this.id = veic.getId();
        this.marca = veic.getMarca();
        this.modelo = veic.getModelo();
        this.cor = veic.getCor();
        this.ano = veic.getAno();
        this.km = veic.getKm();
        this.linkimagem = veic.getLinkimagem();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public String getLinkimagem() {
        return linkimagem;
    }

    public void setLinkimagem(String linkimagem) {
        this.linkimagem = linkimagem;
    }
}

import java.util.Date;

public class Veiculo {

    protected String modelo;
    protected int chassi;
    protected Date dateDeFabricacao;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public Veiculo() {

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public boolean getChassi(int chassi){
        return chassi != 0;
    }

    public Date getDateDeFabricacao() {
        return dateDeFabricacao;
    }

    public void setDateDeFabricacao(Date dateDeFabricacao) {
        this.dateDeFabricacao = dateDeFabricacao;
    }
}

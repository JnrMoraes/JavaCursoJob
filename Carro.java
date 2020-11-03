

import java.util.Date;

public class Carro extends Veiculo{

    private String cor;
    private Date anoDeFabricacao ;

    public Carro(String cor, Date anoDeFabricacao, String modelo) {
    super();
        this.cor = cor;
        this.anoDeFabricacao = anoDeFabricacao;
        this.modelo = modelo;
    }

    public Carro() {

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getAnoDeFabricacao() {
        return anoDeFabricacao;
        }

    public void setAnoDeFabricacao(Date anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public boolean getAno(Date anoDeFabricacao) {
        if (validaAnoFabricacao() == false) {
            System.out.println("Por favor preencher data de fabricação");
            return false;
        }
        return true;
    }

    private boolean validaAnoFabricacao(){
            if (anoDeFabricacao == null) {
              return false;
            }
        return true;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", chassi=" + chassi +
                '}';
    }

}

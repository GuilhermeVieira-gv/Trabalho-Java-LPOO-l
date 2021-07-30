package TrabalhoFinal;
import java.util.Calendar;
/**
 *
 * @author Rafael
 */
public abstract class Veiculo implements VeiculoI {
    Marca marca;
    Estado estado;
    Categoria categoria;
    Locacao locacao;
    double valorDeCompra; // pq estamos usando valorDeCompra e n�o valorParaVenda como o m�todo l� em baixo?
    String placa;
    int ano;
    public Veiculo(Marca marca, Estado estado, Categoria categoria, Locacao locacao, double valorDeCompra, String placa, int ano) {
        this.marca = marca;
        this.estado = estado;
        this.categoria = categoria;
        this.locacao = locacao;
        this.valorDeCompra = valorDeCompra;
        this.placa = placa;
        this.ano = ano;
    }

    @Override
    public Marca getMarca() {
        return marca;
    }

    @Override
    public Estado getEstado() { 
        return estado; 
   }

    @Override
    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public Locacao getLocacao() {
        return locacao;
    }

    public double getValorDeCompra() {  // CRIAMOS ESTE METODO PRA USAR NO MODELOTABELA VEICULO E TB NO METODO GET VALOR PARA VENDA
        return valorDeCompra;
    }

    @Override
    public String getPlaca(){
        return null;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public void locar (int dias, Calendar data, Cliente cliente){
        //instanciar locacao aqui
        //Muda estado para LOCADO. Cria uma inst?ncia de Locacao e armazena no atributo
        //locacao. Chama o m?todo getValorDiariaLocacao para calcular o valor da loca??o.
    }

    @Override
    public void vender(){
        //Muda estado para VENDIDO e n?o pode mais ser alugado
    }

    @Override
    public void devolver(){
        //Muda estado para DISPONIVEL
    }

    @Override
    public double getValorParaVenda() {
    double valorVenda = this.valorDeCompra - (((2021 - ano) * 0.15) * valorDeCompra);
    double percentageCompra10PerCent = (this.valorDeCompra - (this.valorDeCompra * 0.9));

    if (valorVenda < percentageCompra10PerCent || valorVenda < 0) {
    valorVenda = this.valorDeCompra * 0.1;
    }

    return valorVenda;
}
    
    @Override
    public abstract double getValorDiariaLocacao();
  
}
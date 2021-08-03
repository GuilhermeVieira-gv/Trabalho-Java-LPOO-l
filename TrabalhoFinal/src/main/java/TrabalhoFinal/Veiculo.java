package TrabalhoFinal;
import java.util.Calendar;
/**
 *
 * @author Guilherme, Katiana, Matheus, Nicolle, Rafael
 */
public abstract class Veiculo implements VeiculoI {
    private Marca marca;
    private Estado estado;
    private Categoria categoria;
    private Locacao locacao;
    private double valorDeCompra; 
    private String placa;
    private int ano;
    
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

    public double getValorDeCompra() {  
        return valorDeCompra;
    }

    @Override
    public String getPlaca(){
        return this.placa;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public void locar(int dias, Calendar data, Cliente cliente) {
        this.estado = Estado.LOCADO;
        Locacao novaLocacao = new Locacao(dias, this.getValorDiariaLocacao() * dias, data, cliente);
        this.locacao = novaLocacao;
    }

    @Override
    public void vender(){
        this.estado = Estado.VENDIDO;
    }

    @Override
    public void devolver(){
        this.estado = Estado.DISPONIVEL;
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
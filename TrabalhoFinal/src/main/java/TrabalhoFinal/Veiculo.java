/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal;

import java.util.Calendar;

/**
 *
 * @author Rafael
 */
public class Veiculo{
    Marca marca;
    Estado estado;
    Categoria categoria;
    Locacao locacao;
    double valorDeCompra;
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
    
    
    
    public void locar (int dias, Calendar data, Cliente cliente){
        //Muda estado para LOCADO. Cria uma instância de Locacao e armazena no atributo
        //locacao. Chama o método getValorDiariaLocacao para calcular o valor da locação.
    }
    
    public void vender(){
        //Muda estado para VENDIDO e não pode mais ser alugado
    }
    
    public void devolver(){
        //Muda estado para DISPONIVEL
    }
    
    public Estado getEstado(){
    }
    
    public Marca getMarca(){
    }
    
    public Categoria getCategoria(){
    }
    
    public Locacao getLocacao(){
    }
    
    public String getPlaca(){
    }
    
    public int getAno(){
    }
    
    public double getValorParaVenda(){
        //Método que calcula um valor para venda. Utilizar o seguinte cálculo:
    //valorParaVenda = valorDeCompra – idadeVeiculoEmAnos*0,15*valorDeCompra
    //Se o resultado for menor do que 10% do valorDeCompra ou negative, então
    // varlorParaVenda = valorDeCompra*0,1
    }
    
    public double getValorDiariaLocacao(){
        //Método que será abstrato na classe Veiculo
    }
  
}


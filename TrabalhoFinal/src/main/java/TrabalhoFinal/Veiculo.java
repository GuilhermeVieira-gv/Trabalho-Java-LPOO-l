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
        //Muda estado para LOCADO. Cria uma inst�ncia de Locacao e armazena no atributo
        //locacao. Chama o m�todo getValorDiariaLocacao para calcular o valor da loca��o.
    }
    
    public void vender(){
        //Muda estado para VENDIDO e n�o pode mais ser alugado
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
        //M�todo que calcula um valor para venda. Utilizar o seguinte c�lculo:
    //valorParaVenda = valorDeCompra � idadeVeiculoEmAnos*0,15*valorDeCompra
    //Se o resultado for menor do que 10% do valorDeCompra ou negative, ent�o
    // varlorParaVenda = valorDeCompra*0,1
    }
    
    public double getValorDiariaLocacao(){
        //M�todo que ser� abstrato na classe Veiculo
    }
  
}


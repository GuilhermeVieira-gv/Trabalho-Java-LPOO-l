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
    double valorDeCompra; // pq estamos usando valorDeCompra e não valorParaVenda como o método lá em baixo?
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

    public Marca getMarca() {
        return marca;
    }

    public Estado getEstado() {
        return estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }
<<<<<<< HEAD

    public Locacao getLocacao() {
        return locacao;
    }

    public double getValorDeCompra() {  // CRIAMOS ESTE METODO PRA USAR NO MODELOTABELA VEICULO E TB NO METODO GET VALOR PARA VENDA
        return valorDeCompra;
    }

    public String getPlaca(){
    }

    public int getAno() {
        return ano;
    }


    public void locar (int dias, Calendar data, Cliente cliente){
        //instanciar locacao aqui
        //Muda estado para LOCADO. Cria uma inst�ncia de Locacao e armazena no atributo
        //locacao. Chama o m�todo getValorDiariaLocacao para calcular o valor da loca��o.
    }

    public void vender(){
        //Muda estado para VENDIDO e n�o pode mais ser alugado
=======
    
    public Estado getEstado(){
        return null;
    }
    
    public Marca getMarca(){
        return null;
    }
    
    public Categoria getCategoria(){
        return null;
    }
    
    public Locacao getLocacao(){
        return null;
    }
    
    public String getPlaca(){
        return null;
    }
    
    public int getAno(){
        return 0;
>>>>>>> 472ad39f3716b1e7101870bfadfbd4dd6a795600
    }

    public void devolver(){
        //Muda estado para DISPONIVEL
    }

    public double getValorParaVenda(){
        //M�todo que calcula um valor para venda. Utilizar o seguinte c�lculo:
    //valorParaVenda = valorDeCompra � idadeVeiculoEmAnos*0,15*valorDeCompra
    //Se o resultado for menor do que 10% do valorDeCompra ou negative, ent�o
    // varlorParaVenda = valorDeCompra*0,1
        return 0;
        //M�todo que calcula um valor para venda. Utilizar o seguinte c�lculo:
    //valorParaVenda = valorDeCompra � idadeVeiculoEmAnos*0,15*valorDeCompra
    //Se o resultado for menor do que 10% do valorDeCompra ou negative, ent�o
    // varlorParaVenda = valorDeCompra*0,1
    }
    
    public double getValorDiariaLocacao(){
<<<<<<< HEAD
        //M�todo que ser� abstrato na classe Veiculo
=======
        //M�todo que ser� abstrato na classe Veiculo
        return 0;
        //M�todo que ser� abstrato na classe Veiculo
>>>>>>> 472ad39f3716b1e7101870bfadfbd4dd6a795600
    }
  
}


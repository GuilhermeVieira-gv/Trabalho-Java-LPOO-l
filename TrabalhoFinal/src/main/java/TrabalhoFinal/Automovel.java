/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal;

/**
 *
 * @author Rafael
 */
public class Automovel extends Veiculo{
    ModeloAutomovel modelo;
    double ValorDiariaLocacao;

    public Automovel(ModeloAutomovel modelo, double ValorDiariaLocacao, Marca marca, Estado estado, Categoria categoria, Locacao locacao, double valorDeCompra, String placa, int ano) {
        super(marca, estado, categoria, locacao, valorDeCompra, placa, ano);
        this.modelo = modelo;
        this.ValorDiariaLocacao = ValorDiariaLocacao;
    }
    
    
    
    void getModelo(){
    }
    
    double getValorDiariaLocacao(){
      
    }  
}

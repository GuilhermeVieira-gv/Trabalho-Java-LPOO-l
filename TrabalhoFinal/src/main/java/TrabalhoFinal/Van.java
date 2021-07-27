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
public class Van extends Veiculo {
    ModeloVan modelo;
    double ValorDiariaLocacao;

    public Van(ModeloVan modelo, double ValorDiariaLocacao, Marca marca, Estado estado, Categoria categoria, Locacao locacao, double valorDeCompra, String placa, int ano) {
        super(marca, estado, categoria, locacao, valorDeCompra, placa, ano);
        this.modelo = modelo;
        this.ValorDiariaLocacao = ValorDiariaLocacao;
    }

   
    void getModelo(){
    }
    
 
  
}
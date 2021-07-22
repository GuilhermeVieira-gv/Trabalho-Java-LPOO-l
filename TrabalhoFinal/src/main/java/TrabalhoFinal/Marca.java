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
public enum Marca {
    VW(1), GM(2), MERCEDES(3), FIAT(4), HONDA(5);
    
    private int valor;
    
    private Marca(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

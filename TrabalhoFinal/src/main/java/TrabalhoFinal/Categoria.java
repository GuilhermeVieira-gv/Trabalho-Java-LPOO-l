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
public enum Categoria {
    POPULAR(1), INTERMEDIARIO(2), LUXO(3);
    
    private int valor;
    
    private Categoria(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
}

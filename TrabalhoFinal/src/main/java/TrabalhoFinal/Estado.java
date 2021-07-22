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
public enum Estado {
    NOVO(1), LOCADO(2), DISPONIVEL(3), VENDIDO(4);
    
    private int valor;
    
    private Estado(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
}

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
public enum ModeloMotocicleta {
    CG125(1), CBR500(2);
    
    private int valor;
    
    private ModeloMotocicleta(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
}


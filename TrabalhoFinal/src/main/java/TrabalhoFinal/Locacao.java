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
public class Locacao {
    int dias;
    double valor;
    Calendar data;
    Cliente cliente;

    public Locacao(int dias, double valor, Calendar data, Cliente cliente) {
        this.dias = dias;
        this.valor = valor;
        this.data = data;
        this.cliente = cliente;
    }
    
    
    
    double getValor(){
        return valor;
    }
    
    Calendar getData(){
        return data;
    }
 
    Cliente getCliente(){
        return cliente;
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Hamilton
 */
public class CalcularIdade {
    
    public static Integer CalculaIdade(int Dia, int Mes, int Ano){
    Calendar cal = GregorianCalendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        int Idade = anoAtual - Ano;
        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        int mesAtual = cal.get(Calendar.MONTH);
        if(Dia >= diaAtual && Mes >= mesAtual){
            Idade--;
        }
        return Idade; 
    }
} 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class DataTest {

    public static void main(String[] args) {
        
        Data dt1 = new Data();
        
        dt1.setDia(27);
        dt1.setMes(1);
        dt1.setAno(1992);
        
        System.out.println(dt1.mostraData());
        
        Data dt2 = new Data();
        
        dt2.setDia(03);
        dt2.setMes(6);
        dt2.setAno(1996);
        
        System.out.println(dt2.mostraData());
        
        Data dt3 = new Data();
        
        dt3.setDia(29);
        dt3.setMes(8);
        dt3.setAno(2018);
        
        System.out.println(dt3.mostraData());
        
    }
    
}

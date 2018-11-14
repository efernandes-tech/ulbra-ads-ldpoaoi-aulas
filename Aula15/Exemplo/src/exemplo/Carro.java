/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

/**
 *
 * @author ederson.fernandes
 */
public class Carro implements Comparable {

    private String modelo;
    private int placa;

    public Carro(String modelo, int placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String toString() {
        return (this.modelo + " " + this.placa);
    }

    public int compareTo(Object o) {
        Carro c = (Carro) o;
        if (this.placa < c.getPlaca()) {
            return -1;
        } else {
            if (this.placa > c.getPlaca()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

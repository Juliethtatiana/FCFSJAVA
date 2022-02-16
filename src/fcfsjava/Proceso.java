/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcfsjava;

/**
 *
 * @author Julie
 */
public class Proceso {
    private String id;
    private int tLlegada;
    private int rafaga;
    private String tComienzo;
    private String tFinal;
    private String tRetorno;
    private String tEspera;
    private String estado;
    
    public Proceso(String id, int tLlegada,int rafaga){
        this.id=id;
        this.tLlegada=tLlegada;
        this.rafaga=rafaga;
        this.tComienzo="-";
        this.tFinal = "-";
        this.tRetorno = "-";
        this.tEspera = "-";
         this.estado = "inactivo";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int gettLlegada() {
        return tLlegada;
    }

    public void settLlegada(int tLlegada) {
        this.tLlegada = tLlegada;
    }

    public int getRafaga() {
        return rafaga;
    }

    public void setRafaga(int rafaga) {
        this.rafaga = rafaga;
    }

    public String gettComienzo() {
        return tComienzo;
    }

    public void settComienzo(String tComienzo) {
        this.tComienzo = tComienzo;
    }

    public String gettFinal() {
        return tFinal;
    }

    public void settFinal(String tFinal) {
        this.tFinal = tFinal;
    }

    public String gettRetorno() {
        return tRetorno;
    }

    public void settRetorno(String tRetorno) {
        this.tRetorno = tRetorno;
    }

    public String gettEspera() {
        return tEspera;
    }

    public void settEspera(String tEspera) {
        this.tEspera = tEspera;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void calcularValores(){
    
    
    }
}

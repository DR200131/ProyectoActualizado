/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.scene.image.*;
import javafx.scene.shape.Shape;

/**
 *
 * @author Usuario
 */
public class Entidad {
    public int xref;
    public int yref;
    public int xv;
    public int yv;
    public int ancho;
    public int alto;
    public boolean caer = false;
    public boolean saltar = false;
    public double gravedad = 0.0;
    public Image skin;
    public Shape coli;

    public Entidad(int xref, int yref, int ancho, int alto, Image skin, Shape coli) {
        this.xref = xref;
        this.yref = yref;
        this.ancho = ancho;
        this.alto = alto;
        this.skin = skin;
        this.coli = coli;
    }

    public int getXref() {
        return xref;
    }

    public int getYref() {
        return yref;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setXv(int xv) {
        this.xv = xv;
    }

    public void setYv(int yv) {
        this.yv = yv;
    }   
}

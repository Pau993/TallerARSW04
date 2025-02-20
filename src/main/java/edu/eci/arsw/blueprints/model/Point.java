/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blueprints.model;

/**
 * Representa un punto en un plano con coordenadas x e y.
 * 
 */
public class Point {
   
    private int x;
    private int y;

    /**
     * Construye un nuevo Point con las coordenadas especificadas.
     *
     * @param x la coordenada x del punto
     * @param y la coordenada y del punto
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor por defecto para Point.
     */
    public Point() {
    }    
    
    /**
     * Devuelve la coordenada x del punto.
     *
     * @return la coordenada x
     */
    public int getX() {
        return x;
    }

    /**
     * Establece la coordenada x del punto.
     *
     * @param x la nueva coordenada x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Devuelve la coordenada y del punto.
     *
     * @return la coordenada y
     */
    public int getY() {
        return y;
    }

    /**
     * Establece la coordenada y del punto.
     *
     * @param y la nueva coordenada y
     */
    public void setY(int y) {
        this.y = y;
    }
}

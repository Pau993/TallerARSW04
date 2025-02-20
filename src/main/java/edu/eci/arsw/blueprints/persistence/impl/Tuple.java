package edu.eci.arsw.blueprints.persistence.impl;

import java.util.Objects;

/**
 * Representa una tupla genérica con dos elementos.
 *
 * @param <T1> el tipo del primer elemento
 * @param <T2> el tipo del segundo elemento
 */
public class Tuple<T1, T2> {

    T1 o1;
    T2 o2;

    /**
     * Construye una nueva tupla con los elementos especificados.
     *
     * @param o1 el primer elemento
     * @param o2 el segundo elemento
     */
    public Tuple(T1 o1, T2 o2) {
        super();
        this.o1 = o1;
        this.o2 = o2;
    }

    /**
     * Devuelve el primer elemento de la tupla.
     *
     * @return el primer elemento
     */
    public T1 getElem1() {
        return o1;
    }

    /**
     * Devuelve el segundo elemento de la tupla.
     *
     * @return el segundo elemento
     */
    public T2 getElem2() {
        return o2;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.o1);
        hash = 17 * hash + Objects.hashCode(this.o2);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tuple<?, ?> other = (Tuple<?, ?>) obj;
        if (!Objects.equals(this.o1, other.o1)) {
            return false;
        }
        if (!Objects.equals(this.o2, other.o2)) {
            return false;
        }
        return true;
    }
}

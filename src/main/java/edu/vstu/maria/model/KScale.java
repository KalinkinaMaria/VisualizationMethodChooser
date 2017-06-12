package edu.vstu.maria.model;

/**
 * Created by maria on 6/12/17.
 */
public enum KScale {

    NOMINAL("Номинальная"),
    ABSOLUTE("Абсолютная"),
    INTERVAL("Интервальная"),
    ORDINAL("Порядковая");

    private final String name;

    KScale(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}

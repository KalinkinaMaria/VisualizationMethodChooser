package edu.vstu.maria.model;

/**
 * Created by maria on 6/12/17.
 */
public enum KDataType {

    INTEGER("Целый"),
    BOOLEAN("Логический"),
    FLOAT("Вещественный"),
    STRING("Строка");

    private String name;

    KDataType(String name) {
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

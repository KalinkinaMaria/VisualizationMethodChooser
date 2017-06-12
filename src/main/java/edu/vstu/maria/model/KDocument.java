package edu.vstu.maria.model;

/**
 * Created by maria on 6/13/17.
 */
public enum KDocument {

    ANALITICAL("Аналитический"),
    DRAFT("Черновик"),
    OTHER("Другой"),
    PRESENTATION("Презентация"),
    REPORT("Отчет");

    private String name;

    KDocument(String name) {
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

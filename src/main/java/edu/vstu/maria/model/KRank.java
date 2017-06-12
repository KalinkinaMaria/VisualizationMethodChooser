package edu.vstu.maria.model;

/**
 * Created by maria on 6/13/17.
 */
public enum KRank {

    ANALYST("Аналитик"),
    CONSULTANT("Консультант"),
    DEPUTYHEAD("Заместитель начальника"),
    HEAD_OF_DEPARTMENT("Начальник департамента"),
    HEAD_OF_GROUP("Начальник отдела"),
    INGINEER("Инженер"),
    SPECIALIST("Специалист");

    private String name;

    KRank(String name) {
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

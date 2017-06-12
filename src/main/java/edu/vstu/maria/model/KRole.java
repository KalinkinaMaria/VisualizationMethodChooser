package edu.vstu.maria.model;

/**
 * Created by maria on 6/12/17.
 */
public enum KRole {

    AMOUNT("Количество"),
    CATEGORY("Категория"),
    DATE("Дата"),
    GEOGRAPHICAL_POINT("Географическая точка"),
    GEOGRAPHICAL_REGION("Географический регион"),
    MARK("Метка"),
    NUMERIC_INTERVAL("Числовой интервал"),
    PRICE("Цена"),
    PROPORTION("Пропорция"),
    TIME_INTERVAL("Временной интервал");

    private final String name;

    KRole(String name) {
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

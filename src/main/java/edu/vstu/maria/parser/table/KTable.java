package edu.vstu.maria.parser.table;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.ArrayList;

/**
 * Created by maria on 6/7/17.
 */
public class KTable {

    protected Integer columnsCount;
    protected Integer rowsCount;
    protected ArrayList<KTableHeadCell> headCells;
    protected ArrayList<ArrayList<KTableDataCell>> dataCells;

    public KTable() {
        this.columnsCount = new Integer(0);
        this.rowsCount = new Integer(0);
        this.headCells = new ArrayList<>();
        this.dataCells = new ArrayList<>();
    }

    public void addColumn(@NotNull String columnTitle) {
        this.columnsCount++;
        this.headCells.add(new KTableHeadCell(columnTitle));
    }

    public void addRow(@NotNull ArrayList<String> rowContent) {
        this.rowsCount++;
        ArrayList<KTableDataCell> dataRowCells = new ArrayList<>();
        for (int i = 0; i < this.columnsCount; i++) {
            dataRowCells.add(new KTableDataCell(rowContent.get(i)));
        }
        this.dataCells.add(dataRowCells);
    }

    public ArrayList<KTableHeadCell> getColumnsTitle() {
        return new ArrayList<>(this.headCells);
    }

    @Nullable
    public KTableHeadCell getColumnTitle(int index) {
        if (index >= 0 && index < this.columnsCount) {
            return this.headCells.get(index);
        }
        return null;
    }

    public ArrayList<ArrayList<KTableDataCell>> getRowsContent() {
        return new ArrayList<>(this.dataCells);
    }

    @Nullable
    public ArrayList<KTableDataCell> getRowContent(int index) {
        if (index >= 0 && index < this.rowsCount) {
            return new ArrayList<>(this.dataCells.get(index));
        }
        return null;
    }

}

package edu.vstu.maria.parser;

import edu.vstu.maria.parser.table.KTable;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by maria on 6/8/17.
 */
public class KXLSParser extends KParser {

    public KXLSParser(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    @Override
    public KTable parse() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(this.fileName));
        Workbook workboor = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workboor.getSheetAt(0);

        Iterator<Row> rowsIterator = sheet.iterator();

        KTable table = new KTable();

        Iterator<Cell> cellsIterator = rowsIterator.next().iterator();

        while (cellsIterator.hasNext()) {
            table.addColumn(cellsIterator.next().getStringCellValue());
        }

        while (rowsIterator.hasNext()) {
            cellsIterator = rowsIterator.next().iterator();
            ArrayList<String> row = new ArrayList<>();
            while (cellsIterator.hasNext()) {
                row.add(cellsIterator.next().getStringCellValue());
            }
            table.addRow(row);
        }

        return table;
    }

}
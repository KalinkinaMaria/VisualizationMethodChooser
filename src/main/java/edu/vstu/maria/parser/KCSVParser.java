package edu.vstu.maria.parser;

import com.sun.istack.internal.NotNull;
import edu.vstu.maria.parser.table.KTable;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by maria on 6/7/17.
 */
public class KCSVParser extends KParser {

    protected CSVFormat format;

    public KCSVParser(@NotNull String fileName) throws FileNotFoundException {
        super(fileName);
        this.format = CSVFormat.DEFAULT.withDelimiter(';');
    }

    public KCSVParser(@NotNull String fileName, char delimiter) throws FileNotFoundException {
        super(fileName);
        this.format = this.format.withDelimiter(delimiter);
    }

    @Override
    public KTable parse() throws IOException {
        Reader fileReader = new FileReader(this.fileName);

        CSVParser parser = new CSVParser(fileReader, this.format);

        ArrayList<CSVRecord> rows = new ArrayList<>(parser.getRecords());

        KTable table = new KTable();

        for (String cell : rows.get(0)) {
            table.addColumn(cell);
        }

        for (int i = 1; i < rows.size(); i++) {
            ArrayList<String> row = new ArrayList<>();
            for (String cell : rows.get(i)) {
                row.add(cell);
            }
            table.addRow(row);
        }

        return table;
    }

}

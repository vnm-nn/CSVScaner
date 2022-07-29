import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;
import com.sun.source.tree.Scope;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CSVMapped {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) throws FileNotFoundException {

        CsvToBean csv = new CsvToBean();
        String csvFilename = "data.csv";
        CSVReader csvReader = new CSVReader(new FileReader(csvFilename), ';');
        //Set column mapping strategy
        List list = csv.parse(setColumMapping(), csvReader);
        for (Object object : list) {
            Scope score = (Scope) object;
            System.out.println(score);
        }
    }
    @SuppressWarnings({"rawtypes", "unchecked"})
    private static ColumnPositionMappingStrategy setColumMapping()
    {
        ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(Score.class);
        String[] columns = new String[] {"FID", "SERIAL_NUM", "MEMBER_CODE", "ACCT_TYPE", "OPENED_DT", "ACCT_RTE_CDE", "REPORTING_DT", "CREDIT_LIMIT"};
        strategy.setColumnMapping(columns);
        return strategy;

    }
}
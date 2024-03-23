package assignments.week6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

// still working in this task

public class W6T2oa<XSSFWorkbook> {
    private WebDriver bot;
     /*
        Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
        Add 10 notes using data provider with excel
        Run it with 3 different browsers using XML file
        Run it parallel with 3 threads
     */

    @Test(dataProvider ="notes")
    public void task2(String[][] notes){
        bot.navigate("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
        for (String[] note : notes) {
            bot.get(By.id("note-title-input"),note[0]);
            bot.get(By.id("note-details-input"),note[1]);
            bot.click(By.id("add-note"));
        }
    }

    @DataProvider
    public <XSSFWorkbook> Object[][] notes() throws IOException, InvalidFormatException {
        File demoExcelFile = new File("src/test/resources/data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(demoExcelFile);
        Object[][] data = null;

        try {
            XSSFSheet sheet = workbook.getSheetAt(0);
            int numRows = 10;
            data = new Object[1][1];
            String[][] notes = new String[numRows][2];

//            for (int i = 0; i < numRows; i++) {
//                Row row = sheet.getRow(i);
//                Cell cell1 = row.getCell(0);
//                Cell cell2 = row.getCell(1);
//                String cellValue1 = cell1.getStringCellValue();
//                String cellValue2 = cell2.getStringCellValue();
//                notes[i][0] = cellValue1;
//                notes[i][1] = cellValue2;
//            }
            data[0][0] = notes;
        } finally {
            final var clone = workbook.clone();
        }

        return data;
    }
}

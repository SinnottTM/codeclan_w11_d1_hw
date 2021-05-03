import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPaper() {
        assertEquals(100, printer.getSheetsOfPaper());
    }

    @Test
    public void hasToner() {
        assertEquals(100, printer.getTonerVolume());
    }

    @Test
    public void canSetPaper(){
        printer.setSheetsOfPaper(80);
        assertEquals(80, printer.getSheetsOfPaper());
    }

    @Test
    public void canSetToner(){
        printer.setTonerVolume(80);
        assertEquals(80, printer.getTonerVolume());
    }

    @Test
    public void canPrint(){
        printer.print(3,3);
        assertEquals(91, printer.getSheetsOfPaper());
        assertEquals(97, printer.getTonerVolume());
    }

}

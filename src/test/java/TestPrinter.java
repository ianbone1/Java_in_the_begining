import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

//  * Create a Printer class that has a property for number of sheets of paper left.

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasPaper(){
        assertEquals(250, printer.getSheets());
    }

//  * Add a method to print that takes in a number of pages and number of copies.
//  * The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.

    @Test
    public void canPrint(){
        printer.print(10,2);
        assertEquals(230, printer.getSheets());
    }

//  * Create a method to refill the printer paper.
    @Test
    public void canRefillPaper(){
        printer.print(10,2);
        printer.print(10,2);
        printer.refillPaper();
        assertEquals(250, printer.getSheets());
    }

//  * Add a toner volume property to the class.

    @Test
    public void hasToner(){
        assertEquals(5000, printer.getTonerLevel());
    }

//  * Modify the printer so that it reduces the toner by 1 for each page printed.
    @Test
    public void usesToner(){
        printer.print(10,2);
        assertEquals(4980, printer.getTonerLevel());
    }

    @Test
    public void canRefillToner(){
        printer.print(10,2);
        printer.refillToner();
        assertEquals(5000, printer.getTonerLevel());
    }
}

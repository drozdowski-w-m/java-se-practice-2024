package pl.globallogic.exercises.ex38;

public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.pagesPrinted = 0;
        if ( tonerLevel > -1 && tonerLevel <= 100 )
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if ( tonerAmount < 0 || tonerAmount > 100 )
            return -1;
        else if ( (this.tonerLevel + tonerAmount) > 100 )
            return -1;
        else {
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if ( this.isDuplex() ){
            if ( pagesToPrint%2 == 0 ) {
                this.pagesPrinted += pagesToPrint / 2;
                return pagesToPrint/2;
            } else {
                this.pagesPrinted += (pagesToPrint / 2) + 1;
                return (pagesToPrint / 2) + 1;
            }
        } else {
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public static void main(String[] args){
//tests
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());

    }
}

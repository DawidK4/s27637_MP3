package multiinheritance;

public class Printer extends Device implements IPrinter{
    private int pagesPerMinute;
    private String printingColor;

    public Printer(String brand, String model, String serialNumber, int pagesPerMinute, String printingColor) {
        super(brand, model, serialNumber);
        setPagesPerMinute(pagesPerMinute);
        setPrintingColor(printingColor);
    }

    public int getPagesPerMinute() {
        return pagesPerMinute;
    }

    public void setPagesPerMinute(int pagesPerMinute) {
        if (pagesPerMinute < 0) {
            throw new IllegalArgumentException("PagerPerMinute must not be negative!");
        }

        this.pagesPerMinute = pagesPerMinute;
    }

    public String getPrintingColor() {
        return printingColor;
    }

    public void setPrintingColor(String printingColor) {
        if (printingColor == null || printingColor.isEmpty()) {
            throw new IllegalArgumentException("Printing color must not be null or empty!");
        }

        this.printingColor = printingColor;
    }

    public void printDocument(String documentName) {
        System.out.println("Printing document: " + documentName);
    }
}

package multiinheritance;

public class CopyPrinter extends Scanner implements IPrinter{
    private int pagesPerMinute;
    private String printingColor;

    public CopyPrinter(String brand, String model, String serialNumber, int resolutionDpi, boolean duplexScan,
                       int pagesPerMinute, String printingColor) {
        super(brand, model, serialNumber, resolutionDpi, duplexScan);
        setPagesPerMinute(pagesPerMinute);
        setPrintingColor(printingColor);
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

    public int getPagesPerMinute() {
        return pagesPerMinute;
    }

    public void setPagesPerMinute(int pagesPerMinute) {
        if (pagesPerMinute < 0) {
            throw new IllegalArgumentException("PagerPerMinute must not be negative!");
        }

        this.pagesPerMinute = pagesPerMinute;
    }

    public void printDocument(String documentName) {
        System.out.println("Printing document: " + documentName);
    }
}

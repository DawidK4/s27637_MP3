package multiinheritance;

public class Scanner extends Device{
    private int resolutionDpi;
    private boolean duplexScan;

    public Scanner(String brand, String model, String serialNumber, int resolutionDpi, boolean duplexScan) {
        super(brand, model, serialNumber);
        setResolutionDpi(resolutionDpi);
        setDuplexScan(duplexScan);
    }

    public int getResolutionDpi() {
        return resolutionDpi;
    }

    public void setResolutionDpi(int resolutionDpi) {
        if (resolutionDpi < 0) {
            throw new IllegalArgumentException("Resolution of Dpi must not be negative!");
        }

        this.resolutionDpi = resolutionDpi;
    }

    public boolean isDuplexScan() {
        return duplexScan;
    }

    public void setDuplexScan(boolean duplexScan) {
        this.duplexScan = duplexScan;
    }

    public void scanDocument(String documentName) {
        System.out.println("Scanning document: " + documentName + " at " + resolutionDpi + " DPI");
    }
}

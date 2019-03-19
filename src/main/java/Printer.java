public class Printer {

    private int sheets;
    private int tonerLevel;
    public Printer(){
        this.sheets=250;
        this.tonerLevel=5000;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public void print(int pages, int copies){
        int impact=pages*copies;
        if ((this.sheets >= impact) & (this.tonerLevel >= impact)){
            this.sheets -= impact;
            this.tonerLevel -= impact;
        }
    }

    public void refillPaper(){
        this.sheets = 250;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public void refillToner(){
        this.tonerLevel=5000;
    }
}

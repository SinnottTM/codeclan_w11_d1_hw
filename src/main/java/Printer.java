public class Printer {

    private int sheetsOfPaper;
    private int tonerVolume;

    public Printer(int sheetsOfPaper, int tonerVolume) {
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsOfPaper(){
        return this.sheetsOfPaper;
    }

    public void setSheetsOfPaper(int newSheetsOfPaper){
        this.sheetsOfPaper = newSheetsOfPaper;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public void setTonerVolume(int newTonerVolume){
        this.tonerVolume = newTonerVolume;
    }

    public void print(int numOfPages, int numOfCopies){
        this.sheetsOfPaper -= numOfPages * numOfCopies;
        this.tonerVolume -= numOfPages;
    }
}

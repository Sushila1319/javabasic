package WAP.practice.library;

public class EBook extends Book{

    float fileSize;
    String fileFormat;

    public EBook(String bookName, String author, int publishedYear, float fileSize, String fileFormat){
        super(bookName,author,publishedYear);
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }
    @Override
    public void libraryDetails(){
        super.libraryDetails();
        System.out.println("File size: " + fileSize + " mb");
        System.out.println("File format: " + fileFormat);
    }




}

import java.util.Scanner;

class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

public class Lab511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t1Title = sc.nextLine();
        int t1Words = Integer.parseInt(sc.nextLine());
        String p1Title = sc.nextLine();
        int p1Pages = Integer.parseInt(sc.nextLine());

        String t2Title = sc.nextLine();
        int t2Words = Integer.parseInt(sc.nextLine());
        String p2Title = sc.nextLine();
        int p2Pages = Integer.parseInt(sc.nextLine());

        Document[] docs = new Document[4];
        docs[0] = new TextDocument(t1Title, t1Words);
        docs[1] = new PDFDocument(p1Title, p1Pages);
        docs[2] = new TextDocument(t2Title, t2Words);
        docs[3] = new PDFDocument(p2Title, p2Pages);

        int totalPages = 0;

        for (Document d : docs) {
            d.displayDetails();
            
            if (d instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) d;
                totalPages += pdf.pageCount;
            }
        }

        System.out.println("Total Pages: " + totalPages);
        
        sc.close();
    }
}
package Document;

public class DocumentChecker {
    public static void main(String[] args) {
        ExcelDocument document = new ExcelDocument(); // stary sposob
        Document excelDocument = new ExcelDocument(); // Odwolanie sie do glownej klasy
        Document pdfDocument = new PdfDocument();

        document.getDescription();
        excelDocument.getDescription();
        pdfDocument.getDescription();
    }
}

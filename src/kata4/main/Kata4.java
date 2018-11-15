package kata4.main;
import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {
    
    public static void main(String[] args) throws IOException {
        Kata4 kata4 = new Kata4();
        kata4.control();
    }
    
    private String filename;
    private List<Mail> mailList;
    private HistogramDisplay histoDisplay;
    
    private void control() throws IOException {
        input();
        process();
        output();
    }
    
    private void input(){
        filename = "/Users/Usuario/Desktop/Kata4/email.txt";
    }
    
    private void process() throws IOException {
        mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        histoDisplay = new HistogramDisplay(histogram);
    }
    
    private void output(){
        histoDisplay.execute();
    }
    
}

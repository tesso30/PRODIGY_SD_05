import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScraperGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField urlField;
    private JButton scrapeButton;
    private JTextArea resultArea;

    public ScraperGUI() {
        setTitle("Web Scraper");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(mainPanel);

        scrapeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startScraping();
            }
        });
    }

    private void startScraping() {
        String url = urlField.getText();
        resultArea.setText("Starting scraping...\n");

        try {
            Document doc = Jsoup.connect(url).get();
            Elements products = doc.select("article.product_pod");
            List<String[]> productList = new ArrayList<>();
            for (Element product : products) {
                String name = product.select("h3 a").attr("title");
                String price = product.select("p.price_color").text();
                String rating = product.select("p.star-rating").attr("class").split(" ")[1];
                productList.add(new String[]{name, price, rating});

                resultArea.append("Name: " + name + ", Price: " + price + ", Rating: " + rating + "\n");
            }
            try (FileWriter csvWriter = new FileWriter("products.csv")) {
                csvWriter.append("Product Name,Price,Rating\n");
                for (String[] product : productList) {
                    csvWriter.append(String.join(",", product));
                    csvWriter.append("\n");
                }
            }

            resultArea.append("\nScraping completed. Data saved to products.csv");
        } catch (IOException e) {
            resultArea.append("\nError: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ScraperGUI().setVisible(true);
            }
        });
    }
}

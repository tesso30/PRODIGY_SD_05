# Web Scraper GUI Application

This project is a simple Java-based GUI application that scrapes product information (names, prices, and ratings) from an e-commerce website and stores the data in a CSV file.

## Features

- **User-friendly GUI**: Enter the URL of an e-commerce website and scrape product information with a click of a button.
- **Data Extraction**: Extracts product names, prices, and ratings.
- **CSV Export**: Saves the scraped data into a `products.csv` file.
- **Scrollable Results Area**: View the results in a scrollable text area.

## Technologies Used

- **Java**: The primary programming language.
- **Swing**: For the graphical user interface.
- **JSoup**: For web scraping.
- **IntelliJ IDEA**: IDE used for development.

## Prerequisites

- **Java**: Ensure you have Java Development Kit (JDK) installed.
- **IntelliJ IDEA**: Optional, but recommended for development.
- **JSoup Library**: Download and include the JSoup library in your project.

## Installation

1. **Clone the Repository**:
    ```bash
    git clone https: https://github.com/tesso30/PRODIGY_SD_05
    ```

2. **Add JSoup Library**:
   - Download the JSoup library from [jsoup.org](https://jsoup.org/download).
   - In IntelliJ IDEA, go to `File > Project Structure > Modules > Dependencies`.
   - Click `+ > JARs or directories` and add the downloaded `jsoup-x.x.x.jar` file.

3. **Run the Application**:
   - Open the project in IntelliJ IDEA.
   - Locate the `ScraperGUI` class.
   - Right-click and select `Run`.

## Usage

1. **Open the Application**:
   - The main GUI window will appear.

2. **Enter the URL**:
   - Input the URL of the e-commerce website's product listing page.

3. **Start Scraping**:
   - Click the "Start Scraping" button.
   - The application will scrape the product information and display it in the results area.

4. **View the Results**:
   - The results will be displayed in the scrollable text area.
   - A `products.csv` file will be created with the scraped data.

## Screenshots

![Screenshot 2024-06-10 180400](https://github.com/tesso30/PRODIGY_SD_05/assets/156070938/b4da4aac-08a1-4c4c-9a05-456d8b75d664)

![Screenshot 2024-06-10 180052](https://github.com/tesso30/PRODIGY_SD_05/assets/156070938/9481466a-3bdd-46b4-94c5-1e695a592417)

![Screenshot 2024-06-10 180109](https://github.com/tesso30/PRODIGY_SD_05/assets/156070938/6a83af30-d959-4f60-95e1-085ce25f6660)


## Example URLs

Here are some example URLs you can use for testing:

- **Books to Scrape**: `http://books.toscrape.com/catalogue/category/books/science_22/index.html`
- **Web Scraper Test Site**: `https://webscraper.io/test-sites/e-commerce/static/computers/laptops`

## Legal and Ethical Considerations

- Always review the website’s terms of service before scraping.
- Implement respectful scraping practices such as rate limiting to avoid putting undue load on the server.

## Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request. For major changes, please open an issue to discuss what you would like to change.

## Acknowledgments

- **JSoup**: A Java library for HTML parsing and web scraping.
- **Swing**: The GUI widget toolkit for Java.


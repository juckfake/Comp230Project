import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Product extends JPanel{
    String sqlQuery = "SELECT * FROM Product";
    String[] columnNames = {"productSKU", "weight", "productName", "price", "dimensions"};
    Object[][] data = null;

    public Product() throws SQLException {
        super(true);

        data = Main.sqlQueryFetchTable(sqlQuery);
        this.add(new createTablePanel(data, columnNames));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}

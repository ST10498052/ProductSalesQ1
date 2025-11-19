import org.junit.Test;
import static org.junit.Assert.*;

public class ProductSalesTest {

    int[][] sampleData = {
            {300, 150, 700},
            {250, 200, 600}
    };

    //Call ProductSales class
    ProductSales ps = new ProductSales();

    //Tests

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        int expected = 2200;
        assertEquals(expected, ps.TotalSales(sampleData));
    }

    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        double expected = 366.67;
        assertEquals(expected, ps.AverageSales(sampleData), 0.01);
    }
}

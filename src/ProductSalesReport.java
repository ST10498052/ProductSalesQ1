//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProductSalesReport {

    public static void main(String[] args) {
        // 2D array: 2 years × 3 quarters
        int[][] productSales = {
                {300, 150, 700}, // Year 1
                {250, 200, 600}  // Year 2
        };

        // Create instance of ProductSales class
        ProductSales ps = new ProductSales();

        int total = ps.TotalSales(productSales);
        double average = ps.AverageSales(productSales);
        int max = ps.MaxSale(productSales);
        int min = ps.MinSale(productSales);

        // Display report
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("---------------------------------");
        System.out.println("Total sales: " + total);
        System.out.println("Average sales: " + Math.round(average));
        System.out.println("Maximum sale: " + max);
        System.out.println("Minimum sale: " + min);
    }
}

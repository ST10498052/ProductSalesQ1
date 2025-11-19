public class ProductSales implements IProduct {


    //Calculate total sales
    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        for (int[] year : productSales) {
            for (int sale : year) {
                total += sale;
            }
        }
        return total;
    }

    //Calculate average sales
    @Override
    public double AverageSales(int[][] productSales) {
        int total = TotalSales(productSales);
        int count = 0;
        for (int[] year : productSales) {
            count += year.length;
        }
        return (double) total / count;
    }

    //Calculate max sales
    @Override
    public int MaxSale(int[][] productSales) {
        int max = productSales[0][0];
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale > max) max = sale;
            }
        }
        return max;
    }

    //calculate minimum sales
    @Override
    public int MinSale(int[][] productSales) {
        int min = productSales[0][0];
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale < min) min = sale;
            }
        }
        return min;
    }
}

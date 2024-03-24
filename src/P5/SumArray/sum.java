package P5.SumArray;

/**
 * sum
 */
public class sum {

    int bulan;
    double keuntungan[], total;

    public sum(int bulan) {
        this.bulan = bulan;
        this.keuntungan = new double[bulan];
        this.total = 0;
    }

    public double totalBF(double arr[]) {
        for (int i = 0; i < bulan; i++) {
            total = total + arr[i];
        }
        return total;
    }

    public double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if(l < r) {
            int mid = (l+r) / 2;
            double lSum = totalDC(arr, l, mid-1);
            double rSum = totalDC(arr, mid+1, r);
            return lSum+rSum+arr[mid];
        }
        return 0;
    }
}
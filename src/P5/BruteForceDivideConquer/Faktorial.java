package P5.BruteForceDivideConquer;

/**
 * Faktorial
 */
public class Faktorial {

    public int nilai;

    public Faktorial(int nilai) {
        this.nilai = nilai;
    }

    public int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        do {
            fakto = fakto * i;
            i++;

        } while (i <= n);

        // while (i <= n) {
        //     fakto = fakto * i;
        //     i++;
        // }

        // for (int i = 1; i <= n; i++) {
        //     fakto = fakto * i;
        // }
        return fakto;
    } 

    public int faktorialDC(int n) {
        if (n==1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}     

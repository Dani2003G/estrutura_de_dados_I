public class BuscaBinaria1 {
    public static void main(String[] args) {
        
        int v[] = {5, 6, 7, 9, 11, 15, 17, 20, 21, 22, 23, 26, 28, 30, 31, 35, 36, 37, 40, 41};

        print(v);
        System.out.println(buscaBinaria(23, v, 0, 19));
        print(v);

    }

    public static int buscaBinaria(int x, int[] v, int p, int r) {
        if (p > r) {
            return - 1;
        } else {
            int q = (p + r) / 2;
            if (v[q] == x) {
                return q;
            } else {
                if (v[q] < x) {
                    return buscaBinaria(x, v, q + 1, r);
                } else {
                    return buscaBinaria(x, v, p, q - 1);
                }
            }
        }
    }

    public static void print(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            if (i < v.length - 1) {
                System.out.print(v[i] + ", ");
            } else {
                System.out.println(v[i] + "]");
            }
        }
    }
}

public class InsertionSort {
    public static void main(String[] args) {
        
        Integer v[] = geraVetor(5);

        imprimir(v);

        insertion_Sort(v);

        imprimir(v);
    }

    public static Integer[] geraVetor(Integer n) {
        Integer x[] = new Integer[n];
        for (int i = 0; i < n; i++) 
            x[i] = n - i;
        return x;
    }

    public static void insertion_Sort(Integer[] v) {
        for (int j = 1; j < v.length; j++) {
            Integer chave = v[j];
            Integer i = j - 1;

            while (i >= 0 && v[i] > chave) {
                v[i + 1] = v[i];
                i--;
                v[i + 1] = chave;
                imprimir(v);
            }
        }
    }

    public static void imprimir(Integer[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            if (i < v.length - 1)
                System.out.print(v[i] + ", ");
            else
                System.out.println(v[i] + "]");
        }
    }
}
public class SelectionSort {
    public static void main(String[] args) {
        
        Integer v[] = geraVetor(5);

        //imprimir(v);

        selection_Sort(v);

        //imprimir(v);
    }

    public static Integer[] geraVetor(Integer n) {
        Integer x[] = new Integer[n];
        for (int i = 0; i < n; i++) 
            x[i] = n - i;
        return x;
    }

    public static void selection_Sort(Integer[] v) {
        for(int i = 0; i < v.length - 1; i++) {
            Integer min = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[min])
                    min = j;
            }
            if (v[i] != v[min]) {
                Integer aux = v[min];
                v[min] = v[i];
                v[i] = aux;
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

public class BubbleSort {
    public static void main(String[] args) {
        
        Integer v[] = GeraVetor(10);

        ImprimirVetor(v);

        Bubble_Sort(v);

        ImprimirVetor(v);
    }

    public static Integer[] GeraVetor(Integer n) {
        Integer x[] = new Integer[n];
        for (int i = 0; i < n; i++)
            x[i] = n - i;
        return x;
    }

    public static void Bubble_Sort(Integer[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = v.length - 1; j >= i + 1; j--) {
                if (v[j] < v[j - 1]){
                    Integer aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                }
            }
        }
    }

    public static void ImprimirVetor(Integer[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++)
            if (i < v.length - 1)
                System.out.print(v[i] + ", ");
            else 
                System.out.println(v[i] + "]");
    }

}
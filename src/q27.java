public class q27 {  

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int [] arrayResultante = arrayInverso(array);

        for (int elemento : arrayResultante) {
            System.out.print(elemento + " ");;
        }
        
    }

    public static int[] arrayInverso(int[] array){
        int[] arrayInverso = new int[array.length];
        for(int i = 0, j = array.length - 1 ; i < array.length ;i++, j--){
            arrayInverso[i] = array[j];
        }

        return arrayInverso;
    }
}

import java.util.Random;
import java.util.Scanner;

public class BubbleRecursivo {
    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Random rd = new Random();

        System.out.print("Defina o tamanho do array: ");
	    int n = kb.nextInt();
	    int[] array = new int[n];
	    
		kb.close();
        
		System.out.println("Array desordenado: ");
	    for(int i = 0; i<array.length; i++){
	        array[i] = rd.nextInt(10);
	        System.out.print(array[i]+ " ");
	    }
	    System.out.println();
	    
	    ordenacao(array, array.length);
	    System.out.println("Array ordenado: ");
	    for(int i = 0; i<array.length; i++){
	        System.out.print(array[i] + " ");
	    }
	}
    public static void ordenacao(int[]array, int n) {
	    if (n == 1) {
	       return;
	    }
	    
	    for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
	    }
	    ordenacao(array, n-1);
    }
}

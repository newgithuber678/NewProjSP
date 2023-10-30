import java.util.Arrays;

public class L20231023 {
    public static void main(String[] args) {
        // задача 1
        int[] arr1 = new int[3];
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        int[] arr3 = {4,3,7,6};
        int i=0;
        System.out.println("Задача 1");
        for(i=0;i< arr1.length;i++)
            arr1[i]=i+1;
        // задача 2
        System.out.println("Задача 2");
        for(i=0;i< arr1.length;i++){
            System.out.print(arr1[i]);
            if(i< arr1.length-1)
                System.out.print(", ");
        }
        System.out.println();
        for(i=0;i< arr2.length;i++){
            System.out.print(arr2[i]);
            if(i< arr2.length-1)
                System.out.print(", ");
        }
        System.out.println();
        for(i=0;i< arr3.length;i++){
            System.out.print(arr3[i]);
            if(i< arr3.length-1)
                System.out.print(", ");
        }
        System.out.println();
        // задача 3
        System.out.println("Задача 3");
        for(i=arr1.length-1;i>=0;i--){
            System.out.print(arr1[i]);
            if(i>0)
                System.out.print(", ");
        }
        System.out.println();
        for(i=arr2.length-1;i>=0;i--){
            System.out.print(arr2[i]);
            if(i>0)
                System.out.print(", ");
        }
        System.out.println();
        for(i=arr3.length-1;i>=0;i--){
            System.out.print(arr3[i]);
            if(i>0)
                System.out.print(", ");
        }
        System.out.println();
        // задача 4
        System.out.println("Задача 4");
        for(i=0;i< arr1.length;i++){
            if(arr1[i]%2==1)
                arr1[i]++;
        }
        System.out.println(Arrays.toString(arr1));
    }
}

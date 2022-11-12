public class MethondinArray {
    public static void main(String[] args) {
        int[] arr={1,3,5,9,0,4};
        int value=minArray(arr);
        System.out.print("Value min array = "+value);
    }

    public static int minArray(int[]arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min) min=arr[i];
        }
        return min;
    }
}

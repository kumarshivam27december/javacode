
public class min_max {
    public static void main(String[] args) {
        int arr1[] = {2,3,1};
        int max = arr1[0];
        int min = arr1[0];
        for (int i = 0; i < 3; i++) {
            if(arr1[i]>max){
                max = arr1[i];
            }

            if (arr1[i]<min) {
                min = arr1[i];
            }
        }


        System.out.println("max is "+ max);
        System.out.println("min is "+ min);
    }
}

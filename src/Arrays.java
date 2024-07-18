public class Arrays {
    public static void main(String[] args) {
        int count = 0;
        int min = 2;
        int max = 5;
        int range = max - min + 1;
        int arraySize = range * range * range * range;
        int[] arr = new int[arraySize];
        for (int i = min; i <= max; i++) {
            for (int j = min; j <= max; j++) {
                for (int k = min; k <= max; k++) {
                    for (int f = min; f <= max; f++) {
                        arr[count] = i * 1000 + j * 100 + k * 10 + f;
                        count++;
                    }
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("The number of combination is: " + count);

    }
}

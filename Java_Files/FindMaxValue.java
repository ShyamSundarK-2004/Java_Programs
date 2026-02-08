public class FindMaxValue {
    public static void main(String[] args) {
        int[] a = {1, 2, 8,9};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find min and max in one loop
        for (int num : a) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // Count of missing numbers between min and max
        int missingCount = (max - min + 1) - a.length;

        System.out.println(missingCount);
    }
}

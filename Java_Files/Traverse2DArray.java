public class Traverse2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };

        // Traverse the 2D array
        for (int i = 0; i < arr[0].length; i++) { // Loop through rows
            for (int j = 0; j < arr.length; j++) { // Loop through columns
                System.out.print(arr[j][i] + " "); // Print the element
            }
            System.out.println(); // New line after each row
        }
    }
}

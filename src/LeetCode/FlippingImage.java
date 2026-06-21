package LeetCode;

public class FlippingImage {
    public static int[][] flipAndInvert(int[][] image){

        for(int i=0;i < image.length;i++) {
            int high = image[i].length -1 ;
            int low = 0;
                while (low < high) {
                    int temp = image[i][low];
                    image[i][low] = image[i][high];
                    image[i][high] = temp;
                    high--;
                    low++;
                }
            for (int j = 0; j < image[i].length; j++) {
                if(image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;
            }
        }
        return image;
    }

    public static void printArray(int[][] image) {
        System.out.print("Array: ");
        for (int i = 0; i < image.length; i++) {
            System.out.print("{");
            for (int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j]);
                if (j < image[i].length - 1) System.out.print(",");
            }
            System.out.print("} ");
        }
        System.out.println();
    }

    public static void printResult(int[][] arr){

        System.out.print("Original ");
        printArray(arr);
        int[][] result = flipAndInvert(arr);
        System.out.print("Flipped ");
        printArray(result);
        System.out.println();

    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] image2={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        printResult(image);
        printResult(image2);
    }

    }


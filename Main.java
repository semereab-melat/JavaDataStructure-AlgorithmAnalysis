import java.util.Arrays;
import java.util.Random;

/***************************************************************
 Filename: 
 Created by: melat
 Created on: 18/02/2022
 Comment: return maximum and minimum value of a 2d array 
 ***************************************************************/
public class Main {
    public static void main(String[] args) {

        int [][] numbers = new int[10][10];
        Random rand = new Random(0);

        for (int row = 0; row < numbers.length; row++){
            for (int col = 0; col < numbers[row].length; col++){
                numbers[row][col] = rand.nextInt(100) + 1;
                //System.out.println(numbers[row][col]);
            }//for
        }

        System.out.println(maxMin(numbers));
    }

    private static String maxMin(int[][] array){
        int max = array[0][0]; int min = array[0][0]; //1
        for (int row = 0; row < array.length; row++){ //N + 1
            for (int col = 0; col < array[row].length; col++){ //N*N+1
                if (array[row][col] > max){ //N*N*N
                    max = array[row][col];  //N*N
                }//if
                if (array[row][col] < min){ //N*N*N
                    min = array[row][col];
                }//if

            }//for
        }//for
        return "Maximum: " + max + "\nMinimum: " + min;
    }//maxMin
}


/**
 * Sequential Search 
 *
 * @author Brandon Salines
 * @version 1
 */
import java.util.*;
public class SequentialSearch 
{
    public static void main(String[] args){
        int inputSize = 10000000;
       
        int [] numArray = new int [inputSize];
        Random rand = new Random();
        
        for (int i = 0; i < numArray.length; i++){
            
            numArray[i] = rand.nextInt(10000) + 1;
            
            
        }
        findNum(numArray);
        
    }


        
        public static void findNum(int [] array){
        int target = 99999999;
        for (int i = 0; i < array.length; i++){
            
            if (target == array[i]){
                System.out.print ("Found it!");
                break;
            }
            
         }
     }
}
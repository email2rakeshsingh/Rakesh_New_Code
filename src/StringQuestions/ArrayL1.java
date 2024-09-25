package StringQuestions;

import java.util.ArrayList;

public class ArrayL1 {
    public static void main(String[] args) {

        /*
         * Input = array1 = { 4, 2, 3, 1, 6 }; 
         * Output = First is: 4, Last is: 6
         */
     
        ArrayList<Integer> list = new ArrayList<>(5);
        
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(6);
        
        int first = list.get(0);  // First element (4)
        
        int last = list.get(list.size() - 1);  // Last element (6)
        
        System.out.println("First is: " + first + ", Last is: " + last);
    }
}

//Extract only Prime numbers from the list

import java.util.ArrayList;

public class isPrimescheck {
	
    public static void main(String[] args) {
    	
        int[] n = {121, 23, 45, 67, 55, 11, 68, 99, 20};
        ArrayList<Integer> a = new ArrayList<>();

        for (int num : n) {
            int count = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) 
                {
                    count++;
                }
            }

            if (count == 0) {
                a.add(num);
            }
        }

        System.out.println(a);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leetcode.array;

import java.util.Arrays;

/**
 * Find smallest two numbers in an array
 * loop twice, O(N) complexity
 * @author sugang
 */
public class SmallestTwoNumbers {
    
    public static int [] smallestTwo(int[] numbers){
        
        //problem of this method is that all numbers have to be unique; only need 1 flag to show it was visited before
        int smallest1 = Integer.MAX_VALUE;
        for( int i : numbers){
            if(smallest1 > i){
                smallest1 = i;
            }
        }
        
        int smallest2 = Integer.MAX_VALUE;
        boolean visited = false;
        for(int i : numbers){
            
            if(smallest1 == i && !visited){
                visited = true;
                continue;
            }
            
            if(smallest2 > i ){
                smallest2 = i;
            }
        }
        
        return new int[]{smallest1, smallest2};
        
    }
    
    
    public static void main(String[] args){
        
        int[] num = new int[]{1,3,2,4,5,6,7,1};
        
        System.out.println(Arrays.toString(smallestTwo(num)));
        
    }
    
}

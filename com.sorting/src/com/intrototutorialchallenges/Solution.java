package com.intrototutorialchallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 2/24/17.
 */

public class Solution <T> {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int V=scan.nextInt();
        int n=scan.nextInt();
        Integer[] ar = new Integer[n];
        Solution sol = new Solution();
        for(int i=0; i<n; i++){
            ar[i]=scan.nextInt();
        }
        System.out.println(sol.findNum(ar, V));
    }

    public int findNum(T[] arr, int num){
        List<T> list = new ArrayList<T>();
        Collections.addAll(list, arr);
        return list.indexOf(num);
    }

}

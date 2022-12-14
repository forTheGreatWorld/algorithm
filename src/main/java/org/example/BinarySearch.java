package org.example;

import scala.Int;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static int binarySearch(int[] arr, int left, int right, int findVal ){

       if (left > right) {
           return -1;
       }

       int mid = (left + right) / 2;
       int midVal = arr[mid];

       if (findVal > midVal) {
           return binarySearch(arr, mid + 1, right, findVal);
       } else if (findVal < midVal) {
           return binarySearch(arr, left, mid - 1, findVal);
       }else {
           return mid;
       }

    }

    public static List<Integer> binarySearch2(int[] arr, int left, int right, int findVal) {
        if (left > right) {
            return new ArrayList<Integer>();
        }

        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if (findVal > midVal) {
            return binarySearch2(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return binarySearch2(arr, left, mid - 1, findVal);
        }else {
            ArrayList<Integer> resIndexList = new ArrayList<Integer>();

            int temp = mid - 1;
            while (true) {
                if (temp < 0 || arr[temp] != findVal){
                    break;
                }
                resIndexList.add(temp);
                temp--;
            }
            resIndexList.add(mid);

            temp = mid + 1;
            while(true) {
                if (temp > arr.length - 1 || arr[temp] != findVal) {
                    break;
                }
                resIndexList.add(temp);
                temp++;
            }
            return resIndexList;
        }
    }

}

package ArrayOperations;

import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
    Array and List difference:
        1. Arrays can not store generics
    very imp to remember that in java reference is passed to function so, the data being passed is modified
 */

public class ArrayOperations {
    public static void main(String[] args) {
        System.out.println("---Welcome to array operations---");
        List<Integer> intaArray1 = createNewArrayWithValues(new Integer[] {1,2,3,4 ,99 ,33, 11, 44});;
        List<Integer> intArray2 = createNewArrayWithValues(new Integer[] {5,6,7,8,9 ,10 ,11 ,12 ,13 ,14});

        System.out.println("sliceArray(intaArray1,0,3) = " + sliceArray(intaArray1,0,0));
        System.out.println("Slice aray with step = " + sliceArray(intArray2,0,4,3));
        System.out.println("insertElementAtIndex(intaArray1,100,4) = " + insertElementAtIndex(intaArray1,100,4));
        System.out.println("concatTwoArrays(intaArray1 ,intArray2) = " + concatTwoArrays(intaArray1 ,intArray2));
        System.out.println("popFromArray() = " + popFromArray(intaArray1));
        System.out.println("removeFromArray(intaArray1,3) = " + removeFromArray(intaArray1, 3));
        System.out.println("reverse(intaArray1) = " + reverse(intaArray1));
        System.out.println("sort(intaArray1) = " + sort(intaArray1));


        System.out.println("intArray2 = " + intArray2);
        System.out.println("intaArray1 = " + intaArray1);
            

    }

    public static <T> List<T> createNewArrayWithValues(T[] arr){
        List<T> res = new ArrayList<T>(Arrays.<T>asList(arr));
        System.out.println("arr = " + res);
        return res;
    }
    public static <T> List<T> sliceArray(List<T> arr,int start, int stop){
        return arr.subList(start ,stop);
    }
    public static <T> List<T> sliceArray(List<T> arr,int start, int stop ,int step){
        System.out.println("slice with step initial = " + arr);
        List<T> res = new ArrayList<T>();
        for(int i=0;i<arr.size();i++){
            if(i%step==0) res.add(arr.get(i));
        }
        return res;
    }

    public static <T> List<T> insertElementAtIndex(List<T> err, T element ,int index){
        List<T> arr= new ArrayList<T>(err);
        arr.add(index ,element);
        return arr;
    }
    
    public static <T> List<T> concatTwoArrays(List<T> arr1 ,List<T> arr2){
        List<T> arr= new ArrayList<T>(arr1);
        arr.addAll(arr2);
        return arr;
    }
    public static <T> List<T> popFromArray(List<T>arr){
        return arr.subList(0,arr.size()-1);
    }
    public static <T> List<T> removeFromArray(List<T>arr ,int index){
        List<T> res = new ArrayList<T>(arr);
        res.remove(2);
        return res;
    }
    public static <T> List<T> reverse(List<T>arr){
        List<T> res = new ArrayList<T>();
        for(int i=arr.size()-1;i>=0;i--){
            res.add(arr.get(i));
        }
        return res;
    }
    public static <T extends Comparable<? super T>> List<T> sort(List<T>arr){
        List<T> res = new ArrayList<T>(arr);
        Collections.<T>sort(res);
        return res;
    }


}

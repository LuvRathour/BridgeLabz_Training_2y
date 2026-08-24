package Recursion;

public class MergeSort{
    public static void mergesort(int [] arr, int l , int r,int mid){
        if(l>=r){
            return;
        }
        mid = (l+r)/2;
        mergesort(arr,l,mid, mid);
        mergesort(arr,mid+1,r, mid);
        mergesort(arr,l,r,mid);
    }
}

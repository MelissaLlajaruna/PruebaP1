import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int cont=0;

        int n=6;
        int [] arr=new int[] {16,17,4,3,5,2};
        ArrayList<Integer> miarr = new ArrayList< >();




        for(int i=n-1; i>=0 ; i--){

            if(miarr.isEmpty()){
                miarr.add(arr[i]);
                cont++;

            }else if( cont>0 && arr[i] >miarr.get(cont-1)){
                miarr.add(arr[i]);
                cont++;     }
        }
       Collections.reverse(miarr);
        for (Integer integer : miarr) {
            System.out.println(integer);
        }



    }




}
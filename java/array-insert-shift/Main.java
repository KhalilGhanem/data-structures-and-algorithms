public class Main{

    public static void main(String[] args) {
        int[] myNum = {70,60, 20, 30, 40};
        int[] result= insertShiftArray(myNum,7);
        for (int i : result) {
            System.out.println(i);
        }

    }

    public static int[] insertShiftArray(int []arr,int n){
        int []newarr=new int[arr.length+1];
        int count=0;
        int middle=0;
        if (arr.length%2 !=0){
           middle=(arr.length/2)+1;
       }else {
           middle=arr.length/2;
       }
        newarr[middle]=n;
        int j=0;
        for (int i = 0; i < newarr.length; i++) {
            if (i==middle){
                continue;
            }
            newarr[i]=arr[j];
            j++;
        }

        return  newarr;
    }

}
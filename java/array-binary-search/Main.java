public class Main{

    public static void main(String[] args) {
        int [] testarr = {4, 8, 15, 16, 23, 42};
        int num=BinarySearch(testarr,15);
        System.out.println(num);

    }

     public static int BinarySearch(int[]arr,int key){
        int right=arr.length-1;
        int left =0;
        int middle;
        int result=-1;
        int count=0;
        while(left<=right){
            count++;
        middle=(left+right)/2;
        if(arr[middle]<key){
            left=middle+1;
        }else if(arr[middle]>key){
            right=middle-1;
        }else {
            return middle;
        }
        return result;
        }
        result=count;


        return  result;
    }

}
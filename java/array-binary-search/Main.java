public class Main{

    public static void main(String[] args) {
        int [] testarr = {4, 8, 15, 16, 23, 42};
//      System.out.println("test= "+());
        int num=BinarySearch(testarr,16);
        System.out.println(num);


    }

     public static int BinarySearch(int[]arr,int key){
       int right=arr.length-1;
       int left =0;
       int result=-1;
       while(left<=right){
         int middle=(left+right)/2;
         if(arr[middle]==key){
           result=middle;
           return  result;
         }else if(arr[middle]>key){
           right=middle-1;
         }else {
           left=middle+1;
         }
       }
       return  result;
    }

}



//  int right=arr.length-1;
//  int left =0;
//  int result=-1;
//  int count=0;
//       while(left<=right){
//         count++;
//         int middle=(left+right)/2;
//         if(arr[middle]<key){
//  left=middle+1;
//  }else if(arr[middle]>key){
//  right=middle-1;
//  }else {
//  return middle;
//  }
//  return result;
//  }
//  result=count;
//
//  return  result;

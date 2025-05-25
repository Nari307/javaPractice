import java.util.Arrays;

public class Demo {
    public  static  void  main(String[] args){
       //find largest number in an array
//        int[] arr={2,34,26,32,40};
//        int j=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(j<arr[i]){
//                j=arr[i];
//            }
//        }
//        System.out.print(j);

        //merge two arrays
//        int[] arr1={1,3,5};
//        int[] arr2={2,4,6};
//        int[] merge=new int[arr1.length+arr2.length];
        //custom functionality
//        for(int i=0;i<arr1.length;i++){
//            merge[i]=arr1[i];
//        }
//        for(int j=0;j<arr2.length;j++){
//            merge[arr1.length+j]=arr2[j];
//        }
//        System.out.print(Arrays.toString(merge));

        //inbuilt fuctions
//        System.out.print(Arrays.toString(merge));
//        System.arraycopy(arr1,0,merge,0,arr1.length);
//        System.arraycopy(arr2,0,merge,arr1.length,arr2.length);
//        System.out.print(Arrays.toString(merge));

        //sort an array
//        int[] arr={23,345,32,54,53};
//        int[] sort={};
        //logic function
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // Swap arr[j] and arr[j + 1]
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        System.out.print(Arrays.toString(arr));
        //inbuilt methods
//        sort=Arrays.stream(arr).sorted().toArray();
//        System.out.print(Arrays.toString(sort));
//       Arrays.sort(arr);
//       System.out.print(Arrays.toString(arr));

        //Count vowels and Consonants
//        String str="Automation";
//        int vowels=0,consonants=0;
//        for(int i=0;i<str.length();i++){
//            if("aeiouAEIOU".indexOf(str.charAt(i)) !=-1){
//                vowels++;
//            }else consonants++;
//        }
//        System.out.print("Vowels "+vowels +", Consonants "+consonants);
        //prime number check
//        int num=56,count=0;
//        for(int i=2;i<=num/2;i++){
//            if(num%i==0){
//                count++;
//                break;
//            }
//        }
//        if(count>0){
//            System.out.print("not a prime number");
//        }else System.out.print("prime number");
        //factorial of a number
//        int num=5;
//        int sum= num;
//        for(int i=num-1;i>0;i--){
//            sum=sum*i;
//        }
//        System.out.print(sum);
        //fibonacci series
//        int n=10,num1=0,num2=1;
//        int sum=0;
//        System.out.print("Febonacci series "+num1+", "+num2);
//        for (int i=n;i>=0;i--){
//            sum=num1+num2;
//            System.out.print(", "+sum);
//            num1=num2;
//            num2=sum;
//        }
        //palindrome
//        String str="madam";
        //login function
//        String str1="";
//        for(int i=str.length()-1;i>=0;i--){
//            str1=str1+str.charAt(i);
//        }
//        if(str.equals(str1)){
//            System.out.print(str1);
//            System.out.print("Given String is a palindrome");
//        }
//        else {
//            System.out.print("Give string is a not a palindrome");
//        }
        //inbuiltmethod
//        String rev=new StringBuilder(str).reverse().toString();
//        System.out.print(str.equals(rev));


        //Reverse a String
//        String str="Narayana";
//        String rev="";
        //logic function
//        for(int i=str.length()-1; i>=0;i--){
//            rev=rev+str.charAt(i);
//        }
//        System.out.print(rev);
//        //inbuilt method
//        StringBuilder rev2=new StringBuilder(str).reverse();
//        System.out.print(rev2);

//System.out.println("hello user");
//
//int a[] ={2,53,3,25,4};
//
//int b[];
//
//b=Arrays.stream(a).sorted().toArray();
//
//for(int c:b){
//    System.out.print(c+",");
//}
//for(int b :a){
//    System.out.println(b);
//}
}
}


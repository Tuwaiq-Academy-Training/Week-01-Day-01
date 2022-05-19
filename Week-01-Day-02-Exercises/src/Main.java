public class Main {
    public static void main(String[] args) {

        //Exercise 1:
        for (int i = 0; i <= 10; i++) {
            if (i == 9) {
                break;
            }
            System.out.println(i);
        }


        //Exercise 2:
       for (int j=0; j<20; j++){
           if(j%2==0){
               continue;
           }
           System.out.println("Odd Number: "+j);
       }


       //Exercise 3:
        String Role="Admin";
       switch(Role){
            case "Admin":
                System.out.println("Welcome Admin");
            case "SuperUser":
               System.out.println("Welcome SuperUser");
           default:
               System.out.println("Welcome User");
        }

        //Exercise 4:
        int i,factorial=1;
        int number=5;
        for(i=1;i<=number;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+number+" is: "+factorial);


        //Exercise 5:
        String str = "Radar", reverseStr = "";

        int strLength = str.length();

        for (int l = (strLength - 1); l >=0; --l) {
            reverseStr = reverseStr + str.charAt(l);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }




        //Exercise 6:
        int arr[]={5,5,10,10};
        int length=arr.length;
        length=removeDuplicateElements(arr,length);
        for (int e=0; e<length; e++){
            System.out.println(arr[e]);
        }

    }
    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // Changing original array
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }
}



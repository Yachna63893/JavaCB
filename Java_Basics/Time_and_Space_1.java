package Java_Basics;

public class Time_and_Space_1 {
    public static void main(String[] args) {
        // long start = System.currentTimeMillis();
        // for(int i=0; i<1000000; i++){

        // }
        // long end = System.currentTimeMillis(); 
        // System.out.println(end-start);


        // System.out.println("Hello");//O(1)
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");


        int n = 10000;
        int i = 0;
        while(i<n){
            System.out.println("Hey");
            //O(N)
            i++;
        }

        while(i<=n){
            System.out.println("Hey");
            i*=2;
            //O(Log N) base 2;
        }

        while(n>0){
            System.out.println("Hey");
            n/=2;
            //O(Log N) base 2;
        }

        while(i<=n){
            System.out.println("Hey");
            //O(N)
            i+=2;
            i+=3;
        }

        while(i<=n){
            System.out.println("Hey");
            //O(Log N) base 6;
            i*=2;
            i*=3;
        }

        while(n>0){
            System.out.println("Hey");
            //O(Log N) base 6
            n/=2;
            n/=3;
        }

        int k = 3;
        while(i<=n){
            System.out.println("Hey");
            //O(N/k)
            i+=k;
        }
        while(i<=n){
            System.out.println("Hey");
            //O(Log N) base k
            i*=k;
        }

        //Nested loop
        for(i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                //O(N^2)
                System.out.println("Hey");
            }
        }

        for(i=1; i*i<=n; i++){
            System.out.println("Hey");
            //O(sqrt(N))
        }

        for(i=1; i<=n; i++){
            for(int j=1; j<=i*i; j++){
                for(k=1; k<=n/2; k++){
                    //O(N^4)
                    System.out.println("Hey");
                }
            }
        }

        for(i=1; i<=n; i*=2){
            System.out.println("Hey");
            //O(Log N) base 2
        }

        for(i=n/2; i<=n; i++){
            for(int j=1; j<=n/2; j++){
                for(int l=1; l<=n; l=l*2){
                    //O(N^2 Log(N))
                    System.out.println("Hey");
                }
            }
        }

        for(i=1; i<=n; i++){
            for(int j=1; j<=n; j+=i){
                System.out.println("Hey");
                //O(N Log (N))
            }
        }
    }

    //Bubble Sort
    public static void Sort(int[] arr){
        for(int turn=1; turn<arr.length; turn++){
            for(int i=0; i<arr.length-turn; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }  
        }
    } 
    
    //Insertion Sort
    public static void InsertLastElement(int[] arr, int i){
        int item = arr[i];
        int j = i-1;
        while(j>=0 && arr[j]>item){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = item;
    }
}


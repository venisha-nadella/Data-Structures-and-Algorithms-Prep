import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int count=0;
        for(int i=0;i<5;i++){
            if(a[i]==key){
                System.out.println("First occurrence at "+i+" index");
                break;
            }
        }
    }
}

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        boolean found=false;
        for(int var:a){
            if(var==key){
                found=true;
                break;
            }
        }
        if(found) System.out.println("Key found");
        else System.out.println("Key not found");
    }
}

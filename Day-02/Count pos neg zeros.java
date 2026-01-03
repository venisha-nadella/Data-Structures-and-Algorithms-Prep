class Main {
    public static void main(String[] args) {
        int a[]=new int[]{-2,-1,0,1,2};
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                count1++;
            }
            else if(a[i]<0){
                count2++;
            }
            else{
                count3++;
            }
        }
        System.out.println("No of pos no.s="+count1);
        System.out.println("No of neg no.s="+count2);
        System.out.println("No of zeros="+count3);
    }
}

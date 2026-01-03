class Main {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4};
        int sum=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        double avg=(double)sum/n;
        System.out.print("Avg="+avg);
    }
}

class Main {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.print("Max="+max);
    }
}

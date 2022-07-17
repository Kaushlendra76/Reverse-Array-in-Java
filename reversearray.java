public class reversearray {
    int[] a =new int[] {3,4,5,6};
    void print(){
        for(int x : a){
        System.out.println(x);
        }
    }
    void reverse(){
    int j =a.length-1;
    for (int i = 0; i <j; i++) {
        int temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        j--;
        
    }
    
    }
    public static void main(String[] args) {
        reversearray obj = new reversearray();
        obj.print();
        obj.reverse();
        obj.print();
    }
}

import java.util.*;
class tempCodeRunnerFile{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int f=1;
        for( int n=sc.nextInt(); n>0; n--) {
            f=f*n;
        }
        System.out.println(f);
    }
}

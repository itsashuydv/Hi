public class Practice5 {

    public static void main(String[] args) {

        // fabonacci series
        int n = 5;
        int n0 = 0;
        int n1 = 1;
        int fb;
        System.out.print(n0 + " ");
        System.out.print(n1 + " ");

        for (int i = 2; i <= n; i++) {
            fb = n0 + n1;
            n0 = n1;
            n1 = fb;
            System.out.print(fb + " ");
        }

        System.out.println();

        // factorial number
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        // check Prime number
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%2==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" is Prime ");
        }
        else{
            System.out.println(n+" is not Prime ");
        }

        // 
    }

}

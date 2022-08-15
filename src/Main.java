public class Main {
    public static void main(String[] args) {
        int sayac = 0,a,i;


        for(a=2;a<=100; a++){
            boolean asalMi=true;
            for(i=2;i<a; i++) {
                if (a % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if(asalMi == true){
                System.out.print(a +"\n");
                sayac++;
            }
        }
    }
}
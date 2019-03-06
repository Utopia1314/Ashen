public class Tuzi {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long start = System.currentTimeMillis();
        System.out.println(new Tuzi().gettuzi(50));
        long end = System.currentTimeMillis();
        System.out.println(cishu);
        System.out.println(end-start);



    }
    public static long cishu=0;
    public long gettuzi(int month){
        cishu++;
        if(month==1){
            return 1L;
        }
        if(month==2){
            return 1L;
        }
        return gettuzi(month-1)+gettuzi(month-2);

    }
}

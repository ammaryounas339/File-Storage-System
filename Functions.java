public class Functions {
    public static int buffer_size(long len){
        if(len<1000000){
            return Math.round(len/100);
        }
        else if (len < 1000000000){
            return Math.round(len/1000);
        }
        else if (len < 1000000000){
            return Math.round(len / 10000);
        }
        else{
            return Math.round(len / 100000);
        }
    }
}

public class BinOps {

    public String sum(String a, String b){
        int c = Integer.parseInt(a, 2);
        int d = Integer.parseInt(b, 2);
        return Integer.toBinaryString(c + d);
    }

    public String mult(String a, String b){
        int c = Integer.parseInt(a, 2);
        int d = Integer.parseInt(b, 2);
        return Integer.toBinaryString(c * d);
    }
}

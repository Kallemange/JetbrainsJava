import java.lang.reflect.Array;
import java.util.List;
//class Main{
//    public static void main(String[] args) {
//        byte[] x = {'a', 'b', 'c'};
//        AsciiCharSequence X = new AsciiCharSequence(x);
//        System.out.println(X.toString());
//        System.out.println(X.length());
//        System.out.println(X.charAt(2));
//        System.out.println("Subsequence "+X.subSequence(0,1).toString() + ".");
//        System.out.println("Subsequence "+X.subSequence(0,4).toString() + ".");
//    }
//}


class AsciiCharSequence implements java.lang.CharSequence {
    // implementation
    byte[] bytes;

    AsciiCharSequence(byte[] bytes){
        this.bytes = bytes;
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int i) {
            return (char) bytes[i];
    }

    @Override
    public AsciiCharSequence subSequence(int i, int i1) {
        return new AsciiCharSequence(java.util.Arrays.copyOfRange(bytes, i, i1));

    }

    @Override
    public String toString() {
        return new String(bytes);
    }
}
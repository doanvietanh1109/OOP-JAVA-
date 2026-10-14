import java.util.*;
import java.math.*;

class PhanSo {
    private long tu;
    private long mau;
    public PhanSo(long tu, long mau) {
        BigInteger tmp1 = BigInteger.valueOf(tu);
        BigInteger tmp2 = BigInteger.valueOf(mau);
        long gcd = tmp1.gcd(tmp2).longValue();
        this.tu = tu/gcd;
        this.mau = mau/gcd;
    }
    public long getTu() {
        return tu;
    }
    public long getMau() {
        return mau;
    }
    public void setTu(long tu) {
        this.tu = tu;
    }
    public void setMau(long mau) {
        this.mau = mau;
    }
    @Override
    public String toString() {
        return String.format("%d/%d", this.tu, this.mau);
    }

}
public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
        System.out.println(a.toString());
        sc.close();
    }
}
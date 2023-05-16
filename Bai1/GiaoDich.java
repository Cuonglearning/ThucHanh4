package Bai1;
import java.util.Scanner;


public class GiaoDich {
    Scanner scan=new Scanner(System.in);
    public String MaGiaoDich,NgayGiaoDich;
    public long DonGia;
    public float DienTich;

    public GiaoDich() {
    }

    public GiaoDich(String MaGiaoDich, String NgayGiaoDich, long DonGia, float DienTich) {
        this.MaGiaoDich = MaGiaoDich;
        this.NgayGiaoDich = NgayGiaoDich;
        this.DonGia = DonGia;
        this.DienTich = DienTich;
    }

    public String getMaGiaoDich() {
        return MaGiaoDich;
    }

    public void setMaGiaoDich(String MaGiaoDich) {
        this.MaGiaoDich = MaGiaoDich;
    }

    public String getNgayGiaoDich() {
        return NgayGiaoDich;
    }

    public void setNgayGiaoDich(String NgayGiaoDich) {
        this.NgayGiaoDich = NgayGiaoDich;
    }

    public long getDonGia() {
        return DonGia;
    }

    public void setDonGia(long DonGia) {
        this.DonGia = DonGia;
    }

    public float getDienTich() {
        return DienTich;
    }

    public void setDienTich(float DienTich) {
        this.DienTich = DienTich;
    }
    
    public void Nhap(){
        System.out.println("Nhap ma giao dich:");
        MaGiaoDich=scan.nextLine();
        System.out.println("Ngay giao dich(Ngay/thang/nam):");
        NgayGiaoDich=scan.nextLine();
        System.out.println("Nhap don gia");
        DonGia=scan.nextLong();
        System.out.println("Nhap dien tich:");
        DienTich=scan.nextFloat();
    }

    @Override
    public String toString() {
        return "GiaoDich{" + "MaGiaoDich=" + MaGiaoDich + ", NgayGiaoDich=" + NgayGiaoDich + ", DonGia=" + DonGia + ", DienTich=" + DienTich + '}';
    }
    
    
}

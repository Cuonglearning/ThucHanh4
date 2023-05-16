package Bai2;
import java.util.Scanner;

abstract class KhachHang {
    Scanner scan=new  Scanner(System.in);
    public String MaKhachHang, HoTen, NgayRaHoaDon;
    public int SoLuong;
    public long DonGia;

    public KhachHang() {
    }

    public KhachHang(String MaKhachHang, String HoTen, String NgayRaHoaDon, int SoLuong, long DonGia) {
        this.MaKhachHang = MaKhachHang;
        this.HoTen = HoTen;
        this.NgayRaHoaDon = NgayRaHoaDon;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }
    
    abstract void ThanhTien();

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgayRaHoaDon() {
        return NgayRaHoaDon;
    }

    public void setNgayRaHoaDon(String NgayRaHoaDon) {
        this.NgayRaHoaDon = NgayRaHoaDon;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public long getDonGia() {
        return DonGia;
    }

    public void setDonGia(long DonGia) {
        this.DonGia = DonGia;
    }
    
    public void Nhap(){
        System.out.println("Nhap ma khach hang:");
        MaKhachHang=scan.nextLine();
        System.out.println("Nhap ten khach hang:");
        HoTen=scan.nextLine();
        System.out.println("Ngay ra hoa don(Ngay/Thang/Nam):");
        NgayRaHoaDon=scan.nextLine();
        System.out.println("Nhap so luong KW tieu thu:");
        SoLuong=scan.nextInt();
        System.out.println("Nhap don gia:");
        DonGia=scan.nextLong();
    }

    @Override
    public String toString() {
        return "KhachHang{" +  ", MaKhachHang=" + MaKhachHang + ", HoTen=" + HoTen + ", NgayRaHoaDon=" + NgayRaHoaDon + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia ;
    }
    
    
}

package Bai2;

public class KhachHangNuocNgoai extends KhachHang{
    public String QuocTich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String QuocTich, String MaKhachHang, String HoTen, String NgayRaHoaDon, int SoLuong, long DonGia) {
        super(MaKhachHang, HoTen, NgayRaHoaDon, SoLuong, DonGia);
        this.QuocTich = QuocTich;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String QuocTich) {
        this.QuocTich = QuocTich;
    }
    
    @Override
    public void ThanhTien(){
        System.out.println(SoLuong*DonGia);
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap quoc tich:");
        QuocTich=scan.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "QuocTich=" + QuocTich + '}';
    }
    
}

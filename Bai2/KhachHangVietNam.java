package Bai2;

public class KhachHangVietNam extends KhachHang{
    public String DoiTuongKhachHang;
    public int DinhMuc,n;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(String DoiTuongKhachHang, int DinhMuc, String MaKhachHang, String HoTen, String NgayRaHoaDon, int SoLuong, long DonGia) {
        super(MaKhachHang, HoTen, NgayRaHoaDon, SoLuong, DonGia);
        this.DoiTuongKhachHang = DoiTuongKhachHang;
        this.DinhMuc = DinhMuc;
    }

    public String getDoiTuongKhachHang() {
        return DoiTuongKhachHang;
    }

    public void setDoiTuongKhachHang(String DoiTuongKhachHang) {
        this.DoiTuongKhachHang = DoiTuongKhachHang;
    }

    public int getDinhMuc() {
        return DinhMuc;
    }

    public void setDinhMuc(int DinhMuc) {
        this.DinhMuc = DinhMuc;
    }

    @Override
    public void ThanhTien(){
        if(SoLuong<=DinhMuc)
            System.out.println(SoLuong*DonGia);
        else if(SoLuong>DinhMuc)
            System.out.println(SoLuong*DonGia*DinhMuc+(SoLuong-DinhMuc)*DonGia*2.5);
        else
            System.out.println("gia tri khong hop le!");
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap doi tuong khach hang:");
        System.out.println("1.sinh hoat");
        System.out.println("2.kinh doanh");
        System.out.println("3.San xuat");
        n=scan.nextInt();
        switch (n){
            case 1:
                DoiTuongKhachHang="Sinh hoat";
                break;
            case 2:
                DoiTuongKhachHang="Kinh doanh";
            case 3:
                DoiTuongKhachHang="San xuat";
            default:
                System.out.println("Khong hop le!");
        }
        System.out.println("Nhap dinh muc:");
        DinhMuc=scan.nextInt();
        
    }

    @Override
    public String toString() {
        return super.toString() + "DoiTuongKhachHang=" + DoiTuongKhachHang + ", DinhMuc=" + DinhMuc + '}';
    }
}

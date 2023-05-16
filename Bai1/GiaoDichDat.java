package Bai1;

public class GiaoDichDat extends GiaoDich{
    public String LoaiDat;

    public GiaoDichDat() {
    }

    public GiaoDichDat(String LoaiDat, String MaGiaoDich, String NgayGiaoDich, long DonGia, float DienTich) {
        super(MaGiaoDich, NgayGiaoDich, DonGia, DienTich);
        this.LoaiDat = LoaiDat;
    }

    public String getLoaiDat() {
        return LoaiDat;
    }

    public void setLoaiDat(String LoaiDat) {
        this.LoaiDat = LoaiDat;
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap loai dat(A/B/C):");
        LoaiDat=scan.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+", loai dat: "+this.LoaiDat;
    }
    
}

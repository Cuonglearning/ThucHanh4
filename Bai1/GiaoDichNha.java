package Bai1;

public class GiaoDichNha extends GiaoDich {
    public String LoaiNha,DiaChi;
    public int chon;

    public GiaoDichNha() {
    }

    public GiaoDichNha(String LoaiNha, String DiaChi, String MaGiaoDich, String NgayGiaoDich, long DonGia, float DienTich) {
        super(MaGiaoDich, NgayGiaoDich, DonGia, DienTich);
        this.LoaiNha = LoaiNha;
        this.DiaChi = DiaChi;
    }

    public String getLoaiNha() {
        return LoaiNha;
    }

    public void setLoaiNha(String LoaiNha) {
        this.LoaiNha = LoaiNha;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhap dia chi:");
        DiaChi=scan.nextLine();
        System.out.println("Chon loai nha:");
        System.out.println("1.Cao cap");
        System.out.println("2.Thuong");
        chon=scan.nextInt();
        switch(chon){
            case 1:
                LoaiNha="Cao cap";
                break;
            case 2:
                LoaiNha="Thuong";
                break;
            default:
                System.out.println("Khong hop le!");
                break;
        }
        
    
    }

    @Override
    public String toString() {
        return super.toString()+",loai nha:"+this.LoaiNha+",dia chi: "+this.DiaChi;
    }
}

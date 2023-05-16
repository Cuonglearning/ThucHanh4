package Bai2;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachHang {
    ArrayList<KhachHangVietNam> arrKhachHangVietNam=new ArrayList<>();
    ArrayList<KhachHangNuocNgoai> arrKhachHangNuocNgoai=new ArrayList<>();
    int SoKhachHangVn=0;
    int SoKhachHangnn=0;
    long TongTienDien=0;
    long TrungBinhTienDien=0;
    Scanner scan=new Scanner(System.in);
    
    public void NhapThongTin(){
        System.out.println("Nhap so luong khach hang Viet Nam:");
        SoKhachHangVn=scan.nextInt();
        System.out.println("Nhap so luong khach hang nuoc ngoai:");
        SoKhachHangnn=scan.nextInt();
        
        System.out.println("Nhap khach hang Viet Nam:");
        for(int i=0;i<arrKhachHangVietNam.size();i++){
            System.out.println("Khach hang Viet Nam "+(i+1));
            KhachHangVietNam khachHangVietNam=new KhachHangVietNam();
            khachHangVietNam.Nhap();
            arrKhachHangVietNam.add(khachHangVietNam);
        }
        System.out.println("Nhap khach hang nuoc ngoai:");
        for(int i=0;i<arrKhachHangNuocNgoai.size();i++){
            System.out.println("Khach hang nuoc ngoai "+(i+1));
            KhachHangNuocNgoai khachHangNuocNgoai=new KhachHangNuocNgoai();
            khachHangNuocNgoai.Nhap();
            arrKhachHangNuocNgoai.add(khachHangNuocNgoai);
        }
    }
      public void XuatThongTin(){
            System.out.println("Thong tin cac khach hang Viet Nam:");
            for(int i=0;i<arrKhachHangVietNam.size();i++){
                System.out.println(arrKhachHangVietNam.get(i).toString());
            }

            System.out.println("Thong tin cac khach hang nuoc ngoai:");
            for(int i=0;i<arrKhachHangNuocNgoai.size();i++){
                System.out.println(arrKhachHangNuocNgoai.get(i).toString());
            }
        
        
        System.out.println("Tong so luong khach hang Viet Nam la:"+arrKhachHangVietNam.size());
        System.out.println("Tong so luong khach hang nuoc ngoai la:"+arrKhachHangNuocNgoai.size());
        
        TrungBinhTienDien=TongTienDien/arrKhachHangNuocNgoai.size();
        System.out.println("Trung binh thanh tien cua khach hang nuoc ngoai="+TrungBinhTienDien);
        
        System.out.println("Cac hoa don khch hang Viet Nam thang 9 nam 2013:");
        for(int i=0;i<arrKhachHangVietNam.size();i++){
            String[] dateKhachHangVietNam=arrKhachHangVietNam.get(i).getNgayRaHoaDon().split("/");
            if(dateKhachHangVietNam[1].equals("9")&&dateKhachHangVietNam[2].equals("2013")){
                System.out.println(arrKhachHangVietNam.get(i).toString());
            }
        }
        
        System.out.println("Cac hoa don khach hang nuoc ngoai thang 9 nam 2013:");
        for(int i=0;i<arrKhachHangNuocNgoai.size();i++){
            String[] dateKhachHangNuocNgoai=arrKhachHangNuocNgoai.get(i).getNgayRaHoaDon().split("/");
            if(dateKhachHangNuocNgoai[1].equals("9")&&dateKhachHangNuocNgoai[2].equals("2013")){
                System.out.println(arrKhachHangNuocNgoai.get(i).toString());
            }
        }
        }

}

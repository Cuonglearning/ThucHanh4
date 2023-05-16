package Bai1;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyGiaoDich {

        ArrayList<GiaoDichDat> arrGiaoDichDat=new ArrayList<>();
        ArrayList<GiaoDichNha> arrGiaoDichNha=new ArrayList<>();
        int SoGiaoDichDat=0;
        int SoGiaoDichNha=0;
        long TongTienGiaoDichDat=0;
        long TrungBingThanhTien=0;
        Scanner scan=new Scanner(System.in);
        
        public void NhapThongTin(){ 
            System.out.println("Nhap so luong giao dich dat:");
            SoGiaoDichDat=scan.nextInt();
            System.out.println("Nhap so luong giao dich nha:");
            SoGiaoDichNha=scan.nextInt();

            System.out.println("Nhap thong tin giao dich dat:");
            for (int i=0;i<SoGiaoDichDat;i++){
                System.out.println("Nhap giao dich dat lan thu "+(i+1)+":");
                GiaoDichDat giaoDichDat=new GiaoDichDat();
                giaoDichDat.Nhap();
                arrGiaoDichDat.add(giaoDichDat);
            }

            System.out.println("Nhap thong tin giao dich nha:");
            for (int i=0;i<SoGiaoDichNha;i++){
                System.out.println("Nhap giao dich nha lan thu "+(i+1)+":");
                GiaoDichNha giaoDichNha=new GiaoDichNha();
                giaoDichNha.Nhap();
                arrGiaoDichNha.add(giaoDichNha);
            }
        }
        
        public void XuatThongTin(){
            System.out.println("Thong tin cac giao dich dat:");
            for(int i=0;i<arrGiaoDichDat.size();i++){
                System.out.println(arrGiaoDichDat.get(i).toString());
            }

            System.out.println("Thong tin cac  giao dich nha:");
            for(int i=0;i<arrGiaoDichNha.size();i++){
                System.out.println(arrGiaoDichNha.get(i).toString());
            }
        
        for(int i=0;i<arrGiaoDichDat.size();i++){
            if(arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("A")){
                TongTienGiaoDichDat+=arrGiaoDichDat.get(i).getDienTich()*arrGiaoDichDat.get(i).getDonGia()*1.5;
            }else if(arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("B")||arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("A")){
                TongTienGiaoDichDat+=arrGiaoDichDat.get(i).getDienTich()*arrGiaoDichDat.get(i).getDonGia();
            }
        }
        
        System.out.println("Tong so luong giao dich dat la:"+arrGiaoDichDat.size());
        System.out.println("Tong so luong giao dich nha la:"+arrGiaoDichNha.size());
        
        TrungBingThanhTien=TongTienGiaoDichDat/arrGiaoDichDat.size();
        System.out.println("Trung binh thanh tien cua giao dich dat="+TrungBingThanhTien);
        
        System.out.println("Cac giao dich dat thang 9 nam 2013:");
        for(int i=0;i<arrGiaoDichDat.size();i++){
            String[] dateGiaoDichDat=arrGiaoDichDat.get(i).getNgayGiaoDich().split("/");
            if(dateGiaoDichDat[1].equals("9")&&dateGiaoDichDat[2].equals("2013")){
                System.out.println(arrGiaoDichDat.get(i).toString());
            }
        }
        
        System.out.println("Cac giao dich nha thang 9 nam 2013:");
        for(int i=0;i<arrGiaoDichNha.size();i++){
            String[] dateGiaoDichNha=arrGiaoDichNha.get(i).getNgayGiaoDich().split("/");
            if(dateGiaoDichNha[1].equals("9")&&dateGiaoDichNha[2].equals("2013")){
                System.out.println(arrGiaoDichNha.get(i).toString());
            }
        }
        }
    
}

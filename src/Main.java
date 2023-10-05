import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // TODO: Xây dựng trò chơi búa kéo bao
//        // qui ước : búa = 1; kéo = 2; bao = 3;
//        // qui định : búa ăn kéo, kéo ăn bao , bao ăn búa
//        int soLanNguoiChoiThang = 0;
//        int soLanMayThang = 0;
//        boolean coChoiTiep = true;
//        do{
//            Random random = new Random();
//            int luaChonCuaMay = random.nextInt(3) + 1;
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Nhập búa kéo bao (búa = 1 , kéo = 2 , bao = 3): ");
//            int luaChonCuaNguoiChoi = Integer.parseInt(sc.nextLine());
//            if((luaChonCuaMay == 1 && luaChonCuaNguoiChoi == 2) || (luaChonCuaMay == 2 && luaChonCuaNguoiChoi == 3) || (luaChonCuaMay == 3 && luaChonCuaNguoiChoi == 1)){
//                // máy thắng
//                soLanMayThang += 1;
//                System.out.println("Máy thắng");
//            } else if ((luaChonCuaNguoiChoi == 1 && luaChonCuaMay == 2) || (luaChonCuaNguoiChoi == 2 && luaChonCuaMay == 3) || (luaChonCuaNguoiChoi == 3 && luaChonCuaMay == 1)) {
//                // người chơi thắng
//                soLanNguoiChoiThang += 1;
//                System.out.println("Người chơi thắng");
//            }else {
//                // hòa
//                System.out.println("Hòa");
//            }
//            System.out.print("Bấm phím bất kì để chơi tiếp, bấm 0 để dừng và xem kết quả): ");
//            String chuBaoHieu = sc.nextLine();
//
//            if (chuBaoHieu.equals("0")) {
//                coChoiTiep = false;
//            }
//        }while (coChoiTiep);
//
//        if (soLanMayThang > soLanNguoiChoiThang){
//            System.out.print("Máy chiến thắng với tỷ số: " + soLanMayThang + " - " + soLanNguoiChoiThang);
//        } else if (soLanMayThang < soLanNguoiChoiThang) {
//            System.out.print("Người chơi thắng với tỷ số: " + soLanNguoiChoiThang + " - " + soLanMayThang);
//        } else {
//            System.out.print("Hai bên hòa với tý số: " + soLanMayThang + " - " + soLanNguoiChoiThang);
//        }
//

//        // TODO: tìm ra số nguyên n nhỏ nhất thỏa điều kiện 1 + 2 + n > 10000
//        int tongSoNguyen = 0;
//        for( int i = 1 ; tongSoNguyen < 10000 ; i++){
//            tongSoNguyen += i;
//            if (tongSoNguyen > 10000){
//                System.out.print("Số nguyên n nhỏ nhất thỏa điều kiện là: " + i);
//            }
//        }

//        // TODO: tính tổng số nguyên dương lẻ từ con số người dùng nhập
//        int soNguoiDungNhap;
//        int tongSoNguyenLe = 0;
//        do{
//            Scanner sc2 = new Scanner(System.in);
//            System.out.print("Nhập một số nguyên bất kỳ: ");
//            soNguoiDungNhap = Integer.parseInt(sc2.nextLine());
//            if(soNguoiDungNhap > 0){
//                for(int i = 1 ; i < soNguoiDungNhap ; i = i + 2){
//                    tongSoNguyenLe += i;
//                }
//            }
//        }while (soNguoiDungNhap < 0);
//
//        System.out.print("Tổng số nguyên dương lẻ là: " + tongSoNguyenLe);

//        // TODO : nhập só nguyên tính tổng
//
//        // quy định x = 7
//
//        int tong = 0;
//        Scanner sc3 = new Scanner(System.in);
//        System.out.print("Nhập số nguyên n bất kì: ");
//        int soNguyenNguoiDungNhap = Integer.parseInt(sc3.nextLine());
//        for(int i = 1 ; i <= soNguyenNguoiDungNhap ; i++){
//            tong += Math.pow(6, i);
//        }
//        System.out.print("Tổng là: " + tong);


        // TODO: Số năm tối thiểu cần phải đợi

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Nhập số tiền bạn gửi vào ngân hàng: ");
        double soTienGuiVao = sc4.nextDouble();
        System.out.print("Nhập lãi suất hằng năm: ");
        double laiSuatHangNam = sc4.nextDouble();
        System.out.print("Nhập số tiền mục tiêu: ");
        double soTienMucTieu = sc4.nextDouble();
        laiSuatHangNam /= 100;
        double soNamCanThiet = Math.log(soTienMucTieu / soTienGuiVao) / Math.log(1 + laiSuatHangNam);
        long soNamTron = Math.round(soNamCanThiet);
        System.out.print("Số năm tối thiểu cần chờ là: " + soNamTron + " năm");


    }
}
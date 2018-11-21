package btgk_java1;

import java.util.ArrayList;
import java.util.Scanner;

class NHANVIEN {
    
    Scanner scanner = new Scanner(System.in);
    String ten;
    int tuoi;
    String diachi;
    double luong, thuong;
    int giocong;
    
    NHANVIEN() {
        this.thuong = 0;
    }
    
    NHANVIEN(String ten, int tuoi, String diachi, double luong, int giocong) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.luong = luong;
        this.giocong = giocong;
    }
    
    void inputInfo() {
        System.out.print("TÊN NV: ");
        this.ten = scanner.nextLine();
        System.out.print("TUỔI NV: ");
        this.tuoi = Integer.parseInt(scanner.nextLine());
        System.out.print("ĐỊA CHỈ NV: ");
        this.diachi = scanner.nextLine();
        System.out.print("TIỀN LƯƠNG CỦA NV: ");
        this.luong = Double.parseDouble(scanner.nextLine());
        System.out.print("GIỜ CÔNG CỦA NV: ");
        this.giocong = Integer.parseInt(scanner.nextLine());
    }
    
    void printInfo() {
        System.out.printf("NHÂN VIÊN %s ĐÃ LÀM ĐƯỢC %d GIỜ CÔNG --->>> TIỀN LƯƠNG: %d VNĐ", ten, giocong, (int) moneySalary());
        System.out.println();
        System.out.println("**************************************************************");
    }
    
    double moneySalary() {
        if (giocong >= 200) {
            thuong = luong * 0.2;
        } else if (giocong < 200 && giocong >= 100) {
            thuong = luong * 0.1;
        } else {
            thuong = 0;
        }
        return (double) luong + thuong;
    }
}

class STUDENT {
    
    Scanner scanner = new Scanner(System.in);
    String masv;
    float dtb;
    int tuoi;
    String lop;
    
    STUDENT() {
        
    }
    
    STUDENT(String masv, float dtb, int tuoi, String lop) {
        this.masv = masv;
        this.dtb = dtb;
        this.tuoi = tuoi;
        this.lop = lop;
    }
    
    void inputInfo() {
        System.out.print("MÃ SINH VIÊN: ");
        String masinhvien = scanner.nextLine();
        System.out.print("ĐIỂM TRUNG BÌNH: ");
        float diemtrungbinh = Float.valueOf(scanner.nextLine());
        System.out.print("TUỔI: ");
        int tuoisv = Integer.parseInt(scanner.nextLine());
        System.out.print("LỚP: ");
        String lopsv = scanner.nextLine();
        int countcharmsv = masinhvien.length();
        char charlop = lopsv.charAt(0);
        if (countcharmsv == 8) {
            if (diemtrungbinh >= 0 && diemtrungbinh <= 10) {
                if (tuoisv >= 18) {
                    if (charlop == 'A' || charlop == 'C') {
                        this.masv = masinhvien;
                        this.dtb = diemtrungbinh;
                        this.tuoi = tuoisv;
                        this.lop = lopsv;
                    } else {
                        System.err.println("LỚP PHẢI CÓ KÍ TỰ ĐẦU TIÊN A HOẶC C");
                    }
                } else {
                    System.err.println("TUỔI SINH VIÊN PHẢI LỚN HƠN HOẶC BẰNG 18");
                }
            } else {
                System.err.println("ĐIỂM TRUNG BÌNH TỪ 0 ĐẾN 10");
            }
        } else {
            System.err.println("MÃ SINH VIÊN PHẢI CÓ 8 KÍ TỰ");
        }
    }
    
    void showInfo() {
        System.out.println("MÃ SINH VIÊN --->>> " + masv);
        System.out.println("ĐIỂM TRUNG BÌNH --->>> " + dtb);
        System.out.println("TUỔI SINH VIÊN --->>> " + tuoi);
        System.out.println("LỚP CỦA SINH VIÊN --->>> " + lop);
        if (dtb > 8) {
            System.out.println("SINH VIÊN ĐÃ ĐẠT HỌC BỔNG !");
        }
    }
}

public class BTGK_JAVA1 {
    
    public static void main(String[] args) {
//        NHANVIEN nv1 = new NHANVIEN();
//        nv1.inputInfo();
//        nv1.printInfo();
//        NHANVIEN nv2 = new NHANVIEN();
//        nv2.inputInfo();
//        nv2.printInfo();
//        STUDENT sv1 = new STUDENT();
//        sv1.inputInfo();
//        sv1.showInfo();
//        STUDENT sv2 = new STUDENT();
//        sv2.inputInfo();
//        sv2.showInfo();

        //MẢNG 1 CHIỀU
        Scanner scanner = new Scanner(System.in);
        int count = 0, term = 0;
//        NHANVIEN[] nv = new NHANVIEN[2];
//        for (NHANVIEN item : nv) {
//            count++;
//            System.out.print("TÊN NV: ");
//            String ten = scanner.nextLine();
//            System.out.print("TUỔI NV: ");
//            int tuoi = Integer.parseInt(scanner.nextLine());
//            System.out.print("ĐỊA CHỈ NV: ");
//            String diachi = scanner.nextLine();
//            System.out.print("TIỀN LƯƠNG CỦA NV: ");
//            double luong = Double.parseDouble(scanner.nextLine());
//            System.out.print("GIỜ CÔNG CỦA NV: ");
//            int giocong = Integer.parseInt(scanner.nextLine());
//            item = new NHANVIEN(ten, tuoi, diachi, luong, giocong);
//            nv[count - 1] = item;
//        }
//        for (NHANVIEN item : nv) {
//            term++;
//            System.out.println("********** THÔNG TIN NHÂN VIÊN " + term + " **********");
//            System.out.println("TÊN NHÂN VIÊN " + term + " : " + item.ten);
//            System.out.println("TUỔI NHÂN VIÊN " + term + " : " + item.tuoi);
//            System.out.println("ĐỊA CHỈ NHÂN VIÊN " + term + " : " + item.diachi);
//            System.out.println("TIỀN LƯƠNG NHÂN VIÊN " + term + " : " + item.luong);
//            System.out.println("GIỜ CÔNG NHÂN VIÊN " + term + " : " + item.giocong);
//        }
//        STUDENT[] sv = new STUDENT[2];
//        for (STUDENT item : sv) {
//            count++;
//            System.out.print("MÃ SINH VIÊN: ");
//            String masinhvien = scanner.nextLine();
//            System.out.print("ĐIỂM TRUNG BÌNH: ");
//            float diemtrungbinh = Float.valueOf(scanner.nextLine());
//            System.out.print("TUỔI: ");
//            int tuoisv = Integer.parseInt(scanner.nextLine());
//            System.out.print("LỚP: ");
//            String lopsv = scanner.nextLine();
//            int countcharmsv = masinhvien.length();
//            char charlop = lopsv.charAt(0);
//            if (countcharmsv == 8) {
//                if (diemtrungbinh >= 0 && diemtrungbinh <= 10) {
//                    if (tuoisv >= 18) {
//                        if (charlop == 'A' || charlop == 'C') {
//                            item = new STUDENT(masinhvien, diemtrungbinh, tuoisv, lopsv);
//                            sv[count - 1] = item;
//                        } else {
//                            System.err.println("LỚP PHẢI CÓ KÍ TỰ ĐẦU TIÊN A HOẶC C");
//                        }
//                    } else {
//                        System.err.println("TUỔI SINH VIÊN PHẢI LỚN HƠN HOẶC BẰNG 18");
//                    }
//                } else {
//                    System.err.println("ĐIỂM TRUNG BÌNH TỪ 0 ĐẾN 10");
//                }
//            } else {
//                System.err.println("MÃ SINH VIÊN PHẢI CÓ 8 KÍ TỰ");
//                break;
//            }
//        }
//        try {
//            for (STUDENT item : sv) {
//                term++;
//                System.out.println("********** THÔNG TIN SINH VIÊN " + term + " **********");
//                System.out.println("MÃ SINH VIÊN " + term + " : " + item.masv);
//                System.out.println("ĐIỂM TRUNG BÌNH CỦA SINH VIÊN " + term + " : " + item.dtb);
//                System.out.println("TUỔI CỦA SINH VIÊN " + term + " : " + item.tuoi);
//                System.out.println("SINH VIÊN " + term + " THUỘC LỚP HỌC : " + item.lop);
//            }
//        } catch (Exception e) {
//            System.err.println("SINH VIÊN KHÔNG ĐẠT ĐIỀU KIỆN !");
//        }

        ArrayList ar = new ArrayList();
        for (int i = 0; i < 2; i++) {
            System.out.print("TÊN NV: ");
            String ten = scanner.nextLine();
            System.out.print("TUỔI NV: ");
            int tuoi = Integer.parseInt(scanner.nextLine());
            System.out.print("ĐỊA CHỈ NV: ");
            String diachi = scanner.nextLine();
            System.out.print("TIỀN LƯƠNG CỦA NV: ");
            double luong = Double.parseDouble(scanner.nextLine());
            System.out.print("GIỜ CÔNG CỦA NV: ");
            int giocong = Integer.parseInt(scanner.nextLine());
            ar.add(new NHANVIEN(ten, tuoi, diachi, luong, giocong));
        }
        System.out.println(ar.toString());
        for(Object item : ar){
            term++;
            if(item instanceof NHANVIEN){
                System.out.println("********** THÔNG TIN NHÂN VIÊN " + term + " **********");
                System.out.println("TÊN NHÂN VIÊN " + term + " : " + ((NHANVIEN) item).ten);
                System.out.println("TUỔI NHÂN VIÊN " + term + " : " + ((NHANVIEN) item).tuoi);
                System.out.println("ĐỊA CHỈ NHÂN VIÊN " + term + " : " + ((NHANVIEN) item).diachi);
                System.out.println("TIỀN LƯƠNG NHÂN VIÊN " + term + " : " + ((NHANVIEN) item).luong);
                System.out.println("GIỜ CÔNG NHÂN VIÊN " + term + " : " + ((NHANVIEN) item).giocong);
            }
        }
    }
    
}

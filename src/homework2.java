
import java.text.DecimalFormat;
import java.util.Scanner;

public class homework2 {

    public static void main(String[] args) {
        double diemKiemTraTOAN, diemKiemTraVATLY, diemKiemTraHOAHOC, diemTrungBinh;
        String ketQuaXepLoai = "";

        Scanner scanner = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("#.#");

        System.out.println("Nhập vào điểm kiểm tra Toán:");
        diemKiemTraTOAN = scanner.nextDouble();
        System.out.println("Nhập vào điểm kiểm tra Vật lý: ");
        diemKiemTraVATLY = scanner.nextDouble();
        System.out.println("Nhập vào điểm thi Hóa Học: ");
        diemKiemTraHOAHOC = scanner.nextDouble();

        if ((diemKiemTraTOAN < 0 || diemKiemTraTOAN > 10)
                || (diemKiemTraVATLY < 0 || diemKiemTraVATLY > 10) || (diemKiemTraHOAHOC < 0 || diemKiemTraHOAHOC > 10)) {
        } else {
            
            diemTrungBinh = ((diemKiemTraTOAN + diemKiemTraVATLY + diemKiemTraHOAHOC) / 3);
            decimalFormat.format(diemTrungBinh);

                if (diemTrungBinh >= 8.0) {
                ketQuaXepLoai = "Loại A";
            } else
                if ((diemTrungBinh >= 6.5) && (diemTrungBinh < 8.0)) {
                ketQuaXepLoai = "Loại B";
            } else
                if ((diemTrungBinh >= 5.0) && (diemTrungBinh < 6.5)) {

                ketQuaXepLoai = "Loại C";
            } else
                if ((diemTrungBinh < 5.0) && (diemTrungBinh < 5.0)) {
                ketQuaXepLoai = "Loại D";
            }

            System.out.println("Kết quả xếp loại môn học là " + ketQuaXepLoai);
        }

    }
}
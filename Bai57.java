public class Bai57 {

    public static int tinhchuvi(int chieudai, int chieurong) {
        return 2 * (chieudai + chieurong);
    }

    public static int tinhdientich(int chieudai, int chieurong) {
        return (chieudai * chieurong);
    }

    public static void main(String[] args) {
        int chieudai = 15;
        int chieurong = 13;

        int dientich = tinhdientich(chieudai, chieurong);

        int chuvi = tinhchuvi(chieudai, chieurong);

        System.out.println("Diện tích hình chữ nhật:" + dientich);
        System.out.println("Chu vi hình chữ nhật" + chuvi);
    }
}

public class ChaoThegioi {
    public static void main(String[] args) {
        int so1 = 10;
        int so2 = 20;
        int tong = hamTinhTong(so1, tang10Donvi(so2));
        System.out.println("tong la: "+tong);
    }

    public static int hamTinhTong(int so1, int so2){
        return so1 + so2; 
    }

    public static int tang10Donvi(int so){
        return so+10;
    }

    public static void chao(){
        System.out.println("chao ban");
    }
}
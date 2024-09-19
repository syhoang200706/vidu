
public class Baitap {
    public static void main(String[] args) {
        char kytu1 ='m';
        char kytu2 ='a';
        char kytu3 ='n';
        System.out.println("cong chuoi ba bien a,b,c la:"+congBaKitu(kytu3, kytu2, kytu1));
    }

    public static String congBaKitu(char kytu1, char kytu2, char kytu3) {
        return Character.toString(kytu1) + Character.toString(kytu2) + Character.toString(kytu3);
    }

}

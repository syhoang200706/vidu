public class Conghaiso {

     public static void main(String[] args) {

          // cấu trúc điều khiển: rẽ 1 nhánh, rẽ 2 nhánh, rẽ nhiều nhánh, swich-case
          // lặp: lặp với số bước lắp biết trước, lặp chưa biết số bước lặpin

          int tong = 0;
          int k = 1;
          while (k <= 100) {
               tong = tong + k;
               k = k + 1;
               if (tong > 10000000) {

               } else {

               }
          }
          System.out.println("tong la :" + tong);

          tong = 0;
          for (int i = 1; i <= 100; i++) {
               tong = tong + i;
          }
          System.out.println("tong la :" + tong);
     }
}

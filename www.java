public class www {
    public static void main(String[] args) {
        
            int so1 = 10;
            int so2 = 20;
            int so3 = 30;
            int so4 =-20;
            int tong = hamTinhTong(so1,so2,so4, tang10Donvi(so3));
            System.out.println("tong la: "+tong);
        }
    
        public static int hamTinhTong(int so1, int so2,int so3,int so4){
            return so1 + so2 + so3+so4; 
        }
    
        public static int tang10Donvi(int so){
            return so-15;
        }
    
        
} 
    







    
    


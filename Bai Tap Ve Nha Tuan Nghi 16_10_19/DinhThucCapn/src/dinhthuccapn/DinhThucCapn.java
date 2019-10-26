
package dinhthuccapn;


public class DinhThucCapn {

    /**
     * Đề bài: Mảng hai chiều
        Viết phương thức tính định thức của ma trận vuông arr[n][n]. 
        * Phương thức trả về giá trị định thức 
        * (sinh viên xem cách tính trên internet: lý thuyết toán học căn bản)
     */
    public static void main(String[] args) {
        int a[][] = {{1,1,2,2}, {-3,1,5,1}, {-2,5,0,0}, {2,-1,3,-1}};
        int dinhThuc3[][] = new int[3][3];
        int sum=0;
        
        for(int k=0; k<4; k++)
        {
            int cotXoa = k, dongXoa = 2, dongDinhThuc3=0, cotDinhThuc3=0;
            for(int i=0; i<4; i++)
            {
                if(i==dongXoa)
                    continue;
                for(int j=0; j<4; j++)
                {
                    if(j==cotXoa)
                        continue;
                    else
                    {
                        dinhThuc3[dongDinhThuc3][cotDinhThuc3] = a[i][j]; 
                        cotDinhThuc3++;
                        if(cotDinhThuc3 > 2)
                        {
                            cotDinhThuc3=0;
                            dongDinhThuc3++;
                        }
                    }
                }    
            }
            sum += (a[dongXoa][k] * Math.pow(-1, dongXoa + k) * dinhThucCap3(dinhThuc3));
        }
        
        System.out.println("kq = " + sum);
//        int sum = 0;
//        for(int i = 0; i < 4; i++)
//        {
//            System.out.println(" " + kq[i]);
//        }
//        System.out.println(sum);
    }
    
    public static int dinhThucCap3(int a[][])
    {
        int soBiTru = (a[0][0] * a[1][1] * a[2][2] + a[2][0] * a[0][1] * a[1][2] +a[0][2] * a[2][1] * a[1][0]);
        int soTru = (a[0][2] * a[1][1] * a[2][0] + a[2][2] * a[1][0] * a[0][1] +a[0][0] * a[2][1] * a[1][2]);
        return soBiTru - soTru;
    }
}

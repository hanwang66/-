/*
使用for循环输出九九乘法表

*/

public class ForTest08{
	public static void main(String[] args){
	   for (int i = 1;i<=9 ;i ++ ){  //外层循环9次

           for (int j = 1;j <= i ; j++ ){
			   System.out.print( i + " * " + j + " = " + i * j + "   " );
           }
	  
	   

           System.out.println();  //System.out.println("\n"); 

	   }
	


	}

}
class pattern10
{
  public static void main(String args[]){
	  int a =65;
     for (int i=5;i>=0;i--)
	 { 
	     for(int k=4;k>=i;k--)
		 {
		   System.out.print(" ");
		   }
		      for(int j=0;j<=i;j++)
			  { 
			    System.out.print((char)(a+j)+ " ");
				}
				
				  System.out.println();
				  }
				  }
}
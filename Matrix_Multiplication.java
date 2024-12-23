class Matrix_Multiplication {

public static void multiplication(int[][] a, int[][] b, int row1, int row2, int col1, int col2){

int ans[] = new int[row1*col2];

int k=0;

for(int i=0;i<row1;i++){

int varr=0;
int j=0;
int m=0;
int l=0;
int sum=0;
int mul=0;



while(varr<col2){

while(j<col1 & l<row2){

mul = a[i][j++] * b[l++][m];

sum=sum+mul;

}

varr++;

m++;

j=0;

l=0;

ans[k++] = sum;

sum=0;

}

}

for(int i=0;i<row1*col2;i++){

System.out.print(ans[i]+" ");

}

}

public static void main(String[] args) {

int[][] a = {{2,4,6},{3,5,7}};

int[][] b = {{5,6,11},{7,9,12},{8,10,13}};

int row1=2,row2=3,col1=3,col2=3;

multiplication(a,b,row1,row2,col1,col2);
}
}

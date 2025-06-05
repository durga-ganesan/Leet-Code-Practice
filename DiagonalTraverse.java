class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length==0) return new int[] {};
        int a=0,b=0,row=mat.length,col=mat[0].length;
        int[] res=new int[row*col];
        for(int i=0;i<res.length;i++){
            res[i]=mat[a][b];
            if((a+b)%2==0){
                if(b==col-1)
                    a++;
                else if(a==0)
                    b++;
                else{
                    a--;
                    b++;
                }
            }
            else{
                if(a==row-1)
                    b++;
                else if(b==0)
                    a++;
                else{
                    a++;
                    b--;
                }
            }
        }
        return res;
    }
}

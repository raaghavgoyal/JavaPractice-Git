package com.raghav.ArraysLecture;

public class RotationOfMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };
        int [][] target = {
                {1,1,1},
                {0,1,0},
                {0,0,0}
        };
        System.out.println(findRotation(mat,target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        int l = mat.length;

        //360 degree
        if(equalMatrices(mat,target)){
            return true;
        }
        // int [][] t = new int[l][l];
        // int r = l-1;
        // int c = 0;
        //90 degree
        // for(int i =0; i<l ; i++){
        //     r = l-1;
        //     for(int j = 0; j<l ; j++){
        //         t[i][j] = mat[r][c];
        //         r--;
        //     }
        //     c++;
        // }
        // if(equalMatrices(t,target)){
        //     return true;
        // }
        // //180 degree
        // c = l-1;
        // r = l-1;
        // for(int i =0; i<l ; i++){
        //     c = l-1;
        //     for(int j = 0; j<l ; j++){
        //         t[i][j] = mat[r][c];
        //         c--;
        //     }
        //     r--;
        // }
        // if(equalMatrices(t,target)){
        //     return true;
        // }
        // //270 degree
        // c = l-1;
        // r = 0;
        // for(int i =0; i<l ; i++){
        //     r = 0;
        //     for(int j = 0; j<l ; j++){
        //         t[i][j] = mat[r][c];
        //         r++;
        //     }
        //     c--;
        // }

        for(int k = 0; k<3 ; k++){
            int [][] result = new int[l][l];
            for(int i = 0; i<l; i++){
                for(int j = 0; j<l ; j++){
                    result[i][j] = mat[j][l-1-i];
                    //this is formula for rotating matrix by 90degree clockwise
                }
            }
            if(equalMatrices(result,target)){
                return true;
            }
            mat = result;
        }
        return false;

        // if(equalMatrices(t,target)){
        //     return true;
        // }
        // return false;
    }
    public static boolean equalMatrices(int[][] m1, int[][] m2){
        int l = m1.length;
        for(int i =0; i<l ; i++){
            for(int j = 0; j<l ; j++){
                if(m1[i][j]!=m2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}

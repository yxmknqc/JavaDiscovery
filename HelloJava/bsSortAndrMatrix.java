package com.example.lib_mytestinglib;

import java.util.Arrays;

public class bsSortAndrMatrix {			//bubble/select sort And reverse Matrix

    public static void main(String[] args){
        int a[] = new int[10];
        for(int i=0;i<10;i++)a[i]=(int)(Math.random()*100);
        System.out.print("Original Array: ");
        showArr(a);
        bubleSort(a);
        selectSort(a);
        //showArr(a);
        //int c[]= Arrays.copyOfRange(a,3,7);
        //showArr(c);

        System.out.println();
        System.out.println();
        int aa[][]=new int[10][10];
        for (int i=0;i<10;i++)for (int j=0;j<10;j++)aa[i][j]=i*10+(j+1);
        System.out.println("Original Matrix:");
        showMatrix(aa);
        System.out.println();
        System.out.println();
        reverseMatrix(aa);
        System.out.println();
        System.out.println();
    }

    private static void bubleSort(int a[]){ //mao pao pai xu
        int b[]=a.clone();
        int n=a.length;
        int kcount=0;
        long starttime=System.nanoTime();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(b[j]>b[j+1]){
                    int tmp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=tmp;
                }
                kcount++;
                //showArr(a);
            }
        }
        long endtime=System.nanoTime();
        long costtime=(endtime-starttime);
        System.out.print("bubble result: ");
        showArr(b);
        System.out.println("bubble steps: "+kcount);
        System.out.println("bubble durition: "+costtime+" ns");
    }

    private static void selectSort(int a[]){    //direct/select sort
        int b[]=a.clone();
        int n=a.length;
        int kcount=0;
        long starttime=System.nanoTime();
        for(int i=1;i<n;i++){
            int idx=0;
            for(int j=1;j<=n-i;j++){
                if(b[j]>b[idx]){
                    idx=j;
                }
                kcount++;
                //System.out.println(b[idx]);
            }
            int tmp=b[n-i];
            b[n-i]=b[idx];
            b[idx]=tmp;
            //showArr(b);
        }
        long endtime=System.nanoTime();
        long costtime=(endtime-starttime);
        System.out.print("select result: ");
        showArr(b);
        System.out.println("select steps: "+kcount);
        System.out.println("select durition: "+costtime+" ns");
    }

    private static void reverseMatrix(int aa[][]){
        long starttime=System.nanoTime();
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                int tmp=aa[j][i];
                aa[j][i]=aa[i][j];
                aa[i][j]=tmp;
            }
        }
        long endtime=System.nanoTime();
        long costtime=(endtime-starttime);
        System.out.println("Reversed Matrix:");
        showMatrix(aa);
        System.out.println("reverse durition: "+costtime+" ns");
    }

    private static void showArr(int a[]){
        System.out.print("[");
        for (int i=0;i<a.length;i++){
            if(i!=(a.length-1))System.out.print(a[i]+",");
            else System.out.print(a[i]);
        }
        System.out.println("]");
    }

    private static void showMatrix(int aa[][]){
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.print(aa[i][j]+"\t");
            }
            System.out.println();
        }
    }
}


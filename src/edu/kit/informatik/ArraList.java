package edu.kit.informatik;

import java.util.Arrays;

/**
 * 顺序表实现
 */
public class ArraList implements List {

    int[] list = new int[1000];
    int max = 1000;
    int size;

    //添加
    public void add(int n) {
        if (size == max) {
            max = 2 * max;
            int[] list1 = Arrays.copyOf(list,max);
            list = list1;
        }
        list[size++] = n;

    }

    //对有序表插入
    public int[] insert(int[]a,int num){
        int[]b = Arrays.copyOf(a,a.length+1);
        int i=a.length-1;
        for(i=a.length-1;i>=0;i--){
            if(b[i]<num){
                b[i+1]=num;
                break;
            }else{
                b[i+1]=b[i];
            }
        }
        if(i==-1)
            b[0]=num;
        return b;
    }

    //希尔排序
    public void ShellSort(int[]a) {
        int increasement=a.length;
        do {
            int k;
            increasement=increasement/3+1;
            for(int i=0;i<increasement;i++) {
                for(int j=i+increasement;j<a.length;j+=increasement) {
                    int temp=a[j];

                    if(a[j]<a[j-increasement]) {
                        for(k=j-increasement;k>=0&&a[k]>temp;k-=increasement) {
                            a[k+increasement]=a[k];
                        }
                        a[k+increasement]=temp;
                    }
                }
            }
        }while(increasement>1);
    }

    //简单排序
    public void EasySort(int[]a) {
        for(int i=1;i<a.length;i++) {
            int k=i;
            if(a[i]<a[i-1]) {
                int temp=a[i];
                for(k=i-1;k>=0&&temp<=a[k];k--) {
                    a[k+1]=a[k];
                }
                a[k+1]=temp;
            }
        }
    }

    //冒泡排序
    public int[] Bubble() {
        int[] a = Arrays.copyOf(list, size);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    //选择排序
    public int[] Select() {
        int flag;
        int[] a = Arrays.copyOf(list, size);
        for (int i = 0; i < a.length - 1; i++) {
            int temp = i;
            for (int j = i; j < a.length; j++) {
                if (a[temp] >= a[j]) {
                    temp = j;
                }
            }
            flag = a[i];
            a[i] = a[temp];
            a[temp] = flag;
        }
        return a;
    }

    //堆排序
    public void hSort(int[] a){
        MinHeap minHeap = new MinHeap();
        minHeap.hSort(a);
    }

    //快速排序
    public int[] QuickSort() {
        int[] a = Arrays.copyOf(list, size);
        QuickSort(a, 0, a.length - 1);
        return a;
    }

    public int[] QuickSort(int[] a, int start, int end) {
        int i = start;
        int j = end;

        if (start >= end) {
            return null;
        }
        int temp = a[start];
        while (i < j) {
            while (i < j && a[j] >= temp) {
                j--;
            }
            if (i < j) {
                a[i] = a[j];
                i++;
            }
            while (i < j && a[i] < temp) {
                i++;
            }
            if (i < j) {
                a[j] = a[i];
                j--;
            }
        }
        a[i] = temp;
        QuickSort(a, start, i - 1);
        QuickSort(a, i + 1, end);
        return a;
    }

}

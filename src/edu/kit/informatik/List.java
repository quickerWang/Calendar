package edu.kit.informatik;

public interface List {
    void add(int n); //添加
    int[] insert(int[] a, int num);  //对有序表插入
    //希尔排序
    void ShellSort(int[] a);
    //简单排序
    void EasySort(int[] a);
    //冒泡排序
    int[] Bubble();
    //选择排序
    int[] Select();
    //堆排序
    void hSort(int[] a);
    //快速排序
    int[] QuickSort();
}


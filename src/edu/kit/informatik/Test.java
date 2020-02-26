package edu.kit.informatik;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArraList arraList = new ArraList();
        System.out.println("------------八个数字排序----------");
        Scanner in = new Scanner(System.in);
        for(int i=0;i<8;i++){
            System.out.println("输入第"+(i+1)+"个数字：");
            arraList.add(in.nextInt());
        }
        System.out.println("冒泡排序结果:"+ Arrays.toString(arraList.Bubble()));
        System.out.println("快速排序结果:"+ Arrays.toString(arraList.QuickSort()));
        System.out.println("冒泡排序结果:"+ Arrays.toString(arraList.Select()));

        System.out.println("-----------单排序方法和快速、堆排序方法、希尔排序方法对其进行排序-----------");
        System.out.println("输入数字(-1结束）:");
        arraList = new ArraList();
        //循环读入
        while(in.hasNextInt()){
            int number = in.nextInt();
            if(number==-1)
                break;
            else
                arraList.add(number);
        }
        System.out.println("输入插入数值：");
        int number = in.nextInt();
        int []temp = Arrays.copyOf(arraList.list, arraList.size);
        arraList.ShellSort(temp);
        System.out.println("希尔排序结果:"+ Arrays.toString(temp));
        System.out.println("插入后:"+ Arrays.toString(arraList.insert(temp,number)));
        temp = Arrays.copyOf(arraList.list, arraList.size);
        arraList.EasySort(temp);
        System.out.println("简单排序结果:"+ Arrays.toString(temp));
        System.out.println("插入后:"+ Arrays.toString(arraList.insert(temp,number)));
        temp = Arrays.copyOf(arraList.list, arraList.size);
        System.out.println("快速排序结果:"+ Arrays.toString(arraList.QuickSort(temp,0,temp.length-1)));
        System.out.println("插入后:"+ Arrays.toString(arraList.insert(temp,number)));
        temp = Arrays.copyOf(arraList.list, arraList.size);
        arraList.hSort(temp);
        System.out.println("堆排序结果:"+ Arrays.toString(temp));
        System.out.println("插入后:"+ Arrays.toString(arraList.insert(temp,number)));
    }
}

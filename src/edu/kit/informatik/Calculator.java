package edu.kit.informatik;

import javax.script.*;
import java.sql.*;
import java.util.*;

/**
 * Main Function
 */
public class Calculator {
    //store the equation
    MyStack stack = new MyStack();

    //reset stack
    public void reset() {
        stack = new MyStack();
    }

    public void push(Integer number) {
        stack.push(number);
    }

    public void revert() {
        MyStack news = new MyStack();
        //init a new stack,and push the top element in stack to the new stack circle
        while (!stack.isEmpty()) {
            news.push(stack.pop());
        }
        stack = news;
    }

    /**
     * print the infomation of stack
     * @return
     */
    public String print() {
        String result = "";
        MyStack news = new MyStack();
        //init a new stack,and push the top element in stack to the new stack circle,and add the element to result
        while (!stack.isEmpty()) {
            //add the element to result
            result += stack.peek();
            news.push((Integer)stack.pop());
            //add a , if it is not the bottom of the stack
            if (!stack.isEmpty()) {
                result += ",";
            }
        }
        stack=news;
        revert();
        return result;
    }

    /**
     * if-else function
     * @throws Exception
     */
    public void if_else() throws Exception {
        //if <3,throw an Exception
        if(stack.size()<3){
            throw new Exception("Error,the size of stack <= 3");
        }
        //to store the element
        MyStack myStack = new MyStack();
        //if-else function
        for(int i=0;i<=2;i++){
            if((Integer)(stack.peek())!=0){
                stack.pop();
                break;
            }else{
                myStack.push(stack.pop());
            }
        }
        while(!myStack.isEmpty()){
            stack.push(myStack.pop());
        }
    }

    /**
     * divide
     * @throws Exception
     */
    public void divide() throws Exception {
        //if <2,throw an Exception
        if(stack.size()<2){
            throw  new Exception("Error,the size of stack <= 2");
        }
        //if the second top element is 0,throw an Exception
        int x=(Integer)stack.pop();
        int y = (Integer)stack.pop();
        if(y==0){
            stack.push(y);
            stack.push(x);
            throw  new Exception("Error,the second top element is 0");
        }
        //divide
        stack.push(x/y);
    }
    public void multoply() throws Exception {
        //if <2,throw an Exception
        if(stack.size()<2){
            throw  new Exception("Error,the size of stack <= 2");
        }
        int x=(Integer)stack.pop();
        int y = (Integer)stack.pop();
        //multiply
        stack.push(x*y);
    }

    public void sub() throws Exception {
        //if <2,throw an Exception
        if(stack.size()<2){
            throw  new Exception("Error,the size of stack <= 2");
        }
        int x=(Integer)stack.pop();
        int y = (Integer)stack.pop();
        //sub
        stack.push(x-y);
    }


    public void add() throws Exception {
        //if <2,throw an Exception
        if(stack.size()<2){
            throw  new Exception("Error,the size of stack <= 2");
        }
        int x=(Integer)stack.pop();
        int y = (Integer)stack.pop();
        //add
        stack.push(x+y);
    }

    public int peek() throws Exception {
        //if ==0,throw an Exception
        if(stack.size()==0){
            throw  new Exception("Error,the size of stack == 0");
        }
        //return element
        return (Integer)stack.peek();
    }
    public void pop() {
        //delete a element
        stack.pop();
    }

    public void push(int number){
        //add a element
        stack.push(number);
    }

}

package edu.kit.informatik;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

//Main Frame
public class CalculatorFrame {

    Calculator calculator = new Calculator();

    //executeButton
    public void execute() {
        //determine if it is the end
        boolean flag =false;
        while (true) {
            if(flag)
                return;
            //get command
            String command = Terminal.readLine();
            //for push
            if (command.length() >= 4 && command.substring(0, 4).equals("push")) {
                try {
                    Integer number = Integer.parseInt(command.substring(4).trim());//parse value
                    calculator.push(number);
                    Terminal.printLine("OK");
                } catch (Exception e) {
                    Terminal.printLine("Error, wrong push");//print result
                }
            } else {
                //other command
                switch (command) {
                    case "quit":
                        flag=true;
                        break;
                    case "reset":
                        calculator.reset();
                        Terminal.printLine("OK");//print result
                        break;
                    case "revert":
                        calculator.revert();
                        Terminal.printLine("OK");//print result
                        break;
                    case "print":
                        String result = calculator.print();
                        Terminal.printLine(result);//print result
                        break;
                    case "if-else":
                        try {
                            calculator.if_else();
                            Terminal.printLine("OK");//print result
                        } catch (Exception e) { //catch exception and print
                            Terminal.printLine(e.getMessage());//print result
                        }
                        break;
                    case "divide":
                        try {
                            calculator.divide();
                            Terminal.printLine("OK");//print result
                        } catch (Exception e) {
                            Terminal.printLine(e.getMessage());//print result
                        }
                        break;
                    case "multiply":
                        try {
                            calculator.multoply();
                            Terminal.printLine("OK");//print result
                        } catch (Exception e) {
                            Terminal.printLine(e.getMessage());//print result
                        }
                        break;
                    case "sub":
                        try {
                            calculator.sub();
                            Terminal.printLine("OK");//print result
                        } catch (Exception e) {
                            Terminal.printLine(e.getMessage());//print result
                        }
                        break;
                    case "add":
                        try {
                            calculator.add();
                            Terminal.printLine("OK");//print result
                        } catch (Exception e) {
                            Terminal.printLine(e.getMessage());//print result
                        }
                        break;
                    case "peek":
                        try {
                            int e = calculator.peek();
                            Terminal.printLine(e);//print result
                        } catch (Exception e) {
                            Terminal.printLine(e.getMessage());//print result
                        }
                        break;
                    case "pop":
                        calculator.pop();
                        Terminal.printLine("OK");//print result
                        break;
                    default:  //wrong command
                        Terminal.printLine("Error,Wrong command");//print result
                }
            }
        }
    }

    public static void main(String[] args) {
        //Main Frame initialize
        CalculatorFrame calculatorFrame = new CalculatorFrame();
        calculatorFrame.execute();
    }
}


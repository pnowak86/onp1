package com.onp;

import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        int result = 0;

        boolean close = true;
        while (close) {
            String scIn = scanner.nextLine();
            stack.push(scIn);
            printStack(stack);

            if (scIn.equals("+")) {
                stack.pop();
                int plast = Integer.parseInt(stack.pop());
                int psecondlast = Integer.parseInt(stack.pop());
                int addresult = psecondlast + plast;
                stack.push(Integer.toString(addresult));
                printStack(stack);
            }

            if (scIn.equals("-")) {
                stack.pop();
                int plast = Integer.parseInt(stack.pop());
                int psecondlast = Integer.parseInt(stack.pop());
                int addresult = psecondlast - plast;
                stack.push(Integer.toString(addresult));
                printStack(stack);
            }


            if (scIn.equals("*")) {
                stack.pop();
                int plast = Integer.parseInt(stack.pop());
                int psecondlast = Integer.parseInt(stack.pop());
                int addresult = psecondlast * plast;
                stack.push(Integer.toString(addresult));
                printStack(stack);
            }

            if (scIn.equals("/")) {
                stack.pop();
                int plast = Integer.parseInt(stack.pop());
                int psecondlast = Integer.parseInt(stack.pop());
                int addresult = psecondlast / plast;
                stack.push(Integer.toString(addresult));
                printStack(stack);
            }
            if (scIn.equals("quit")) {
                stack.pop();
                if(stack.size() == 1){
                    close = false;
                    result = Integer.parseInt(stack.pop());
                }
                else{
                    System.out.println("We have more than one item on stack! Operation is not finish yet!");
                    System.out.println("Our stack:");
                    printStack(stack);
                }

            }

        }

        System.out.println("Current stack size is: " + stack.size());

        System.out.println("If stack is empty? " + stack.empty());
        //System.out.println("Last item of stack: " + stack.peek());
        printStack(stack);
        System.out.println("FINAL RESULT: " + result);


    }

    public static void printStack(Stack<String> s) {
        if (s.isEmpty()) {
            System.out.println("Stack is empty!!!");
        } else {
            System.out.printf("%s, TOP\n", s);
        }

    }
}

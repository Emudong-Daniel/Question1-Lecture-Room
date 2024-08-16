/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1.lecture.room;

/**
 *
 * @author Liam
 */

import java.util.Scanner;

public class EasyReader {
    private Scanner scanner;

   
    public EasyReader() {
        this.scanner = new Scanner(System.in);
    }

    
    public int readInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }


    public char readChar(String prompt) {
        System.out.print(prompt);
        return scanner.next().charAt(0);
    }
}

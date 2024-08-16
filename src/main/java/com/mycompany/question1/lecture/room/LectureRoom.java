/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1.lecture.room;

/**
 *
 * @author Liam
 */

public class LectureRoom {
    private int numberOfStudents;
    private boolean[] lights; 
    public LectureRoom() {
        this.numberOfStudents = 0;
        this.lights = new boolean[3]; 
    }

    public void addStudents(int count) {
        this.numberOfStudents += count;
        System.out.println(count + " students added. Total students: " + this.numberOfStudents);
    }
    public void removeStudents(int count) {
        if (count >= this.numberOfStudents) {
            this.numberOfStudents = 0;
        } else {
            this.numberOfStudents -= count;
        }
        System.out.println(count + " students removed. Total students: " + this.numberOfStudents);
    }    
    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = true;
            System.out.println("Light " + lightNumber + " turned on.");
        } else {
            System.out.println("Invalid light number. Choose between 1 and 3.");
        }
    }   
    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = false;
            System.out.println("Light " + lightNumber + " turned off.");
        } else {
            System.out.println("Invalid light number. Choose between 1 and 3.");
        }
    }    
    public void displayStatus() {
        System.out.println("Current number of students: " + this.numberOfStudents);
        for (int i = 0; i < lights.length; i++) {
            System.out.println("Light " + (i + 1) + " is " + (lights[i] ? "on" : "off"));
        }
    }
}


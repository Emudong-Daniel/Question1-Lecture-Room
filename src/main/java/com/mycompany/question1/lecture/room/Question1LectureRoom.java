/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1.lecture.room;

/**
 *
 * @author Liam
 */
public class Question1LectureRoom {

 public static void main(String[] args) {
        EasyReader reader = new EasyReader();
        LectureRoom room = new LectureRoom();

        while (true) {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("W - Add students");
            System.out.println("X - Remove students");
            System.out.println("Y - Turn on light");
            System.out.println("Z - Turn off light");
            System.out.println("Q - Quit");

            char choice = reader.readChar("Enter your choice: ");

            switch (choice) {
                case 'W':
                    int addCount = reader.readInt("Enter the number of students to add: ");
                    room.addStudents(addCount);
                    break;
                case 'X':
                    int removeCount = reader.readInt("Enter the number of students to remove: ");
                    room.removeStudents(removeCount);
                    break;
                case 'Y':
                    int lightOn = reader.readInt("Enter the light number to turn on (1, 2, or 3): ");
                    room.turnOnLight(lightOn);
                    break;
                case 'Z':
                    int lightOff = reader.readInt("Enter the light number to turn off (1, 2, or 3): ");
                    room.turnOffLight(lightOff);
                    break;
                case 'Q':
                    System.out.println("Quitting the program.");
                    room.displayStatus(); // Show final status before quitting
                    return;
                default:
                    System.out.println("Invalid choice. Please enter W, X, Y, Z, or Q.");
            }
        }
    }
    }


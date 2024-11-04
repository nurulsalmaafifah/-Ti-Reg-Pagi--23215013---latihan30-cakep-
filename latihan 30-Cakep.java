/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Cakep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini?\nJawab (Yoi/Enggak): ");
        String jawab = scanner.nextLine();
        
        if (jawab.equalsIgnoreCase("Yoi")) {
            System.out.println("Cakep Bener. Good Job");
        } else if (jawab.equalsIgnoreCase("Enggak")) {
            System.out.println("Tetep cakep sih.");
            System.out.println("Sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
        } else {
            System.out.println("Jawaban tidak valid. Harus Yoi atau Enggak.");
        }

        scanner.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas_5;

import java.util.Scanner;

/**
 *
 * @author Rifki
 */
public class Tugas_5 {
static int move =1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("masukan jumlah cakram/Disc = ");
        int Cakram = Input.nextInt();
        hanoi (Cakram, 'A','B','C');
    }
    static void hanoi (int Cakram, char awal, char bantu, char tujuan){
        if (Cakram>=1)
        {
            hanoi (Cakram-1,awal,tujuan,bantu);
            move (Cakram,awal,tujuan);
            hanoi (Cakram-1, bantu,awal,tujuan);
        }}
        static void move (int step, char awal, char tujuan) {
            System.out.println("Langkah "+move);
            move++;
            System.out.println("Pindahkan cakram "+step);
            System.out.println("Cari "+awal);
            System.out.println("Ke "+tujuan);
        }
    }

    
    


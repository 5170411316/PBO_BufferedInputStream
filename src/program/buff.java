/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Bismillah
 */
public class buff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String nama;
		String alamat,prodi,fakultas,univ;
		
		try
		{
                        System.out.print("Masukkan nama anda : "); // melakukan input nama
			nama = br.readLine();
			System.out.print("Masukkan alamat anda : "); // melakukan input nama
                        prodi = br.readLine();
			System.out.print("Masukkan alamat anda : "); // melakukan input nama
                        fakultas = br.readLine();
			System.out.print("Masukkan alamat anda : "); // melakukan input nama
                        univ = br.readLine();
			System.out.print("Masukkan alamat anda : "); // melakukan input nama
			alamat = br.readLine();
			System.out.println("===============================");
			System.out.println("Nama anda : " + nama); // menampilkan pesan nama
			System.out.println("Alamat anda : " + alamat); // menampilkan pesan alamat
			System.out.println("Prodi anda : " + prodi); // menampilkan pesan alamat
			System.out.println("Fakultas anda : " + fakultas); // menampilkan pesan alamat
			System.out.println("Universitas anda : " + univ); // menampilkan pesan alamat
		}
		catch(IOException eox) // menangkap kesalahan
		{
			System.out.println(eox);
		}
	}
    }
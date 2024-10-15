import java.util.Scanner;

public class Person{
    private String Nama;
    private int Umur;

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getUmur() {
        return this.Umur;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }

    //Constructor Parameter
    public Person (String Nama, int Umur){
        this.Nama = Nama;
        this.Umur = Umur;
    }
}
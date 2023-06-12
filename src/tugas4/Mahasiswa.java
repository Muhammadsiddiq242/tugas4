
package tugas4;


public class Mahasiswa {
    String nama;
    private String jurusan;
    private int nim;
    
    Mahasiswa(){
        System.out.println("data mahasiswa");
    }
    
    Mahasiswa(String nama, String jurusan, int nim){
        this.nama = nama;
        this.jurusan = jurusan;
        this.nim = nim;
    }
    
    
    // method mutator
    public void setjurusan(String jurusan){
    this.jurusan = jurusan;
    }
    
    //method mutator
      public void setnim(int nim){
    this.nim = nim;
    }
      
    //method accesor
      String getnama(){
          return nama;
      }
      
      void cetakData(){
          System.out.println("Nama = "+nama);
          System.out.println("Jurusan = "+jurusan);
          System.out.println("Nim = "+nim);
      }
}

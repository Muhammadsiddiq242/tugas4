
package tugas4;


public class Main extends Mahasiswa{

public static void main(String[] args){
    
    
    System.out.println("Halo Halo");
    Mahasiswa data = new Mahasiswa();
    
    data.nama = "muhammad siddiq";
    data.setjurusan("TI");
    data.setnim(29083908);
    
    data.cetakData();
}    
}

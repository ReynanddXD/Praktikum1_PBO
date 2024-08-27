package nilai;

public class DemoNilai {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai mahasiswa = new Nilai();
        
        mahasiswa.NPM = "12345";
        mahasiswa.Nama = "Reynanda";
        mahasiswa.NilaiAbsen = 100;
        mahasiswa.NilaiTugas = 90;
        mahasiswa.NilaiUTS = 95;
        mahasiswa.NilaiUAS = 98;
        
        mahasiswa.nilai();
        mahasiswa.CetakNilai();
    }
    
}

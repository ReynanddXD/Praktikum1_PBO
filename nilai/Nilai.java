package nilai;

public class Nilai {
    String NPM;
    String Nama;
    double NilaiAbsen;
    double NilaiTugas;
    double NilaiUTS;
    double NilaiUAS;
    double NilaiAkhir;
    
    void nilai(){
        NilaiAkhir = NilaiAbsen*0.1 + NilaiTugas*0.2 + NilaiUTS*0.3 +NilaiUAS*0.4;
        
    }
    void CetakNilai(){
        System.out.println("NPM         : "+this.NPM);
        System.out.println("Nama        : "+this.Nama);
        System.out.println("Nilai Absen : "+this.NilaiAbsen);
        System.out.println("Nilai Tugas : "+this.NilaiTugas);
        System.out.println("Nilai UTS   : "+this.NilaiUTS);
        System.out.println("Nilai UAS   : "+this.NilaiUAS);
        System.out.println("Nilai Akhir : "+this.NilaiAkhir);
    }
}

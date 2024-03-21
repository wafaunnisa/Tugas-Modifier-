
public class Mahasiswa {
    private String nama;
    private int nim;
    protected String jurusan;

    public Mahasiswa(String nama, int nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void SetNama(String nama){
        this.nama = nama;
    }

    public void SetNIM(int nim){
        this.nim = nim;
    }

    public void SetJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public String GetNama(){
        return this.nama;
    }

    public int GetNim(){
        return this.nim;
    }

    public String GetJurusan(){
        return this.jurusan;
    }

    public String toString(){
        return
        "Nama :" + nama+
        "\nNim :" + nim+
        "\nJurusan :"+ jurusan;
    }
}

package JavaGui;

public class Mahasiswa {
    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjang() {
        char kodeJg = nim.charAt(0);
        if (kodeJg == '1') {
            return "S1 (SARJANA)";
        } else if (kodeJg == '2') {
            return "S2 (MAGISTER)";
        } else if (kodeJg == '3') {
            return "S3 (DOKTOR)";
        }
        return "UNKNOWN";
    }


    public String getTahunMasuk() {
        String kodeTm = nim.substring(1, 3);
        kodeTm = "20" + kodeTm;

        return kodeTm;
    }


    public String getFakultas(){
        char kodeFk = nim.charAt(3);
        if(kodeFk == '1'){
            return "TARBIYAH DAN KEGURUAN";
        }else if(kodeFk == '2'){
            return "SYARIAH DAN HUKUM";
        }else if(kodeFk == '3') {
            return "USHULAUDDIN";
        }else if(kodeFk == '4') {
            return "DAKWAH DAN KOMUNIKASI";
        }else if(kodeFk == '5') {
            return "SAINS DAN TEKNOLOGI";
        } else if(kodeFk == '6') {
            return "PSIKOLOGI";
        }else if(kodeFk == '7') {
            return "EKONOMI DAN IMU SOSIAL";
        }else if(kodeFk == '8'){
            return "PERTANIAN DAN PETERNAKAN";
        }
        return "UNKNOWN";
    }

    public String getJurusan(){
        String kodeJn = nim.substring(4,6);
        if(kodeJn.equals("01")){
            return "Teknik Informatika";
        }else if(kodeJn.equals("02")){
            return "Teknik Industri";
        }else if(kodeJn.equals("03")){
            return "Sistem Informasi";
        }else if(kodeJn.equals("04")){
            return "Matematika";
        }else if(kodeJn.equals("05")){
            return "Teknik Elektro";
        }
        return "UNKNOWN";
    }

    public String getJenisKelamin(){
        char kodeJk = nim.charAt(6);
        if(kodeJk == '1'){
            return "LAKI-LAKI";
        }else if(kodeJk == '2'){
            return "PEREMPUAN";
        }
        return "UNKNOWN";
    }

    public String getNomorUrutMahasiswa(){
        String kodeNm = nim.substring(7,11);
        kodeNm=kodeNm;

        return kodeNm;
    }
}

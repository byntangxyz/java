import java.util.Arrays;

public class Tugas {
  public static void main(String[] args) {
    String[][] daftarLagu = {
      {"Denny Caknan", "Crito Mustahil", "246", "102"},
      {"Difarina Indra", "Lintang Asmoro", "149", "74"},
      {"Gilga Sahid", "Nemu", "351", "184"},
      {"Denny Caknan", "Sigar", "278", "142"},
      {"Happy Asmara", "Kalah", "107", "50"},
      {"Wames", "Dumes", "123", "65"},
      {"NdarBoy Genk", "Anak Lanang", "240", "35"}
  };

  // for (String[] lagu : daftarLagu) {
  //     System.out.println(Arrays.toString(lagu));
  // } // output Array


  ////menambah data array 
    String[] laguBaru1 = {"Masddho", "Kisinan 2", "347", "23"};
    String[] laguBaru2 = {"Aftershine", "Kalah", "101", "54"};
    String[][] daftarLaguBaru = new String[daftarLagu.length + 2][4];

    for (int i = 0; i < daftarLagu.length; i++) {
      daftarLaguBaru[i] = daftarLagu[i];
    }

    daftarLaguBaru[daftarLagu.length] = laguBaru1;
    daftarLaguBaru[daftarLagu.length + 1] = laguBaru2;

    //  Menampilkan array baru
    for (String[] lagu : daftarLaguBaru) {
      System.out.println(Arrays.toString(lagu));
    };

    // loop untuk menampilkan data lagu yang dimainkan lebih dari 200
    // for (int j = 0; j < daftarLaguBaru.length; j++) {
    //   if (Integer.parseInt(daftarLaguBaru[j][2]) > 200) {
    //     System.out.println(Arrays.toString(daftarLaguBaru[j]));
    //   }
    // }

    // loop untuk menampilkan data lagu secara terbalik (reverse)
    // for (int r = daftarLaguBaru.length -1; r >= 0; r--) {
    //   System.out.println(Arrays.toString(daftarLaguBaru[r]));
    // }
  }
}

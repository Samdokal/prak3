import java.util.Scanner;

class KalkulatorLuasLingkaran {
    private double jariJari;

    /**
     * ini construktor untuk objek kelas kalkulatorLuasLingkaran
     *
     * @param jariJari jariJari kalkulatorLuasLingkaran
     */
    public KalkulatorLuasLingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    /**
     * ini fungsi hitung luasLingkaran
     *
     * @return Math.PI * jariJari * jariJari
     */
    public double hitungLuasLingkaran() {
        if (jariJari < 0) {
            System.out.println("Jari-jari tidak boleh negatif.");
            return -1; // Nilai negatif untuk menunjukkan kesalahan
        } else {
            return Math.PI * jariJari * jariJari;
        }
    }

    /**
     * fungsi Main untuk menjalankan program
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        KalkulatorLuasLingkaran kalkulator = new KalkulatorLuasLingkaran(jariJari);

        double luas = kalkulator.hitungLuasLingkaran();

        if (luas >= 0) {
            System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah: " + luas);
        }
    }
}
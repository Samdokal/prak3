import java.util.Scanner;

class AutocompleteAndTemplates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        System.out.print("Pilih operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Tidak dapat melakukan pembagian oleh nol");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Operator yang Anda masukkan tidak valid.");
                System.exit(1);
        }

        System.out.println("Hasil: " + hasil);
    }
}
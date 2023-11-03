import java.util.Scanner;

public class zodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tanggal lahir kamu (dengan format tanggal/bulan): ");
        String input = scanner.nextLine();

        String[] parts = input.split("/");
        int tanggal = Integer.parseInt(parts[0]);
        int bulan = Integer.parseInt(parts[1]);

        String zodiacSign = findZodiacSign(tanggal, bulan);
        if (zodiacSign.equals("Tidak Sesuai")) {
            System.out.println("Tanggal yang kamu masukkan tidak sesuai.");
        } else {
            System.out.println("Zodiakmu adalah: " + zodiacSign);
        }

        scanner.close();
    }

    public static String findZodiacSign(int tanggal, int bulan) {
        if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {
            return "Aquarius";
        } else if ((bulan == 2 && tanggal >= 19) || (bulan == 3 && tanggal <= 20)) {
            return "Pisces";
        } else if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
            return "Aries";
        } else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
            return "Taurus";
        } else if ((bulan == 5 && tanggal >= 21) || (bulan == 6 && tanggal <= 20)) {
            return "Gemini";
        } else if ((bulan == 6 && tanggal >= 21) || (bulan == 7 && tanggal <= 22)) {
            return "Cancer";
        } else if ((bulan == 7 && tanggal >= 23) || (bulan == 8 && tanggal <= 22)) {
            return "Leo";
        } else if ((bulan == 8 && tanggal >= 23) || (bulan == 9 && tanggal <= 22)) {
            return "Virgo";
        } else if ((bulan == 9 && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) {
            return "Libra";
        } else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) {
            return "Scorpio";
        } else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) {
            return "Sagittarius";
        } else if ((bulan == 12 && tanggal >= 22) || (bulan == 1 && tanggal <= 19)) {
            return "Capricorn";
        } else {
            return "Tidak Sesuai";
        }
    }
}


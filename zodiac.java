import java.util.Scanner;

public class zodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tanggal lahir kamu (dengan format tanggal/bulan): ");
        String input = scanner.nextLine();

        String[] parts = input.split("/");
        int hari = Integer.parseInt(parts[0]);
        int bulan = Integer.parseInt(parts[1]);

        String zodiacSign = findZodiacSign(hari, bulan);
        if (zodiacSign.equals("Tidak Sesuai")) {
            System.out.println("Tanggal yang kamu masukkan tidak sesuai.");
        } else {
            System.out.println("Zodiakmu adalah: " + zodiacSign);
        }

        scanner.close();
    }

    public static String findZodiacSign(int hari, int bulan) {
        if ((bulan == 1 && hari >= 20) || (bulan == 2 && hari <= 18)) {
            return "Aquarius";
        } else if ((bulan == 2 && hari >= 19) || (bulan == 3 && hari <= 20)) {
            return "Pisces";
        } else if ((bulan == 3 && hari >= 21) || (bulan == 4 && hari <= 19)) {
            return "Aries";
        } else if ((bulan == 4 && hari >= 20) || (bulan == 5 && hari <= 20)) {
            return "Taurus";
        } else if ((bulan == 5 && hari >= 21) || (bulan == 6 && hari <= 20)) {
            return "Gemini";
        } else if ((bulan == 6 && hari >= 21) || (bulan == 7 && hari <= 22)) {
            return "Cancer";
        } else if ((bulan == 7 && hari >= 23) || (bulan == 8 && hari <= 22)) {
            return "Leo";
        } else if ((bulan == 8 && hari >= 23) || (bulan == 9 && hari <= 22)) {
            return "Virgo";
        } else if ((bulan == 9 && hari >= 23) || (bulan == 10 && hari <= 22)) {
            return "Libra";
        } else if ((bulan == 10 && hari >= 23) || (bulan == 11 && hari <= 21)) {
            return "Scorpio";
        } else if ((bulan == 11 && hari >= 22) || (bulan == 12 && hari <= 21)) {
            return "Sagittarius";
        } else if ((bulan == 12 && hari >= 22) || (bulan == 1 && hari <= 19)) {
            return "Capricorn";
        } else {
            return "Tidak Sesuai";
        }
    }
}


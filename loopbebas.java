public class loopbebas {
    public static void main(String[] args) {
        int kolom = 10;
        
        for (int i = kolom; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("^ ");
            }
            System.out.println();
        }
    }
}
//Program loop membuat segitiga siku siku terbalik
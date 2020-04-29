package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 15000;
        double uangDiDompet = 25000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, minta lagi");
        }else if(uangDiDompet>totalBelanja){
            double angsul = totalBelanja-uangDiDompet;
            System.out.println("Uang cukup, angsul : "+angsul);
        } else {
            System.out.println("Uang pas, .. uWu .. ");
        }
    }
}

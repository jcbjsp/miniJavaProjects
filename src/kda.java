import java.util.Locale;

public class kda {
    public static void main(String[] args) {
        double kills = 1;
        double death = 4;
        double assists = 20;
        double kda = (kills + assists) / death;
        double finalValue = Math.round(kda * 100.0)/100.0;
        //DecimalFormat value = new DecimalFormat("#.#");
        //double finalValue = Double.parseDouble(value.format(kda));
        System.out.println(finalValue);
        if (kda <= 2.0){
            System.out.println("Uninstall".toUpperCase(Locale.ROOT));
        }
        else if (kda > 5.0) {
            System.out.println("touch grace".toUpperCase(Locale.ROOT));
        }
        else if (kda > 2.0){
            System.out.println("tg");
        }

    }
}

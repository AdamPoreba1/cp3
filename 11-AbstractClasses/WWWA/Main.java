
public class Main {
    public static void main(String[] args) {
        SMS sms1 = new SMS("Siemaneczko, co tam?", "213 742 069");
        SMS sms2 = new SMS("Siemaneczko, hipopopam.", "718 307 231");


        sms1.send();
        sms2.send();
    }
}

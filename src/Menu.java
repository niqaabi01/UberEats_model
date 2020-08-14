import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Menu { 
   public static ArrayList<String> KFCMenu=new ArrayList<>();
   public static ArrayList<Integer> KFCMPrice=new ArrayList<>();
   public static ArrayList<String> BKMenu=new ArrayList<>();
   public static ArrayList<Integer> BKPrice=new ArrayList<>();
   public static ArrayList<String> MCdMenu=new ArrayList<>();
   public static ArrayList<Integer> McDPrice=new ArrayList<>();

    public static String getKFC() {
        String line = "";
        String cvsSplitBy = ",";
        String KFC = "";

        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\saani\\Downloads\\uberEatsClone(1)\\uberEatsClone\\bin\\restos.csv"))) {
            int lineNum = 0;
            int count = 0;

            while ((line = br.readLine()) != null) {
                if (lineNum == 0) {
                    lineNum++;
                    continue;
                }
                // use comma as separator
                String[] item = line.split(cvsSplitBy);
                String outcome = item[1] + " Worth R" + item[2];
                String outcome1 = item[3] + " Worth R" + item[4];
                String outcome2 = item[5] + " Worth R" + item[6];
                count++;
                if (count == 3) {
                    KFC = " 1. " + outcome + "\n 2. " + outcome1 + "\n 3. " + outcome2 + "\n";
                    KFCMenu.add(item[1].trim()); KFCMPrice.add(Integer.parseInt(item[2].trim()));
                    KFCMenu.add(item[3].trim()); KFCMPrice.add(Integer.parseInt(item[4].trim()));
                    KFCMenu.add(item[5].trim()); KFCMPrice.add(Integer.parseInt(item[6].trim()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return KFC;
    }

    public static String getMcDonalds() {
        String line = "";
        String cvsSplitBy = ",";
        String McDonalds = "";

        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\saani\\Downloads\\uberEatsClone(1)\\uberEatsClone\\bin\\restos.csv"))) {
            int lineNum = 0;
            int count = 0;

            while ((line = br.readLine()) != null) {
                if (lineNum == 0) {
                    lineNum++;
                    continue;
                }
                // use comma as separator
                String[] item = line.split(cvsSplitBy);
                String outcome = item[1] + " Worth R" + item[2];
                String outcome1 = item[3] + " Worth R" + item[4];
                String outcome2 = item[5] + " Worth R" + item[6];
                count++;
                if (count == 6) {
                    McDonalds = " 1. " + outcome + "\n 2. " + outcome1 + "\n 3. " + outcome2 + "\n";
                    MCdMenu.add(item[1].trim()); McDPrice.add(Integer.parseInt(item[2].trim()));
                    MCdMenu.add(item[3].trim()); McDPrice.add(Integer.parseInt(item[4].trim()));
                    MCdMenu.add(item[5].trim()); McDPrice.add(Integer.parseInt(item[6].trim()));

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return McDonalds;
    }
  
    public static String getBurgerKing() {
        String line = "";
        String cvsSplitBy = ",";
        String BurgerKing = "";

        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\saani\\Downloads\\uberEatsClone(1)\\uberEatsClone\\bin\\restos.csv"))) {
            int lineNum = 0;
            int count = 0;

            while ((line = br.readLine()) != null) {
                if (lineNum == 0) {
                    lineNum++;
                    continue;
                }
                // use comma as separator
                String[] item = line.split(cvsSplitBy);
                String outcome = item[1] + " Worth R" + item[2];
                String outcome1 = item[3] + " Worth R" + item[4];
                String outcome2 = item[5] + " Worth R" + item[6];
                count++;
                if (count == 9) {
                    BurgerKing = " 1. " + outcome + "\n 2. " + outcome1 + "\n 3. " + outcome2 + "\n";
                    BKMenu.add(item[1].trim()); BKPrice.add(Integer.parseInt(item[2].trim()));
                    BKMenu.add(item[3].trim()); BKPrice.add(Integer.parseInt(item[4].trim()));
                    BKMenu.add(item[5].trim()); BKPrice.add(Integer.parseInt(item[6].trim()));

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return BurgerKing;
    }



}
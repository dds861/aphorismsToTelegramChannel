package Presenter;


import Model.Model;

import java.util.ArrayList;
import java.util.Random;

public class Presenter implements IPresenter {

    private Model model;

    public Presenter() {
        model = new Model();
    }

    @Override
    public void onStartSendingData() throws InterruptedException {

        ArrayList<String> strings = model.getResultSetFromDatabase();
        Random rand = new Random();
        int n;
        String s1;
        while (true) {
            Thread.sleep(30000);
            n = rand.nextInt(strings.size() - 1);
            s1 = strings.get(n);

            System.out.println(s1);
            model.onSendToTelegram(s1);
        }


//        // loop through the result set
//        while (resultSet.next()) {
//            System.out.println(
////                        rs.getInt("adam") +  "\t" +
//                    resultSet.getString("adam") + "\t"
////                       + rs.getString("til") + "\t"
////                                + rs.getDouble("adam")
//            );
//        }
    }
}

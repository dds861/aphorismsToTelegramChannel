package Model;

import java.util.ArrayList;

public interface IModel {

    ArrayList<String> getResultSetFromDatabase();

    void onSendToTelegram(String message);
}

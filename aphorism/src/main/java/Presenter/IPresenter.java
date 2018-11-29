package Presenter;

import java.sql.SQLException;

public interface IPresenter {

   void onStartSendingData() throws SQLException, InterruptedException;
}

import Presenter.IPresenter;
import Presenter.Presenter;

import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException, InterruptedException {


        IPresenter iPresenter = new Presenter();
        iPresenter.onStartSendingData();

    }



}
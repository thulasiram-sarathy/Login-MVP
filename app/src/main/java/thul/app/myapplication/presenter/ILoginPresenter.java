package thul.app.myapplication.presenter;

public interface ILoginPresenter {

    void clear();
    void doLogin(String name, String passwd);
    void setProgressBarVisiblity(int visiblity);
}

package thul.app.myapplication.view;

public interface ILoginView {

    public void onClearText();
    public void onLoginResult(Boolean result, int code);
    public void onSetProgressBarVisibility(int visibility);
}

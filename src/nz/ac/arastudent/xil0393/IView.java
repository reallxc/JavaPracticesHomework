package nz.ac.arastudent.xil0393;

public interface IView {
    public String get();
    public String get(String prompt);

    public <T> void say(T message);
    public void start();
    public void stop();
}

package nz.ac.arastudent.xil0393;

public interface IView {
    String get();
    String get(String prompt);

    <T> void say(T message);
    <T> void add(T message);
    void start();
    void stop();

}

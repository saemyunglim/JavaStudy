package Object;

public class TestClass {

    private int time;
    private String className;

    public TestClass(int time, String className){
        this.time = time;
        this.className = className;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

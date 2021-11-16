package gbJavaCore.hw1;

public class Athletes {
    String name;
    int maxRunDistance;
    boolean passing;


    public Athletes(String name, int maxRunDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;

    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }


    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package gbJavaCore.hw1;

public class Main {
    public static void main(String[] args) {

        Team team =new Team();
        team.informationAboutTeam();

        Course course =new Course();
        course.doIt(team);

        team.showResults();

    }
}

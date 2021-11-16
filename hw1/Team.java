package gbJavaCore.hw1;

import java.util.concurrent.Callable;

public class Team {

    public final String nameTeam = "Stars";

    Athletes[] athletes = {new Athletes("Bob", 100),
            new Athletes("Jon", 160),
            new Athletes("Mari", 80),
            new Athletes("Alex", 40)};


    public Team() {
        this.athletes = athletes;
    }

    public Team(Athletes[] athletes) {
        this.athletes = athletes;
    }


    public String getNameTeam() {
        return nameTeam;
    }


    public Athletes[] getAthletes() {
        return athletes;
    }

    public void setAthletes(Athletes[] athletes) {
        this.athletes = athletes;
    }


    public void informationAboutTeam() {
        System.out.println("Команда: " + nameTeam + "\nЕе участники:");
        for (Athletes i : athletes) {
            System.out.println(i.name + " бежит:" + i.maxRunDistance);
        }
    }

    public void showResults() {

        Course course = new Course();
        for(Athletes a : athletes) {
            for (Let l : course.lets) {
                if (l.run <= a.maxRunDistance) {
                    System.out.println("Участник " + a.name + " пробежал дистанцию в " + l.run + "  метров, он мог бы пробежать еще "+ (a.maxRunDistance - l.run)+ " метров");
                }else
                    System.out.println("Участник " + a.name + " не пробежал дистанцию в "+ l.run+ "  метров , в его силах пробежать только " + a.maxRunDistance + " метров");
            }
        }
    }


}



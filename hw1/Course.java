package gbJavaCore.hw1;

public class Course {

  Let[] lets = new Let[2];{
            lets[0] = new Let(100);
            lets[1] = new Let(20);
    }


    public void doIt(Team team){

        for (Athletes a : team.athletes) {
            for(Let l :lets) {
                if (l.run <= a.maxRunDistance) {

                    System.out.println("Участник "+ a.name + " бежит");
                } else
                System.out.println("Участник "+ a.name + " не побежит");

            }
        }




    }

}




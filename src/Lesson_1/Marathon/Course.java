package Lesson_1.Marathon;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Competitor competitor : team.getCompetitors()) {
            for (Obstacle obstacle : obstacles) {
                obstacle.doIt(competitor);

                // если участник сошел с дистанции, то нет смысла двигать его дальше
                if (!competitor.isOnDistance()) {
                    break;
                }
            }
        }
    }
}

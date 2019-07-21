package Lesson_1.Marathon;

public class Team {
    private Competitor[] competitors;

    // здесь используется конструктор с переменным числом параметров
    public Team(Competitor... competitors) {
        // внутри метода переменное число параметров интерпретируется как массив
        this.competitors = competitors;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void getResults() {
        for (Competitor part : competitors) {
            part.info();
        }
    }
}

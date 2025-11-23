import java.util.ArrayList;
import java.util.List;

class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> actors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.actors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    // Новый метод для печати имени и фамилии режиссера
    public void printDirector() {
        System.out.println("Режиссер спектакля '" + title + "': " + 
                          director.getFirstName() + " " + director.getLastName());
    }

    public void addActor(Actor actor) {
        if (actors.contains(actor)) {
            System.out.println("Предупреждение: актер " + actor + " уже участвует в спектакле!");
            return;
        }
        actors.add(actor);
    }

    public void replaceActor(Actor newActor, String lastNameToReplace) {
        boolean found = false;
        for (int i = 0; i < actors.size(); i++) {
            if (actors.get(i).getLastName().equals(lastNameToReplace)) {
                actors.set(i, newActor);
                found = true;
                System.out.println("Актер " + lastNameToReplace + " заменен на " + newActor);
                break;
            }
        }
        if (!found) {
            System.out.println("Предупреждение: актер с фамилией '" + lastNameToReplace + "' не найден в спектакле!");
        }
    }

    public void printActors() {
        System.out.println("Актеры в спектакле '" + title + "':");
        for (Actor actor : actors) {
            System.out.println("  - " + actor);
        }
    }

    @Override
    public String toString() {
        return "Спектакль: " + title + " (" + duration + " мин), режиссер: " + director;
    }
}
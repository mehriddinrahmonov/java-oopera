import java.util.Objects;

class Actor extends Person {
    private int height;

    public Actor(String firstName, String lastName, Gender gender, int height) {
        super(firstName, lastName, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return height == actor.height &&
                Objects.equals(getFirstName(), actor.getFirstName()) &&
                Objects.equals(getLastName(), actor.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), height);
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " (" + height + " см)";
    }
}
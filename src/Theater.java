public class Theater {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor actor2 = new Actor("Мария", "Сидорова", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Алексей", "Иванов", Gender.MALE, 175);
        Actor actor4 = new Actor("Елена", "Кузнецова", Gender.FEMALE, 170);

        Director director1 = new Director("Сергей", "Васильев", Gender.MALE, 15);
        Director director2 = new Director("Ольга", "Николаева", Gender.FEMALE, 20);

        Composer composer = new Composer("Петр", "Чайковский", Gender.MALE);
        Choreographer choreographer = new Choreographer("Анна", "Павлова", Gender.FEMALE);

        Show regularShow = new Show("Гроза", 120, director1);
        Opera opera = new Opera("Евгений Онегин", 180, director2, composer, 
                               "Молодой дворянин Онегин, устав от светской жизни...", 30);
        Ballet ballet = new Ballet("Лебединое озеро", 150, director1, composer, 
                                  "Принц Зигфрид встречает заколдованную принцессу Одетту...", choreographer);

        regularShow.addActor(actor1);
        regularShow.addActor(actor2);
        
        opera.addActor(actor2);
        opera.addActor(actor3);
        opera.addActor(actor4);
        
        ballet.addActor(actor1);
        ballet.addActor(actor4);

        System.out.println("=== Попытка добавить дубликат ===");
        ballet.addActor(actor1);

        System.out.println("\n=== Списки актеров по спектаклям ===");
        regularShow.printActors();
        opera.printActors();
        ballet.printActors();

        System.out.println("\n=== Информация о режиссерах ===");
        regularShow.printDirector();
        opera.printDirector();
        ballet.printDirector();

        System.out.println("\n=== Замена актера ===");
        opera.replaceActor(actor1, "Иванов");
        opera.printActors();

        System.out.println("\n=== Попытка заменить несуществующего актера ===");
        ballet.replaceActor(actor2, "Несуществующий");

        System.out.println("\n=== Либретто оперы и балета ===");
        opera.printLibretto();
        System.out.println();
        ballet.printLibretto();
    }
}
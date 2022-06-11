package prototype;

public class PrototypeDemo {
    public static void main(String[] args) {

        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Pattern in Java");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie another = (Movie) registry.createItem("Movie");
        another.setTitle("Gang of Four");

        System.out.println(another);
        System.out.println(another.getRuntime());
        System.out.println(another.getTitle());
        System.out.println(another.getUrl());
    }
}

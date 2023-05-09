public class HelloOtus {

    public static void main(String[] args) {
        String greetings = "Hello Otus";
        Splitter.on(" ")
                .split(greetings);
    }
}

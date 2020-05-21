class Application {

    String name;

    void run(String[] args) {
        System.out.println(name);
        for (String word: args
             ) {
            System.out.println(word);
        }
    }
}
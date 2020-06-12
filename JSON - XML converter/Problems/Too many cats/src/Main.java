class Cat {
    String name;
    int age;
    public static int numberOfCats = 0;
    // write static and instance variables

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfCats++;
        if(numberOfCats>5){
            System.out.println("You have too many cats");
        }
        // implement the constructor
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        // implement the static method
        return numberOfCats;
    }
}
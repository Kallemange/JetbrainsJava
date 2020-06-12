class Employee {

    String name;
    String email;
    int experience;

    // write constructor
    Employee(String name, String email, int experience){
        this.name = name;
        this.email = email;
        this.experience = experience;
    }
    // write getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }
}

class Developer extends Employee {

    // write fields
    String mainLanguage;
    String[] skills;

    // write constructor
    Developer(String name, String email, int experience,
              String mainLanguage, String[] skills){
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills =skills;
    }

    // write getters

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public int getExperience() {
        return super.getExperience();
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }
}

class DataAnalyst extends Employee {

    // write fields
    boolean phd;
    String methods[];

    // write constructor
    DataAnalyst(String name, String email, int experience,
                boolean phd, String[] methods){
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    // write getters

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public int getExperience() {
        return super.getExperience();
    }

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }
}
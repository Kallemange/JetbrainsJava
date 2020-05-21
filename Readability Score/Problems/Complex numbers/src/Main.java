class Complex {

    double real;
    double image;

    public Complex(){
        this.real = 0;
        this.image = 0;
    }
    
    public void add(Complex number){
        this.real += number.real;
        this.image += number.image;
    }
    
    public void subtract(Complex number){
        this.real -= number.real;
        this.image -= number.image;
    }
}

package guardenPattern;

public class Shape {

    public  String type;
    public  Integer diametere;

    Shape() {

    }

    Shape(String type, Integer diametere) {
        this.type = type;
        this.diametere = diametere;
    }

    public  int calculArea(){
        return 2 * 2 ;
    }

}

public class Film extends Media{

    private String director;
    private String actors;



    public Film(String title, double cost, String director, String actors) {
        super(title, cost);
        this.director = director;
        this.actors = actors;

    }

    public static int countFilms(Film[] films){
        return films.length;
    }

    public String play(){
        return this.title;

    }
//Overloading
    public String play(String message){
        return "This film contains, " + message + ".";
    }

    public void setCostToZero(){
        this.cost = 0.0;
    }
}

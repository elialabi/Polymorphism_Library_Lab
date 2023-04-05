public class AudioItem extends Media{

    private int ISBN;
    private String voiceActors;


    public AudioItem(String title, double cost, int ISBN, String voiceActors) {
        super(title, cost);
        this.ISBN = ISBN;
        this.voiceActors= voiceActors;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getVoiceActors(){
        return this.voiceActors;
    }

    public void setCostToZero(){
        this.cost = 0.0;
    }
}

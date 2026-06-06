package hw_6.task_3;

public class MultimediaFiles {
    public static void main(String[] args) {

        Media myMedia = new Media("File",7);
        Media mySong = new Music("Bred",5,"Lekha's neighbor");
        Media myMovie = new Video("Night breweries",120,"8k");

        myMedia.play();
        mySong.play();
        myMovie.play();
    }
}

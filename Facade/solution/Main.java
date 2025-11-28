public class Main {
    public static void main(String[] args){
        VideoConversionFacade facade = new VideoConversionFacade();
        facade.convert("video.avi", "mp4");
    }
}
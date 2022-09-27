package exerc7;

public class Program {
  public static void main(String[] args) { 
    YoutubeVideo youtubeVideo = new YoutubeVideo(); 
    FaceVideo faceVideo = new FaceVideo(); 

    VideoPlayer player = new VideoPlayer(faceVideo);
    player.play();
    
    VideoPlayer player2 = new VideoPlayer(youtubeVideo);
    player2.play();
}
}

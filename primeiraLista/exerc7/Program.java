package exerc7;

public class Program {
  public static void main(String[] args) { 
    YoutubeVideo youtubeVideo = new YoutubeVideo(); 
    FaceVideo faceVideo = new FaceVideo(); 
    VideoPlayer videoPlayer = new VideoPlayer(youtubeVideo);
    videoPlayer.play();
    videoPlayer.setVideo(faceVideo);
    videoPlayer.play();
}
}

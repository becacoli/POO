package exerc7;

public class FaceVideo extends Video {
  private final boolean[] bitsFace;

  public FaceVideo() {
    bitsFace = new boolean[] {
        false, true, false, true, false, false, false, false, false, true, true, false, false, false, false,
        true, false, true, true, true, false, false, true, false, false, true, true, false, false, false, false,
        true, false, true, true, false, false, false, true, false, true, true, true, false, true, false, false,
        true, false, true, true, false, true, true, true, false, false, true, true, true, false, false, true,
        true, false, false, true, false, true, true, false, false, false, false, true, false, false, false,
        false, false, false, true, true, true, false, true, true, false, false, true, true, false, false, false,
        true, true, false, false, true, false, false, false, false, false, false, true, true, false, false,
        false, true, true, false, true, true, false, true, true, true, true, false, true, true, false, true,
        true, true, false, false, true, true, true, false, false, true, true, false, true, true, false, false,
        true, false, true, false, true, true, false, false, true, true, true, false, true, true, true, false,
        true, false, true, false, true, true, false, true, false, false, true, false, true, true, true, false,
        true, false, true, false, false, true, false, true, true, true, false
    };
  }

  public boolean[] getBitsFace() {
    return bitsFace;
  }

  @Override
  public String getContent() {
    // TODO Auto-generated method stub
    String content = "";
    String currentBinaryString = "";
        
        for(int i = 0; i < bitsFace.length; i++) {
            char currentBit = bitsFace[i] ? '1' : '0';
            currentBinaryString += currentBit;
            if(i % 8 == 0) {
                int asciiCode = Integer.parseInt(currentBinaryString, 2) / 2;
                content += (char)asciiCode;
                currentBinaryString = "";
            }
  }
    return content;
  }
}

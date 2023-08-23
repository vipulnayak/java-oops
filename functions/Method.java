package functions;


class Music {
    //When we use void it doesnt expect a value to return
    public void PlayMusic() {
        System.out.println("music Playing...");
    }

    // since we return a value we cant use void to be returned so we should use a  particular type
    public String GetMePen() {
        return "pen";
    }
}

public class Method {
    public static void main(String args[]) {

        Music obj = new Music();
        obj.GetMePen();
        obj.PlayMusic();
    }
}

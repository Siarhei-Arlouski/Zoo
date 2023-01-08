package Birds;

public class Eagle extends Birds {
    public String getEagleAcuteEyesight() {
        return "Unique action: Acute eyesight";
    }

    public void eagleAcuteEyesight() {
        System.out.println(getEagleAcuteEyesight());
    }
}
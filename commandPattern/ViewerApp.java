package commandPattern;

public class ViewerApp {

    public static void main(String[] args){

        Tv tv = new Tv();

        RemoteControl remote = new RemoteControl();

        PowerOn powerOn = new PowerOn(tv);
        remote.setCommand(powerOn);
        remote.clickButton();


        PowerOff powerOff = new PowerOff(tv);
        remote.setCommand(powerOff);
        remote.clickButton();


    }
}

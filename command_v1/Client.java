package command_v1;

/*
 * https://dzone.com/articles/design-patterns-command
 */

//Client
public class Client{
public static void main(String[] args)    {
  RemoteControl control = new RemoteControl();
  Light light = new Light();
  Command lightsOn = new LightOnCommand(light);
  Command lightsOff = new LightOffCommand(light);
  //switch on
  control.setCommand(lightsOn);
  control.pressButton();
  System.out.println("La luz está: "+ light.dameEstado());
  
  //switch off
  control.setCommand(lightsOff);
  control.pressButton();
  System.out.println("La luz está: "+ light.dameEstado());
}
}
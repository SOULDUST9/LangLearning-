/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.35.0.7523.c616a4dce modeling language!*/



// line 2 "model.ump"
// line 52 "model.ump"
public class ModerateTrafficLight
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ModerateTrafficLight State Machines
  public enum Status { Mod1, Mod2, Mod3, Mod4, Mod5, Mod6 }
  private Status status;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ModerateTrafficLight()
  {
    setStatus(Status.Mod1);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getStatusFullName()
  {
    String answer = status.toString();
    return answer;
  }

  public Status getStatus()
  {
    return status;
  }

  public boolean timerGreen()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Mod1:
        setStatus(Status.Mod2);
        wasEventProcessed = true;
        break;
      case Mod3:
        setStatus(Status.Mod4);
        wasEventProcessed = true;
        break;
      case Mod5:
        setStatus(Status.Mod6);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean timerYellow()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case Mod2:
        setStatus(Status.Mod3);
        wasEventProcessed = true;
        break;
      case Mod4:
        setStatus(Status.Mod5);
        wasEventProcessed = true;
        break;
      case Mod6:
        setStatus(Status.Mod1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setStatus(Status aStatus)
  {
    status = aStatus;

    // entry actions and do activities
    switch(status)
    {
      case Mod1:
        // line 6 "model.ump"
        trafficLightManager.southRed();
        // line 7 "model.ump"
        trafficLightManager.westRed();
        // line 8 "model.ump"
        trafficLightManager.eastRed();
        // line 9 "model.ump"
        trafficLightManager.northGreenAndArrow();
        break;
      case Mod2:
        // line 13 "model.ump"
        trafficLightManager.northYellow();
        // line 14 "model.ump"
        trafficLightManager.southRed();
        // line 15 "model.ump"
        trafficLightManager.westRed();
        // line 16 "model.ump"
        trafficLightManager.eastRed();
        break;
      case Mod3:
        // line 20 "model.ump"
        trafficLightManager.northRed();
        // line 21 "model.ump"
        trafficLightManager.westRed();
        // line 22 "model.ump"
        trafficLightManager.eastRed();
        // line 23 "model.ump"
        trafficLightManager.southGreenAndArrow();
        break;
      case Mod4:
        // line 27 "model.ump"
        trafficLightManager.northRed();
        // line 28 "model.ump"
        trafficLightManager.southYellow();
        // line 29 "model.ump"
        trafficLightManager.westRed();
        // line 30 "model.ump"
        trafficLightManager.eastRed();
        break;
      case Mod5:
        // line 34 "model.ump"
        trafficLightManager.northRed();
        // line 35 "model.ump"
        trafficLightManager.southRed();
        // line 36 "model.ump"
        trafficLightManager.westGreen();
        // line 37 "model.ump"
        trafficLightManager.eastGreen();
        break;
      case Mod6:
        // line 41 "model.ump"
        trafficLightManager.northRed();
        // line 42 "model.ump"
        trafficLightManager.southRed();
        // line 43 "model.ump"
        trafficLightManager.westYellow();
        // line 44 "model.ump"
        trafficLightManager.eastYellow();
        break;
    }
  }

  public void delete()
  {}

}
package OOPs.Interfaces.Multiple;

public abstract class SmartPhone implements CalculatorMultiple,CameraMultiple,ClockMultiple,Telephone,MusicPlayerMultiple
{

    @Override
    public abstract void calculator()  ;

    @Override
    public abstract void Camera() ;

    @Override
    public abstract void Clock() ;

    @Override
    public abstract void musicPlayer();

    @Override
    public abstract void telephone();
}

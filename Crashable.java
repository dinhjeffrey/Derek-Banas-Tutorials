/**
 * Created by Jeffrey on 12/30/15.
 */
public abstract class Crashable
{
    boolean carDrivable = true;

    public void youCrashed()
    {
        this.carDrivable = false;
    }
    public abstract void setCarStrength(int carStrength);

    public abstract int getCarStrength();
}

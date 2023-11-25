package Lambda;
public interface SampleInterface
{
void sampleMethod();

public class SampleInterfaceAnonymousImplementation
{
public static void main(String[] args)
{
SampleInterface si=new SampleInterface()
{
@Override
public void sampleMethod()
{
System.out.println("Method implemented using Anonymous Class");
}
};
si.sampleMethod();
}
}
}

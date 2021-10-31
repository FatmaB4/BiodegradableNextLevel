public class Main
{
  private static int daysAwake = 0;
  private static int numberTeeth = 0;
  private static String result = "";
  private static final String angry = "The bear is angry!";
  private static final String notAngry = "The bear is NOT angry";

  //An AngryBear is angry if it has been awake for more than 3 days and has less than 10 teeth.
  //An AngryBear is angry it if has no teeth.
  //An AngryBear is angry if it has been awake for more than 5 days.

  public static void main(String args[])
	{
    daysAwake = 10;
    numberTeeth = 3;

    if ((daysAwake > 3 && numberTeeth < 10) ||
       (numberTeeth == 0) ||
       (daysAwake > 5))
    {
      result = angry;
    }
    else
    {
      result = notAngry;
    }

    System.out.println(result);

    daysAwake = 10;
    numberTeeth = 35;

    if ((daysAwake > 3 && numberTeeth < 10) ||
       (numberTeeth == 0) ||
       (daysAwake > 5))
    {
      result = angry;
    }
    else
    {
      result = notAngry;
    }

    System.out.println(result);

    daysAwake = 1;
    numberTeeth = 25;

    if ((daysAwake > 3 && numberTeeth < 10) ||
       (numberTeeth == 0) ||
       (daysAwake > 5))
    {
      result = angry;
    }
    else
    {
      result = notAngry;
    }

    System.out.println(result);
	}
}
package level_012_LandOfLogic;

public class E_053_validTime {
  /*
Check if the given string is a correct time representation of the 24-hour clock.
----------------------
Example:
For time = "13:58", the output should be
validTime(time) = true;

For time = "25:51", the output should be
validTime(time) = false;

For time = "02:76", the output should be
validTime(time) = false.
   */
  public boolean validTime(String time) {
	int hours = Integer.parseInt(time.split(":")[0]);
	int minutes = Integer.parseInt(time.split(":")[1]);

	return (0 <= hours && hours < 24) && (0 <= minutes && minutes < 60);
  }
}

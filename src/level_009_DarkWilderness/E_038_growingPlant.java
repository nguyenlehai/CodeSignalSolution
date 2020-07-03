package level_009_DarkWilderness;

public class E_038_growingPlant {
  int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
	int afterDay = 0;
	int countDay = 0;

	while (afterDay < desiredHeight) {
	  afterDay += upSpeed;
	  countDay++;
	  if (afterDay >= desiredHeight) {
		break;
	  } else {
		afterDay -= downSpeed;
	  }
	}
	return countDay;
  }
}

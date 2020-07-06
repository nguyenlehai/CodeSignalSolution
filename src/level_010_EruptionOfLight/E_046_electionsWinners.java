package level_010_EruptionOfLight;

import java.util.Arrays;

public class E_046_electionsWinners {
  public int electionsWinners(int[] votes, int k) {
	int lengthVotes = votes.length;
	Arrays.sort(votes);
	if (k == 0) {
	  return votes[lengthVotes - 1] == votes[lengthVotes - 2] ? 0 : 1;
	}
	int total = 0;
	for (int vote : votes) {
	  if (vote + k > votes[lengthVotes - 1]) {
		total++;
	  }
	}
	return total;
  }
}

package level_012_LandOfLogic;

public class E_057_fileNaming {

  /*
You are given an array of desired filenames in the order of their creation.
Since two files cannot have equal names, the one which comes later will have an addition to its name in a form of (k),
where k is the smallest positive integer such that the obtained name is not used yet.

Return an array of names that will be given to the files.
------------------
Example:
For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be
fileNaming(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].
   */
  public String[] fileNaming(String[] names) {
	/* Cách 1:
	ArrayList<String> result = new ArrayList<>();

	for (String s : names) {
	  int i = 1;
	  if (!result.contains(s)) {
		result.add(s);
	  } else {
		while (result.contains(s + "(" + i + ")")) {
		  i++;
		}
		result.add(s + "(" + i + ")");
	  }
	}
	return result.toArray(new String[0]);
 	*/

	//Cách 2:
	for (int i = 1; i < names.length; i++) {
	  int count = 1;
	  String fileName = names[i];
	  for (int j = 0; j < i; j++) {
		if (names[j].equals(fileName)) {
		  fileName = names[i] + "(" + (count++) + ")";
		  j = -1;
		}
	  }
	  names[i] = fileName;
	}
	return names;
  }
}

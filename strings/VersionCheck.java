package strings;

public class VersionCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(softwareVersionComparison("v1.2.4a", "v1.2.3b"));
	}

	static int softwareVersionComparison(String versionA, String versionB) {
		/*
		 * Write your code here.
		 */

		if (versionA == versionB)
			return 0;
		else {
			String[] vA = versionA.split("\\.");
			String[] vB = versionB.split("\\.");
			for (int i = 0; i < vA.length; i++) {
				if (!vA[i].equals(vB[i])) {
					if (i == vA.length - 1) {
						int result = NumberComparision(vA[i], vB[i]);
						if (result == 0) {
							if (!checkifContainCharacter(vA[i]) && !checkifContainCharacter(vB[i])) {
								char lastA = vA[i].charAt(vA[i].length() - 1);
								char lastB = vB[i].charAt(vB[i].length() - 1);

								if (lastA != lastB) {
									if (lastA - lastB > 0)
										return 1;
									else
										return -1;
								}
							}
						} else {
							return result;
						}
					} else {
						return NumberComparision(vA[i], vB[i]);
					}
				} else {
					return NumberComparision(vA[i], vB[i]);
				}
			}
		}
		return 0;
	}

	static int NumberComparision(String s1, String s2) {
		if (getNumber(s1) == getNumber(s2))
			return 0;
		if (getNumber(s1) > getNumber(s2))
			return 1;
		else
			return -1;
	}

	static int getNumber(String s) {
		return Integer.parseInt(s.replaceAll("[^0-9]", ""));
	}

	static boolean checkifContainCharacter(String s) {
		return s.matches("[0-9]+");
	}
}

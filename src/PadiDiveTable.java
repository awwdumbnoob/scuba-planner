/**
 * Basic Dive Planner
 * @author Duane Leong, Andrew Nishimura, Jiajie Li
 * @date November 2, 2014
 * Warning: This scuba planner is a prototype and cannot be used to plan real dives.
 */

public class PadiDiveTable {
	private static int[][] pressureGroup = new int[][] {
		{35, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140},
		{10, 8, 7, 6, 5, 4, 4, 3, 3, 3, 3, -1},
		{19, 16, 13, 11, 9, 8, 7, 6, 6, 5, 5, 4},
		{25, 22, 17, 14, 12, 10, 9, 8, 7, 6, 6, 5},
		{29, 25, 19, 16, 13, 11, 10, 9, 8, 7, 7, 6}, 
		{32, 27, 21, 17, 15, 13, 11, 10, 9, 8, -1, 7},
		{36, 31, 24, 19, 16, 14, 12, 11, 10, 9, 8, 8},
		{40, 34, 26, 21, 18, 15, 13, 12, 11, 10, 9},
		{44, 37, 28, 23, 19, 17, 15, 13, 12, 11, 10},
		{48, 40, 31, 25, 21, 18, 16, 14, 13, -1},
		{52, 44, 33, 27, 22, 19, 17, 15, -1, 12},
		{57, 48, 36, 29, 24, 21, 18, 16, 14, 13},
		{62, 51, 39, 31, 26, 22, 19, 17, 15},
		{67, 55, 41, 33, 27, 23, 21, 18, 16},
		{73, 60, 44, 35, 29, 25, 22, 19},
		{79, 64, 47, 37, 31, 26, 23, 20},
		{85, 69, 50, 39, 33, 28, 24},
		{92, 74, 53, 42, 35, 29, 25},
		{100, 79, 57, 44, 36, 30},
		{108, 85, 60, 47, 38},
		{117, 91, 63, 49, 40},
		{127, 97, 67, 52},
		{139, 104, 71, 54},
		{152, 11, 75, 55},
		{168, 120, 80},
		{188, 129},
		{205, 140},
	};
	
	public static char getPressureGroup(int depth, int time) throws DepthOutOfRangeException, TimeOutOfRangeException {
		int y = -1;
		int x = -1;
		
		if (depth > 140 || depth < 0) {
			throw new DepthOutOfRangeException();
		}
		if (time < 0) {
			throw new TimeOutOfRangeException();
		}
		
		for (int i = 0; i < pressureGroup[0].length; i++) {
			if (depth <= pressureGroup[0][i]) {
				x = i;
				break;
			}
		}
		
		try {
			for (int i = 1; i < pressureGroup.length; i++) {
				if (pressureGroup[i][x] >= time) {
					y = i;
					break;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new TimeOutOfRangeException();
		}

		
		char pressureGroup = (char) (y + '@');
		return pressureGroup;
	}
	
}

@SuppressWarnings("serial")
class DepthOutOfRangeException extends Exception {
}

@SuppressWarnings("serial")
class TimeOutOfRangeException extends Exception {
	
}

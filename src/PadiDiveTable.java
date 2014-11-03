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
	//times are listed in total minutes
  private static int[][][] surfacetable = new int[][][]{
    {{0,180}},//A
    {{0,47},{48,228}},//B
    {{0,21},{22,69},{70,250},//C
    {{0,8},{9,30},{31,78},{79,259},//D
    {{0,7},{8,16},{17,38},{39,87},{88,268},//E
    {{0,7},{8,15},{16,24},{25,46},{47,94},{95,275}},//F
    {{0,6},{7,13},{14,22},{23,31},{32,53},{54,101},{102,282}},//G
    {{0,5},{6,12},{13,20},{21,28},{29,37},{38,59},{60,107},{108,288}},//H
    {{0,5},{6,11},{12,18},{19,26},{27,34},{35,43},{44,65},{66,113},{114,294}},//I
    {{0,5},{6,11},{12,17},{18,24},{25,31},{32,40},{41,49},{50,71},{72,119},{120,300}},//J
    {{0,4},{5,10},{11,16},{17,22},{23,29},{30,37},{38,45},{46,54},{55,76},{77,124},{125,305},//K
    {{0,4},{5,9},{10,15},{16,21},{22,27},{28,34},{35,42},{43,50},{51,59},{60,81},{82,129},{130,310},//L
    {{0,4},{5,9},{10,14},{15,19},{20,25},{26,32},{33,39},{40,46},{47,55},{56,64},{65,85},{86,134},{135,315}},//M
    {{0,3},{4,8},{9,13},{14,18},{19,24},{25,30},{31,36},{37,43},{44,51},{52,59},{60,68},{69,90},{91,138},{139,319},//N 
  
  
    }
   
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

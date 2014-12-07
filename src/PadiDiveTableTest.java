import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Basic Dive Planner Tests
 * @author Duane Leong, Andrew Nishimura, Jiajie Li
 * @date November 2, 2014
 * Warning: This scuba planner is a prototype and cannot be used to plan
 * real dives.
 */

public class PadiDiveTableTest {

	@Test
	public void test() {
		try {
			//Edge testing
			assertEquals("Expecting the value Z", 'Z', PadiDiveTable.getPressureGroup(40, 140));
			assertEquals("Expecting the value Z", 'Z', PadiDiveTable.getPressureGroup(40, 139));
			assertEquals("Expecting the value A", 'A', PadiDiveTable.getPressureGroup(35, 10));
			//make sure the arrows (-1) works
			assertEquals("Expecting the value B", 'B', PadiDiveTable.getPressureGroup(140, 4));
			assertEquals("Expecting the value G", 'G', PadiDiveTable.getPressureGroup(100, 12));


			//tests getrisidualnitrogentime method
			assertEquals("Expecting the value 30", 30, PadiDiveTable.getresidualnitrogentime(80, 'R'));
			assertEquals("Expecting the value 12", 12, PadiDiveTable.getresidualnitrogentime(120, 'I'));
			assertEquals("Expecting the value 12", 12, PadiDiveTable.getresidualnitrogentime(115, 'I'));
			assertEquals("Expecting the value 10", 10, PadiDiveTable.getresidualnitrogentime(10, 'A'));
			assertEquals("Expecting the value 205", 205, PadiDiveTable.getresidualnitrogentime(10, 'Z'));
			assertEquals("Expecting the value 9", 9, PadiDiveTable.getresidualnitrogentime(95, 'D'));

			//tests newpressuregrouprest method
			assertEquals("Expecting the value A", 'A', PadiDiveTable.newpressuregrouprest(600, 'A'));
			assertEquals("Expecting the value B", 'B', PadiDiveTable.newpressuregrouprest(47, 'B'));
			assertEquals("Expecting the value G", 'G', PadiDiveTable.newpressuregrouprest(29, 'K'));



		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//exception testing, make sure everything throws an exception when needed
	@Test(expected = Exception.class)
	public void exceptionTesting() throws DepthOutOfRangeException, TimeOutOfRangeException, PressureGroupOutOfRangeException {
		PadiDiveTable.getPressureGroup(1, 100000);
		PadiDiveTable.getPressureGroup(-1, 10);
		PadiDiveTable.newpressuregrouprest(10, '?');
		PadiDiveTable.newpressuregrouprest(-1, 'A');
	}

}

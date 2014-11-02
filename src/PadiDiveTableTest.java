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
			assertEquals("Expecting the value Z", 'Z', PadiDiveTable.getPressureGroup(40, 140));
			assertEquals("Expecting the value Z", 'Z', PadiDiveTable.getPressureGroup(40, 139));
			assertEquals("Expecting the value A", 'A', PadiDiveTable.getPressureGroup(35, 10));
			//make sure the arrows (-1) works
			assertEquals("Expecting the value B", 'B', PadiDiveTable.getPressureGroup(140, 4));
			assertEquals("Expecting the value G", 'G', PadiDiveTable.getPressureGroup(100, 12));


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

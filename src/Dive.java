import java.util.*;

/**
 * Dive class
 * @author Duane Leong, Andrew Nishimura, Jiajie Li
 * @date November 2, 2014
 * Warning: This scuba planner is a prototype and cannot be used to plan
 * real dives.
 */
public class Dive {
    private ArrayList<Integer> depth;
    private ArrayList<Integer> time;
    private String DiveName;

    /**
     * Default dive constructor, sets the dive to no name
     */
    public Dive() {
        this.depth = new ArrayList<Integer>();
        this.time = new ArrayList<Integer>();
        this.depth.add(0);
        this.time.add(0);
        this.DiveName = "";
    }

    /**
     * Dive constructor that takes a dive name as argument
     * @param name name of the dive
     */
    public Dive(String name) {
        this.depth = new ArrayList<Integer>();
        this.time = new ArrayList<Integer>();
        this.depth.add(0);
        this.time.add(0);
        this.DiveName = name;
    }

    /**
     * Sets the name of the dive
     * @param name name of the dive
     */
    public void setName(String name) {
        this.DiveName = name;
    }

    /**
     * Adds a point to the dive
     * @param depth depth of dive
     * @param duration duration of dive
     */
    public void addPoint(int depth, int duration) {
        this.depth.add(depth);
        this.time.add(this.time.get(time.size()-1) + duration);
    }

    /**
     * Gets total time of current dive
     * @return Integer in minutes of total dive time
     */
    public int getTotalTime() {
        return this.time.get(time.size() - 1);
    }

    /**
     * Gets the dive's depth list
     * @return Array list of the depths traveled
     */
    public ArrayList<Integer> getDepthList() {
        return this.depth;
    }

    /**
     * Get's the dive's time list
     * @return Array list of time
     */
    public ArrayList<Integer> getTimeList() {
        return this.time;
    }

    public static void main(String[] args) {
        Dive dive = new Dive("test");
        dive.addPoint(10, 20);
        dive.addPoint(10, 20);
        System.out.println(dive.getTotalTime());
    }

}

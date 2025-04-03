public class BugSim {
    private int bugs = 1000;

    public int BreedBugs(){
        bugs = bugs*2;
        return bugs;
    }
    public int sprayBugs(){
        bugs =  bugs/4;
        return bugs;
    }
    public void getBugCount(){
        System.out.println(bugs);
    }
}
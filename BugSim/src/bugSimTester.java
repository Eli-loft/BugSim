public class bugSimTester {
    public static void main(String[] args){
        BugSim bugSimTest = new BugSim();
        for (int i = 0; i < 3; i++) {
            bugSimTest.BreedBugs();
            bugSimTest.sprayBugs();
        }
        bugSimTest.getBugCount();
    }
}

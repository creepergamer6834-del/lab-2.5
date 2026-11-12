public class StudentRecord {
    private String name;
    private int[] scores;

    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public StudentRecord(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    public int getTestScore(int testNumber) {
        return Utils.getNumber(scores, testNumber);
    }

    public String toString() {
        String stuff = name + "'s scores: ["
                + Utils.printArray(scores) + "]";
        return stuff;
    }

    public double getAverage(int first, int last) {
        return Utils.getAverageFromArray(scores, first, last);
    }

    public double getAverage() {
        return Utils.average(scores, 0);
    }

    public boolean hasImproved() {
        return Utils.hasImproved(scores);
    }

    public double getFinalAverage() {
        if (!hasImproved()) {
            return getAverage();
        } else {
            int start = scores.length / 2;
            return Utils.average(scores, start);
        }
    }
}

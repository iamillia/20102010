package lab_9;

import java.util.Comparator;

public final class FootballResults extends CompetitionResults {

    public final double addTime;

    public FootballResults(String FirstTeamName, String SecondTeamName, int FirstTeamPoints, int SecondTeamPoints, double addTime) {
        super(FirstTeamName, SecondTeamName, FirstTeamPoints, SecondTeamPoints);
        this.addTime = addTime;
    }

    public FootballResults(String FirstTeamName, String SecondTeamName, int FirstTeamPoints, int SecondTeamPoints) {
        super(FirstTeamName, SecondTeamName, FirstTeamPoints, SecondTeamPoints);
        addTime = 0.0;
    }

    public FootballResults() {
        super();
        addTime = 0.0;
    }

    public double GetAddTime() {
        return addTime;
    }

    public FootballResults ChangeScore(int FirstTeamPoints, int SecondTeamPoints) {
        return new FootballResults(this.FirstTeamName, this.SecondTeamName, FirstTeamPoints, SecondTeamPoints, this.GetAddTime());
    }

    public FootballResults ChangeScore(int FirstTeamPoints) {
        return new FootballResults(this.FirstTeamName, this.SecondTeamName, FirstTeamPoints, this.SecondTeamPoints, this.GetAddTime());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.addTime) ^ (Double.doubleToLongBits(this.addTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return super.toString() + " addTime: " + addTime;
    }

    class AddTimeComparator implements Comparator<FootballResults> {
        @Override
        public int compare(FootballResults fr1, FootballResults fr2) {
            return Double.compare(fr1.addTime, fr2.addTime);
        }
    }
}

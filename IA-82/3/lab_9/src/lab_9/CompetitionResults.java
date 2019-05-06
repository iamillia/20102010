package lab_9;

import java.util.Comparator;
import java.util.Objects;

public abstract class CompetitionResults {

    protected String FirstTeamName;
    protected String SecondTeamName;
    protected String Winner;

    protected int FirstTeamPoints;
    protected int SecondTeamPoints;

    protected CompetitionResults(String FirstTeamName, String SecondTeamName, int FirstTeamPoints, int SecondTeamPoints) {
        this.FirstTeamName = FirstTeamName;
        this.SecondTeamName = SecondTeamName;
        this.FirstTeamPoints = FirstTeamPoints;
        this.SecondTeamPoints = SecondTeamPoints;

        if (FirstTeamPoints == SecondTeamPoints) {
            Winner = "None";
        } else if (FirstTeamPoints > SecondTeamPoints) {
            Winner = FirstTeamName;
        } else {
            Winner = SecondTeamName;
        }
    }

    protected CompetitionResults() {
        this("None", "None", 0, 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final CompetitionResults other = (CompetitionResults) obj;
        if (this.FirstTeamPoints != other.FirstTeamPoints) {
            return false;
        }
        if (this.SecondTeamPoints != other.SecondTeamPoints) {
            return false;
        }
        if (!Objects.equals(this.FirstTeamName, other.FirstTeamName)) {
            return false;
        }
        if (!Objects.equals(this.SecondTeamName, other.SecondTeamName)) {
            return false;
        }
        return Objects.equals(this.Winner, other.Winner);
    }

    @Override
    public String toString() {
        return FirstTeamName + " " + SecondTeamName + "(" + FirstTeamPoints + " : " + SecondTeamPoints + ")" + " Winner " + Winner;
    }

    static class CompetitionResultsComparator implements Comparator<CompetitionResults> {
        @Override
        public int compare(CompetitionResults cr1, CompetitionResults cr2) {
            return Integer.compare(cr1.FirstTeamPoints + cr1.SecondTeamPoints, cr2.FirstTeamPoints + cr2.SecondTeamPoints);
        }
    }

}

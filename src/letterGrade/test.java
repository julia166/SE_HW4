package letterGrade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void EquivalencePartitioningTest() {
		letterGrade grade = new letterGrade();
        assertEquals('X', grade.ScoreGrade(-1));
        assertEquals('X', grade.ScoreGrade(101));
        assertEquals('F', grade.ScoreGrade(0));
        assertEquals('F', grade.ScoreGrade(10));
        assertEquals('F', grade.ScoreGrade(20));
        assertEquals('F', grade.ScoreGrade(30));
        assertEquals('F', grade.ScoreGrade(40));
        assertEquals('F', grade.ScoreGrade(50));
        assertEquals('D', grade.ScoreGrade(60));
        assertEquals('C', grade.ScoreGrade(70));
        assertEquals('B', grade.ScoreGrade(80));
        assertEquals('A', grade.ScoreGrade(90));
        assertEquals('A', grade.ScoreGrade(100));
	}
	
}

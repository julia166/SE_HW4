package letterGrade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test1 {

	@Test
	void BoundaryValueTest() {
		letterGrade grade = new letterGrade();
        assertEquals('X', grade.ScoreGrade(-1));
        assertEquals('X', grade.ScoreGrade(101));
        assertEquals('F', grade.ScoreGrade(0));
        assertEquals('F', grade.ScoreGrade(10));
        assertEquals('F', grade.ScoreGrade(59));
        assertEquals('D', grade.ScoreGrade(60));
        assertEquals('D', grade.ScoreGrade(69));
        assertEquals('C', grade.ScoreGrade(70));
        assertEquals('C', grade.ScoreGrade(79));
        assertEquals('B', grade.ScoreGrade(80));
        assertEquals('B', grade.ScoreGrade(89));
        assertEquals('A', grade.ScoreGrade(90));
        assertEquals('A', grade.ScoreGrade(99));
        assertEquals('A', grade.ScoreGrade(100));
	}

}
package club.jaguardevelopers.grader.tests;

import club.jaguardevelopers.grader.ExpectedOutputFile;
import club.jaguardevelopers.grader.StudentSubmissionFile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentSubmissionFileTest {

    StudentSubmissionFile studentFile;
    ExpectedOutputFile expectedFile;

    public StudentSubmissionFileTest(StudentSubmissionFile studentFile, ExpectedOutputFile expectedFile){
        this.studentFile = studentFile;
        this.expectedFile = expectedFile;

    }

    public void junitTest(){
        assertEquals(expectedFile.toString(),studentFile.getProgramOutput());

    }

    public void isOutputSameAsExpectedOutput(){
        char[] studentArr = studentFile.getProgramOutput().toCharArray();
        char[] expectedArr = expectedFile.toString().toCharArray();

        if(!studentFile.getProgramOutput().equals(expectedFile.toString()) ){

        }
        else{
            System.out.println("Output is the same");
        }


    }












}

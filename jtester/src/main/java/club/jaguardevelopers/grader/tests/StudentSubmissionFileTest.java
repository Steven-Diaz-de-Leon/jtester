package club.jaguardevelopers.grader.tests;

import club.jaguardevelopers.grader.ExpectedOutputFile;
import club.jaguardevelopers.grader.StudentSubmissionFile;
import org.junit.jupiter.api.Test;
import info.debatty.java.stringsimilarity.JaroWinkler;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentSubmissionFileTest {

    StudentSubmissionFile studentFile;
    ExpectedOutputFile expectedFile;
    JaroWinkler similarityPercent = new JaroWinkler();

    public StudentSubmissionFileTest(StudentSubmissionFile studentFile, ExpectedOutputFile expectedFile){
        this.studentFile = studentFile;
        this.expectedFile = expectedFile;

    }

    public void junitTest(){
        assertEquals(expectedFile.toString(),studentFile.getProgramOutput());

    }

    public void isOutputSameAsExpectedOutput(){

        if(!studentFile.getProgramOutput().equals(expectedFile.toString()) ){
            double percent = similarityPercent.similarity(studentFile.getProgramOutput(),expectedFile.toString());
            System.out.println("Student's output: "+studentFile.getProgramOutput());
            System.out.println("Expected output: "+expectedFile.toString());
            System.out.println(percent+" match");

        }
        else{
            System.out.println("Output is the same");
        }


    }












}

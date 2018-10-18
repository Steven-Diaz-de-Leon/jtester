package club.jaguardevelopers.grader;


import club.jaguardevelopers.grader.tests.StudentSubmissionFileTest;

public class Main {

    private StudentSubmissionFileTest test;
    private TerminalCommands terminal;
    private StudentSubmissionFile studentFile;
    private ExpectedOutputFile expectedFile;

    public Main(String studentFilePath, String expectedOutputFilePath){
        terminal = new TerminalCommands();
        studentFile = new StudentSubmissionFile(studentFilePath);
        expectedFile = new ExpectedOutputFile(expectedOutputFilePath);
    }

    private void run(){
        terminal.runJAVAC(studentFile);
        terminal.runJAVA(studentFile);

        System.out.println(studentFile.getProgramOutput());
        System.out.println(studentFile.getErrorOutput());

        System.out.println(expectedFile.toString());


    }

    private void test(){
        test = new StudentSubmissionFileTest(studentFile, expectedFile);
        test.isOutputSameAsExpectedOutput();



    }


    public static void main( String[] args ) {
        Main main = new Main(args[0], args[1]);
        main.run();
        main.test();


        System.out.println("Done!");
    }
}

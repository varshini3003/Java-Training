package Question_6;

class Result extends Exam
{
    private int totalMarks;
    private char grade;
    public void evaluateResult()
    {
        totalMarks = mathmark+chemark+phymark;
        if(totalMarks>=250)
        {
            grade='A';
        }
        else if(totalMarks>=200 && totalMarks<250)
        {
            grade='B';
        }
        else if(totalMarks>=150 && totalMarks<200)
        {
            grade='C';
        }
        else if(totalMarks>=100 && totalMarks<150)
        {
            grade='D';
        }
        else
        {
            grade='U';
        }
    }
    public void showResult()
    {
        displayDetails();
        showMarks();
        evaluateResult();
        System.out.println("Total marks: "+totalMarks);
        System.out.println("Grade: "+grade);
    }
}

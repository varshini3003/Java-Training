class Student
{
    int rollno;
    String name;
    protected void setDetails(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }
    protected void displayDetails()
    {
        System.out.println("Roll No.: "+rollno);
        System.out.println("Name.: "+name);
    }
}
class Exam extends Student
{
    protected int mathmark, chemark, phymark;
    protected void setExamDetails(int mathmark, int chemark, int phymark)
    {
        this.mathmark = mathmark;
        this.chemark = chemark;
        this.phymark = phymark;
    }
    protected void showMarks()
    {
        System.out.println("Maths marks: "+mathmark);
        System.out.println("Chemistry marks: "+chemark);
        System.out.println("Physics marks: "+ phymark);
    }
}
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
public class Ques14 {
    public static void main (String[] args)
    {
        Result res = new Result();
        res.setDetails(1, "Varshini");
        res.setExamDetails(80, 93, 67);
        res.showResult();
    }
}

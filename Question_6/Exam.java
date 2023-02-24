package Question_6;

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
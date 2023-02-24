package Question_6;

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

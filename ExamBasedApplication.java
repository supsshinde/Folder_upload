//Exam Based Application
import java.util.*;
class Question
{
	private int id;
	private String op1,op2,op3,op4,Answer;
	public void setId(int i)
	{
		id=i;
	}
	public int getId()
	{
		return id;
	}
	public void setOp1(String OP1)
	{
		op1=OP1;
	}
	public String getOp1()
	{
		return op1;
	}
	public void setOp2(String OP2)
	{
		op2=OP2;
	}
	public String getOp2()
	{
		return op2;
	}
	public void setOp3(String OP1)
	{
		op3=OP3;
	}
	public String getOp3()
	{
		return op3;
	}
	public void setOp1(String OP4)
	{
		op4=OP4;
	}
	public String getOp4()
	{
		return op4;
	}
	public void setAnswer(String A)
	{
		Answer=A;
	}
	public String getAnswer()
	{
		return Answer;
	}
}
class Exam
{
	Question Q[];
	private int Eid;
	private String Ename,EQuestion;
	void setQuestion(Question ...q)
	{
		Q=q;
	}
	void getQuestion()
	{
		
	}
	public void setEid(int EID)
	{
		Eid=EID;
	}
	public int getEid()
	{
		return Eid;
	}
	public void setEQuestion(String EQ)
	{
		EQuestion=EQ;
	}
	public String getEQuestion()
	{
		return EQuestion;
	}
	public void setEname(String EN)
	{
		Ename=EN;
	}
	public String getEname()
	{
		return Ename;
	}
}
class Student
{
	private int Sid;
	private float marks;
	private String Sname,Semail,Scontact;
	Exam e;
	void setExam(Exam e)
	{
		this.e=e;
	}
	public Exam[] getExam()
	{
		return e;
	}
}
public class ExamBasedApplication
{
	public static void main(String x[])
	{
		
	}
}
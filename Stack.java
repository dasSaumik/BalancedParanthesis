import java.util.Scanner;
public class Stack
{
	static int top=-1,size=0;
	static char arr[]=new char[10];
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	void push(char x)
	{
		if(top==9)
			System.out.println("Stack is Full");
		else
			arr[++top]=x;
	}
	char pop()
	{
		if(top==-1)
			return '\0';
		else
			return arr[top--];
	}

}
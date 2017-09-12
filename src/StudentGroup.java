import java.util.Date;

public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	//@Override
	public Student[] getStudents() {
		
		return students;
	}

	//@Override
	public void setStudents(Student[] students) 
	{
	try
	{
	int len,i;
	len=students.length;
	if(students==null)
	{
	throw IllegalArgumentException e;
	}
	else
	{
	for(i=0;i<len;i++)
	{
	this.students[i]=students[i];
	}
	}
	}
	catch(IllegalArgumentException e)
	{
	System.out.println(e);
	}
	}

	//@Override
	public Student getStudent(int index) {
try
{
if((index<0)||(index>=students.length))
{
throw IllegalArgumentException e;
}
else
{
return index;
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}

		return null;
	}

	//@Override
	public void setStudent(Student student, int index) {
		try
{
if((student==null)||((index<0)||(index>=students.length)))
{
throw IllegalArgumentException e;
}
else
{
students.replace(students[index],student);
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}
	}

	//@Override
	public void addFirst(Student student) {
	try
{
if(student==null)
{
throw IllegalArgumentException e;
}
else
{
students.index(0)=student;
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}		
	}

	//@Override
	public void addLast(Student student) {
	try
{
if(student==null)
{
throw IllegalArgumentException e;
}
else
{
students.append(student);
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}		
	}

	@Override
	public void add(Student student, int index) {
		try
{
if((student==null)||((index<0)||(index>=students.length)))
{
throw IllegalArgumentException e;
}
else
{
students.index(index)=student;
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}		
	}

	//@Override
	public void remove(int index) {
		try
{
if(((index<0)||(index>=students.length)))
{
throw IllegalArgumentException e;
}
else
{
students.index(index)=null;
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}		
	}

	//@Override
	public void remove(Student student) {
		try
{
int i;
if(student==null)
{
throw IllegalArgumentException e;
}
else
{
for(i=0;i<students.length;i++)
{
if(students[i].equals(student))
students[i]=null;
}
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	try
{
int i;
if(((index<0)||(index>=students.length)))
{
throw IllegalArgumentException e;
}
else
{
for(i=index+1;i<students.length;i++)
{
students[i]=null;
}
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}		
	}

	//@Override
	public void removeFromElement(Student student) {
	try
{
int i,j,k;
if(student==null)
{
throw IllegalArgumentException e;
}
else
{
for(i=0;i<students.length;i++)
{
if(students[i].equals(student))
j=i;
}
for(k=j;k<students.length;k++)
{
students[k]=null;
}
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}		
	}

	@Override
	public void removeToIndex(int index) {
		try
{
int i;
if(((index<0)||(index>=students.length)))
{
throw IllegalArgumentException e;
}
else
{
for(i=0;i<index-1;i++)
{
students[i]=null;
}
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
try
{
int i,j,k;
if(student==null)
{
throw IllegalArgumentException e;
}
else
{
for(i=0;i<students.length;i++)
{
if(students[i].equals(student))
j=i;
}
for(k=0;k<j-1;k++)
{
students[k]=null;
}
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}		
	}

	@Override
	public void bubbleSort() {
		int i,j;
for(i=0;i<students.length-1;i++)
{
for(j=0;j<students.length-i-1;j++)
{
if(students[j].compareTo(students[j+1])>0)
{
temp=students[j];
students[j]=students[j+1];
students[j+1]=temp;
}
}
}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		try
{
int i,j;
if(date==null)
{
throw IllegalArgumentException e;
}
else
{
for(i=0;i<students.length;i++)
{
if(students[i].birthDate==date)
j=i;
}
for(i=0;i<j;i++)
{
return students[i];
}
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}

		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		try
{
int i,j,k;
if((firstDate==null)||(lastDate==null))
{
throw IllegalArgumentException e;
}
else
{
for(i=0;i<students.length;i++)
{
if(students[i].birthDate==firstDate)
j=i;
else if(students[i].birthDate==lastDate)
k=i;
}
for(i=j;i<k;i++)
{
return students[i];
}
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		try
{
int i;
if(date==null)
{
throw IllegalArgumentException e;
}
else
{
for(i=0;i<students.length;i++)
{
if((students[i].birthdate==date)||(students[i].birthdate==days))
return students[i];
}
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
	try
{
int i;
String student;
if(indexOfStudent==0)
{
throw IllegalArgumentException e;
}
else
{
student=students.index(indexOfStudent);
return (int)student.date;
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
int i;		
for(i=0;i<students.length;i++)
{
if((int)students[i].birthDate==age)
return students[i];
}
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
int i;		
for(i=0;i<students.length;i++)
{
if(students[i].avgMark>students[i+1].avgMark)
j=i;
}
for(i=0;i<students.length;i++)
{
if(students[i].avgMark==i)
return students[i];
}
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
try
{
int i,j,k;
if(student==null)
{
throw IllegalArgumentException e;
}
else
{
for(i=0;i<students.length;i++)
{
if(students[i].equals(student))
j=++i;
}
return students[j];
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}		
		return null;
	}
}

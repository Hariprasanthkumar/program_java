class student
 {
    String name;
    int age;
    int roll;

    student()
	{
	    name="Hari";
            age=22;
	    roll=1;
	}

    void display1()
      {
             System.out.println("display1()");
       }

     public void displaystudent()
	{
	   System.out.println("Studentname"+name);
	   System.out.println("Student age"+age);
	   System.out.println("Roll"+roll);
	}
 }


class teacher extends student
 {

   teacher()
	{   
            super.display1();
            this.display();
	    name="Sivam";
            age=45;
	    roll=1;
	}
      
     void display()
      {
             System.out.println("display()");
       }

     public void displayteacher()
	{
	   System.out.println("Trainername"+name);
	   System.out.println("Trainerage"+age);
	   System.out.println("Trainer id"+roll);
	}
 }

class principal extends teacher
 {

   principal()
	{
	    name="SathishSivam";
            age=55;
	    roll=1;
	}

     public void displayprincipal()
	{
	   System.out.println("Principalname"+name);
	   System.out.println("Prinicipalage"+age);
	   System.out.println("Prinicipal id"+roll);
	}
 }


class demoinheritance
 {
    public static void main(String asd[])
	{   

           teacher obj1= new teacher();

	  // principal tobj=new principal();

	  // tobj.displaystudent();
	  // tobj.displayteacher();
	   //tobj.displayprincipal();
	}
 }

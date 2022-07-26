package GIT_GitHub_Practices;

public class Student {


    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 5 || age > 90) {
            System.out.println("Invalid age for a student.");
            return;
        }


    }

    public void setGender(char gender) {
        this.gender = gender;
        if (!(gender == 'F' || gender == 'M')) {
            System.out.println("Invalid entry for gender.");
            return;
        }
    }

    public void setGrade(char grade) {
        this.grade = grade;

        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')) {
            System.out.println("Invalid entry for the grade.");
            return;
        }
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, int age, char gender, char grade, String schoolName) {
        this.name = name;
        setAge(age);
        setGender(gender);
        setGrade(grade);
        this.schoolName = schoolName;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    public void Study(String study){
        System.out.println(name + " is studying.");
    }

    /*
1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fileds (at least encapsulate two fields manually)
					requirments:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any chanarcter other than: 'M' and 'F'
						3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirments of fileds in the above must be applied)


			Methods:
				study()
				toString()


 */


}

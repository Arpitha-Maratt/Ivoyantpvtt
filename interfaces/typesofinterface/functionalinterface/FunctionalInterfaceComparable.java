package interfaces.typesofinterface.functionalinterface;

class Student implements Comparable<Student>{
    int marks;
    Student(int marks){
        this.marks = marks;
    }

    public int compareTo(Student s){
        return this.marks - s.marks;
    }

    public static void main(String[] args) {
        Student s1 = new Student(90);
        Student s2 = new Student(80);

        System.out.println(s1.compareTo(s2));
    }
}


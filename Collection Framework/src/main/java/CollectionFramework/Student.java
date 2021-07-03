/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramework;

/**
 *
 * @author imrul
 */
public class Student implements Comparable<Student> {
    String name;
    int rollNo;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.rollNo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.rollNo != other.rollNo) {
            return false;
        }
        return true;
    }
    
    public Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public String toString(){
        return "Student{"+"name='"+name+'\''+", rollno="+rollNo+'}';
    }

    @Override
    //for rollNo sort
    public int compareTo(Student o) {
        return this.rollNo-o.rollNo; //To change body of generated methods, choose Tools | Templates.
    }
    //for name sort
    //public int compareTo(Student o) {
    //    return this.name.compareTo(o.name); //To change body of generated methods, choose Tools | Templates.
    //}
}

package PE2;

public class MemberInstance {
    Member object1=new Member("santhosh",21,50000);
    public String name()
    {
        return object1.name;
    }

    public int  age()
    {
        return object1.age;
    }

    public double salary()
    {
        return object1.salary;
    }

    public static  void main(String args[])
    {

        MemberInstance object2=new MemberInstance();
        System.out.println(object2.name());
        System.out.println(object2.age());
        System.out.println(object2.salary());
    }
}

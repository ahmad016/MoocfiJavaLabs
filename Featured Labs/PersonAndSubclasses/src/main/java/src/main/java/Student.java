public class Student extends Person{
    private int study;

    public Student(String name, String address){
        super(name, address);
        this.study = 0;
    }

    public void study(){
        study++;
    }

    public int credits(){
        return study;
    }

    @Override
    public String toString(){
        return super.toString() + "\n  Study credits " + credits();
    }


}

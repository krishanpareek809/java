class MyEmployee{
    private int id;
    private String name;

    public int getId(){
        return id;
    }

    public void setId(int i){
        this.id = i;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {

        MyEmployee krishan = new MyEmployee();

        krishan.setId(2);
        krishan.setName("Krishan Pareek");

        System.out.println(krishan.getId());
        System.out.println(krishan.getName());
    }
}

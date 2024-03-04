//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class dog {
    public String name;
    public int age;
    public String type;
    public String color;

    public dog(String name,int age, String type,String color) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.color = color;
    }
        public String nme() {
            return name;
        }

        public int ag() {
            return age;
        }

        public String tpe() {
            return type;
        }

        public String clr() {
            return color;
        }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
    }



    public static void main(String[] args) {
        // Contoh penggunaan class MyCat
        dog ovj = new dog("Dodi", 7, "cihuahua","brown");
        ovj.displayInfo();

        System.out.println();

    }
}
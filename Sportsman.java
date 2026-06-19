public class Sportsman {
    String name;
    int age;
    String sport;
    String country;
    int rank;
    void practice() {
        System.out.println(name + " is practicing " + sport);
    }
    void compete() {
        System.out.println(name + " is competing in a match");
    }
    void rest() {
        System.out.println(name + " is taking rest");
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sport: " + sport);
        System.out.println("Country: " + country);
        System.out.println("Rank: " + rank);
    }
    public static void main(String[] args) {
        Sportsman s1 = new Sportsman();

        s1.name = "Nitish Kumar Reddy";
        s1.age = 26;
        s1.sport = "Cricket";
        s1.country = "India";
        s1.rank = 71;

        s1.displayDetails();
        s1.practice();
        s1.compete();
        s1.rest();
    }
}
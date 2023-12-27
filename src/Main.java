public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        int age = yearTo-birth;
        if (age == 1) return "You are 1 year old.";
        else if (age == -1) return "You will be born in 1 year.";
        else if (birth == yearTo)  return "You were born this very year!";
        else if (age>0) return "You are "+ age + " years old.";
        else return "You will be born in "+ (birth-yearTo) + " years.";
    }
}
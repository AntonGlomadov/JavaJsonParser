public class Main {
    public static void main(String args[])
    {
        JsonParser parser = new JsonParser("test.json");
        Person[] persons = parser.parse();
        for(Person I : persons)
            if(I.age >= 20 && I.age <= 30 && I.gender.equals("male"))
                System.out.println(I.guid);
    }
}

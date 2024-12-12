class Person {
    private String name;
    private int age;

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Артём");
        person.setAge(19);

        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
    }
}

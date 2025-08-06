class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class methodOverriding {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound();            // Output: Dog barks
    }
}

    


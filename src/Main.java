public class AgeGenerator {
    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(100); // генерируем случайное число от 0 до 99
        return age;
    }
}
    public static void main(String[] args) {
        int age = AgeGenerator.generateRandomAge();
        boolean isAllowedToGoOut = canGoOut(age);
        System.out.println("Age: " + age);
        System.out.println("Allowed to go out: " + isAllowedToGoOut);
    }
    public static boolean canGoOut(int age) {
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }


}

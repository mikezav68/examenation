public class Main {

    public static void main(String[] args) {
        String abc = "телефон нофелет";
        boolean palindrome = true;
        int i = 0;
        int j = abc.length() - 1;
        while (i < abc.length()) {
            if (abc.charAt(i) != abc.charAt(j)) {
                palindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (palindrome) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }

}
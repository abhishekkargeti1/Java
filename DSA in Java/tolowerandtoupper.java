class tolowerandtoupper {
    public static void main(String[] args) 
{
        String words = "HelloWorld";
        String word1 = "";
                for (int i = 0; i < words.length(); i++) {
            char word = words.charAt(i);
            if (Character.isLowerCase(word)) {
                word1 += Character.toUpperCase(word);
            } else {
                word1 += Character.toLowerCase(word);
            }
        }
        
        System.out.println(word1);
    }
}

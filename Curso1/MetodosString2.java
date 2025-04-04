class MetodosString2 {
    public static void main(String[] args) {
       String sentence = "Java programming is fun and educational";
       
       boolean contain=sentence.contains("fun");
       System.out.println("This sentece contains the word fun? " +contain );
       
       String change = sentence.replace ("educational", "awesome");
       System.out.println("The new sentence is: " +change);
       
       String shorten = sentence.substring(0,23);
       System.out.println("The shorten sentence is: " +shorten);
       
    }
}
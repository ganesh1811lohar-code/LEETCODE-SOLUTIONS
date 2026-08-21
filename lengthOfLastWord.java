public class lengthOfLastWord {
    public int lengthofLastWord(String s) {
        int count = 0 ;

        for(int i = s.length()-1;i>=0;i--) {
            char str = s.charAt(i);

            if(str == ' ') {
                if(count>0) {
                    break;
                }
            } else {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)  {
        String s = "Hello world ";
        lengthOfLastWord s1 = new lengthOfLastWord();

        System.out.println(s1.lengthofLastWord(s));
    }
}
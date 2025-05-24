public class Performance {
    public static void main(String[] args) {

        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
        }
        System.out.println(series);

        //Now the problem is that as string are immutable so its creating the first and then adding the next and then again its creating a new object so if we are doing this process for so many times then there is so much of unused memory.

        //Now if we can modify the object then this would solve the problem
        //So String builder is the solution for this problem,
                                
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = ((char) ('a' + i));
            sb.append(ch);
        }

        System.out.println(sb.toString());
        System.out.println(sb.reverse());
        System.out.println(sb.length());
    }
}

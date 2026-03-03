public class Strings {
    public static void main(String[] args) {
        String name="yash";
        String title= new String("mittal");
        System.out.println(name);
        System.out.println(title);
        name=name+title;
        System.out.println(name);

        StringBuffer sb= new StringBuffer();
        sb.append("yash");
        sb.insert(4, "mittal");
        System.out.println(sb);
    }
    
}

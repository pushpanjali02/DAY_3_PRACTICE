public class IfConsonant {
    public static void main(String[] args) {
       // char[] ch=new char[10];
        char ch[]={'p','u','s','h','p','a','n','j','a','l','i','d','a','s'};
        for(char c: ch){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='O'||c=='U'||c=='E'||c=='I'){
                continue;
            }
            System.out.println(c);

        }
    }
}

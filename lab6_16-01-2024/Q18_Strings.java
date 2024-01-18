 //18
class str2
{
    public static void main(String ar[])
    {
        
        StringBuffer ob = new StringBuffer("Hello ");
        
        System.out.println("ob = "+ob);
        System.out.println("Length of ob:"+ob.length());
        ob.setLength(6);
        ob.append("World");
        System.out.println("New ob = "+ob);
        System.out.println("Length of new String:"+ob.length());
        System.out.println("Character at position 2="+ob.charAt(1));
        System.out.println("Inserting how are you? to ob: "+ob.insert(11," how are you?"));
        
        System.out.println("Reversing the String Buffer: "+ob.reverse());
        
        char s[] = new char[4];
        ob.getChars(0,4,s,0);
        System.out.println("Getting first 4 chars from ob: ");
        for(int i=0;i<s.length;i++)
        System.out.println(s[i]);
        
       StringBuffer ob = new StringBuffer("Hello");
       ob.delete(0,2);
       ob.deleteCharAt(1);
       
       StringBuffer ob = new StringBuffer("Hello");
       ob.replace(0,1,"B");
       System.out.println("ob = "+ob);
       
       
       String s = ob.substring(1);
       System.out.println("Substring = "+s);       
    }
}

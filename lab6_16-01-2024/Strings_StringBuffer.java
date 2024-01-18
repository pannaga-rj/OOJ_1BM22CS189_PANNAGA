class str
{
public static void main(String ar[])
{

//1
char c[] = {'h','i'};
String a =new String(c);
System.out.println(a);

//2
String s = new String("Hello");
System.out.println("Length: "+s.length());
String s1 = " World";
System.out.println("String after concatenation "+s.concat(s1));

//3
int d = 10;
System.out.println("d="+(Integer.toString(d)));


//4
String b = "Welcome to Bmsce college";
char c1[] = new char[7];
b.getChars(11,16,c1,0);
System.out.println(c1);


//5
String c = "ABC";
byte b[] = c.getBytes();
for(int i=0;i<b.length;i++)
System.out.println(b[i]);

//6
String s = "Bmsce";
String s1 = "Bmsce";
System.out.println(s+" equals "+s1+"="+s.equals(s1));
System.out.println(s+" equals College"+"="+s.equals("College"));

System.out.println(s+" equals BMSCE"+"="+s.equals("BMSCE"));
System.out.println(s+" equals College"+"="+s.equalsIgnoreCase("BMSCE"));



//7
String s="Bmsce college";
String s1 =  "Welcome to Bmsce college";
if(s1.regionMatches(11,s,0,s.length()))
System.out.println("Substring is matched");

else
System.out.println("Substring is  not mtched");




//8

String s="Welcome";
String s1 =  "Welcome to Bmsce college";
System.out.println(s+" startswith "+s1+"="+s1.startsWith(s));


//9
String s2 ="College";
System.out.println(s+" endswith "+s1+"="+s1.endsWith(s2));




//10
String s = "Bmsce";
String s1 = "Bmsce";
System.out.println("s==s1:" + (s==s1));
System.out.println("s.equals(s1):" + s.equals(s1));



//11
String a[] = {"van", "watch","ball", "cat","xmas","yatch","zee","apple","ice","jug","kite","lift","man","net","orange","dog","en","free","gun","hen","parrot","queen","ring","star","tree","umbrella"};


for(int j = 0;j<a.length;j++)
{
for(int i=0;i<a.length-1;i++)
{
if(a[i].compareTo(a[i+1])<0)
{
String temp = a[i+1];
a[i+1] = a[i];
a[i] = temp;
}

}
}

for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}



//12
String a[] = {"9", "8","7", "6", "5", "4", "3","2","1","0"};

for(int j = 0;j<a.length;j++)
{
for(int i=0;i<a.length-1;i++)
{
if(a[i].compareTo(a[i+1])>0)
{
String temp = a[i+1];
a[i+1] = a[i];
a[i] = temp;
}

}
}

for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}





//13

String s = "Thwas was a test. Thwas was, too.";
int i;
String search = "was";
String  sub = "is";
String res = "";
do
{
i = s.indexOf("was");
if(i!=-1)
{
res = s.substring(0, i);
res = res + sub;
res = res + s.substring(i+search.length());
s = res;
}
}
while(i!=-1);
System.out.println(res);


//14 == //2

//15
String s = "College";
System.out.println(s.replace('l','m'));


//16
String s = "   Hello Friends    ";
System.out.println(s.trim());
}
}

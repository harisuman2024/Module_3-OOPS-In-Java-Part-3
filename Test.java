class Test{
public static void main(String[] args) {
 show('A','A');
}
static void show(long a,char c) {
 System.out.println("long-char");
}
static void show(char c,int a) {
 System.out.println("char-int");
}
} 
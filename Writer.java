class Writer {
public static void write() {
System.out.println("Writing...");
}
}
class Author extends Writer {
public static void write() {
System.out.println("Writing book");
}
}
class Programmer extends Author {
public static void write() {
System.out.println("Writing code");
}
public static void main(String[] args) {
Author a = new Programmer();
// Programmer a = new Programmer();
a.write();
}
}
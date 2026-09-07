public class thiskeyword {
    String myname;
    thiskeyword(){
        System.out.println("hello");
    }
    void setname(String myname){
        this.myname=myname;
    }
    public static void main(String args[]){
        thiskeyword t1=new thiskeyword();
        t1.setname("mark");
        System.out.println(t1.myname);
    }
}

public class p extends HtmlBase{

    String text;
    public p(String id, String name, String text) {
        this.text = text;
        this.name=name;
        this.id=id;
        if(name != null && id != null) {
            tag = "<p name= "+ name +" id= "+ id+ ">"+text+"</p>";
        }
        if(name == null && id != null) {
            tag = "<p id= "+ id+ ">"+text+"</p>";
        }
        if(name != null && id == null) {
            tag = "<p name= "+ name+ ">"+text+"</p>";
        }
        if(name == null && id == null) {
            tag = "<p>"+text+"</p>";
        }
    }
}

public class div extends HtmlBase{

    String text;
    public div(String id, String name, String text) {
        this.text=text;
        this.name=name;
        this.id=id;
        if(name != null && id != null) {
            tag = "<div name= "+ name +" id= "+ id+ ">"+text+"</div>";
        }
        if(name == null && id != null) {
            tag = "<div id= "+ id+ ">"+text+"</div>";
        }
        if(name != null && id == null) {
            tag = "<div name= "+ name+ ">"+text+"</div>";
        }
        if(name == null && id == null) {
            tag = "<div>"+text+"</div>";
        }

    }





}

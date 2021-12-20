public class em extends HtmlDecorator{
    HtmlBase html;

    public em (HtmlBase html, String name, String id){
        this.html=html;
        this.name= name;
        this.id= id;
}
public String getTag(){


    if(name != null && id != null) {
        tag = "<em name= "+ name +" id= "+ id+ ">"+ html.getTag()+"</em>";
    }
    if(name == null && id != null) {
        tag = "<em id= "+ id+ ">"+html.getTag()+"</em>";
    }
    if(name != null && id == null) {
        tag = "<em name= "+ name+ ">"+html.getTag()+"</em>";
    }
    if(name == null && id == null) {
        tag = "<em>"+html.getTag()+"</em>";
    }
        return tag;
}




}

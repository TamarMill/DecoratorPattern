public class u extends HtmlDecorator{
    HtmlBase html;

    public u (HtmlBase html, String name, String id){
        this.html = html;
        this.name = name;
        this.id = id;
    }
    public String getTag(){
        if(name != null && id != null) {
            tag = "<u name= "+ name +" id= "+ id+ ">"+ html.getTag()+"</u>";
        }
        if(name == null && id != null) {
            tag = "<u id= "+ id+ ">"+html.getTag()+"</u>";
        }
        if(name != null && id == null) {
            tag = "<u name= "+ name+ ">"+html.getTag()+"</u>";
        }
        if(name == null && id == null) {
            tag = "<u>"+html.getTag()+"</u>";
        }
        return tag;
    }

}

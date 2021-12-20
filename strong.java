public class strong extends HtmlDecorator{
    HtmlBase html;

    public strong (HtmlBase html, String name, String id){
        this.html = html;
        this.name = name;
        this.id = id;
    }
    public String getTag(){
        if(name != null && id != null) {
            tag = "<strong name= "+ name +" id= "+ id+ ">"+ html.getTag()+"</strong>";
        }
        if(name == null && id != null) {
            tag = "<strong id= "+ id+ ">"+html.getTag()+"</strong>";
        }
        if(name != null && id == null) {
            tag = "<strong name= "+ name+ ">"+html.getTag()+"</strong>";
        }
        if(name == null && id == null) {
            tag = "<strong>"+html.getTag()+"</strong>";
        }
        return tag;
    }

}

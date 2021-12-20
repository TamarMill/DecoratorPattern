public class small extends HtmlDecorator{
    HtmlBase html;

    public small(HtmlBase html, String name, String id){
        this.name = name;
        this.id = id;
        this.html=html;

    }
    public String getTag(){
        if(name != null && id != null) {
            tag = "<small name= "+ name +" id= "+ id+ ">"+ html.getTag()+"</small>";
        }
        if(name == null && id != null) {
            tag = "<small id= "+ id+ ">"+html.getTag()+"</small>";
        }
        if(name != null && id == null) {
            tag = "<small name= "+ name+ ">"+html.getTag()+"</small>";
        }
        if(name == null && id == null) {
            tag = "<small>"+html.getTag()+"</small>";
        }
        return tag;
    }

}

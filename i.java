public class i extends HtmlDecorator{
    HtmlBase html;

    public i(HtmlBase html, String name, String id){
        this.html=html;
        this.name= name;
        this.id = id;
    }

    public String getTag(){
        if(name != null && id != null) {
            tag = "<i name= "+ name +" id= "+ id+ ">"+ html.getTag()+"</i>";
        }
        if(name == null && id != null) {
            tag = "<i id= "+ id+ ">"+html.getTag()+"</i>";
        }
        if(name != null && id == null) {
            tag = "<i name= "+ name+ ">"+html.getTag()+"</i>";
        }
        if(name == null && id == null) {
            tag = "<i>"+html.getTag()+"</i>";
        }
        return tag;
    }

}

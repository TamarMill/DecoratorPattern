public class a extends HtmlDecorator{
    HtmlBase html;
    String href;

    public a ( HtmlBase html,String name, String id, String href){
        this.name=name;
        this.id= id;
        this.html=html;
        this.href=href;
    }
    public String getTag(){
        if(name != null && id != null) {
            tag = "<a href= "+"\""+href+"\"" +" name= "+ name +" id= "+ id+ ">"+ html.getTag()+"</a>";
        }
        if(name == null && id != null) {
            tag = "<a href= "+"\""+href+"\"" +" id= "+ id+ ">"+html.getTag()+"</a>";
        }
        if(name != null && id == null) {
            tag = "<a href= "+"\""+href+"\"" +" name= "+ name+ ">"+html.getTag()+"</a>";
        }
        if(name == null && id == null) {
            tag = "<a href= "+"\""+href+"\"" +">"+html.getTag()+"</a>";
        }
        return tag;
    }

}

public class input extends HtmlBase{
    String id;
    String type;
    String event;
    String value;
    String name;
    String eventDesc;
    String text;
    public input(String id,String name, String type, String event, String value, String eventDesc, String text) {
        this.text=text;
        this.type=type;
        this.event=event;
        this.value=value;
        this.eventDesc=eventDesc;
        this.name=name;
        this.id=id;
        if(name != null && id != null) {
            tag = "<input name= "+ name +" id= "+ id+ " type= \"" +type+"\" value = \"" +value +"\" "+ event+"= "+"\""+eventDesc+"\""+">"+text+"</input>";
        }
        if(name == null && id != null) {
            tag = "<input id= "+ id+ " type= \"" +type+"\" value = \"" +value +"\" "+ event+"= "+"\""+eventDesc+"\""+">"+text+"</input>";
        }
        if(name != null && id == null) {
            tag = "<input name= "+ name+ " type= \"" +type+"\" value = \"" +value +"\" "+ event+"= "+"\""+eventDesc+"\""+">"+text+"</input>";
        }
        if(name == null && id == null) {
            tag = "<input"+" type= \"" +type+"\" value = \"" +value +"\" "+ event+"= "+"\""+eventDesc+"\""+">"+text+"</input>";
        }
    }



}

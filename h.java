public class h extends HtmlBase{
    int number;
    String text;
    public h(String id, String name, int number, String text) {
        this.text=text;
        this.number = number;
        if(number<1 || number>6){
            throw new IllegalArgumentException("Invalid number (must be between 1 and 6)");
        }
        this.name=name;
        this.id=id;

        if(name != null && id != null) {
            tag = "<h"+number+ " name= "+ name +" id= "+ id+ ">"+text+"</h"+number+">";
        }
        if(name == null && id != null) {
            tag = "<h"+number+ " id= "+ id+ ">"+text+"</h"+number+">";
        }
        if(name != null && id == null) {
            tag = "<h"+number+ " name= "+ name+ ">"+text+"</h"+number+">";
        }
        if(name == null && id == null) {
            tag = "<h" +number+">"+text+"</h"+number+">";
        }

    }


}

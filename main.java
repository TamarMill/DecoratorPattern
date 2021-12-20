public class main {
    public static void main (String[] args){
      HtmlBase html= new div("123", "divTag","this is the div tag");
      html= new a(html,null,null,"www.touro.edu");
      System.out.println(html.getTag());

      HtmlBase html2 = new p("123", "pTag","");
      System.out.println(html2.getTag());

      HtmlBase html3 = new h(null, "hTag", 4,"hello my name is Tami");
      html3 = new em(html3, null, "123456");
      html3 = new strong(html3, "strongTag", "378");
      html3 = new i(html3, "iTag", null);
      System.out.println(html3.getTag());

      HtmlBase html4 = new input(null,null,"button", "onclick","action", "javascript:alert('action')", "");
      html4 = new u(html4, "uTag", "123");
      html4 = new small(html4, null, null);
      System.out.println(html4.getTag());


    }
}

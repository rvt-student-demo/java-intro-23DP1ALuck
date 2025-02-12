package lv.rvt;

public class BoxTester {
    public static void main(String[] args) {
// Ex. 1,2 test constructor, area and volume methods
        Box box = new Box(2.5, 5.0, 6.0);

        System.out.println("Area " + box.area() + " volume " + box.volume());
        System.out.println( "length: " + box.length() + " height: " + box.height() +
                " width:  " + box.width() )  ;
// Ex. 3 access methods
        Box test2 = new Box(box);
        System.out.println("Box2 test copy");
        System.out.println("length: " + test2.length() + " height: " + test2.height() + " width: " + test2.width());
// Ex. 4 constructor inside method
        Box smallerBox = box.smallerBox(box);
        Box biggerBox = box.biggerBox(box);
        System.out.println("length: " + smallerBox.length() + " height: " + smallerBox.height() + " width: "
                + smallerBox.width());
//Ex.5 Nesting box, compare two object parameters
        System.out.println(smallerBox.nests(box));
        System.out.println(biggerBox.nests(box));
    }

}

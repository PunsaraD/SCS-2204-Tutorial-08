object Q1 extends App{
    var a = Point(2,5);
    var b = Point(4,1);

    println(a);
    println(b);

    println(a.add(b));

    a.move(2, 3);
    println(a);

    var c = a.distance(b)
    println(c);

    a.invert()
    println(a)

}


case class Point(var x:Int, var y:Int) {
        def add(p:Point) = new Point(x+p.x, y+p.y)

        def move(n:Int, m:Int) ={
            this.x = this.x + n;
            this.y = this.y + m;
        } 

        def distance(a:Point) = {
            var xDistance = x - a.x;
            var yDistance = y - a.y;
            var dist = xDistance*xDistance + yDistance*yDistance;
            scala.math.sqrt(dist)
        }

        def invert() = {
            var temp = this.x;
            this.x = this.y;
            this.y = temp;
        }
    }

import java.util.*;
package Question3;
public abstract class Shape
{
     abstract double area();
}
class Circle extends Shape
{
       private double radius;
       Circle(double radius)
       {
           this.radius=radius;
       }
       //provide parameterized constructor.
      //override  area() ;
      @Override double area()
      {
          return 3.14*radius*radius;
      }
}
class Rectangle extends Shape
{
     private double length,breadth;
      //provide parameterized constructor
      Rectangle(double length,double breadth)
      {
          this.length=length;
          this.breadth=breadth;
      }
     // override area() ;
     @Override double area()
     {
         return length*breadth;
     }
     
     
}
class  ShapesFactory
{
          ArrayList<Shape> slist = new ArrayList<>();  //to store Circle and Rectangle objects.
         public ShapesFactory()  {  }
        
      public void addShape(Shape s)
       {
                //Should add Circle Objects / Rectangle Objects to the slist property.
                slist.add(s);
        }
        public ArrayList<Circle> getCircles()
        {
              //Should return list of Circle Objects from slist property.
              ArrayList<Shape> clist=new ArrayList<>();
              Iterator<Shape> iter= slist.iterator();
              while (iter.hasNext()) 
              {
                  Shape temp=iter.next();
                  if(temp.getClass().getName()=="Circle")
                  {
                      clist.add(temp);
                  }
                  
              }
              return clist;
              
        }
       public ArrayList<Rectangle> getRectangles()
        {
              //Should return list of  Rectangle Objects from slist property.
              ArrayList<Shape> rlist=new ArrayList<>();
              Iterator<Shape> iter= slist.iterator();
              while (iter.hasNext()) 
              {
                  Shape temp=iter.next();
                  if(temp.getClass().getName()=="Rectangle")
                  {
                      rlist.add(temp);
                  }
                  
              }
              return rlist;
        }
        public boolean  deleteShape(Shape s)
        {
                  //If given Shape I,e. Circle/Rectangle object if should delete and return true
                  //If not found should return false
                  if(slist.contains(s))
                  {
                     slist.remove(slist.indexOf(s)); 
                  }
                  return slist.contains(s);
        }
        
}
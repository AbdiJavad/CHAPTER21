  import com.sun.javafx.geom.Rectangle;
  import javafx.scene.shape.Circle;

  import java.util.*;

           public class TestTreeSetWithComparator {
   public static <GeometricObject> void main(String[] args) {

          Set<GeometricObject> set =
                  new TreeSet<>((Comparator) new GeometricObjectComparator());
          set.add((GeometricObject) new Rectangle(4, 5));
          set.add((GeometricObject) new Circle(40));
          set.add((GeometricObject) new Circle(40));
          set.add((GeometricObject) new Rectangle(4, 1));

           System.out.println("A sorted set of geometric objects");
          for (GeometricObject element: set)
             System.out.println("area = " + element.getClass());
          }
  }
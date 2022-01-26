/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Jeremiah Curtis
 * @version 01.26.2022
 */
public class Picture
{
    private Square house;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Person guy;
    private Square ground;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        house = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        guy = new Person();
        ground = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            house.moveHorizontal(-50);
            house.moveVertical(0);
            house.changeSize(150);
            house.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(35);
            window.moveVertical(20);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeColor("magenta");
            roof.changeSize(100, 170);
            roof.moveHorizontal(125);
            roof.moveVertical(-120);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(-190);
            sun.moveVertical(-60);
            sun.changeSize(75);
            sun.makeVisible();
            
            guy.changeColor("blue");
            guy.moveHorizontal(-60);
            guy.moveVertical(20);
            guy.makeVisible();
            
            ground.changeColor("green");
            ground.moveHorizontal(-320);
            ground.moveVertical(130);
            ground.changeSize(520);
            ground.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        house.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        guy.changeColor("black");
        ground.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        house.changeColor("red");
        window.changeColor("black");
        roof.changeColor("magenta");
        sun.changeColor("yellow");
        guy.changeColor("blue");
        ground.changeColor("green");
    }
}

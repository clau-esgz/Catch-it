import greenfoot.*;

public class Kirby extends Actor {
    private final int COUNT_STOP_KIRBY_START_VALUE = 20;
    private final int OFFSET = 3;
    private final int DIRECTION_RIGHT = 0;
    private final int DIRECTION_LEFT = 1;
    private final int REFERENCE_Y = 280;
    private final int VELOCITY_DOWN_Y = 8;
    private final int VELOCITY_UP_Y = 14;

    private int walkingDelay = COUNT_STOP_KIRBY_START_VALUE;
    private String[][] images;
    private int imageIndex;
    private int referenceY = REFERENCE_Y;
    private int velocityDownY = VELOCITY_DOWN_Y;
    private int velocityUpY = VELOCITY_UP_Y;

    private GreenfootImage imgDown;
    private GreenfootImage imgUp;

    public Kirby() {
        imagesRightLeft();
        setImage(images[0][0]);
        imgDown = new GreenfootImage("images/Down.png");
        imgUp = new GreenfootImage("images/Up.png");
    }

    public void act() {
        checkCollision();
        fall();
        moveKeys();
    }

    private void checkCollision() {
        if (isTouching(Obstacle.class)) {
            Actor obstacle = getOneIntersectingObject(Obstacle.class);
            int obstacleLeft = obstacle.getX() - (obstacle.getImage().getWidth() / 2);
            int obstacleRight = obstacle.getX() + (obstacle.getImage().getWidth() / 2);
            int kirbyLeft = getX() - (getImage().getWidth() / 2);
            int kirbyRight = getX() + (getImage().getWidth() / 2);
            int obstacleTop = obstacle.getY() - (obstacle.getImage().getHeight() / 2);
            int obstacleBottom = obstacle.getY() + (obstacle.getImage().getHeight() / 2);
            int kirbyBottom = getY() + (getImage().getHeight() / 2);
            int kirbyTop = getY() - (getImage().getHeight() / 2);

            if (kirbyBottom >= obstacleTop && kirbyTop <= obstacleBottom) {
                if (kirbyRight >= obstacleLeft && kirbyRight < obstacleLeft + 10) {
                    // Choque desde el lado izquierdo
                    setLocation(obstacleLeft - (getImage().getWidth() / 2), getY());
                } else if (kirbyLeft <= obstacleRight && kirbyLeft > obstacleRight - 10) {
                    // Choque desde el lado derecho
                    setLocation(obstacleRight + (getImage().getWidth() / 2), getY());
                } else if (kirbyBottom >= obstacleTop && kirbyBottom < obstacleTop + 10) {
                    // Choque desde abajo
                    setLocation(getX(), obstacleTop - (getImage().getHeight() / 2));
                } else if (kirbyTop <= obstacleBottom && kirbyTop > obstacleBottom - 10) {
                    // Choque desde arriba
                    setLocation(getX(), obstacleBottom + (getImage().getHeight() / 2));
                }
            }
        }
    }

    private void imagesRightLeft() {
        images = new String[2][2];

        images[DIRECTION_RIGHT] = new String[]{
            "images/NormalRight.png",
            "images/WalkRight.png"
        };

        images[DIRECTION_LEFT] = new String[]{
            "images/NormalLeft.png",
            "images/WalkLeft.png"
        };

    }

    private void moveKeys() {
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + OFFSET, getY());
            walkingDelay(DIRECTION_RIGHT);
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - OFFSET, getY());
            walkingDelay(DIRECTION_LEFT);
        }
        if (Greenfoot.isKeyDown("down")) {
            setImage(imgDown);
        }
        if (Greenfoot.isKeyDown("space")) {
            setImage(imgUp);
            setLocation(getX(), getY() - velocityUpY);
        }
    }

    public void walkingDelay(int direction) {
        walkingDelay--;
        if (direction == DIRECTION_LEFT) {
            if (walkingDelay == 0) {
                imageIndex = (imageIndex + 1) % images[DIRECTION_LEFT].length;
                setImage(images[DIRECTION_LEFT][imageIndex]);
                walkingDelay = COUNT_STOP_KIRBY_START_VALUE;
            }
        }
        if (direction == DIRECTION_RIGHT) {
            if (walkingDelay == 0) {
                imageIndex = (imageIndex + 1) % images[DIRECTION_RIGHT].length;
                setImage(images[DIRECTION_RIGHT][imageIndex]);
                walkingDelay = COUNT_STOP_KIRBY_START_VALUE;
            }
        }
    }

    public void fall() {
        if (getY() < referenceY) {
            setLocation(getX(), getY() + velocityDownY);
        }
    }
}
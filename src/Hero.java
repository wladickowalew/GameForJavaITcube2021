public class Hero extends Model{

    public Hero(int x, int y){
        super(x, y, "Images\\Hangehog.png");
    }

    public void stepX(int x){
        x += this.getX();
        this.setX(x);
        if (x >= Const.W)
            this.setX(0);
        if (x < 0)
            this.setX(Const.W - Const.STEP);
    }

    public void stepY(int y){
        y += this.getY();
        this.setY(y);
        if (y >= Const.H)
            this.setY(0);
        if (y < 0)
            this.setX(Const.H - Const.STEP);
    }
}

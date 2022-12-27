package magicGame.models.magics;

public abstract class MagicImpl implements Magic{

    public String name;
    public int bulletsCount;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getBulletsCount() {
        return 0;
    }

    @Override
    public int fire() {
        return 0;
    }
}

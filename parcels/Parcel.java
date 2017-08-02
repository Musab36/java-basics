class Parcel {
public int mWeight;
public int mDimensions;
public int mCost;

public boolean volume(int maxVolume) {
    return(mWeight > maxVolume);
}
public boolean costToShip(int shipCost) {
    return(mCost > shipCost);
}
}
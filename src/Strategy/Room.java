package Strategy;

public abstract class Room {
    private IGameRoomType gameRoomType;
    private IPSRoomType psRoomType;
    private IFoodRoomType foodRoomType;
    private ICinemaRoomType cinemaRoomType;

    public Room(IGameRoomType gameRoomType, IPSRoomType psRoomType, IFoodRoomType foodRoomType, ICinemaRoomType cinemaRoomType) {
        this.gameRoomType = gameRoomType;
        this.psRoomType = psRoomType;
        this.foodRoomType = foodRoomType;
        this.cinemaRoomType = cinemaRoomType;
    }

    public void aboutPSRoomType(){
        this.psRoomType.roomType();
    }
    public void aboutGameRoomType(){
        this.gameRoomType.roomType();
    }
    public void aboutFoodRoomType(){
        this.foodRoomType.roomType();
    }
    public void aboutCinemaRoomType(){
        this.cinemaRoomType.roomType();
    }


    public IGameRoomType getGameRoomType() {
        return gameRoomType;
    }

    public void setGameRoomType(IGameRoomType gameRoomType) {
        this.gameRoomType = gameRoomType;
    }

    public IPSRoomType getPsRoomType() {
        return psRoomType;
    }

    public void setPsRoomType(IPSRoomType psRoomType) {
        this.psRoomType = psRoomType;
    }

    public IFoodRoomType getFoodRoomType() {
        return foodRoomType;
    }

    public void setFoodRoomType(IFoodRoomType foodRoomType) {
        this.foodRoomType = foodRoomType;
    }

    public ICinemaRoomType getCinemaRoomType() {
        return cinemaRoomType;
    }

    public void setCinemaRoomType(ICinemaRoomType cinemaRoomType) {
        this.cinemaRoomType = cinemaRoomType;
    }
}

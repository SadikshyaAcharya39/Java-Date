package JavaCodes;

public class MainMethod{
    public static void main(String[] args) {
       StationaryItems stationaryItems = new StationaryItems();
       StationaryItems.Pen pen = stationaryItems.new Pen();
        System.out.println(stationaryItems.firstItem);
        System.out.println(pen.type);
    }
}

package chap5;
class TV{
    private int size;
    public TV(int size) { this.size = size; }
    protected int getSize() { return size; }
}

class ColorTV extends TV
{
    private int resolution;
    ColorTV(int size, int resolution) {
        super(size);
        this.resolution = resolution;
    }
    public void printProperty() {
        System.out.print(getSize()+"인치 "+resolution+"컬러");
    }
}
class IPTV5_2 extends ColorTV
{
    String IP;
    IPTV5_2(String IP, int size, int resolution)
    {
        super(size, resolution);
        this.IP = IP;
    }
    public void printProperty() {
        System.out.print("나의 IPTV는 "+IP+" 주소의 ");
        super.printProperty();
    }
    public static void main(String[] args) {
        IPTV5_2 iptv = new IPTV5_2("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
        iptv.printProperty();
    }
}

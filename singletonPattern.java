
class singletonPattern{
    public String str;
    private static singletonPattern instance = null;
    private singletonPattern(){
    }
    public static singletonPattern getSingleInstance(){
        if (instance==null) instance = new singletonPattern();
        return instance;
    }
}
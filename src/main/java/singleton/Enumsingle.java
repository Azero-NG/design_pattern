class Resource{

}

public enum Singele {
    INSTANCE;
    private Resource instance;
    private Singele(){
        instance = new Resource();
    }
    public Resource get_instance(){
        return instance;
    }
}

//存在疑问,INSTANCE到底是什么
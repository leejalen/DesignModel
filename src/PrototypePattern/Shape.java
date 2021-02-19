package PrototypePattern;

/**
 * @Author Jalen
 * @Date 2020/6/1 17:09
 * @Description 原型模式
 **/
public abstract class Shape implements Cloneable{

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone=null;
        clone=super.clone();
        return clone;
    }
}

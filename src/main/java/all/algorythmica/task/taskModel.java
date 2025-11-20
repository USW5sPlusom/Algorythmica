package all.algorythmica.task;


public class taskModel {
    private String id;
    private String content;

    taskModel(){

    }
    taskModel(String id, String content){
        this.id = id;
        this.content = content;
    }

    public String getId(){
        return this.id;
    }
    public String getContent(){
        return this.content;
    }

    public void setId(String id){
        this.id = id;
    }
    public void setContent(String content){
        this.content = content;
    }

    public String toString(){
        return this.id + " " + this.content;
    }
}
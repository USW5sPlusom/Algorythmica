package all.algorythmica.task.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class taskModel {
    @Id
    private String id;
    @Column
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
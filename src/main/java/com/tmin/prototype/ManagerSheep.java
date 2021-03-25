package com.tmin.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * @author
 * @date 2021-02-07 21:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManagerSheep implements Cloneable, Serializable {

    private String name;

    private Sheep sheep;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        //对基本数据类型和String进行克隆
        ManagerSheep managerSheep = (ManagerSheep) super.clone();
        //对类中的应用数据类型拷贝
        Sheep sheep = (Sheep) this.sheep.clone();
        managerSheep.setSheep(sheep);
        return managerSheep;
    }

    //深拷贝  方式2 通过对象的序列化实现(推荐)

    public Object deepClone(){

        //创建流对象
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            //关闭流
            try {
                assert ois != null;
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

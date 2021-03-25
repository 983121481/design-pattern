package com.tmin.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @date 2021-02-22 21:12
 */
public class Client {
    public static void main(String[] args) {

        //创建学院
        List<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hallur
 */
public class SqlScriptCreator {

    public String demoCreateAndInsert() {
        String doAll = "Create schema hallur2;";
        doAll += "CREATE TABLE testTable (\n"
                + "    user_name varchar(45),\n"
                + "    user_age int\n"
                + ");";
        doAll+="insert into testTable()values('hallur', 123);";
        return doAll;
    }
}

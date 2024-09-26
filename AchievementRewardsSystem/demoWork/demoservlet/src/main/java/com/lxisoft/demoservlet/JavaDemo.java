package com.lxisoft.demoservlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JavaDemo extends HttpServlet{

    public void doPost(HttpServletRequest request,HttpServletResponse response){

        String name = request.getParameter("name");
        String number = request.getParameter("idNumber");

        String url = "jdbc:mysql://localhost:3306/demoServlet";
        String dbUserName = "root";
        String dbUserPass = "arjun7945";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, dbUserName, dbUserPass);

            String sql = "Insert into employee (name,number) values (?,?)";
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setString(1,name);
            prep.setInt(2,Integer.parseInt(number));

            int rowsInserted = prep.executeUpdate();

        }
        catch (ClassNotFoundException e) {
            e.printStackTrace(); 
        } catch (SQLException e) {
            e.printStackTrace(); 
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }

}
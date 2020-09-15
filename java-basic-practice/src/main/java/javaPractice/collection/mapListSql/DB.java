package javaPractice.collection.mapListSql;


import java.sql.*;

public class DB {

    //mysql驱动包名
    public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    //数据库连接地址:哪个ip地址下的哪个端口下的哪个数据库名
    public static final String URL= "jdbc:mysql://localhost:3306/ha?useUnicode=true&characterEncoding=utf8";//JDBC文档会指明url的格式
    //数据库用户名
    public static final String USER_NAME = "root";
    //数据库密码
    public static final String PASSWORD= "12";


    public static void main(String[] args) {
        Connection cn;
        try{
            //JDBC与DBMS建立连接:所有的操作都是基于连接之上
            //步骤一：加载mysql的驱动类：包括创建驱动实例并且注册驱动 ：加载 Driver 类后，它们即可用来与数据库建立连接。
            Class.forName(DRIVER_NAME); //加载驱动类
            System.out.println("数据库加载驱动成功");
            //步骤二：获取数据库连接
            cn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);//用适当的驱动程序类与DBMS建立一个连接：该方法发返回一个打开的连接：cn对象，可以用它发送sql语句
            if(cn!=null&&!cn.isClosed()){
                System.out.println("数据库连接成功");
            }

            //创建向数据库发送sql的对象
            Statement statement = cn.createStatement();//创建代表SQL语句的对象：
            //创建sql语句对象
            String sql="select * from t_sale_pic WHERE pic_type=1;";
            //ResultSet类，用来存放获取的结果集！！
            ResultSet rs = statement.executeQuery(sql);//执行SQL语句

            while(rs.next()){//如果是查询语句，需要遍历结果集
                System.out.println("地址："+rs.getString("pic_path"));
            }

            //释放占用的资源
            rs.close();
            statement.close();
            cn.close();

        }catch (ClassNotFoundException e){
            System.out.println("数据库驱动没有安装");
            e.printStackTrace();
        }catch(SQLException s) {
            System.out.println("数据库连接失败");
            s.printStackTrace();//打印异常日志
        }



    }
}

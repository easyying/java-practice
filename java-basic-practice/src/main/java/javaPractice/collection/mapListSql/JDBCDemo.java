package javaPractice.collection.mapListSql;

/**
 * 测试加载数据库驱动成功没
 */
public class JDBCDemo {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    public static void main(String[] args) {
        try{
            Class.forName(DRIVER);
            System.out.println("数据库驱动类加载成功");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}

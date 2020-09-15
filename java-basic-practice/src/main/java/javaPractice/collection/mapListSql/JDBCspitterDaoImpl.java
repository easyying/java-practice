package javaPractice.collection.mapListSql;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class JDBCspitterDaoImpl implements SpitterDao {

    private static final  String SQL_UPDATE = "SELECT  id,username,password from spitter";
    private SimpleJdbcTemplate simpleJdbcTemplate ;
    public void setSimpleJdbcTemplate(SimpleJdbcTemplate simpleJdbcTemplate){
        this.simpleJdbcTemplate = simpleJdbcTemplate;
    }

    public void add(Spitter spitter){
        simpleJdbcTemplate.update(SQL_UPDATE,
                spitter.getPassword(),
                spitter.getUsername()
                );
    }

}

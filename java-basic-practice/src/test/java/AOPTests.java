import javaPractice.aop.service.AdviceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class AOPTests {
    @Autowired
    private AdviceService adviceService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test(){
        String user = adviceService.findUser();
        System.out.println("<><><><><><><><><><><><><>");
        adviceService.addUser();
    }
}

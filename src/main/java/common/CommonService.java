package common;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author chase
 */
@Service
public class CommonService {

    @Autowired
    private CommonProperties commonProperties;

    /**
     * 外部调用方法
     * @return
     */
    public String sayHello() {
        return commonProperties.getUsername() ;
    }
}
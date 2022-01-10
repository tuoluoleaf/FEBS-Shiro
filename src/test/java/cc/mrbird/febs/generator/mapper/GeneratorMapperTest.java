package cc.mrbird.febs.generator.mapper;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author tuoluolef
 * @date 2022/1/10 13:30
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GeneratorMapperTest {

    @Autowired(required = false)
    private GeneratorMapper generatorMapper;

    @Test
    public void getDatabases() {
        List<String> databases = generatorMapper.getDatabases(null);

        System.out.println(JSON.toJSON(databases));
    }

    @Test
    public void getTables() {
    }

    @Test
    public void getColumns() {
    }
}
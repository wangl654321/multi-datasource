package cn.zhh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： @author wl
 * 创建时间： 2020/12/11 12:40 下午
 * 创建描述：
 *
 * 修 改 者：
 * 修改时间：
 * 修改描述：
 *
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */
@MapperScan(basePackages = {"cn.zhh.mapper","cn.zhh.mapper2"})
@SpringBootApplication
public class MultiDatasourceTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiDatasourceTransactionApplication.class, args);
    }

}

package cn.zhh.controller;
import cn.zhh.config.InfoProperties;
import cn.zhh.entity.Student;
import cn.zhh.entity.User;
import cn.zhh.service.MultiDataSourceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： @author wl
 * 创建时间： 2020/12/10 10:41 上午
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
@Controller
public class IndexController {

    @Resource
    private MultiDataSourceService sourceService;

    @Resource
    private InfoProperties dataSourceEntity;

    @ResponseBody
    @RequestMapping("/test/dataSource")
    public String getMusicNames() {

        System.out.println(dataSourceEntity.getConfigs());

        Student student = new Student();
        student.setName("张三");
        student.setCode("123");
        student.setSex(15);
        student.setCreateTime(new Date());
        student.setIsDeleted(1);

        User user = new User();
        user.setUserName("李四");
        user.setPassword("123456");
        user.setMobile("110");
        user.setCreateTime(new Date());
        user.setIsDeleted(2);

        sourceService.bothInsert(student,user);
        System.out.println("getMusicNames");
        return "getMusicNames";
    }
}

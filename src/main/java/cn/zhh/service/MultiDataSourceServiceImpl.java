package cn.zhh.service;

import cn.zhh.annotation.DynamicTransactional;
import cn.zhh.entity.Student;
import cn.zhh.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 多数据源服务实现类
 *
 * @author Zhou Huanghua
 * @date 2019/10/26 0:56
 */
@Service
public class MultiDataSourceServiceImpl implements MultiDataSourceService {

    @Resource
    private StudentService studentService;

    @Resource
    private UserService userService;

    @Override
    @DynamicTransactional(transactionManagers = {"dataSourceTransactionManager", "dataSourceTransactionManager2"})
    public void bothInsert(Student student, User user) {
        // 插入学生
        studentService.insert(student);
        // 插入用户
        userService.insert(user);
        // 抛出异常
        // int i = 1 / 0;
    }

    @Override
    @DynamicTransactional(transactionManagers = {"dataSourceTransactionManager", "dataSourceTransactionManager2"})
    public void bothDelete(Long studentId, Long userId) {
        //  int i = 1 / 0;
        studentService.deleteById(studentId);
        //  int j = 1 / 0;
        userService.deleteById(userId);
        //  int k = 1 / 0;
    }
}

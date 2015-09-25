package com.zhujie.study.mybatis._01_GettingStarted;

import org.apache.ibatis.annotations.Select;

/**
 * Created by zhujie on 15/9/25.
 */
public interface BlogMapper {
    @Select("SELECT * FROM blog WHERE id = #{id}")
    Blog selectBlog(int id);
}

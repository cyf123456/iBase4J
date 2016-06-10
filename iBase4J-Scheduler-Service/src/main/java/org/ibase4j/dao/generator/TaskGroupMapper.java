package org.ibase4j.dao.generator;

import java.util.List;
import org.ibase4j.model.generator.TaskGroup;

public interface TaskGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     *
     * @mbggenerated
     */
    int insert(TaskGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     *
     * @mbggenerated
     */
    TaskGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     *
     * @mbggenerated
     */
    List<TaskGroup> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_group
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TaskGroup record);
}
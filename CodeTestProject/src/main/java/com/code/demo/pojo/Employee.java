package com.code.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.mybatis.spring.annotation.MapperScan;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * @author byte
 **/
@Data
@TableName(value = "employee")
public class Employee {

    @TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(hidden=true)
    private Long id;

    @TableField(value = "name")
    @ApiModelProperty(hidden=true)
    @Size(min = 6, max = 16)
    private String name;

    @TableField(value = "age")
    @ApiModelProperty(hidden=true)
    @Max(100)
    @Min(0)
    private Integer age;

    @TableField(value = "tel")
    @ApiModelProperty(hidden=true)
    @Size(max = 11)
    private String Tel;

    @TableField(value = "email")
    @ApiModelProperty(hidden=true)
    private String email;

    @TableField(value = "address")
    @ApiModelProperty(hidden=true)
    private String address;

    @TableField(value = "dept_id")
    @ApiModelProperty(hidden=true)
    @Min(1)
    @Max(4)
    private Integer deptId;

}

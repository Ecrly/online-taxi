package com.karl.onlinetaxi.carnev.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 新能源汽车表
 * </p>
 *
 * @author 
 * @since 2022-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("n_new_energy_car")
@ApiModel(value="NewEnergyCar对象", description="新能源汽车表")
public class NewEnergyCar implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "nid", type = IdType.AUTO)
    private Integer nid;

    @ApiModelProperty(value = "车辆介绍")
    private String introduction;

    @ApiModelProperty(value = "平台类别")
    private String platformType;

    @ApiModelProperty(value = "车辆照片")
    private String picture;

    @ApiModelProperty(value = "车辆状态")
    private String state;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "亮点标签")
    private String highlightLabel;

    @ApiModelProperty(value = "日志-创建人")
    private String createdUser;

    @ApiModelProperty(value = "日志-创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createdTime;

    @ApiModelProperty(value = "日志-最后修改执行人")
    private String modifiedUser;

    @ApiModelProperty(value = "日志-最后修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifiedTime;


}

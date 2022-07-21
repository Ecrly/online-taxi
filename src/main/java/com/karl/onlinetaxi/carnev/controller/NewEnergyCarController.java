package com.karl.onlinetaxi.carnev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.karl.onlinetaxi.carnev.entity.NewEnergyCar;
import com.karl.onlinetaxi.carnev.service.NewEnergyCarService;
import com.karl.onlinetaxi.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.springframework.stereotype.Controller;
import com.karl.onlinetaxi.util.BaseController;

/**
* <p>
    * 新能源汽车表 前端控制器
    * </p>
*
* @author 
* @since 2022-07-21
*/
@Api(tags = "新能源汽车表")
@RestController
@RequestMapping("/carnev/new-energy-car")
    public class NewEnergyCarController extends BaseController {
    @Autowired
    private NewEnergyCarService newEnergyCarService;

    @ApiOperation(value = "新能源汽车表新增")
    @ApiImplicitParams({
            @ApiImplicitParam(name="introduction", value = "车辆介绍", dataType = "String"),
            @ApiImplicitParam(name="platformType", value = "平台类别", dataType = "String"),
            @ApiImplicitParam(name="picture", value = "车辆照片", dataType = "String"),
            @ApiImplicitParam(name="state", value = "车辆状态", dataType = "String"),
            @ApiImplicitParam(name="price", value = "价格", dataType = "BigDecimal"),
            @ApiImplicitParam(name="highlightLabel", value = "亮点标签", dataType = "String"),
            @ApiImplicitParam(name="createdUser", value = "日志-创建人", dataType = "String"),
            @ApiImplicitParam(name="createdTime", value = "日志-创建时间", dataType = "Date"),
            @ApiImplicitParam(name="modifiedUser", value = "日志-最后修改执行人", dataType = "String"),
            @ApiImplicitParam(name="modifiedTime", value = "日志-最后修改时间", dataType = "Date"),
    })
    @PostMapping
    public JsonResult<Void> save(@RequestBody NewEnergyCar newEnergyCar) {
        newEnergyCarService.saveOrUpdate(newEnergyCar);
        return new JsonResult<Void>(200);
    }

    @ApiOperation(value = "新能源汽车表删除")
    @DeleteMapping("/{id}")
    public JsonResult<Void> delete(@PathVariable Integer id) {
        newEnergyCarService.removeById(id);
        return new JsonResult<Void>(200);
    }

    @ApiOperation(value = "新能源汽车表列表")
    @GetMapping
    public JsonResult<List<NewEnergyCar>> findAll() {
        return new JsonResult<List<NewEnergyCar>>(200, newEnergyCarService.list());
    }


    @ApiOperation(value = "新能源汽车表详情")
    @GetMapping("/{id}")
    public JsonResult<NewEnergyCar> findOne(@PathVariable Integer id) {
        return new JsonResult<NewEnergyCar>(200, newEnergyCarService.getById(id));
    }
}

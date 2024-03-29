package com.mshis.medicalSystem.controller.hospitalization;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.ChargeType;
import com.mshis.medicalSystem.service.hospitalization.ChargeTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description: ChargeTypeController
 * author: 冯凡利
 * create:  2019/7/18 15:17
 */
@RestController
@CrossOrigin
@Api("病人信息资料")
@RequestMapping("/price-standard")
public class ChargeTypeController {


    @Autowired
    private ChargeTypeService chargeTypeService;


    @ApiOperation("添加")
    @ApiImplicitParam(name = "ChargeType", value = "添加收费标准")
    @PostMapping("/add")
    public Result addChargeType(@RequestBody ChargeType chargeType){
        return chargeTypeService.addChargeType(chargeType);
    }

    @ApiOperation("查询")
    @ApiImplicitParam(name = "", value = "查询 收费标准")
    @GetMapping("/query")
    public Result getAllChargeType(){
        return chargeTypeService.getAllChargeType();
    }

    @ApiOperation("修改")
    @ApiImplicitParam(name = "ChargeType", value = "修改 收费标准")
    @PostMapping("/update")
    public Result updateChargeType(@RequestBody ChargeType chargeType){
        return chargeTypeService.updateChargeType(chargeType);
    }

    @ApiOperation("删除")
    @ApiImplicitParam(name = "ChargeType", value = "删除 收费标准")
    @PostMapping("/delete")
    public Result deleteChargeType(int id){
        return chargeTypeService.deleteChargeType(id);
    }


}

package com.baomidou.mybatisplus.generator;

import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.run.AutoGenerator;

public class CodeGenertor {

	public static void main(String[] args) {
		
		AutoGenerator ag = new AutoGenerator();
		//设置名称
		GlobalConfig gc = new GlobalConfig();
		gc.setOutputDir("D:\\code");
		gc.setFileOverride(true);
		gc.setActiveRecord(false);
		gc.setEnableCache(false);
		gc.setBaseResultMap(true);
		gc.setBaseColumnList(true);
		gc.setAuthor("dongh");
		gc.setControllerName("%sController");
		gc.setMapperName("%sDao");
		gc.setServiceName("%sService");
		gc.setServiceImplName("%sServiceImpl");
		gc.setXmlName("%sMapper");
		gc.setKotlin(false);
		gc.setOpen(true);
		ag.setGlobalConfig(gc);
		//设置数据源
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.MYSQL);
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUsername("spacexclouddev");
		dsc.setPassword("space_DEV@2018");
		dsc.setUrl("jdbc:mysql://rm-wz95120784q657tip3o.mysql.rds.aliyuncs.com:3306/d_spacexcloud_opt");
		ag.setDataSource(dsc);
		//设置超类
		StrategyConfig strategy = new StrategyConfig();
		//strategy.setTablePrefix("trace_");
		strategy.setNaming(NamingStrategy.underline_to_camel);
		strategy.setEntityBooleanColumnRemoveIsPrefix(false);
		//strategy.setInclude("trace_breed_drugs");
		strategy.setSuperMapperClass("com.servingcloud.cockroach.data.dao.BaseDao");
		strategy.setSuperControllerClass(null);
		strategy.setSuperServiceClass("com.servingcloud.cockroach.data.service.BaseService");
		strategy.setSuperServiceImplClass("com.servingcloud.cockroach.data.service.BaseServiceImpl");
		strategy.setSuperEntityClass(null);
		strategy.setEntityLombokModel(true);
		ag.setStrategy(strategy);
		//设置包信息
		PackageConfig pc = new PackageConfig();
		pc.setParent("com.servingcloud.spacexcloud.operate");
		pc.setController("controller");
		pc.setEntity("entity");
		pc.setMapper("dao");
		pc.setService("service");
		pc.setServiceImpl("service.impl");
		pc.setXml("mapper");
		ag.setPackageInfo(pc);
		
		ag.execute();
		
	}

}

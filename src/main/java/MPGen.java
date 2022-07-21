import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;

public class MPGen {

    public static void main(String[] args) {

        String MODULE_NAME = "carnev";
        String TABLE_NAME = "n_new_energy_car";
        Boolean HAS_PREFIX = true;


        // 需要构建一个 代码自动生成器 对象
        AutoGenerator mpg = new AutoGenerator();
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        // 配置策略
        // 1、全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath+"/src/main/java");
        gc.setAuthor("");
        gc.setOpen(false);
        gc.setFileOverride(true); // 是否覆盖
        gc.setServiceName("%sService"); // 去Service的I前缀
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setIdType(IdType.ID_WORKER);
        gc.setDateType(DateType.ONLY_DATE);
        gc.setSwagger2(true);
        mpg.setGlobalConfig(gc);
        //2、设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://81.68.126.181:3306/onlinetaxi?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("taxi");
        dsc.setPassword("123456");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);
        //3、包的配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(MODULE_NAME);
        pc.setParent("com.karl.onlinetaxi");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
//        // 自定义输出配置
//        List<FileOutConfig> focList = new ArrayList<>();
//        // 自定义配置会被优先输出
//        focList.add(new FileOutConfig(templatePath) {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
//                return projectPath + "/src/main/resources/mapper/" + pc.getModuleName()
//                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
//            }
//        });
//        cfg.setFileOutConfigList(focList);
//        mpg.setCfg(cfg);

        //4、策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude(TABLE_NAME); // 设置要映射的表名
        if (HAS_PREFIX) strategy.setTablePrefix(TABLE_NAME.split("_")[0] + "_");  //表名去前缀
        strategy.setNaming(NamingStrategy.underline_to_camel); // 表下划线转驼峰
        strategy.setColumnNaming(NamingStrategy.underline_to_camel); // 列下划线转驼峰
        strategy.setEntityLombokModel(true); // 自动lombok；
        strategy.setSuperControllerClass("com.karl.onlinetaxi.util.BaseController"); // 控制器父类
        strategy.setControllerMappingHyphenStyle(true); // controller驼峰转连字符
        strategy.setLogicDeleteFieldName("deleted"); // 逻辑删除字段
        //5、自动填充配置
        TableFill gmtCreate = new TableFill("created_time", FieldFill.INSERT); // 创建时间字段
        TableFill gmtModified = new TableFill("modified_time", FieldFill.INSERT_UPDATE); // 修改时间字段
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(gmtCreate);
        tableFills.add(gmtModified);
        strategy.setTableFillList(tableFills);
        //6、配置模板
        TemplateConfig templateConfig = new TemplateConfig();
        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
//         templateConfig.setEntity("templates/entity2.java");
//         templateConfig.setService();
        templateConfig.setController("templates/controller.java");
//        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);
        // 乐观锁
//        strategy.setVersionFieldName("version");
//        strategy.setRestControllerStyle(true);
//        strategy.setControllerMappingHyphenStyle(true);

        mpg.setStrategy(strategy);
        mpg.execute(); //执行

    }

}


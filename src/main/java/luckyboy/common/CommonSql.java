package luckyboy.common;

public class CommonSql {

    public static final String failLogDoris = ".FAIL_LOG\n" +
            "(\n" +
            "    id bigint ,\n" +
            "    date     DATETIME null comment '时间',\n" +
            "    api      VARCHAR(200) null comment 'api',\n" +
            "    comment  VARCHAR(200) null comment '备注',\n" +
            "    pkg      VARCHAR(255) null comment '归属接口大类',\n" +
            "    params   VARCHAR(512) null comment '参数',\n" +
            "    if_retry INT(10)      null comment '是否重试 0无 1是 2无需'\n" +
            ")UNIQUE KEY (`id`)\n" +
            "DISTRIBUTED BY HASH(`id`) BUCKETS 10\n" +
            "PROPERTIES (\n" +
            "  \"replication_num\" = \"3\"\n" +
            ")";

    public static final String failLogMysql = ".FAIL_LOG\n" +
            "(\n" +
            "    id bigint ,\n" +
            "    date     DATETIME null comment '时间',\n" +
            "    api      VARCHAR(200) null comment 'api',\n" +
            "    comment  VARCHAR(200) null comment '备注',\n" +
            "    pkg      VARCHAR(255) null comment '归属接口大类',\n" +
            "    params   VARCHAR(512) null comment '参数',\n" +
            "    if_retry INT(10)      null comment '是否重试 0无 1是 2无需'\n" +
            ")";


    public static final String scheduledJobDoris = ".scheduled_job (\n" +
            "    id bigint ,\n" +
            "    bean_name varchar(255) comment '执行具体工作的bean名称',\n" +
            "    description varchar(255) comment '工作表述',\n" +
            "    create_by varchar(255) comment '创建人',\n" +
            "    create_time date default current_timestamp comment '创建时间',\n" +
            "    update_by varchar(255) comment '修改人',\n" +
            "    update_time date default current_timestamp comment '修改时间'\n" +
            ")UNIQUE KEY (`id`)\n" +
            "DISTRIBUTED BY HASH(`id`) BUCKETS 10\n" +
            "PROPERTIES (\n" +
            "  \"replication_num\" = \"3\"\n" +
            ")";

    public static final String scheduledJobMysql = ".scheduled_job (\n" +
            "    id bigint ,\n" +
            "    bean_name varchar(255) comment '执行具体工作的bean名称',\n" +
            "    description varchar(255) comment '工作表述',\n" +
            "    create_by varchar(255) comment '创建人',\n" +
            "    create_time date default current_timestamp comment '创建时间',\n" +
            "    update_by varchar(255) comment '修改人',\n" +
            "    update_time date default current_timestamp comment '修改时间'\n" +
            ")";

    public static final String scheduledCornDoris = ".scheduled_corn(\n" +
            "    id bigint,\n" +
            "    corn varchar(255) comment '任务表达式',\n" +
            "    description varchar(255) comment '表达式描述',\n" +
            "    create_by varchar(255) comment '创建人',\n" +
            "    create_time date default current_timestamp comment '创建时间',\n" +
            "    update_by varchar(255) comment '修改人',\n" +
            "    update_time date default current_timestamp comment '修改时间'\n" +
            "    )UNIQUE KEY (`id`)\n" +
            "DISTRIBUTED BY HASH(`id`) BUCKETS 10\n" +
            "PROPERTIES (\n" +
            "  \"replication_num\" = \"3\"\n" +
            ")";

    public static final String scheduledCornmysql = ".scheduled_corn(\n" +
            "    id bigint,\n" +
            "    corn varchar(255) comment '任务表达式',\n" +
            "    description varchar(255) comment '表达式描述',\n" +
            "    create_by varchar(255) comment '创建人',\n" +
            "    create_time date default current_timestamp comment '创建时间',\n" +
            "    update_by varchar(255) comment '修改人',\n" +
            "    update_time date default current_timestamp comment '修改时间'\n" +
            "    )";

    public static final String scheduledCornJobDoris = ".scheduled_corn_job(\n" +
            "    id bigint,\n" +
            "    store_key varchar(255) comment '内存储存时的key值',\n" +
            "    corn_id bigint comment 'corn表id',\n" +
            "    job_id bigint comment 'job表id',\n" +
            "    status tinyint comment '是否开启 0：关闭 1：开启',\n" +
            "    create_by varchar(255) comment '创建人',\n" +
            "    create_time date default current_timestamp comment '创建时间',\n" +
            "    update_by varchar(255) comment '修改人',\n" +
            "    update_time date default current_timestamp comment '修改时间'\n" +
            ")UNIQUE KEY (`id`)\n" +
            "DISTRIBUTED BY HASH(`id`) BUCKETS 10\n" +
            "PROPERTIES (\n" +
            "  \"replication_num\" = \"3\"\n" +
            ")";

    public static final String scheduledCornJobMysql = ".scheduled_corn_job(\n" +
            "    id bigint,\n" +
            "    store_key varchar(255) comment '内存储存时的key值',\n" +
            "    corn_id bigint comment 'corn表id',\n" +
            "    job_id bigint comment 'job表id',\n" +
            "    status tinyint comment '是否开启 0：关闭 1：开启',\n" +
            "    create_by varchar(255) comment '创建人',\n" +
            "    create_time date default current_timestamp comment '创建时间',\n" +
            "    update_by varchar(255) comment '修改人',\n" +
            "    update_time date default current_timestamp comment '修改时间'\n" +
            ")";

    public static final String cornInit = ".scheduled_corn (id,corn,description,create_by,create_time,update_by,update_time) VALUES\n" +
            "\t (29,'0 6 22 ? * 1-5','工作日22点6分',NULL,NULL,NULL,NULL),\n" +
            "\t (33,'0 0 12 * * ?','每日12点',NULL,NULL,NULL,NULL),\n" +
            "\t (42,'0 1 19 1 * ?','每月1日19点1分',NULL,NULL,NULL,NULL),\n" +
            "\t (57,'0 12 23 ? * 1-5','工作日23点12分',NULL,NULL,NULL,NULL),\n" +
            "\t (70,'0 35 22 ? * *','每日22点35分',NULL,NULL,NULL,NULL),\n" +
            "\t (71,'0 36 22 ? * *','每日22点36分',NULL,NULL,NULL,NULL),\n" +
            "\t (72,'0 37 22 ? * *','每日22点37分',NULL,NULL,NULL,NULL),\n" +
            "\t (73,'0 38 22 ? * *','每日22点38分',NULL,NULL,NULL,NULL),\n" +
            "\t (76,'0 10 19 ? * 1-5','工作日19点10分',NULL,NULL,NULL,NULL),\n" +
            "\t (77,'0 30 23 ? * 1-5','工作日23点30分',NULL,NULL,NULL,NULL),\n"+
            "(81,'20 20 23 ? * 1-5','工作日23点20分20秒',NULL,NULL,NULL,NULL),\n" +
            "\t (95,'7 40 22 ? * *','每日22点40分7秒',NULL,NULL,NULL,NULL),\n" +
            "\t (102,'9 40 22 ? * *','每日22点40分9秒',NULL,NULL,NULL,NULL),\n" +
            "\t (103,'14 10 9 ? * *','每日9点10分14秒',NULL,NULL,NULL,NULL),\n" +
            "\t (104,'0 0 9 1 1 ?','1月1日9点',NULL,NULL,NULL,NULL),\n" +
            "\t (109,'9 0 22 ? * *','每日22点9秒',NULL,NULL,NULL,NULL),\n" +
            "\t (15,'5 10 22 ? * 1-5','工作日22点10分5秒',NULL,NULL,NULL,NULL),\n" +
            "\t (19,'10 5 9 ? * 1-5','工作日9点5分10秒',NULL,NULL,NULL,NULL),\n" +
            "\t (22,'10 5 21 1 * ?','每月1日21点5分10秒',NULL,NULL,NULL,NULL),\n" +
            "\t (32,'40 10 * ? * *','每小时10分40秒',NULL,NULL,NULL,NULL),\n" +
            "\t (37,'0 0 15 ? * 1','周一15点',NULL,NULL,NULL,NULL),\n" +
            "\t (46,'0 4 19 ? * 1-5','工作日19点5分',NULL,NULL,NULL,NULL),\n" +
            "\t (47,'0 20 9 ? * 1-5','工作日19点20分',NULL,NULL,NULL,NULL),\n" +
            "\t (51,'0 7 23 ? * 1-5','工作日23点7分',NULL,NULL,NULL,NULL),\n" +
            "\t (55,'0 10 23 ? * 1-5','工作日23点10分',NULL,NULL,NULL,NULL),\n" +
            "\t (61,'0 16 23 ? * 1-5','工作日23点16分',NULL,NULL,NULL,NULL),\n" +
            "\t (84,'0/10 * * * * ?','每10秒',NULL,NULL,NULL,NULL),\n" +
            "\t (112,'12 0 22 ? * *','每日22点12秒',NULL,NULL,NULL,NULL),\n" +
            "\t (113,'13 0 22 ? * *','每日22点13秒',NULL,NULL,NULL,NULL),\n" +
            "\t (13,'3 10 22 ? * 1-5','工作日22点10分3秒',NULL,NULL,NULL,NULL),\n" +
            "\t (21,'10 5 21 ? * 5','周五21点5分10秒',NULL,NULL,NULL,NULL),\n" +
            "\t (41,'30 0 19 ? * 6','周六19点30秒',NULL,NULL,NULL,NULL),\n" +
            "\t (44,'0 3 19 ? * 1-5','工作日19点3分',NULL,NULL,NULL,NULL),\n" +
            "\t (45,'0 4 19 ? * 1-5','工作日19点4分',NULL,NULL,NULL,NULL),\n" +
            "\t (58,'0 13 23 ? * 1-5','工作日23点13分',NULL,NULL,NULL,NULL),\n" +
            "\t (65,'0 0 9 ? * *','每日9点',NULL,NULL,NULL,NULL),\n" +
            "\t (78,'10 10 9 ? * *','每日9点10分10秒',NULL,NULL,NULL,NULL),\n" +
            "\t (89,'11 10 9 ? * *','每日9点10分11秒',NULL,NULL,NULL,NULL),\n" +
            "\t (96,'10 0 0 ? * *','每日零点10秒',NULL,NULL,NULL,NULL),\n" +
            "\t (101,'0 0 9 1 1 ?','1月1日9点',NULL,NULL,NULL,NULL),\n" +
            "\t (23,'15 5 21 ? * 1-5','工作日21点5分15秒',NULL,NULL,NULL,NULL),\n" +
            "\t (24,'20 5 21 ? * 1-5','工作日21点5分20秒',NULL,NULL,NULL,NULL),\n" +
            "\t (50,'0 6 23 ? * 1-5','工作日23点6分',NULL,NULL,NULL,NULL),\n" +
            "\t (56,'0 11 23 ? * 1-5','工作日23点11分',NULL,NULL,NULL,NULL),\n" +
            "\t (66,'0 0 22 ? * *','每日22点',NULL,NULL,NULL,NULL),\n" +
            "\t (90,'2 40 22 ? * *','每日22点40分2秒',NULL,NULL,NULL,NULL),\n" +
            "\t (94,'6 40 22 ? * *','每日22点40分6秒',NULL,NULL,NULL,NULL),\n" +
            "\t (98,'8 40 22 ? * *','每日22点40分8秒',NULL,NULL,NULL,NULL),\n" +
            "\t (99,'13 10 9 ? * *','每日9点10分13秒',NULL,NULL,NULL,NULL),\n" +
            "\t (105,'5 0 22 1 * ?','每月1日22点5秒',NULL,NULL,NULL,NULL),\n" +
            "\t (2,'2 25 22 ? * 1-5','工作日22点25分2秒',NULL,NULL,NULL,NULL),\n" +
            "\t (3,'4 25 22 ? * 1-5','工作日22点25分4秒',NULL,NULL,NULL,NULL),\n" +
            "\t (6,'10 25 22 ? * 1-5','工作日22点25分10秒',NULL,NULL,NULL,NULL),\n" +
            "\t (8,'14 25 22 ? * 1-5','工作日22点25分14秒',NULL,NULL,NULL,NULL),\n" +
            "\t (16,'6 10 22 ? * 1-5','工作日22点10分6秒',NULL,NULL,NULL,NULL),\n" +
            "\t (17,'7 10 22 ? * 1-5','工作日22点10分7秒',NULL,NULL,NULL,NULL),\n" +
            "\t (31,'0 10 0 ? * 7','周日10点',NULL,NULL,NULL,NULL),\n" +
            "\t (34,'0 0 9 ? * 1-5','工作日9点',NULL,NULL,NULL,NULL),\n" +
            "\t (59,'0 14 23 ? * 1-5','工作日23点14分',NULL,NULL,NULL,NULL),\n" +
            "\t (62,'0 17 23 ? * 1-5','工作日23点17分',NULL,NULL,NULL,NULL),\n" +
            "\t (69,'0 30 23 ? * *','每日22点30分',NULL,NULL,NULL,NULL),\n" +
            "\t (1,'0 25 22 ? * 1-5','工作日22点25分',NULL,NULL,NULL,NULL),\n" +
            "\t (4,'6 25 22 ? * 1-5','工作日22点25分6秒',NULL,NULL,NULL,NULL),\n" +
            "\t (18,'8 10 22 ? * 6','周六22点10分8秒',NULL,NULL,NULL,NULL),\n" +
            "\t (25,'0 0 0 ? * *','每日零点',NULL,NULL,NULL,NULL),\n" +
            "\t (36,'30 0 9 ? * 1-5','工作日9点30分',NULL,NULL,NULL,NULL),\n" +
            "\t (85,'10 10 9 ? * *','每日9点10分10秒',NULL,NULL,NULL,NULL),\n" +
            "\t (7,'12 25 22 ? * 1-5','工作日22点25分12秒',NULL,NULL,NULL,NULL),\n" +
            "\t (9,'0 0 22 1 * ?','每月1日22点',NULL,NULL,NULL,NULL),\n" +
            "\t (27,'20 5 22 ? * 1-5','工作日22点5分20秒',NULL,NULL,NULL,NULL),\n" +
            "\t (35,'0 0 9 1 1 ?','1月1日9点',NULL,NULL,NULL,NULL),\n" +
            "\t (38,'0 0 9 ? * 7','周日9点',NULL,NULL,NULL,NULL),\n" +
            "\t (39,'0 30 8 * * ?','每日8点30分',NULL,NULL,NULL,NULL),\n" +
            "\t (48,'30 4 22 ? * 1-5','工作日22点4分30秒',NULL,NULL,NULL,NULL),\n" +
            "\t (52,'0 5 9 1 * ?','每月1日9点5分',NULL,NULL,NULL,NULL),\n" +
            "\t (64,'10 24 9 ? * *','每日9点24分10秒',NULL,NULL,NULL,NULL),\n" +
            "\t (79,'11 10 9 ? * *','每日9点10分11秒',NULL,NULL,NULL,NULL),\n" +
            "\t (83,'0 0 9 ? * *','每日9点',NULL,NULL,NULL,NULL),\n" +
            "\t (88,'1 40 22 ? * *','每日22点40分1秒',NULL,NULL,NULL,NULL),\n" +
            "\t (97,'12 10 9 ? * *','每日9点10分12秒',NULL,NULL,NULL,NULL),\n" +
            "\t (100,'13 10 9 ? * *','每日9点10分13秒',NULL,NULL,NULL,NULL),\n" +
            "\t (115,'14 0 22 ? * *','每日22点14秒',NULL,NULL,NULL,NULL),\n" +
            "\t (5,'8 25 22 ? * 1-5','工作日22点25分8秒',NULL,NULL,NULL,NULL),\n" +
            "\t (10,'0 10 22 ? * 1-5','工作日22点10分',NULL,NULL,NULL,NULL),\n" +
            "\t (11,'1 10 22 1 1 ?','1月1日22点10分1秒',NULL,NULL,NULL,NULL),\n" +
            "\t (14,'4 10 22 ? * 1-5','工作日22点10分4秒',NULL,NULL,NULL,NULL),\n" +
            "\t (28,'30 5 22 ? * 1-5','工作日22点5分30秒',NULL,NULL,NULL,NULL),\n" +
            "\t (43,'0 2 19 ? * 1-5','工作日19点2分',NULL,NULL,NULL,NULL),\n" +
            "\t (54,'0 9 23 ? * 1-5','工作日23点9分',NULL,NULL,NULL,NULL),\n" +
            "\t (60,'0 15 23 ? * 1-5','工作日23点15分',NULL,NULL,NULL,NULL),\n" +
            "\t (67,'0 30 22 ? * *','每日22点30分',NULL,NULL,NULL,NULL),\n" +
            "\t (80,'10 10 10 ? * *','每日10点10分10秒',NULL,NULL,NULL,NULL),\n" +
            "\t (91,'3 40 22 ? * *','每日22点40分3秒',NULL,NULL,NULL,NULL),\n" +
            "\t (108,'8 0 22 ? * 1','周一22点8秒',NULL,NULL,NULL,NULL),\n" +
            "\t (12,'2 10 22 ? * 1-5','工作日22点10分2秒',NULL,NULL,NULL,NULL),\n" +
            "\t (20,'10 5 21 ? * 1-5','工作日21点5分10秒',NULL,NULL,NULL,NULL),\n" +
            "\t (49,'0 5 23 ? * 1-5','工作日23点5分',NULL,NULL,NULL,NULL),\n" +
            "\t (63,'0 24 9 ? * *','每日9点24分',NULL,NULL,NULL,NULL),\n" +
            "\t (75,'0 10 22 ? * 1-5','工作日22点10分',NULL,NULL,NULL,NULL),\n" +
            "\t (107,'7 0 22 1 * ?','每月1日22点7秒',NULL,NULL,NULL,NULL),\n" +
            "\t (111,'11 0 22 ? * *','每日22点11秒',NULL,NULL,NULL,NULL),\n" +
            "\t (114,'0 0/5 * * * ?','每5分种',NULL,NULL,NULL,NULL),\n" +
            "\t (26,'20 0 0 ? * *','每日零点20秒',NULL,NULL,NULL,NULL),\n" +
            "\t (30,'0 7 22 ? * 1-5','工作日22点7分',NULL,NULL,NULL,NULL),\n" +
            "\t (40,'0 0 19 ? * 1-5','工作日19点',NULL,NULL,NULL,NULL),\n" +
            "\t (53,'0 8 23 ? * 1-5','工作日23点8分',NULL,NULL,NULL,NULL),\n" +
            "\t (68,'0 31 22 ? * *','每日22点31分',NULL,NULL,NULL,NULL),\n" +
            "\t (74,'0 39 22 ? * *','每日22点39分',NULL,NULL,NULL,NULL),\n" +
            "\t (82,'0 0 10 ? * *','每日10点',NULL,NULL,NULL,NULL),\n" +
            "\t (86,'0 40 22 ? * *','每日22点40分',NULL,NULL,NULL,NULL),\n" +
            "\t (87,'10 10 9 ? * *','每日9点10分10秒',NULL,NULL,NULL,NULL),\n" +
            "\t (92,'4 40 22 ? * *','每日22点40分4秒',NULL,NULL,NULL,NULL),\n" +
            "\t (93,'5 40 22 ? * *','每日22点40分5秒',NULL,NULL,NULL,NULL),\n" +
            "\t (106,'6 0 22 1 * ?','每月1日22点6秒',NULL,NULL,NULL,NULL),\n" +
            "\t (110,'10 0 22 ? * *','每日22点10秒',NULL,NULL,NULL,NULL)";

    public static final String jobInit =".scheduled_job (id,bean_name,description,create_by,create_time,update_by,update_time) VALUES\n" +
            "\t (7,'fund_daily','场内基金日线行情',NULL,NULL,NULL,NULL),\n" +
            "\t (9,'fund_portfolio','公募基金持仓数据',NULL,NULL,NULL,NULL),\n" +
            "\t (27,'daily_info','市场交易统计',NULL,NULL,NULL,NULL),\n" +
            "\t (35,'TradeCal','交易日历',NULL,NULL,NULL,NULL),\n" +
            "\t (38,'StockCompany','上市公司基本信息',NULL,NULL,NULL,NULL),\n" +
            "\t (39,'NewShare','IPO新股列表',NULL,NULL,NULL,NULL),\n" +
            "\t (48,'moneyflowHsgt','沪深港通资金流向',NULL,NULL,NULL,NULL),\n" +
            "\t (52,'ggtMonthly','港股通每月成交统计',NULL,NULL,NULL,NULL),\n" +
            "\t (64,'margin_detail','融资融券交易明细',NULL,NULL,NULL,NULL),\n" +
            "\t (79,'ccass_hold_detail','中央结算系统持股明细',NULL,NULL,NULL,NULL),\n" +
            "\t (83,'broker_recommend','券商每月荐股',NULL,NULL,NULL,NULL),\n" +
            "\t (88,'opt_daily','期权日线行情',NULL,NULL,NULL,NULL),\n" +
            "\t (97,'fx_obasic','外汇基础信息（海外）',NULL,NULL,NULL,NULL),\n" +
            "\t (100,'hk_tradecal','港股行情',NULL,NULL,NULL,NULL),\n" +
            "\t (115,'cctv_news','新闻联播',NULL,NULL,NULL,NULL),\n" +
            "\t (29,'ths_index','同花顺概念和行业指数',NULL,NULL,NULL,NULL),\n" +
            "\t (33,'Retry','重试任务',NULL,NULL,NULL,NULL),\n" +
            "\t (42,'monthly','月线行情',NULL,NULL,NULL,NULL),\n" +
            "\t (57,'express_vip','业绩快报',NULL,NULL,NULL,NULL),\n" +
            "\t (70,'concept','概念股分类',NULL,NULL,NULL,NULL),\n" +
            "\t (71,'share_float','限售股解禁',NULL,NULL,NULL,NULL),\n" +
            "\t (72,'block_trade','大宗交易',NULL,NULL,NULL,NULL),\n" +
            "\t (73,'stk_holdernumber','股东人数',NULL,NULL,NULL,NULL),\n" +
            "\t (76,'cyq_perf','每日筹码及胜率',NULL,NULL,NULL,NULL),\n" +
            "\t (77,'stk_factor','股票技术因子（量化因子）',NULL,NULL,NULL,NULL),\n" +
            "\t (81,'limit_list_d','涨跌停列表',NULL,NULL,NULL,NULL),\n" +
            "\t (95,'bond_blk_detail','大宗交易明细',NULL,NULL,NULL,NULL),\n" +
            "\t (102,'us_basic','美股列表',NULL,NULL,NULL,NULL),\n" +
            "\t (103,'us_tradecal','美股行情',NULL,NULL,NULL,NULL),\n" +
            "\t (104,'tmt_twincome','台湾电子产业月营收',NULL,NULL,NULL,NULL),\n" +
            "\t (109,'bo_cinema','影院每日票房',NULL,NULL,NULL,NULL),\n" +
            "\t (5,'fund_nav','公募基金净值',NULL,NULL,NULL,NULL),\n" +
            "\t (10,'fut_basic','期货合约信息表',NULL,NULL,NULL,NULL),\n" +
            "\t (11,'fut_trade_cal','交易日历',NULL,NULL,NULL,NULL),\n" +
            "\t (14,'fut_wsr','仓单日报',NULL,NULL,NULL,NULL),\n" +
            "\t (28,'sz_daily_info','深圳市场每日交易概况',NULL,NULL,NULL,NULL),\n" +
            "\t (43,'adjFactor','复权因子',NULL,NULL,NULL,NULL),\n" +
            "\t (54,'balancesheet_vip','资产负债表',NULL,NULL,NULL,NULL),\n" +
            "\t (60,'fina_audit','财务审计意见',NULL,NULL,NULL,NULL),\n" +
            "\t (67,'top_inst','龙虎榜机构明细',NULL,NULL,NULL,NULL),\n" +
            "\t (80,'hk_hold','沪深港股通持股明细',NULL,NULL,NULL,NULL),\n" +
            "\t (91,'cb_call','可转债赎回信息',NULL,NULL,NULL,NULL),\n" +
            "\t (108,'bo_daily','电影日度票房',NULL,NULL,NULL,NULL),\n" +
            "\t (12,'fut_daily','期货日线行情',NULL,NULL,NULL,NULL),\n" +
            "\t (20,'index_daily','指数日线行情',NULL,NULL,NULL,NULL),\n" +
            "\t (49,'hsgtTop10','沪深股通十大成交股',NULL,NULL,NULL,NULL),\n" +
            "\t (63,'margin','融资融券交易汇总',NULL,NULL,NULL,NULL),\n" +
            "\t (75,'report_rc','卖方盈利预测数据',NULL,NULL,NULL,NULL),\n" +
            "\t (107,'bo_weekly','电影周度票房',NULL,NULL,NULL,NULL),\n" +
            "\t (111,'teleplay_record','全国拍摄制作电视剧备案公示数据',NULL,NULL,NULL,NULL),\n" +
            "\t (114,'news','新闻快讯',NULL,NULL,NULL,NULL),\n" +
            "\t (15,'fut_settle','结算参数',NULL,NULL,NULL,NULL),\n" +
            "\t (19,'index_basic','指数基本信息',NULL,NULL,NULL,NULL),\n" +
            "\t (22,'index_monthly','指数月线行情',NULL,NULL,NULL,NULL),\n" +
            "\t (32,'index_global','国际指数',NULL,NULL,NULL,NULL),\n" +
            "\t (37,'HsConst','沪深股通成份股',NULL,NULL,NULL,NULL),\n" +
            "\t (46,'moneyflow','个股资金流向',NULL,NULL,NULL,NULL),\n" +
            "\t (47,'stkLimit','每日涨跌停价格',NULL,NULL,NULL,NULL),\n" +
            "\t (51,'ggtDaily','港股通每日成交统计',NULL,NULL,NULL,NULL),\n" +
            "\t (55,'cashflow_vip','现金流量表',NULL,NULL,NULL,NULL),\n" +
            "\t (61,'fina_mainbz_vip','主营业务构成',NULL,NULL,NULL,NULL),\n" +
            "\t (84,'test','测试',NULL,NULL,NULL,NULL),\n" +
            "\t (112,'stock_mx','动能因子',NULL,NULL,NULL,NULL),\n" +
            "\t (113,'stock_vx','估值因子',NULL,NULL,NULL,NULL),\n" +
            "\t (26,'index_member','申万行业成分构成',NULL,NULL,NULL,NULL),\n" +
            "\t (30,'ths_daily','同花顺板块指数行情',NULL,NULL,NULL,NULL),\n" +
            "\t (40,'daily','A股日线行情',NULL,NULL,NULL,NULL),\n" +
            "\t (53,'income_vip','利润表',NULL,NULL,NULL,NULL),\n" +
            "\t (68,'pledge_stat','股权质押统计数据',NULL,NULL,NULL,NULL),\n" +
            "\t (74,'stk_holdertrade','股东增减持',NULL,NULL,NULL,NULL),\n" +
            "\t (82,'stk_surv','机构调研表',NULL,NULL,NULL,NULL),\n" +
            "\t (86,'sge_daily','黄金现货日行情',NULL,NULL,NULL,NULL),\n" +
            "\t (87,'opt_basic','期权合约信息',NULL,NULL,NULL,NULL),\n" +
            "\t (92,'cb_daily','可转债行情',NULL,NULL,NULL,NULL),\n" +
            "\t (93,'repo_daily','债券回购日行情',NULL,NULL,NULL,NULL),\n" +
            "\t (106,'bo_monthly','电影月度票房',NULL,NULL,NULL,NULL),\n" +
            "\t (110,'film_record','全国电影剧本备案数据',NULL,NULL,NULL,NULL),\n" +
            "\t (23,'index_weight','指数成分和权重',NULL,NULL,NULL,NULL),\n" +
            "\t (24,'index_dailybasic','大盘指数每日指标',NULL,NULL,NULL,NULL),\n" +
            "\t (50,'ggtTop10','港股通十大成交股',NULL,NULL,NULL,NULL),\n" +
            "\t (56,'forecast_vip','业绩预告',NULL,NULL,NULL,NULL),\n" +
            "\t (66,'top_list','龙虎榜每日明细',NULL,NULL,NULL,NULL),\n" +
            "\t (90,'cb_issue','可转债发行',NULL,NULL,NULL,NULL),\n" +
            "\t (94,'bond_blk','债券大宗交易',NULL,NULL,NULL,NULL),\n" +
            "\t (98,'fx_daily','外汇日线行情',NULL,NULL,NULL,NULL),\n" +
            "\t (99,'hk_basic','港股列表',NULL,NULL,NULL,NULL),\n" +
            "\t (105,'tmt_twincomedetail','台湾电子产业月营收明细',NULL,NULL,NULL,NULL),\n" +
            "\t (1,'fund_basic','公募基金列表',NULL,NULL,NULL,NULL),\n" +
            "\t (4,'fund_share','基金规模数据',NULL,NULL,NULL,NULL),\n" +
            "\t (18,'fut_weekly_detail','期货主要品种交易周报',NULL,NULL,NULL,NULL),\n" +
            "\t (25,'index_classify','申万行业分类',NULL,NULL,NULL,NULL),\n" +
            "\t (36,'NameChange','股票曾用名',NULL,NULL,NULL,NULL),\n" +
            "\t (85,'sge_basic','黄金现货基础信息',NULL,NULL,NULL,NULL),\n" +
            "\t (13,'fut_holding','每日成交持仓排名',NULL,NULL,NULL,NULL),\n" +
            "\t (21,'index_weekly','指数周线行情',NULL,NULL,NULL,NULL),\n" +
            "\t (41,'weekly','周线行情',NULL,NULL,NULL,NULL),\n" +
            "\t (44,'suspendD','每日停复牌信息',NULL,NULL,NULL,NULL),\n" +
            "\t (45,'daily_basic','每日指标',NULL,NULL,NULL,NULL),\n" +
            "\t (58,'dividend','分红送股',NULL,NULL,NULL,NULL),\n" +
            "\t (65,'margin_target','融资融券标的',NULL,NULL,NULL,NULL),\n" +
            "\t (78,'ccass_hold','中央结算系统持股汇总',NULL,NULL,NULL,NULL),\n" +
            "\t (89,'cb_basic','可转债基本信息',NULL,NULL,NULL,NULL),\n" +
            "\t (96,'eco_cal','财经日历',NULL,NULL,NULL,NULL),\n" +
            "\t (101,'hk_daily','港股交易日历',NULL,NULL,NULL,NULL),\n" +
            "\t (2,'fund_company','公募基金公司',NULL,NULL,NULL,NULL),\n" +
            "\t (3,'fund_manager','基金经理',NULL,NULL,NULL,NULL),\n" +
            "\t (6,'fund_div','公募基金分红',NULL,NULL,NULL,NULL),\n" +
            "\t (8,'fund_adj','基金复权因子',NULL,NULL,NULL,NULL),\n" +
            "\t (16,'fut_index_daily','南华期货指数日线行情',NULL,NULL,NULL,NULL),\n" +
            "\t (17,'fut_mapping','期货主力与连续合约',NULL,NULL,NULL,NULL),\n" +
            "\t (31,'ths_member','同花顺概念板块成分',NULL,NULL,NULL,NULL),\n" +
            "\t (34,'StockBasic','股票列表',NULL,NULL,NULL,NULL),\n" +
            "\t (59,'fina_indicator_vip','财务指标数据',NULL,NULL,NULL,NULL),\n" +
            "\t (62,'disclosure_date','财报披露计划',NULL,NULL,NULL,NULL),\n" +
            "\t (69,'repurchase','股票回购',NULL,NULL,NULL,NULL)";

    public static final String cornJobInit = ".scheduled_corn_job (id,store_key,corn_id,job_id,status,create_by,create_time,update_by,update_time) VALUES\n" +
            "\t (26,'job26',26,26,1,NULL,NULL,NULL,NULL),\n" +
            "\t (30,'job30',30,30,1,NULL,NULL,NULL,NULL),\n" +
            "\t (40,'job40',40,40,1,NULL,NULL,NULL,NULL),\n" +
            "\t (53,'job53',53,53,1,NULL,NULL,NULL,NULL),\n" +
            "\t (68,'job68',68,68,1,NULL,NULL,NULL,NULL),\n" +
            "\t (74,'job74',74,74,1,NULL,NULL,NULL,NULL),\n" +
            "\t (82,'job82',82,82,1,NULL,NULL,NULL,NULL),\n" +
            "\t (86,'job86',86,86,1,NULL,NULL,NULL,NULL),\n" +
            "\t (87,'job87',87,87,1,NULL,NULL,NULL,NULL),\n" +
            "\t (92,'job92',92,92,1,NULL,NULL,NULL,NULL),\n" +
            "\t (93,'job93',93,93,1,NULL,NULL,NULL,NULL),\n" +
            "\t (106,'job106',106,106,1,NULL,NULL,NULL,NULL),\n" +
            "\t (110,'job110',110,110,1,NULL,NULL,NULL,NULL),\n" +
            "\t (23,'job23',23,23,1,NULL,NULL,NULL,NULL),\n" +
            "\t (24,'job24',24,24,1,NULL,NULL,NULL,NULL),\n" +
            "\t (50,'job50',50,50,1,NULL,NULL,NULL,NULL),\n" +
            "\t (56,'job56',56,56,1,NULL,NULL,NULL,NULL),\n" +
            "\t (66,'job66',66,66,1,NULL,NULL,NULL,NULL),\n" +
            "\t (90,'job90',90,90,1,NULL,NULL,NULL,NULL),\n" +
            "\t (94,'job94',94,94,1,NULL,NULL,NULL,NULL),\n" +
            "\t (98,'job98',98,98,1,NULL,NULL,NULL,NULL),\n" +
            "\t (99,'job99',99,99,1,NULL,NULL,NULL,NULL),\n" +
            "\t (105,'job105',105,105,1,NULL,NULL,NULL,NULL),\n" +
            "\t (5,'job5',5,5,1,NULL,NULL,NULL,NULL),\n" +
            "\t (10,'job10',10,10,1,NULL,NULL,NULL,NULL),\n" +
            "\t (11,'job11',11,11,1,NULL,NULL,NULL,NULL),\n" +
            "\t (14,'job14',14,14,1,NULL,NULL,NULL,NULL),\n" +
            "\t (28,'job28',28,28,1,NULL,NULL,NULL,NULL),\n" +
            "\t (43,'job43',43,43,1,NULL,NULL,NULL,NULL),\n" +
            "\t (54,'job54',54,54,1,NULL,NULL,NULL,NULL),\n" +
            "\t (60,'job60',60,60,1,NULL,NULL,NULL,NULL),\n" +
            "\t (67,'job67',67,67,1,NULL,NULL,NULL,NULL),\n" +
            "\t (80,'job80',80,80,1,NULL,NULL,NULL,NULL),\n" +
            "\t (91,'job91',91,91,1,NULL,NULL,NULL,NULL),\n" +
            "\t (108,'job108',108,108,1,NULL,NULL,NULL,NULL),\n" +
            "\t (12,'job12',12,12,1,NULL,NULL,NULL,NULL),\n" +
            "\t (20,'job20',20,20,1,NULL,NULL,NULL,NULL),\n" +
            "\t (49,'job49',49,49,1,NULL,NULL,NULL,NULL),\n" +
            "\t (63,'job63',63,63,1,NULL,NULL,NULL,NULL),\n" +
            "\t (75,'job75',75,75,1,NULL,NULL,NULL,NULL),\n" +
            "\t (107,'job107',107,107,1,NULL,NULL,NULL,NULL),\n" +
            "\t (111,'job111',111,111,1,NULL,NULL,NULL,NULL),\n" +
            "\t (114,'job114',114,114,1,NULL,NULL,NULL,NULL),\n" +
            "\t (1,'job1',1,1,1,NULL,NULL,NULL,NULL),\n" +
            "\t (4,'job4',4,4,1,NULL,NULL,NULL,NULL),\n" +
            "\t (18,'job18',18,18,1,NULL,NULL,NULL,NULL),\n" +
            "\t (25,'job25',25,25,1,NULL,NULL,NULL,NULL),\n" +
            "\t (36,'job36',36,36,1,NULL,NULL,NULL,NULL),\n" +
            "\t (85,'job85',85,85,1,NULL,NULL,NULL,NULL),\n" +
            "\t (7,'job7',7,7,1,NULL,NULL,NULL,NULL),\n" +
            "\t (9,'job9',9,9,1,NULL,NULL,NULL,NULL),\n" +
            "\t (27,'job27',27,27,1,NULL,NULL,NULL,NULL),\n" +
            "\t (35,'job35',35,35,1,NULL,NULL,NULL,NULL),\n" +
            "\t (38,'job38',38,38,1,NULL,NULL,NULL,NULL),\n" +
            "\t (39,'job39',39,39,1,NULL,NULL,NULL,NULL),\n" +
            "\t (48,'job48',48,48,1,NULL,NULL,NULL,NULL),\n" +
            "\t (52,'job52',52,52,1,NULL,NULL,NULL,NULL),\n" +
            "\t (64,'job64',64,64,1,NULL,NULL,NULL,NULL),\n" +
            "\t (79,'job79',79,79,1,NULL,NULL,NULL,NULL),\n" +
            "\t (83,'job83',83,83,1,NULL,NULL,NULL,NULL),\n" +
            "\t (88,'job88',88,88,1,NULL,NULL,NULL,NULL),\n" +
            "\t (97,'job97',97,97,1,NULL,NULL,NULL,NULL),\n" +
            "\t (100,'job100',100,100,1,NULL,NULL,NULL,NULL),\n" +
            "\t (115,'job115',115,115,1,NULL,NULL,NULL,NULL),\n" +
            "\t (13,'job13',13,13,1,NULL,NULL,NULL,NULL),\n" +
            "\t (21,'job21',21,21,1,NULL,NULL,NULL,NULL),\n" +
            "\t (41,'job41',41,41,1,NULL,NULL,NULL,NULL),\n" +
            "\t (44,'job44',44,44,1,NULL,NULL,NULL,NULL),\n" +
            "\t (45,'job45',45,45,1,NULL,NULL,NULL,NULL),\n" +
            "\t (58,'job58',58,58,1,NULL,NULL,NULL,NULL),\n" +
            "\t (65,'job65',65,65,1,NULL,NULL,NULL,NULL),\n" +
            "\t (78,'job78',78,78,1,NULL,NULL,NULL,NULL),\n" +
            "\t (89,'job89',89,89,1,NULL,NULL,NULL,NULL),\n" +
            "\t (96,'job96',96,96,1,NULL,NULL,NULL,NULL),\n" +
            "\t (101,'job101',101,101,1,NULL,NULL,NULL,NULL),\n" +
            "\t (2,'job2',2,2,1,NULL,NULL,NULL,NULL),\n" +
            "\t (3,'job3',3,3,1,NULL,NULL,NULL,NULL),\n" +
            "\t (6,'job6',6,6,1,NULL,NULL,NULL,NULL),\n" +
            "\t (8,'job8',8,8,1,NULL,NULL,NULL,NULL),\n" +
            "\t (16,'job16',16,16,1,NULL,NULL,NULL,NULL),\n" +
            "\t (17,'job17',17,17,1,NULL,NULL,NULL,NULL),\n" +
            "\t (31,'job31',31,31,1,NULL,NULL,NULL,NULL),\n" +
            "\t (34,'job34',34,34,1,NULL,NULL,NULL,NULL),\n" +
            "\t (59,'job59',59,59,1,NULL,NULL,NULL,NULL),\n" +
            "\t (62,'job62',62,62,1,NULL,NULL,NULL,NULL),\n" +
            "\t (69,'job69',69,69,1,NULL,NULL,NULL,NULL),\n" +
            "\t (15,'job15',15,15,1,NULL,NULL,NULL,NULL),\n" +
            "\t (19,'job19',19,19,1,NULL,NULL,NULL,NULL),\n" +
            "\t (22,'job22',22,22,1,NULL,NULL,NULL,NULL),\n" +
            "\t (32,'job32',32,32,1,NULL,NULL,NULL,NULL),\n" +
            "\t (37,'job37',37,37,1,NULL,NULL,NULL,NULL),\n" +
            "\t (46,'job46',46,46,1,NULL,NULL,NULL,NULL),\n" +
            "\t (47,'job47',47,47,1,NULL,NULL,NULL,NULL),\n" +
            "\t (51,'job51',51,51,1,NULL,NULL,NULL,NULL),\n" +
            "\t (55,'job55',55,55,1,NULL,NULL,NULL,NULL),\n" +
            "\t (61,'job61',61,61,1,NULL,NULL,NULL,NULL),\n" +
            "\t (84,'job84',84,84,0,NULL,NULL,NULL,NULL),\n" +
            "\t (112,'job112',112,112,1,NULL,NULL,NULL,NULL),\n" +
            "\t (113,'job113',113,113,1,NULL,NULL,NULL,NULL),\n" +
            "\t (29,'job29',29,29,1,NULL,NULL,NULL,NULL),\n" +
            "\t (33,'job33',33,33,1,NULL,NULL,NULL,NULL),\n" +
            "\t (42,'job42',42,42,1,NULL,NULL,NULL,NULL),\n" +
            "\t (57,'job57',57,57,1,NULL,NULL,NULL,NULL),\n" +
            "\t (70,'job70',70,70,1,NULL,NULL,NULL,NULL),\n" +
            "\t (71,'job71',71,71,1,NULL,NULL,NULL,NULL),\n" +
            "\t (72,'job72',72,72,1,NULL,NULL,NULL,NULL),\n" +
            "\t (73,'job73',73,73,1,NULL,NULL,NULL,NULL),\n" +
            "\t (76,'job76',76,76,1,NULL,NULL,NULL,NULL),\n" +
            "\t (77,'job77',77,77,1,NULL,NULL,NULL,NULL),\n" +
            "\t (81,'job81',81,81,1,NULL,NULL,NULL,NULL),\n" +
            "\t (95,'job95',95,95,1,NULL,NULL,NULL,NULL),\n" +
            "\t (102,'job102',102,102,1,NULL,NULL,NULL,NULL),\n" +
            "\t (103,'job103',103,103,1,NULL,NULL,NULL,NULL),\n" +
            "\t (104,'job104',104,104,1,NULL,NULL,NULL,NULL),\n" +
            "\t (109,'job109',109,109,1,NULL,NULL,NULL,NULL)";
}

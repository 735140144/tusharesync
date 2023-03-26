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
}

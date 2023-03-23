package luckyboy.result.hsStock;

import lombok.Builder;
import lombok.Data;
import luckyboy.common.BucketAnnotation;
import luckyboy.common.ExplainAnnotation;
import luckyboy.common.KeyAnnotation;
import luckyboy.common.ResultComment;
import luckyboy.util.Formart;
@Data
@ResultComment(comment = "股票技术面因子")
public class StkFactorResult extends Formart {
    @ExplainAnnotation(comment = "股票代码")
    @KeyAnnotation
    private String ts_code;
    @ExplainAnnotation(comment = "交易日期")
    @KeyAnnotation
    @BucketAnnotation
    private String trade_date;
    @ExplainAnnotation(comment = "收盘价")
    private String close;
    @ExplainAnnotation(comment = "开盘价")
    private String open;
    @ExplainAnnotation(comment = "最高价")
    private String high;
    @ExplainAnnotation(comment = "最低价")
    private String low;
    @ExplainAnnotation(comment = "昨收价")
    private String pre_close;
    @ExplainAnnotation(comment = "涨跌额")
    private String change;
    @ExplainAnnotation(comment = "涨跌幅")
    private String pct_change;
    @ExplainAnnotation(comment = "成交量 （手）")
    private String vol;
    @ExplainAnnotation(comment = "成交额 （千元）")
    private String amount;
    @ExplainAnnotation(comment = "复权因子")
    private String adj_factor;
    @ExplainAnnotation(comment = "开盘价后复权")
    private String open_hfq;
    @ExplainAnnotation(comment = "开盘价前复权")
    private String open_qfq;
    @ExplainAnnotation(comment = "收盘价后复权")
    private String close_hfq;
    @ExplainAnnotation(comment = "收盘价前复权")
    private String close_qfq;
    @ExplainAnnotation(comment = "最高价后复权")
    private String high_hfq;
    @ExplainAnnotation(comment = "最高价前复权")
    private String high_qfq;
    @ExplainAnnotation(comment = "最低价后复权")
    private String low_hfq;
    @ExplainAnnotation(comment = "最低价前复权")
    private String low_qfq;
    @ExplainAnnotation(comment = "昨收价后复权")
    private String pre_close_hfq;
    @ExplainAnnotation(comment = "昨收价前复权")
    private String pre_close_qfq;
    @ExplainAnnotation(comment = "MCAD_DIF (基于前复权价格计算，下同)")
    private String macd_dif;
    @ExplainAnnotation(comment = "MCAD_DEA")
    private String macd_dea;
    @ExplainAnnotation(comment = "MCAD")
    private String macd;
    @ExplainAnnotation(comment = "KDJ_K")
    private String kdj_k;
    @ExplainAnnotation(comment = "KDJ_D")
    private String kdj_d;
    @ExplainAnnotation(comment = "KDJ_J")
    private String kdj_j;
    @ExplainAnnotation(comment = "RSI_6")
    private String rsi_6;
    @ExplainAnnotation(comment = "RSI_12")
    private String rsi_12;
    @ExplainAnnotation(comment = "RSI_24")
    private String rsi_24;
    @ExplainAnnotation(comment = "BOLL_UPPER")
    private String boll_upper;
    @ExplainAnnotation(comment = "BOLL_MID")
    private String boll_mid;
    @ExplainAnnotation(comment = "BOLL_LOWER")
    private String boll_lower;
    @ExplainAnnotation(comment = "CCI")
    private String cci;
}

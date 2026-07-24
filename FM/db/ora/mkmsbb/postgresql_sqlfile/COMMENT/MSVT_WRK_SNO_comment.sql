\encoding UTF-8

COMMENT ON VIEW msvt_wrk_sno IS '案件手配紐付ビュー // Sales project procurement pegged view';


COMMENT ON COLUMN msvt_wrk_sno.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN msvt_wrk_sno.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN msvt_wrk_sno.wrk_nm IS '案件名 // #MA.WRK_NM // Sales project name';


COMMENT ON COLUMN msvt_wrk_sno.st_dt IS '案件開始日 // #MA.DT // Sales project start date';


COMMENT ON COLUMN msvt_wrk_sno.end_dt IS '案件終了日 // #MA.DT // Sales project end date';


COMMENT ON COLUMN msvt_wrk_sno.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


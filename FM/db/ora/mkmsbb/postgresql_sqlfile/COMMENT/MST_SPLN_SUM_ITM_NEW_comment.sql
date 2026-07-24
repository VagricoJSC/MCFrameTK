\encoding UTF-8

COMMENT ON VIEW mst_spln_sum_itm_new IS '最新集計別品目別販売計画 // Latest sales plan by item by aggregated';


COMMENT ON COLUMN mst_spln_sum_itm_new.dpt_cd IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN mst_spln_sum_itm_new.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_spln_sum_itm_new.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_spln_sum_itm_new.spln_itm_cd IS '計画品目ＣＤ // #MA.SPLN_ITM_CD // Plan item cd.';


COMMENT ON COLUMN mst_spln_sum_itm_new.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_spln_sum_itm_new.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_spln_sum_itm_new.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_spln_sum_itm_new.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_spln_sum_itm_new.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mst_spln_sum_itm_new.spln_ym IS '販売年月 // #MA.YM // Sales month';


COMMENT ON COLUMN mst_spln_sum_itm_new.spln_qty IS '計画数量 // #MA.QTY // Plan qty.';


COMMENT ON COLUMN mst_spln_sum_itm_new.spln_amt IS '計画金額 // #MA.MONEY // Plan amount';


COMMENT ON COLUMN mst_spln_sum_itm_new.ym IS '計画年月 // #MA.YM // Plan month';


COMMENT ON COLUMN mst_spln_sum_itm_new.spln_vers IS 'バージョン // #MS.SPLN_VERS // Version';


COMMENT ON COLUMN mst_spln_sum_itm_new.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_spln_sum_itm_new.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_spln_sum_itm_new.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_spln_sum_itm_new.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_spln_sum_itm_new.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_spln_sum_itm_new.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_spln_sum_itm_new.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_spln_sum_itm_new.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_spln_sum_itm_new.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_spln_sum_itm_new.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


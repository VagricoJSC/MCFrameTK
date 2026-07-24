\encoding UTF-8

COMMENT ON TABLE mst_cst_frcst_all IS '顧客期間内示情報 // Sales forecast info.';


COMMENT ON COLUMN mst_cst_frcst_all.cst_frcst_r_no IS '顧客期間内示レコードＮＯ // #MA.CST_FRCST_R_NO // Sales forecast record No.';


COMMENT ON COLUMN mst_cst_frcst_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_cst_frcst_all.cst_frcst_no IS '顧客期間内示ＮＯ // #MA.CST_FRCST_NO // Sales forecast No.';


COMMENT ON COLUMN mst_cst_frcst_all.cst_frcst_d_no IS '顧客期間内示明細ＮＯ // #MA.CST_FRCST_D_NO // Sales forecast details No.';


COMMENT ON COLUMN mst_cst_frcst_all.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_cst_frcst_all.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_cst_frcst_all.cst_frcst_prnt_dt IS '得意先内示書発行日 // #MA.DT // Customer forecast list issue date';


COMMENT ON COLUMN mst_cst_frcst_all.cst_frcst_slip_no IS '得意先内示書ＮＯ // #MA.CST_FRCST_SLIP_NO // Customer forecast list No.';


COMMENT ON COLUMN mst_cst_frcst_all.frcst_dpt_cd IS '担当部門ＣＤ // #MA.DPT_CD // Dept. in charge cd.';


COMMENT ON COLUMN mst_cst_frcst_all.frcst_usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mst_cst_frcst_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_cst_frcst_all.rcpt_dt IS '受付日 // #MA.DT // Receiving date';


COMMENT ON COLUMN mst_cst_frcst_all.fix_flg IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN mst_cst_frcst_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_cst_frcst_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_cst_frcst_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_cst_frcst_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_cst_frcst_all.frcst_period_typ IS '内示期間区分 // #MS.PERIOD_TYP // Forecast period type';


COMMENT ON COLUMN mst_cst_frcst_all.frcst_dt IS '内示期間 // #MA.DT // Forecast period';


COMMENT ON COLUMN mst_cst_frcst_all.frcst_st_dt IS '内示期間開始日 // #MA.DT // Forecast period start date';


COMMENT ON COLUMN mst_cst_frcst_all.frcst_end_dt IS '内示期間終了日 // #MA.DT // Forecast period end date';


COMMENT ON COLUMN mst_cst_frcst_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_cst_frcst_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_cst_frcst_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_cst_frcst_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_cst_frcst_all.net_qty IS '正味内示数量 // #MA.QTY // Net forecast qty.';


COMMENT ON COLUMN mst_cst_frcst_all.gi_loc_cd IS '出庫元場所ＣＤ // #MA.LOC_CD // GI source location cd.';


COMMENT ON COLUMN mst_cst_frcst_all.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_cst_frcst_all.cst_itm_nm IS '得意先品目名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_cst_frcst_all.cst_frcst_slip_d_no IS '得意先内示書明細ＮＯ // #MA.CST_FRCST_SLIP_NO // Customer forecast list details No.';


COMMENT ON COLUMN mst_cst_frcst_all.prms_qty IS '回答数量 // #MA.QTY // Replied qty.';


COMMENT ON COLUMN mst_cst_frcst_all.frcst_stop_flg IS '下位優先ＦＬＧ // #MA.FLG // Lower priority flg.';


COMMENT ON COLUMN mst_cst_frcst_all.dmnd_cnt_rmrks IS '需要連絡備考 // #MS.DMND_CNT_RMRKS // Demand contact remarks';


COMMENT ON COLUMN mst_cst_frcst_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_cst_frcst_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_cst_frcst_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_cst_frcst_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_cst_frcst_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_cst_frcst_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_cst_frcst_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_cst_frcst_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_cst_frcst_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_cst_frcst_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


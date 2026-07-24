\encoding UTF-8

COMMENT ON VIEW mst_cst_frcst_d IS '顧客期間内示明細 // Sales forecast details';


COMMENT ON COLUMN mst_cst_frcst_d.cst_frcst_d_no IS '顧客期間内示明細ＮＯ // #MA.CST_FRCST_D_NO // Sales forecast details No.';


COMMENT ON COLUMN mst_cst_frcst_d.cst_frcst_no IS '顧客期間内示ＮＯ // #MA.CST_FRCST_NO // Sales forecast No.';


COMMENT ON COLUMN mst_cst_frcst_d.fix_flg IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN mst_cst_frcst_d.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_cst_frcst_d.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_cst_frcst_d.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_cst_frcst_d.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_cst_frcst_d.frcst_period_typ IS '内示期間区分 // #MS.PERIOD_TYP // Forecast period type';


COMMENT ON COLUMN mst_cst_frcst_d.frcst_st_dt IS '内示期間開始日 // #MA.DT // Forecast period start date';


COMMENT ON COLUMN mst_cst_frcst_d.frcst_end_dt IS '内示期間終了日 // #MA.DT // Forecast period end date';


COMMENT ON COLUMN mst_cst_frcst_d.frcst_dt IS '内示期間 // #MA.DT // Forecast period';


COMMENT ON COLUMN mst_cst_frcst_d.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_cst_frcst_d.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_cst_frcst_d.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_cst_frcst_d.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_cst_frcst_d.gi_loc_cd IS '出庫元場所ＣＤ // #MA.LOC_CD // GI source location cd.';


COMMENT ON COLUMN mst_cst_frcst_d.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_cst_frcst_d.cst_itm_nm IS '得意先品目名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_cst_frcst_d.cst_frcst_slip_d_no IS '得意先内示書明細ＮＯ // #MA.CST_FRCST_SLIP_NO // Customer forecast list details No.';


COMMENT ON COLUMN mst_cst_frcst_d.prms_qty IS '回答数量 // #MA.QTY // Replied qty.';


COMMENT ON COLUMN mst_cst_frcst_d.frcst_stop_flg IS '下位優先ＦＬＧ // #MA.FLG // Lower priority flg.';


COMMENT ON COLUMN mst_cst_frcst_d.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_cst_frcst_d.dmnd_cnt_rmrks IS '需要連絡備考 // #MS.DMND_CNT_RMRKS // Demand contact remarks';


COMMENT ON COLUMN mst_cst_frcst_d.intr_rmrks IS '内部備考 // #MS.CST_FRCST_D_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_cst_frcst_d.sub_char1 IS '予備１ // #MS.CST_FRCST_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_cst_frcst_d.sub_char2 IS '予備２ // #MS.CST_FRCST_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_cst_frcst_d.sub_char3 IS '予備３ // #MS.CST_FRCST_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_cst_frcst_d.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_cst_frcst_d.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_cst_frcst_d.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_cst_frcst_d.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_cst_frcst_d.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_cst_frcst_d.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_cst_frcst_d.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_cst_frcst_d.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_cst_frcst_d.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_cst_frcst_d.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


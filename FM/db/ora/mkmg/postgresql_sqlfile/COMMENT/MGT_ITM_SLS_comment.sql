\encoding UTF-8

COMMENT ON VIEW mgt_itm_sls IS '原価品目販売単価情報 // Cost item sales unit price info.';


COMMENT ON COLUMN mgt_itm_sls.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_itm_sls.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_itm_sls.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_itm_sls.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_itm_sls.dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mgt_itm_sls.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mgt_itm_sls.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mgt_itm_sls.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mgt_itm_sls.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mgt_itm_sls.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mgt_itm_sls.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mgt_itm_sls.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_itm_sls.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_itm_sls.base_qty IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN mgt_itm_sls.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mgt_itm_sls.upri IS '単価 // #MA.MONEY // Unit price';


COMMENT ON COLUMN mgt_itm_sls.prio IS '優先順位 // #MG.SLS_UNIT_PRIO // Priority';


COMMENT ON COLUMN mgt_itm_sls.alc_val1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN mgt_itm_sls.alc_val2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN mgt_itm_sls.alc_val3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN mgt_itm_sls.alc_val4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN mgt_itm_sls.alc_val5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';


COMMENT ON COLUMN mgt_itm_sls.rmrks IS '備考 // #MG.ITM_SLS_RMRKS // Remarks';


COMMENT ON COLUMN mgt_itm_sls.sub_char1 IS '予備１ // #MG.ITM_SLS_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_itm_sls.sub_char2 IS '予備２ // #MG.ITM_SLS_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_itm_sls.sub_char3 IS '予備３ // #MG.ITM_SLS_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_itm_sls.non_calc_flg IS '計算対象外ＦＬＧ // #MA.FLG // Not to calculate flg.';


COMMENT ON COLUMN mgt_itm_sls.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_itm_sls.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_itm_sls.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_itm_sls.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_itm_sls.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_itm_sls.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_itm_sls.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_itm_sls.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_itm_sls.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_itm_sls.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


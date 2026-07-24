\encoding UTF-8

COMMENT ON VIEW mgt_itm_fix IS '原価品目指値情報 // Cost item limit unit price info.';


COMMENT ON COLUMN mgt_itm_fix.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_itm_fix.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_itm_fix.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_itm_fix.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_itm_fix.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgt_itm_fix.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mgt_itm_fix.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_itm_fix.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_itm_fix.base_qty IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN mgt_itm_fix.std_upri IS '標準単価 // #MA.MONEY // Standard unit cost';


COMMENT ON COLUMN mgt_itm_fix.rmrks IS '備考 // #MG.ITM_FIX_RMRKS // Remarks';


COMMENT ON COLUMN mgt_itm_fix.sub_char1 IS '予備１ // #MG.ITM_FIX_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_itm_fix.sub_char2 IS '予備２ // #MG.ITM_FIX_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_itm_fix.sub_char3 IS '予備３ // #MG.ITM_FIX_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_itm_fix.non_calc_flg IS '計算対象外ＦＬＧ // #MA.FLG // Not to calculate flg.';


COMMENT ON COLUMN mgt_itm_fix.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_itm_fix.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_itm_fix.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_itm_fix.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_itm_fix.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_itm_fix.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_itm_fix.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_itm_fix.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_itm_fix.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_itm_fix.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


\encoding UTF-8

COMMENT ON VIEW mst_onr_prov_bal IS '有償支給残高情報 // Chargeable supply balance info.';


COMMENT ON COLUMN mst_onr_prov_bal.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mst_onr_prov_bal.ap_dpt_cd IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN mst_onr_prov_bal.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_onr_prov_bal.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_onr_prov_bal.init_bal IS '月初残高 // #MA.MONEY // Beginning balance';


COMMENT ON COLUMN mst_onr_prov_bal.onr_prov_amt IS '当月有償支給額 // #MA.MONEY // Chargeable supply amount (Current month)';


COMMENT ON COLUMN mst_onr_prov_bal.onr_prov_ret_amt IS '当月有償支給戻し額 // #MA.MONEY // Chargeable supply refundable amount (Current month)';


COMMENT ON COLUMN mst_onr_prov_bal.setoff_amt IS '当月相殺額 // #MA.MONEY // Offset amount (Current month)';


COMMENT ON COLUMN mst_onr_prov_bal.tax_amt IS '当月税額 // #MA.MONEY // Tax amount (Current month)';


COMMENT ON COLUMN mst_onr_prov_bal.end_bal IS '当月残高 // #MA.MONEY // Balance (Current month)';


COMMENT ON COLUMN mst_onr_prov_bal.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mst_onr_prov_bal.base_cur_init_bal IS '基準通貨月初残高 // #MA.MONEY // Beginning balance (Base currency)';


COMMENT ON COLUMN mst_onr_prov_bal.base_cur_onr_prov_amt IS '基準通貨当月有償支給額 // #MA.MONEY // Current month chargeable supply amount (Base currency)';


COMMENT ON COLUMN mst_onr_prov_bal.base_cur_onr_prov_ret_amt IS '基準通貨当月有償支給戻し額 // #MA.MONEY // Current month chargeable supply repayment amount (Base currency)';


COMMENT ON COLUMN mst_onr_prov_bal.base_cur_setoff_amt IS '基準通貨当月相殺額 // #MA.MONEY // Current month offset amount (Base currency)';


COMMENT ON COLUMN mst_onr_prov_bal.base_cur_tax_amt IS '基準通貨当月税額 // #MA.MONEY // Current month tax amount (Base currency)';


COMMENT ON COLUMN mst_onr_prov_bal.base_cur_end_bal IS '基準通貨当月残高 // #MA.MONEY // Current month balance (Base currency)';


COMMENT ON COLUMN mst_onr_prov_bal.sub_char1 IS '予備１ // #MS.MLY_ONR_PROV_BAL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_onr_prov_bal.sub_char2 IS '予備２ // #MS.MLY_ONR_PROV_BAL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_onr_prov_bal.sub_char3 IS '予備３ // #MS.MLY_ONR_PROV_BAL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_onr_prov_bal.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_onr_prov_bal.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_onr_prov_bal.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_onr_prov_bal.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_onr_prov_bal.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_onr_prov_bal.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_onr_prov_bal.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_onr_prov_bal.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_onr_prov_bal.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_onr_prov_bal.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


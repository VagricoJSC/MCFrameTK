\encoding UTF-8

COMMENT ON VIEW mst_mly_ap_bal IS '月次買掛残高 // Monthly AP balance';


COMMENT ON COLUMN mst_mly_ap_bal.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_mly_ap_bal.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mst_mly_ap_bal.ap_dpt_cd IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN mst_mly_ap_bal.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_mly_ap_bal.purc_act_no IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN mst_mly_ap_bal.rcpt_iv_mng_no IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN mst_mly_ap_bal.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_mly_ap_bal.ap_typ IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN mst_mly_ap_bal.init_bal IS '月初残高 // #MA.MONEY // Beginning balance';


COMMENT ON COLUMN mst_mly_ap_bal.purc_amt IS '当月仕入額 // #MA.MONEY // Purchase amount (Current month)';


COMMENT ON COLUMN mst_mly_ap_bal.ret_amt IS '当月返品額 // #MA.MONEY // Return amount (Current month)';


COMMENT ON COLUMN mst_mly_ap_bal.dscnt_amt IS '当月値引額 // #MA.MONEY // Discount amount (Current month)';


COMMENT ON COLUMN mst_mly_ap_bal.sw_to_amt IS '当月振替額（振替先） // #MA.MONEY // Transferred amount (Current month)(Transfer)';


COMMENT ON COLUMN mst_mly_ap_bal.tax_amt IS '当月税額 // #MA.MONEY // Tax amount (Current month)';


COMMENT ON COLUMN mst_mly_ap_bal.cash_amt IS '当月現金支払額 // #MA.MONEY // Cash payment amount of current month';


COMMENT ON COLUMN mst_mly_ap_bal.note_amt IS '当月手形支払額 // #MA.MONEY // Notes payment amount (Current month)';


COMMENT ON COLUMN mst_mly_ap_bal.account_amt IS '当月預金支払額 // #MA.MONEY // Deposit payment amount (Current month)';


COMMENT ON COLUMN mst_mly_ap_bal.setoff_amt IS '当月相殺額 // #MA.MONEY // Offset amount (Current month)';


COMMENT ON COLUMN mst_mly_ap_bal.sw_amt IS '当月振替額 // #MA.MONEY // Transferred amount (Current month)';


COMMENT ON COLUMN mst_mly_ap_bal.end_bal IS '当月残高 // #MA.MONEY // Balance (Current month)';


COMMENT ON COLUMN mst_mly_ap_bal.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mst_mly_ap_bal.base_cur_init_bal IS '基準通貨月初残高 // #MA.MONEY // Beginning balance (Base currency)';


COMMENT ON COLUMN mst_mly_ap_bal.base_cur_purc_amt IS '基準通貨当月仕入額 // #MA.MONEY // Current month purchase amount (Base currency)';


COMMENT ON COLUMN mst_mly_ap_bal.base_cur_ret_amt IS '基準通貨当月返品額 // #MA.MONEY // Current month return amount (Base currency)';


COMMENT ON COLUMN mst_mly_ap_bal.base_cur_dscnt_amt IS '基準通貨当月値引額 // #MA.MONEY // Current month discount amount (Base currency)';


COMMENT ON COLUMN mst_mly_ap_bal.base_cur_sw_to_amt IS '基準通貨当月振替額（振替先） // #MA.MONEY // Current month transfer amount (Transfer) (Base currency)';


COMMENT ON COLUMN mst_mly_ap_bal.base_cur_tax_amt IS '基準通貨当月税額 // #MA.MONEY // Current month tax amount (Base currency)';


COMMENT ON COLUMN mst_mly_ap_bal.base_cur_cash_amt IS '基準通貨当月現金支払額 // #MA.MONEY // Current month cash payment amount (Base currency)';


COMMENT ON COLUMN mst_mly_ap_bal.base_cur_note_amt IS '基準通貨当月手形支払額 // #MA.MONEY // Current month notes payment amount (Base currency)';


COMMENT ON COLUMN mst_mly_ap_bal.base_cur_account_amt IS '基準通貨当月預金支払額 // #MA.MONEY // Current month deposit payment amount (Base currency)';


COMMENT ON COLUMN mst_mly_ap_bal.base_cur_setoff_amt IS '基準通貨当月相殺額 // #MA.MONEY // Current month offset amount (Base currency)';


COMMENT ON COLUMN mst_mly_ap_bal.base_cur_sw_amt IS '基準通貨当月振替額 // #MA.MONEY // Current month transfer amount (Base currency)';


COMMENT ON COLUMN mst_mly_ap_bal.base_cur_end_bal IS '基準通貨当月残高 // #MA.MONEY // Current month balance (Base currency)';


COMMENT ON COLUMN mst_mly_ap_bal.exc_gain_loss IS '為替差損益 // #MA.MONEY // Exchange gain/loss';


COMMENT ON COLUMN mst_mly_ap_bal.total_exc_gain_loss IS '累計為替差損益 // #MA.MONEY // Accumulation exchange gain/loss';


COMMENT ON COLUMN mst_mly_ap_bal.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_mly_ap_bal.sub_char1 IS '予備１ // #MS.MLY_AP_BAL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_mly_ap_bal.sub_char2 IS '予備２ // #MS.MLY_AP_BAL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_mly_ap_bal.sub_char3 IS '予備３ // #MS.MLY_AP_BAL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_mly_ap_bal.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_mly_ap_bal.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_mly_ap_bal.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_mly_ap_bal.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_mly_ap_bal.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_mly_ap_bal.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_mly_ap_bal.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_mly_ap_bal.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_mly_ap_bal.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_mly_ap_bal.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


\encoding UTF-8

COMMENT ON VIEW mst_mly_ar_bal IS '月次売掛残高 // Monthly AR balance';


COMMENT ON COLUMN mst_mly_ar_bal.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_mly_ar_bal.acst_cd IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN mst_mly_ar_bal.ar_dpt_cd IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN mst_mly_ar_bal.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_mly_ar_bal.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_mly_ar_bal.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_mly_ar_bal.ar_typ IS '債権区分 // #MA.AR_TYP // AR type';


COMMENT ON COLUMN mst_mly_ar_bal.init_bal IS '月初残高 // #MA.MONEY // Beginning balance';


COMMENT ON COLUMN mst_mly_ar_bal.sls_amt IS '当月売上額 // #MA.MONEY // Sales amount (Current month)';


COMMENT ON COLUMN mst_mly_ar_bal.ret_amt IS '当月返品額 // #MA.MONEY // Return amount (Current month)';


COMMENT ON COLUMN mst_mly_ar_bal.dscnt_amt IS '当月値引額 // #MA.MONEY // Discount amount (Current month)';


COMMENT ON COLUMN mst_mly_ar_bal.sw_to_amt IS '当月振替額（振替先） // #MA.MONEY // Transferred amount (Current month)(Transfer)';


COMMENT ON COLUMN mst_mly_ar_bal.tax_amt IS '当月税額 // #MA.MONEY // Tax amount (Current month)';


COMMENT ON COLUMN mst_mly_ar_bal.cash_amt IS '当月現金入金額 // #MA.MONEY // Cash payment received amount (Current month)';


COMMENT ON COLUMN mst_mly_ar_bal.note_amt IS '当月手形入金額 // #MA.MONEY // Notes payment received amount (Current month)';


COMMENT ON COLUMN mst_mly_ar_bal.xfr_amt IS '当月振込入金額 // #MA.MONEY // Transfer payment received amount (Current month)';


COMMENT ON COLUMN mst_mly_ar_bal.setoff_amt IS '当月相殺額 // #MA.MONEY // Offset amount (Current month)';


COMMENT ON COLUMN mst_mly_ar_bal.sw_amt IS '当月振替額 // #MA.MONEY // Transferred amount (Current month)';


COMMENT ON COLUMN mst_mly_ar_bal.end_bal IS '当月残高 // #MA.MONEY // Balance (Current month)';


COMMENT ON COLUMN mst_mly_ar_bal.ar_appl_amt IS '当月売掛金消込額 // #MA.MONEY // AR reconciled amount (Current month)';


COMMENT ON COLUMN mst_mly_ar_bal.ar_not_appl_bal IS '当月売掛金未消込残高 // #MA.MONEY // AR unreconciled balance (Current month)';


COMMENT ON COLUMN mst_mly_ar_bal.rcv_appl_amt IS '当月入金消込額 // #MA.MONEY // Payment received reconciled amount (Current month)';


COMMENT ON COLUMN mst_mly_ar_bal.rcv_not_appl_bal IS '当月入金未消込残高 // #MA.MONEY // Payment received unreconciled balance (Current month)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_init_bal IS '基準通貨月初残高 // #MA.MONEY // Beginning balance (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_sls_amt IS '基準通貨当月売上額 // #MA.MONEY // Current month sales amount (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_ret_amt IS '基準通貨当月返品額 // #MA.MONEY // Current month return amount (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_dscnt_amt IS '基準通貨当月値引額 // #MA.MONEY // Current month discount amount (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_sw_to_amt IS '基準通貨当月振替額（振替先） // #MA.MONEY // Current month transfer amount (Transfer) (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_tax_amt IS '基準通貨当月税額 // #MA.MONEY // Current month tax amount (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_cash_amt IS '基準通貨当月現金入金額 // #MA.MONEY // Current month cash payment received amount (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_note_amt IS '基準通貨当月手形入金額 // #MA.MONEY // Current month notes payment received amount (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_xfr_amt IS '基準通貨当月振込入金額 // #MA.MONEY // Current month transfer payment received amount (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_setoff_amt IS '基準通貨当月相殺額 // #MA.MONEY // Current month offset amount (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_sw_amt IS '基準通貨当月振替額 // #MA.MONEY // Current month transfer amount (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_end_bal IS '基準通貨当月残高 // #MA.MONEY // Current month balance (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_ar_appl_amt IS '基準通貨当月売掛金消込額 // #MA.MONEY // Current month AR reconciled amount (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_ar_not_appl_bal IS '基準通貨当月売掛金未消込残高 // #MA.MONEY // Current month AR unreconciled balance (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_rcv_appl_amt IS '基準通貨当月入金消込額 // #MA.MONEY // Current month payment received reconciled amount (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.base_cur_rcv_not_appl_bal IS '基準通貨当月入金未消込残高 // #MA.MONEY // Current month payment received unreconciled balance (Base currency)';


COMMENT ON COLUMN mst_mly_ar_bal.exc_gain_loss IS '為替差損益 // #MA.MONEY // Exchange gain/loss';


COMMENT ON COLUMN mst_mly_ar_bal.total_exc_gain_loss IS '累計為替差損益 // #MA.MONEY // Accumulation exchange gain/loss';


COMMENT ON COLUMN mst_mly_ar_bal.sub_char1 IS '予備１ // #MS.MLY_AR_BAL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_mly_ar_bal.sub_char2 IS '予備２ // #MS.MLY_AR_BAL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_mly_ar_bal.sub_char3 IS '予備３ // #MS.MLY_AR_BAL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_mly_ar_bal.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_mly_ar_bal.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_mly_ar_bal.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_mly_ar_bal.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_mly_ar_bal.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_mly_ar_bal.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_mly_ar_bal.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_mly_ar_bal.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_mly_ar_bal.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_mly_ar_bal.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


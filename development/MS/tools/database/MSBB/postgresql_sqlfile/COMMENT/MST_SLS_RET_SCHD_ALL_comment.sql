\encoding UTF-8

COMMENT ON TABLE mst_sls_ret_schd_all IS '売上返品予定ヘッダ // Sales return schedule header';


COMMENT ON COLUMN mst_sls_ret_schd_all.sls_ret_schd_no IS '売上返品予定ＮＯ // #MA.SLS_RET_SCHD_NO // Sales return schedule No.';


COMMENT ON COLUMN mst_sls_ret_schd_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_sls_ret_schd_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_sls_ret_schd_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_sls_ret_schd_all.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_sls_ret_schd_all.sls_dpt_cd IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mst_sls_ret_schd_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_sls_ret_schd_all.sls_usr_cd IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN mst_sls_ret_schd_all.reg_dt IS '登録日 // #MA.DT // Entry date';


COMMENT ON COLUMN mst_sls_ret_schd_all.sls_ret_schd_dt IS '売上返品予定日 // #MA.DT // Scheduled sales return date';


COMMENT ON COLUMN mst_sls_ret_schd_all.cst_po_no IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN mst_sls_ret_schd_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_sls_ret_schd_all.xrate_inpt_flg IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN mst_sls_ret_schd_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_sls_ret_schd_all.ptax_xrate_inpt_flg IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN mst_sls_ret_schd_all.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mst_sls_ret_schd_all.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_sls_ret_schd_all.intr_rmrks IS '内部備考 // #MS.SLS_RET_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_sls_ret_schd_all.ar_dpt_cd IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN mst_sls_ret_schd_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_sls_ret_schd_all.ref_iv_no IS '対応インボイスＮＯ // #MA.IV_NO // Corresponding I/V No.';


COMMENT ON COLUMN mst_sls_ret_schd_all.rcv_schd_dt IS '入金予定日 // #MA.DT // Scheduled payment receipt date';


COMMENT ON COLUMN mst_sls_ret_schd_all.sync_flg IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN mst_sls_ret_schd_all.tterm_cd1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN mst_sls_ret_schd_all.tterm_rmrks1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN mst_sls_ret_schd_all.tterm_cd2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN mst_sls_ret_schd_all.tterm_rmrks2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN mst_sls_ret_schd_all.tterm_cd3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN mst_sls_ret_schd_all.tterm_rmrks3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN mst_sls_ret_schd_all.sub_char1 IS '予備１ // #MS.SLS_RET_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_sls_ret_schd_all.sub_char2 IS '予備２ // #MS.SLS_RET_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_sls_ret_schd_all.sub_char3 IS '予備３ // #MS.SLS_RET_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_sls_ret_schd_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_sls_ret_schd_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_sls_ret_schd_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_sls_ret_schd_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_sls_ret_schd_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_sls_ret_schd_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_sls_ret_schd_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_sls_ret_schd_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_sls_ret_schd_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_sls_ret_schd_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


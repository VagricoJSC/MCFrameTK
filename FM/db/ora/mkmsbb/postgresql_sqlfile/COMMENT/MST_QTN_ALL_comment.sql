\encoding UTF-8

COMMENT ON TABLE mst_qtn_all IS '見積ヘッダ // Quotation header';


COMMENT ON COLUMN mst_qtn_all.qtn_no IS '見積ＮＯ // #MA.QTN_NO // Quotation No.';


COMMENT ON COLUMN mst_qtn_all.qtn_rev IS '見積改訂番号 // #MA.SLIP_REV // Quotation rev. number';


COMMENT ON COLUMN mst_qtn_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_qtn_all.qtn_typ IS '見積区分 // #MS.QTN_TYP // Quotation type';


COMMENT ON COLUMN mst_qtn_all.failure_flg IS '失注ＦＬＧ // #MA.FLG // Failed order flg.';


COMMENT ON COLUMN mst_qtn_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_qtn_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_qtn_all.qtn_dt IS '見積日 // #MA.DT // Quotation date';


COMMENT ON COLUMN mst_qtn_all.valid_dt IS '有効期限 // #MA.DT // Expiration date';


COMMENT ON COLUMN mst_qtn_all.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_qtn_all.cst_sundry_flg IS '得意先諸口ＦＬＧ // #MA.FLG // Miscellaneous customer flg.';


COMMENT ON COLUMN mst_qtn_all.cst_nm IS '得意先名 // #MA.BP_NM // Customer name';


COMMENT ON COLUMN mst_qtn_all.cst_cntct_dpt IS '得意先部署 // #MA.BP_CNTCT_DPT // Customer dept.';


COMMENT ON COLUMN mst_qtn_all.cst_cntct_psn IS '得意先担当者 // #MA.BP_CNTCT_PSN // Customer PIC';


COMMENT ON COLUMN mst_qtn_all.cst_zip_cd IS '得意先郵便番号 // #MA.ZIP_CD // Customer zip code';


COMMENT ON COLUMN mst_qtn_all.cst_addr1 IS '得意先住所１ // #MA.ADDR1 // Customer address 1';


COMMENT ON COLUMN mst_qtn_all.cst_addr2 IS '得意先住所２ // #MA.ADDR2 // Customer address 2';


COMMENT ON COLUMN mst_qtn_all.cst_addr3 IS '得意先住所３ // #MA.ADDR3 // Customer address 3';


COMMENT ON COLUMN mst_qtn_all.cst_addr4 IS '得意先住所４ // #MA.ADDR4 // Customer address 4';


COMMENT ON COLUMN mst_qtn_all.cst_tel IS '得意先ＴＥＬ // #MA.TEL // Customer TEL';


COMMENT ON COLUMN mst_qtn_all.cst_fax IS '得意先ＦＡＸ // #MA.TEL // Customer FAX';


COMMENT ON COLUMN mst_qtn_all.tterm_cd1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN mst_qtn_all.tterm_rmrks1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN mst_qtn_all.tterm_cd2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN mst_qtn_all.tterm_rmrks2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN mst_qtn_all.tterm_cd3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN mst_qtn_all.tterm_rmrks3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN mst_qtn_all.trnspt_cd IS '輸送方法ＣＤ // #MA.TRNSPT_CD // Transportation method cd.';


COMMENT ON COLUMN mst_qtn_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_qtn_all.xrate_inpt_flg IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN mst_qtn_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_qtn_all.sls_usr_cd IS '売上担当者 // #MA.USR_CD // Sales PIC';


COMMENT ON COLUMN mst_qtn_all.sls_dpt_cd IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mst_qtn_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_qtn_all.qtn_rmrks IS '見積備考 // #MS.QTN_RMRKS // Quotation remarks';


COMMENT ON COLUMN mst_qtn_all.intr_rmrks IS '内部備考 // #MS.QTN_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_qtn_all.qtn_term_cd IS '見積条件 // #MS.SLO_RSN_CD // Quotation terms';


COMMENT ON COLUMN mst_qtn_all.qtn_rslt_rsn_cd IS '見積結果理由ＣＤ // #MS.SLO_RSN_CD // Quotation result reason cd.';


COMMENT ON COLUMN mst_qtn_all.qtn_rslt_rsn_rmrks IS '見積結果理由備考 // #MS.QTN_RSLT_RSN_RMRKS // Quotation result reason remarks';


COMMENT ON COLUMN mst_qtn_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_qtn_all.cst_qtn_rqst_no IS '得意先見積依頼ＮＯ // #MA.CST_QTN_RQST_NO // Customer quotation request No.';


COMMENT ON COLUMN mst_qtn_all.rcpt_dt IS '受付日 // #MA.DT // Receiving date';


COMMENT ON COLUMN mst_qtn_all.rcpt_usr_cd IS '受付担当者ＣＤ // #MA.USR_CD // Receiving PIC cd.';


COMMENT ON COLUMN mst_qtn_all.aprv_flg IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN mst_qtn_all.aprv_no IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN mst_qtn_all.aprv_sts_typ IS '承認状況区分 // #MA.APRV_STS_TYP // Approval status type';


COMMENT ON COLUMN mst_qtn_all.sub_char1 IS '予備１ // #MS.QTN_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_qtn_all.sub_char2 IS '予備２ // #MS.QTN_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_qtn_all.sub_char3 IS '予備３ // #MS.QTN_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_qtn_all.qtn_prnt_flg IS '見積書発行済ＦＬＧ // #MA.FLG // Quotation issued flg.';


COMMENT ON COLUMN mst_qtn_all.qtn_prnt_seq IS '見積書連番 // #MA.PRNT_SEQ // Quotation sequence number';


COMMENT ON COLUMN mst_qtn_all.qtn_prnt_dt IS '見積書発行日 // #MA.DT // Quotation issue date';


COMMENT ON COLUMN mst_qtn_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_qtn_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_qtn_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_qtn_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_qtn_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_qtn_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_qtn_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_qtn_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_qtn_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_qtn_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_qtn_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


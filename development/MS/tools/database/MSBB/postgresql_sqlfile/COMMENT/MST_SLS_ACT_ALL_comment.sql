\encoding UTF-8

COMMENT ON TABLE mst_sls_act_all IS '売上実績ヘッダ // Sales result header';


COMMENT ON COLUMN mst_sls_act_all.sls_act_no IS '売上実績ＮＯ // #MA.SLS_ACT_NO // Sales result No.';


COMMENT ON COLUMN mst_sls_act_all.sls_act_seq IS '売上実績連番 // #MA.SLIP_SEQ // Sales result sequence number';


COMMENT ON COLUMN mst_sls_act_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_sls_act_all.sls_act_rev IS '売上実績改訂番号 // #MA.SLIP_REV // Sales result rev. number';


COMMENT ON COLUMN mst_sls_act_all.slip_sts_typ IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN mst_sls_act_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_sls_act_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_sls_act_all.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_sls_act_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_sls_act_all.sls_dpt_cd IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mst_sls_act_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_sls_act_all.sls_usr_cd IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN mst_sls_act_all.sls_dt IS '売上日 // #MA.DT // Sales date';


COMMENT ON COLUMN mst_sls_act_all.ship_tm IS '出荷日時 // #MA.TM // Shipping date and time';


COMMENT ON COLUMN mst_sls_act_all.dlv_tm IS '納品日時 // #MA.TM // Delivery date and time';


COMMENT ON COLUMN mst_sls_act_all.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_sls_act_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_sls_act_all.ref_iv_no IS '対応インボイスＮＯ // #MA.IV_NO // Corresponding I/V No.';


COMMENT ON COLUMN mst_sls_act_all.rcpt_iv_mng_no IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN mst_sls_act_all.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_sls_act_all.tterm_cd1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN mst_sls_act_all.tterm_rmrks1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN mst_sls_act_all.tterm_cd2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN mst_sls_act_all.tterm_rmrks2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN mst_sls_act_all.tterm_cd3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN mst_sls_act_all.tterm_rmrks3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN mst_sls_act_all.lc_no IS 'Ｌ／ＣＮＯ // #MA.LC_NO // L/C No.';


COMMENT ON COLUMN mst_sls_act_all.lc_dt IS 'Ｌ／Ｃ日付 // #MA.DT // L/C Date';


COMMENT ON COLUMN mst_sls_act_all.lc_rmrks IS 'Ｌ／Ｃ備考 // #MS.LC_RMRKS // L/C remarks';


COMMENT ON COLUMN mst_sls_act_all.rcv_schd_dt IS '入金予定日 // #MA.DT // Scheduled payment receipt date';


COMMENT ON COLUMN mst_sls_act_all.bill_basis_dt IS '請求起算日 // #MA.DT // Billing base date';


COMMENT ON COLUMN mst_sls_act_all.cred_cd IS '与信管理先ＣＤ // #MA.BP_CD // Credit managed BP cd.';


COMMENT ON COLUMN mst_sls_act_all.bcst_cd IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN mst_sls_act_all.acst_cd IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN mst_sls_act_all.ar_dpt_cd IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN mst_sls_act_all.cst_po_no IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN mst_sls_act_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_sls_act_all.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mst_sls_act_all.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mst_sls_act_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_sls_act_all.ptax_cur_cd IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN mst_sls_act_all.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mst_sls_act_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_sls_act_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_sls_act_all.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mst_sls_act_all.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mst_sls_act_all.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_sls_act_all.intr_rmrks IS '内部備考 // #MS.SLS_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_sls_act_all.ship_act_no IS '出荷実績ＮＯ // #MA.SHIP_ACT_NO // Shipping result No.';


COMMENT ON COLUMN mst_sls_act_all.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_sls_act_all.sls_ret_schd_no IS '売上返品予定ＮＯ // #MA.SLS_RET_SCHD_NO // Sales return schedule No.';


COMMENT ON COLUMN mst_sls_act_all.qtn_no IS '見積ＮＯ // #MA.QTN_NO // Quotation No.';


COMMENT ON COLUMN mst_sls_act_all.qtn_rev IS '見積改訂番号 // #MA.SLIP_REV // Quotation rev. number';


COMMENT ON COLUMN mst_sls_act_all.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_sls_act_all.dlv_slip_seq IS '納品書連番 // #MA.SLIP_SEQ // Delivery note sequence number';


COMMENT ON COLUMN mst_sls_act_all.ship_dlv_slip_no IS '出荷時納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No. at shipping';


COMMENT ON COLUMN mst_sls_act_all.slip_form_cd IS '伝票帳票ＣＤ // #MA.SLIP_FORM_CD // Slip report cd.';


COMMENT ON COLUMN mst_sls_act_all.aprv_flg IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN mst_sls_act_all.aprv_no IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN mst_sls_act_all.aprv_sts_typ IS '承認状況区分 // #MA.APRV_STS_TYP // Approval status type';


COMMENT ON COLUMN mst_sls_act_all.sls_basis_typ IS '売上計上区分 // #MA.SLS_BASIS_TYP // Revenue recording type';


COMMENT ON COLUMN mst_sls_act_all.ddlv_sls_flg IS '直送売上ＦＬＧ // #MA.FLG // Direct-delivery sales flg.';


COMMENT ON COLUMN mst_sls_act_all.ship_act_sync_flg IS '出荷実績同時計上ＦＬＧ // #MA.FLG // Shipping result simultaneously recorded flg.';


COMMENT ON COLUMN mst_sls_act_all.ship_lg_grp_cd IS '出荷物流グループＣＤ // #MA.LG_GRP_CD // Shipping distribution group cd.';


COMMENT ON COLUMN mst_sls_act_all.adjst_tgt_dt IS '調整対象日 // #MA.DT // Adjustment required date';


COMMENT ON COLUMN mst_sls_act_all.sls_adjst_typ IS '売上調整区分 // #MS.SLS_ADJST_TYP // Sales adjustment type';


COMMENT ON COLUMN mst_sls_act_all.adjst_mtd_typ IS '調整方法区分 // #MS.ADJST_MTD_TYP // Adjustment method type';


COMMENT ON COLUMN mst_sls_act_all.edi_flg IS 'ＥＤＩＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN mst_sls_act_all.sub_char1 IS '予備１ // #MS.SLS_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_sls_act_all.sub_char2 IS '予備２ // #MS.SLS_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_sls_act_all.sub_char3 IS '予備３ // #MS.SLS_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_sls_act_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_sls_act_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_sls_act_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_sls_act_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_sls_act_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_sls_act_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_sls_act_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_sls_act_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_sls_act_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_sls_act_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


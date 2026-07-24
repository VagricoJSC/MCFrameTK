\encoding UTF-8

COMMENT ON TABLE mst_po_all IS '発注ヘッダ // PO header';


COMMENT ON COLUMN mst_po_all.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mst_po_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_po_all.po_rev IS '発注改訂番号 // #MA.SLIP_REV // PO rev. number';


COMMENT ON COLUMN mst_po_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_po_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_po_all.purc_dpt_cd IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN mst_po_all.wg_cd IS 'ＷＧ ＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_po_all.purc_usr_cd IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN mst_po_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_po_all.sppl_cntct_dpt IS '発注先部署 // #MA.BP_CNTCT_DPT // Supplier dept.';


COMMENT ON COLUMN mst_po_all.sppl_cntct_psn IS '発注先担当者 // #MA.BP_CNTCT_PSN // Supplier PIC';


COMMENT ON COLUMN mst_po_all.sppl_zip_cd IS '発注先郵便番号 // #MA.ZIP_CD // Supplier zip code';


COMMENT ON COLUMN mst_po_all.sppl_addr1 IS '発注先住所１ // #MA.ADDR // Supplier address 1';


COMMENT ON COLUMN mst_po_all.sppl_addr2 IS '発注先住所２ // #MA.ADDR // Supplier address 2';


COMMENT ON COLUMN mst_po_all.sppl_addr3 IS '発注先住所３ // #MA.ADDR // Supplier address 3';


COMMENT ON COLUMN mst_po_all.sppl_addr4 IS '発注先住所４ // #MA.ADDR // Supplier address 4';


COMMENT ON COLUMN mst_po_all.sppl_tel IS '発注先ＴＥＬ // #MA.TEL // Supplier TEL';


COMMENT ON COLUMN mst_po_all.sppl_fax IS '発注先ＦＡＸ // #MA.TEL // Supplier FAX';


COMMENT ON COLUMN mst_po_all.po_dt IS '発注日 // #MA.DT // PO date';


COMMENT ON COLUMN mst_po_all.upd_po_print_schd_dt IS '変更注文書発行予定日 // #MA.DT // Scheduled change PO sheet issue date after change';


COMMENT ON COLUMN mst_po_all.po_print_dt IS '注文書発行日時 // #MA.TM // PO sheet issue date and time';


COMMENT ON COLUMN mst_po_all.po_print_flg IS '注文書発行済ＦＬＧ // #MA.FLG // PO sheet issued flg.';


COMMENT ON COLUMN mst_po_all.last_po_rev IS '最新発注改訂番号 // #MA.SLIP_REV // Latest PO rev. number';


COMMENT ON COLUMN mst_po_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_po_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_po_all.xrate_inpt_flg IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN mst_po_all.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mst_po_all.ptax_xrate_inpt_flg IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN mst_po_all.crct_rsn_cd IS '訂正理由ＣＤ // #MS.PO_CRCT_RSN_CD // Correction reason cd.';


COMMENT ON COLUMN mst_po_all.po_print_cd IS '注文書表示ＣＤ // #MA.PO_PRINT_CD // Display PO sheet cd.';


COMMENT ON COLUMN mst_po_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_po_all.tterm_cd1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN mst_po_all.tterm_rmrks1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN mst_po_all.tterm_cd2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN mst_po_all.tterm_rmrks2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN mst_po_all.tterm_cd3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN mst_po_all.tterm_rmrks3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN mst_po_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_po_all.edi_flg IS 'ＥＤＩ　ＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN mst_po_all.aprv_flg IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN mst_po_all.aprv_no IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN mst_po_all.aprv_sts_typ IS '承認状況区分 // #MA.APRV_STS_TYP // Approval status type';


COMMENT ON COLUMN mst_po_all.purc_if_flg IS '購買ＩＦ　ＦＬＧ // #MA.FLG // Purchasing IF flg.';


COMMENT ON COLUMN mst_po_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_po_all.ext_po_no IS '外部発注ＮＯ // #MA.EXT_PO_NO // External PO No.';


COMMENT ON COLUMN mst_po_all.dlv_slip_form_cd IS '伝票帳票ＣＤ // #MA.SLIP_FORM_CD // Slip report cd.';


COMMENT ON COLUMN mst_po_all.sgl_form_flg IS '単票ＦＬＧ // #MA.FLG // Single slip flg.';


COMMENT ON COLUMN mst_po_all.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_po_all.intr_rmrks IS '内部備考 // #MS.PO_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_po_all.po_print_rmrks IS '注文書備考 // #MS.PO_PRINT_RMRKS // PO sheet remarks';


COMMENT ON COLUMN mst_po_all.dlv_slip_rmrks IS '納品書備考 // #MA.TRD_RMRKS // Delivery note remarks';


COMMENT ON COLUMN mst_po_all.sub_char1 IS '予備１ // #MS.PO_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_po_all.sub_char2 IS '予備２ // #MS.PO_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_po_all.sub_char3 IS '予備３ // #MS.PO_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_po_all.edi_sub_char1 IS 'ＥＤＩ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI spare CHAR column 1';


COMMENT ON COLUMN mst_po_all.edi_sub_char2 IS 'ＥＤＩ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI spare CHAR column 2';


COMMENT ON COLUMN mst_po_all.edi_sub_char3 IS 'ＥＤＩ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI spare CHAR column 3';


COMMENT ON COLUMN mst_po_all.edi_sub_char4 IS 'ＥＤＩ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI spare CHAR column 4';


COMMENT ON COLUMN mst_po_all.edi_sub_char5 IS 'ＥＤＩ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI spare CHAR column 5';


COMMENT ON COLUMN mst_po_all.edi_sub_num1 IS 'ＥＤＩ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI spare NUM column 1';


COMMENT ON COLUMN mst_po_all.edi_sub_dt1 IS 'ＥＤＩ予備ＤＡＴＥ項目１ // #MA.DT // EDI spare DATE column 1';


COMMENT ON COLUMN mst_po_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_po_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_po_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_po_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_po_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_po_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_po_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_po_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_po_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_po_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


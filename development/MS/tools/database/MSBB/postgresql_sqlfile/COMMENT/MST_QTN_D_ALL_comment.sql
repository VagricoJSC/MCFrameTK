\encoding UTF-8

COMMENT ON TABLE mst_qtn_d_all IS '見積明細 // Quotation details';


COMMENT ON COLUMN mst_qtn_d_all.qtn_d_no IS '見積明細ＮＯ // #MA.QTN_D_NO // Quotation details No.';


COMMENT ON COLUMN mst_qtn_d_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_qtn_d_all.qtn_no IS '見積ＮＯ // #MA.QTN_NO // Quotation No.';


COMMENT ON COLUMN mst_qtn_d_all.qtn_rev IS '見積改訂番号 // #MA.SLIP_REV // Quotation rev. number';


COMMENT ON COLUMN mst_qtn_d_all.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_qtn_d_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_qtn_d_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_qtn_d_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_qtn_d_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_qtn_d_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_qtn_d_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_qtn_d_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_qtn_d_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_qtn_d_all.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_qtn_d_all.iv_itm_nm IS 'インボイス表記品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN mst_qtn_d_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_qtn_d_all.cntry_org_cd IS '原産地ＣＤ // #MA.CNTRY_CD // Place of origin cd.';


COMMENT ON COLUMN mst_qtn_d_all.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mst_qtn_d_all.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mst_qtn_d_all.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mst_qtn_d_all.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_qtn_d_all.dlv_sundry_flg IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_qtn_d_all.dlv_nm IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN mst_qtn_d_all.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_qtn_d_all.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_qtn_d_all.dlv_zip_cd IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN mst_qtn_d_all.dlv_addr1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN mst_qtn_d_all.dlv_addr2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN mst_qtn_d_all.dlv_addr3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN mst_qtn_d_all.dlv_addr4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN mst_qtn_d_all.dlv_tel IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN mst_qtn_d_all.dlv_fax IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN mst_qtn_d_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_qtn_d_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_qtn_d_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_qtn_d_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_qtn_d_all.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_qtn_d_all.sls_itm_no IS '販売品目ＮＯ // #MA.SLS_ITM_NO // Sales item No.';


COMMENT ON COLUMN mst_qtn_d_all.no_itm_cd_flg IS '品目ＣＤ未採番ＦＬＧ // #MA.FLG // Item cd. unnumbered flg.';


COMMENT ON COLUMN mst_qtn_d_all.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mst_qtn_d_all.upri_not_tgt_flg IS '単価再取得対象外ＦＬＧ // #MA.FLG // Not to reacquire unit price flg.';


COMMENT ON COLUMN mst_qtn_d_all.trd_cur_std_sls_upri IS '取引通貨標準販売単価 // #MA.MONEY // Standard sales unit price (Transaction currency)';


COMMENT ON COLUMN mst_qtn_d_all.trd_cur_std_sls_amt IS '取引通貨標準販売金額 // #MA.MONEY // Standard sales amount (Transaction currency)';


COMMENT ON COLUMN mst_qtn_d_all.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_qtn_d_all.upri_rate IS '仕切率 // #MA.PER // Discount rate';


COMMENT ON COLUMN mst_qtn_d_all.trd_cur_upri IS '取引通貨仕切単価 // #MA.MONEY // Discount unit price (Transaction currency)';


COMMENT ON COLUMN mst_qtn_d_all.trd_cur_amt IS '取引通貨仕切金額 // #MA.MONEY // Discount unit amount (Transaction currency)';


COMMENT ON COLUMN mst_qtn_d_all.dscnt_rsn_cd IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN mst_qtn_d_all.tax_fix_flg IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN mst_qtn_d_all.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_qtn_d_all.trd_cur_std_sls_tax_amt IS '取引通貨標準販売税額 // #MA.MONEY // Standard sales tax (Transaction currency)';


COMMENT ON COLUMN mst_qtn_d_all.trd_cur_tax_amt IS '取引通貨仕切税額 // #MA.MONEY // Discount unit tax (Transaction currency)';


COMMENT ON COLUMN mst_qtn_d_all.set_itm_grp_no IS '品揃グループＮＯ // #MA.SET_ITM_GRP_NO // Assortment group No.';


COMMENT ON COLUMN mst_qtn_d_all.cost_upri IS '原価単価 // #MA.MONEY // Unit cost';


COMMENT ON COLUMN mst_qtn_d_all.cost_amt IS '原価金額 // #MA.MONEY // Total cost';


COMMENT ON COLUMN mst_qtn_d_all.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_qtn_d_all.cst_itm_nm IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_qtn_d_all.qtn_d_rmrks IS '見積明細備考 // #MS.QTN_D_RMRKS // Quotation details remarks';


COMMENT ON COLUMN mst_qtn_d_all.intr_rmrks IS '内部備考 // #MS.QTN_D_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_qtn_d_all.qtn_d_rslt_rsn_cd IS '見積明細結果理由ＣＤ // #MS.SLO_RSN_CD // Quotation details result reason cd.';


COMMENT ON COLUMN mst_qtn_d_all.qtn_d_rslt_rsn_rmrks IS '見積明細結果理由備考 // #MS.QTN_D_RSLT_RSN_RMRKS // Quotation details result reason remarks';


COMMENT ON COLUMN mst_qtn_d_all.slo_trnst_qty IS '受注引継数量 // #MA.QTY // Sales order copy qty.';


COMMENT ON COLUMN mst_qtn_d_all.sls_trnst_qty IS '売上実績引継数量 // #MA.QTY // Sales results copy qty.';


COMMENT ON COLUMN mst_qtn_d_all.cst_qtn_rqst_d_no IS '得意先見積依頼明細ＮＯ // #MA.CST_QTN_RQST_D_NO // Customer quotation request details No.';


COMMENT ON COLUMN mst_qtn_d_all.sub_char1 IS '予備１ // #MS.QTN_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_qtn_d_all.sub_char2 IS '予備２ // #MS.QTN_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_qtn_d_all.sub_char3 IS '予備３ // #MS.QTN_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_qtn_d_all.itm_comp_seq IS '構成表連番 // #MA.SLIP_SEQ // Configuration table sequence number';


COMMENT ON COLUMN mst_qtn_d_all.itm_spec_seq IS '仕様表連番 // #MA.SLIP_SEQ // Specification table sequence number';


COMMENT ON COLUMN mst_qtn_d_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_qtn_d_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_qtn_d_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_qtn_d_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_qtn_d_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_qtn_d_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_qtn_d_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_qtn_d_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_qtn_d_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_qtn_d_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


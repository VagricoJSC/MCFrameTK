\encoding UTF-8

COMMENT ON VIEW mst_iv_d IS 'インボイス明細 // Invoice details';


COMMENT ON COLUMN mst_iv_d.iv_d_no IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN mst_iv_d.iv_mng_no IS 'インボイス管理ＮＯ // #MA.IV_MNG_NO // Invoice management No.';


COMMENT ON COLUMN mst_iv_d.iv_rev IS 'インボイス改訂番号 // #MA.SLIP_REV // Invoice rev. number';


COMMENT ON COLUMN mst_iv_d.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_iv_d.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_iv_d.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_iv_d.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_iv_d.xfr_schd_no IS '移動・移送予定ＮＯ // #MA.XFR_SCHD_NO // Movement/transport schedule No.';


COMMENT ON COLUMN mst_iv_d.cst_po_no IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN mst_iv_d.cst_po_d_no IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN mst_iv_d.bndl_flg IS 'まとめＦＬＧ // #MA.FLG // Aggregation flg.';


COMMENT ON COLUMN mst_iv_d.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_iv_d.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_iv_d.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_iv_d.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_iv_d.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_iv_d.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_iv_d.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_iv_d.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_iv_d.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_iv_d.iv_itm_nm IS 'インボイス表記用品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN mst_iv_d.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_iv_d.cst_itm_nm IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_iv_d.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_iv_d.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_iv_d.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_iv_d.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_iv_d.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_iv_d.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_iv_d.upri_not_tgt_flg IS '単価再取得対象外ＦＬＧ // #MA.FLG // Not to reacquire unit price flg.';


COMMENT ON COLUMN mst_iv_d.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mst_iv_d.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_iv_d.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_iv_d.iv_upri IS 'インボイス表記単価 // #MA.MONEY // Unit price for invoice';


COMMENT ON COLUMN mst_iv_d.iv_amt IS 'インボイス表記金額 // #MA.MONEY // Amount for invoice';


COMMENT ON COLUMN mst_iv_d.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_iv_d.tax_fix_flg IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN mst_iv_d.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_iv_d.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_iv_d.ptax_cur_amt IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN mst_iv_d.wtax_rate IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mst_iv_d.wtax_amt IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN mst_iv_d.cntry_org_cd IS '原産地ＣＤ // #MA.CNTRY_CD // Place of origin cd.';


COMMENT ON COLUMN mst_iv_d.rsn_cd IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN mst_iv_d.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_iv_d.sls_dpt_cd IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mst_iv_d.sls_usr_cd IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN mst_iv_d.dscnt_rsn_cd IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN mst_iv_d.manual_add_flg IS 'マニュアル追加ＦＬＧ // #MA.FLG // Manual addition flg.';


COMMENT ON COLUMN mst_iv_d.ar_dpt_cd IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN mst_iv_d.dlv_rqst_tm IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN mst_iv_d.purc_schd_no IS '仕入予定ＮＯ // #MA.PURC_SCHD_NO // Purchase schedule No.';


COMMENT ON COLUMN mst_iv_d.iv_d_rmrks IS 'インボイス明細備考 // #MS.IV_D_RMRKS // Invoice details remarks';


COMMENT ON COLUMN mst_iv_d.case_mrk1 IS 'ケースマーク１ // #MS.CASE_MRK // Case mark 1';


COMMENT ON COLUMN mst_iv_d.case_mrk2 IS 'ケースマーク２ // #MS.CASE_MRK // Case mark 2';


COMMENT ON COLUMN mst_iv_d.case_mrk3 IS 'ケースマーク３ // #MS.CASE_MRK // Case mark 3';


COMMENT ON COLUMN mst_iv_d.case_mrk4 IS 'ケースマーク４ // #MS.CASE_MRK // Case mark 4';


COMMENT ON COLUMN mst_iv_d.case_mrk5 IS 'ケースマーク５ // #MS.CASE_MRK // Case mark 5';


COMMENT ON COLUMN mst_iv_d.case_mrk6 IS 'ケースマーク６ // #MS.CASE_MRK // Case mark 6';


COMMENT ON COLUMN mst_iv_d.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_iv_d.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_iv_d.intr_d_rmrks IS '内部明細備考 // #MS.IV_D_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN mst_iv_d.sub_char1 IS '予備１ // #MS.IV_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_iv_d.sub_char2 IS '予備２ // #MS.IV_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_iv_d.sub_char3 IS '予備３ // #MS.IV_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_iv_d.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_iv_d.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_iv_d.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_iv_d.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_iv_d.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_iv_d.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_iv_d.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_iv_d.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_iv_d.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_iv_d.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


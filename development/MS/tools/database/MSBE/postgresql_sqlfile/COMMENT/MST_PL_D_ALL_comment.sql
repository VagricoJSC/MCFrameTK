\encoding UTF-8

COMMENT ON TABLE mst_pl_d_all IS 'パッキング明細 // Packing details';


COMMENT ON COLUMN mst_pl_d_all.pl_d_no IS 'パッキングリスト明細ＮＯ // #MA.PL_D_NO // Packing list details No.';


COMMENT ON COLUMN mst_pl_d_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_pl_d_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_pl_d_all.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_pl_d_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_pl_d_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_pl_d_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_pl_d_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_pl_d_all.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_pl_d_all.iv_itm_nm IS 'インボイス表記用品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN mst_pl_d_all.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_pl_d_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_pl_d_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_pl_d_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_pl_d_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_pl_d_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_pl_d_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_pl_d_all.cntnr_cd IS '梱包容器ＣＤ // #MA.CNTNR_CD // Packing container cd.';


COMMENT ON COLUMN mst_pl_d_all.cntnr_no_fr IS '梱包番号ＦＲ // #MS.CNTNR_NO // Container No. FR';


COMMENT ON COLUMN mst_pl_d_all.cntnr_no_to IS '梱包番号ＴＯ // #MS.CNTNR_NO // Container No. TO';


COMMENT ON COLUMN mst_pl_d_all.net_wt IS '純重量 // #MA.WT // Net weight';


COMMENT ON COLUMN mst_pl_d_all.grss_wt IS '総重量 // #MA.WT // Gross weight';


COMMENT ON COLUMN mst_pl_d_all.dim IS '容積 // #MA.DIM // Volume';


COMMENT ON COLUMN mst_pl_d_all.cntry_org_cd IS '原産地ＣＤ // #MA.CNTRY_CD // Place of origin cd.';


COMMENT ON COLUMN mst_pl_d_all.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_pl_d_all.cst_itm_nm IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_pl_d_all.cst_po_no IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN mst_pl_d_all.cst_po_d_no IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN mst_pl_d_all.pl_d_rmrks IS 'パッキングリスト明細備考 // #MS.PL_D_RMRKS // Packing list details remarks';


COMMENT ON COLUMN mst_pl_d_all.intr_d_rmrks IS '内部明細備考 // #MS.PL_D_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN mst_pl_d_all.sub_char1 IS '予備１ // #MS.PL_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_pl_d_all.sub_char2 IS '予備２ // #MS.PL_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_pl_d_all.sub_char3 IS '予備３ // #MS.PL_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_pl_d_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_pl_d_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_pl_d_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_pl_d_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_pl_d_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_pl_d_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_pl_d_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_pl_d_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_pl_d_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_pl_d_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


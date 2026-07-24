\encoding UTF-8

COMMENT ON VIEW mgt_pln_sls IS '売上計画 // Sales plan';


COMMENT ON COLUMN mgt_pln_sls.pln_sls_key IS '売上計画キー // #MG.ROW_NO // Sales plan key';


COMMENT ON COLUMN mgt_pln_sls.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_pln_sls.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_pln_sls.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_pln_sls.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_pln_sls.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_pln_sls.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_pln_sls.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_pln_sls.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_pln_sls.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_pln_sls.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_pln_sls.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_pln_sls.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_pln_sls.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_pln_sls.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_pln_sls.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgt_pln_sls.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mgt_pln_sls.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mgt_pln_sls.sls_dpt_cd IS '売上部門ＣＤ // #MA.COST_DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mgt_pln_sls.sls_usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mgt_pln_sls.alc_dpt_cd IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN mgt_pln_sls.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mgt_pln_sls.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mgt_pln_sls.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mgt_pln_sls.cost_sls_cd1 IS '売上分類１ // #MA.COST_SLS_CD // Sales classification 1';


COMMENT ON COLUMN mgt_pln_sls.cost_sls_cd2 IS '売上分類２ // #MA.COST_SLS_CD // Sales classification 2';


COMMENT ON COLUMN mgt_pln_sls.cost_sls_cd3 IS '売上分類３ // #MA.COST_SLS_CD // Sales classification 3';


COMMENT ON COLUMN mgt_pln_sls.cost_sls_cd4 IS '売上分類４ // #MA.COST_SLS_CD // Sales classification 4';


COMMENT ON COLUMN mgt_pln_sls.cost_sls_cd5 IS '売上分類５ // #MA.COST_SLS_CD // Sales classification 5';


COMMENT ON COLUMN mgt_pln_sls.unit_cd IS '単位ＣＤ // #MA.UNIT_CD // Unit cd.';


COMMENT ON COLUMN mgt_pln_sls.qty IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN mgt_pln_sls.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mgt_pln_sls.amt IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN mgt_pln_sls.rmrks IS '備考 // #MG.PLN_SLS_RMRKS // Remarks';


COMMENT ON COLUMN mgt_pln_sls.sub_char1 IS '予備１ // #MG.PLN_SLS_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_pln_sls.sub_char2 IS '予備２ // #MG.PLN_SLS_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_pln_sls.sub_char3 IS '予備３ // #MG.PLN_SLS_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_pln_sls.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_pln_sls.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_pln_sls.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_pln_sls.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_pln_sls.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_pln_sls.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_pln_sls.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_pln_sls.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_pln_sls.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_pln_sls.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


\encoding UTF-8

COMMENT ON VIEW mst_slo_itm_comp IS '受注品目構成 // Sales order item configuration';


COMMENT ON COLUMN mst_slo_itm_comp.slo_itm_comp_no IS '受注品目構成ＮＯ // #MA.SLO_ITM_COMP_NO // Sales order item configuration No.';


COMMENT ON COLUMN mst_slo_itm_comp.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_slo_itm_comp.slo_itm_comp_lno IS '受注品目構成行ＮＯ // #MA.ITM_COMP_LNO // Sales order item configuration row No.';


COMMENT ON COLUMN mst_slo_itm_comp.sls_itm_comp_no IS '販売品目構成ＮＯ // #MA.SLS_ITM_COMP_NO // Sales item configuration No.';


COMMENT ON COLUMN mst_slo_itm_comp.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_slo_itm_comp.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_slo_itm_comp.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_slo_itm_comp.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_slo_itm_comp.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_slo_itm_comp.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_slo_itm_comp.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_slo_itm_comp.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_slo_itm_comp.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_slo_itm_comp.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_slo_itm_comp.core_itm_flg IS '主品目ＦＬＧ // #MA.FLG // Main item flg.';


COMMENT ON COLUMN mst_slo_itm_comp.mst_flg IS 'マスタ参照ＦＬＧ // #MA.FLG // Master reference flg.';


COMMENT ON COLUMN mst_slo_itm_comp.std_comp_flg IS '標準構成ＦＬＧ // #MA.FLG // Standard structure flg.';


COMMENT ON COLUMN mst_slo_itm_comp.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_slo_itm_comp.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_slo_itm_comp.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_slo_itm_comp.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_slo_itm_comp.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_slo_itm_comp.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_slo_itm_comp.cost_upri IS '原価単価 // #MA.MONEY // Unit cost';


COMMENT ON COLUMN mst_slo_itm_comp.cost_amt IS '原価金額 // #MA.MONEY // Total cost';


COMMENT ON COLUMN mst_slo_itm_comp.qtn_itm_comp_no IS '見積品目構成ＮＯ // #MA.QTN_ITM_COMP_NO // Quotation item configuration No.';


COMMENT ON COLUMN mst_slo_itm_comp.rmrks IS '品目構成備考 // #MS.SLO_ITM_COMP_RMRKS // Item configuration remarks';


COMMENT ON COLUMN mst_slo_itm_comp.sub_char1 IS '予備１ // #MS.SLO_ITM_COMP_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_slo_itm_comp.sub_char2 IS '予備２ // #MS.SLO_ITM_COMP_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_slo_itm_comp.sub_char3 IS '予備３ // #MS.SLO_ITM_COMP_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_slo_itm_comp.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_slo_itm_comp.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_slo_itm_comp.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_slo_itm_comp.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_slo_itm_comp.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_slo_itm_comp.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_slo_itm_comp.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_slo_itm_comp.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_slo_itm_comp.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_slo_itm_comp.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


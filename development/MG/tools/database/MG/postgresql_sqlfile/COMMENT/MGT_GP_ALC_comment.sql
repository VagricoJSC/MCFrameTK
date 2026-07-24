\encoding UTF-8

COMMENT ON VIEW mgt_gp_alc IS '汎用配賦対象情報 // General purpose allocation info.';


COMMENT ON COLUMN mgt_gp_alc.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_gp_alc.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_gp_alc.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_gp_alc.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_gp_alc.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_gp_alc.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_gp_alc.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_gp_alc.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_gp_alc.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_gp_alc.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_gp_alc.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_gp_alc.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_gp_alc.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_gp_alc.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_gp_alc.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_gp_alc.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_gp_alc.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgt_gp_alc.alc_dpt_cd IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN mgt_gp_alc.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgt_gp_alc.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mgt_gp_alc.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mgt_gp_alc.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mgt_gp_alc.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgt_gp_alc.gp_alc_cd IS '汎用配賦分類ＣＤ // #MA.GP_ALC_CD // General purpose allocation classification cd.';


COMMENT ON COLUMN mgt_gp_alc.qty IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN mgt_gp_alc.amt IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN mgt_gp_alc.alc_val1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN mgt_gp_alc.alc_val2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN mgt_gp_alc.alc_val3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN mgt_gp_alc.alc_val4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN mgt_gp_alc.alc_val5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';


COMMENT ON COLUMN mgt_gp_alc.rmrks IS '備考 // #MG.GP_ALC_RMRKS // Remarks';


COMMENT ON COLUMN mgt_gp_alc.sub_char1 IS '予備１ // #MG.GP_ALC_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_gp_alc.sub_char2 IS '予備２ // #MG.GP_ALC_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_gp_alc.sub_char3 IS '予備３ // #MG.GP_ALC_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_gp_alc.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_gp_alc.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_gp_alc.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_gp_alc.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_gp_alc.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_gp_alc.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_gp_alc.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_gp_alc.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_gp_alc.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_gp_alc.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


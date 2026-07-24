\encoding UTF-8

COMMENT ON TABLE mgt_act_mfg_all IS '製造実績 // Mfg. result';


COMMENT ON COLUMN mgt_act_mfg_all.act_mfg_id IS '製造実績ＩＤ // #MG.ACT_MFG_ID // Mfg. result ID';


COMMENT ON COLUMN mgt_act_mfg_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_act_mfg_all.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_act_mfg_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_act_mfg_all.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_act_mfg_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mgt_act_mfg_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_act_mfg_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_act_mfg_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_act_mfg_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_act_mfg_all.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgt_act_mfg_all.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mgt_act_mfg_all.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mgt_act_mfg_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_act_mfg_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_act_mfg_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_act_mfg_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_act_mfg_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_act_mfg_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_act_mfg_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_act_mfg_all.str_ln_cd IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN mgt_act_mfg_all.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mgt_act_mfg_all.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mgt_act_mfg_all.qty IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN mgt_act_mfg_all.amt IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN mgt_act_mfg_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mgt_act_mfg_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mgt_act_mfg_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mgt_act_mfg_all.mfg_per IS '製造進捗度 // #MA.RATE // Mfg. progress';


COMMENT ON COLUMN mgt_act_mfg_all.mfg_cost_ratio IS '製造原価比率 // #MG.MFG_COST_RATIO // Mfg. cost ratio';


COMMENT ON COLUMN mgt_act_mfg_all.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgt_act_mfg_all.alc_val1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN mgt_act_mfg_all.alc_val2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN mgt_act_mfg_all.alc_val3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN mgt_act_mfg_all.alc_val4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN mgt_act_mfg_all.alc_val5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';


COMMENT ON COLUMN mgt_act_mfg_all.rmrks IS '備考 // #MG.ACT_MFG_RMRKS // Remarks';


COMMENT ON COLUMN mgt_act_mfg_all.sub_char1 IS '予備１ // #MG.ACT_MFG_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_act_mfg_all.sub_char2 IS '予備２ // #MG.ACT_MFG_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_act_mfg_all.sub_char3 IS '予備３ // #MG.ACT_MFG_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_act_mfg_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_act_mfg_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_act_mfg_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_act_mfg_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_act_mfg_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_act_mfg_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_act_mfg_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_act_mfg_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_act_mfg_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_act_mfg_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


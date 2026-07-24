\encoding UTF-8

COMMENT ON VIEW mgt_act_inpt IS '投入実績 // Input result';


COMMENT ON COLUMN mgt_act_inpt.act_inpt_id IS '投入実績ＩＤ // #MG.ACT_INPT_ID // Input result ID';


COMMENT ON COLUMN mgt_act_inpt.act_inpt_id_sub IS '投入実績ＩＤ枝番 // #MG.ACT_INPT_ID_SUB // Input result ID branch No.';


COMMENT ON COLUMN mgt_act_inpt.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_act_inpt.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_act_inpt.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_act_inpt.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mgt_act_inpt.par_itm_cd IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN mgt_act_inpt.par_itm_sub1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN mgt_act_inpt.par_itm_sub2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN mgt_act_inpt.par_itm_sub3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN mgt_act_inpt.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgt_act_inpt.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mgt_act_inpt.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mgt_act_inpt.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_act_inpt.str_ln_cd IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN mgt_act_inpt.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_act_inpt.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_act_inpt.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_act_inpt.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_act_inpt.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_act_inpt.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_act_inpt.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_act_inpt.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_act_inpt.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_act_inpt.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_act_inpt.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_act_inpt.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mgt_act_inpt.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mgt_act_inpt.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgt_act_inpt.stk_bp_cd IS '在庫先ＣＤ // #MA.BP_CD // Company holding inventory cd.';


COMMENT ON COLUMN mgt_act_inpt.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgt_act_inpt.mfg_act_grp IS '製造実績グループ // #MG.MFG_ACT_GRP // Mfg. result group';


COMMENT ON COLUMN mgt_act_inpt.qty IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN mgt_act_inpt.amt IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN mgt_act_inpt.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mgt_act_inpt.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mgt_act_inpt.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mgt_act_inpt.rec_eval_typ IS '個別評価区分 // #MG.REC_EVAL_TYP // Individual evaluation type';


COMMENT ON COLUMN mgt_act_inpt.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgt_act_inpt.eval_loop_flg IS '個別評価ループＦＬＧ // #MA.FLG // Individual evaluation loop flg.';


COMMENT ON COLUMN mgt_act_inpt.zero_effect_flg IS 'ゼロ評価ＦＬＧ // #MA.FLG // Zero evaluation flg.';


COMMENT ON COLUMN mgt_act_inpt.rmrks IS '備考 // #MG.ACT_INPT_RMRKS // Remarks';


COMMENT ON COLUMN mgt_act_inpt.sub_char1 IS '予備１ // #MG.ACT_INPT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_act_inpt.sub_char2 IS '予備２ // #MG.ACT_INPT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_act_inpt.sub_char3 IS '予備３ // #MG.ACT_INPT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_act_inpt.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_act_inpt.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_act_inpt.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_act_inpt.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_act_inpt.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_act_inpt.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_act_inpt.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_act_inpt.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_act_inpt.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_act_inpt.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


\encoding UTF-8

COMMENT ON VIEW mgt_act_alc_amt IS '配賦費用実績 // Allocable expenses result';


COMMENT ON COLUMN mgt_act_alc_amt.act_alc_amt_key IS '配賦費用実績キー // #MG.ROW_NO // Allocable expenses result key';


COMMENT ON COLUMN mgt_act_alc_amt.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_act_alc_amt.alc_rec_typ IS '費用発生区分 // #MG.ALC_REC_TYP // Expense incurred type';


COMMENT ON COLUMN mgt_act_alc_amt.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_act_alc_amt.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_act_alc_amt.alc_ac_cd IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN mgt_act_alc_amt.dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mgt_act_alc_amt.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_act_alc_amt.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_act_alc_amt.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgt_act_alc_amt.ctg_cd IS '品群ＣＤ // #MA.COST_CTG_CD // Item category cd.';


COMMENT ON COLUMN mgt_act_alc_amt.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_act_alc_amt.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_act_alc_amt.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_act_alc_amt.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_act_alc_amt.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_act_alc_amt.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_act_alc_amt.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_act_alc_amt.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_act_alc_amt.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_act_alc_amt.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_act_alc_amt.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgt_act_alc_amt.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mgt_act_alc_amt.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mgt_act_alc_amt.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mgt_act_alc_amt.amt IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN mgt_act_alc_amt.trd_wg_cd IS '振替元ワーキンググループＣＤ // #MA.WG_CD // Previous WG cd.';


COMMENT ON COLUMN mgt_act_alc_amt.trd_calc_grp_cd IS '振替元計算グループＣＤ // #MA.CALC_GRP_CD // Previous calculation group cd.';


COMMENT ON COLUMN mgt_act_alc_amt.trd_calc_no IS '振替元原価計算ＮＯ // #MA.CALC_NO // Previous calculation No.';


COMMENT ON COLUMN mgt_act_alc_amt.pre_alc_fin_flg IS '一次配賦処理済ＦＬＧ // #MA.FLG // Departmental alloc. processed flg.';


COMMENT ON COLUMN mgt_act_alc_amt.rmrks IS '備考 // #MG.ACT_ALC_AMT_RMRKS // Remarks';


COMMENT ON COLUMN mgt_act_alc_amt.sub_char1 IS '予備１ // #MG.ACT_ALC_AMT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_act_alc_amt.sub_char2 IS '予備２ // #MG.ACT_ALC_AMT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_act_alc_amt.sub_char3 IS '予備３ // #MG.ACT_ALC_AMT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_act_alc_amt.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_act_alc_amt.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_act_alc_amt.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_act_alc_amt.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_act_alc_amt.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_act_alc_amt.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_act_alc_amt.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_act_alc_amt.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_act_alc_amt.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_act_alc_amt.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


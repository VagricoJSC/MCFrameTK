\encoding UTF-8

COMMENT ON TABLE mgt_pre_alc_path_all IS '一次配賦計算過程 // Departmental alloc. calculation process';


COMMENT ON COLUMN mgt_pre_alc_path_all.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_pre_alc_path_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_pre_alc_path_all.pre_alc_seq IS '連番 // #MA.PRE_ALC_MAX_REC // Sequence number';


COMMENT ON COLUMN mgt_pre_alc_path_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_pre_alc_path_all.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_pre_alc_path_all.inpt_alc_typ IS '入力費用区分 // #MG.INPT_ALC_TYP // Input expense type';


COMMENT ON COLUMN mgt_pre_alc_path_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_pre_alc_path_all.alc_ac_cd IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN mgt_pre_alc_path_all.dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mgt_pre_alc_path_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_pre_alc_path_all.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_pre_alc_path_all.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgt_pre_alc_path_all.ctg_cd IS '品群ＣＤ // #MA.COST_CTG_CD // Item category cd.';


COMMENT ON COLUMN mgt_pre_alc_path_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_pre_alc_path_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_pre_alc_path_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_pre_alc_path_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_pre_alc_path_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_pre_alc_path_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_pre_alc_path_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_pre_alc_path_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_pre_alc_path_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_pre_alc_path_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_pre_alc_path_all.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgt_pre_alc_path_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mgt_pre_alc_path_all.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mgt_pre_alc_path_all.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mgt_pre_alc_path_all.amt IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN mgt_pre_alc_path_all.pre_alc_rate IS '配賦対象 // #MG.PRE_ALC_RATE // Allocation target';


COMMENT ON COLUMN mgt_pre_alc_path_all.pre_alc_total IS '配賦対象合計 // #MG.PRE_ALC_TOTAL // Allocation target total';


COMMENT ON COLUMN mgt_pre_alc_path_all.pre_alc_calc_rate IS '配賦率 // #MG.PRE_ALC_CALC_RATE // Allocation rate';


COMMENT ON COLUMN mgt_pre_alc_path_all.pre_alc_rate_cd IS '一次配賦基準ＣＤ // #MA.PRE_ALC_RATE_CD // Departmental alloc. basis cd.';


COMMENT ON COLUMN mgt_pre_alc_path_all.src_wg_cd IS '配賦元ワーキンググループＣＤ // #MA.WG_CD // Allocation source WG cd.';


COMMENT ON COLUMN mgt_pre_alc_path_all.src_pre_alc_seq IS '配賦元連番 // #MA.PRE_ALC_MAX_REC // Allocation source sequence number';


COMMENT ON COLUMN mgt_pre_alc_path_all.top_pre_alc_seq IS '最上位連番 // #MA.PRE_ALC_MAX_REC // Top sequence number';


COMMENT ON COLUMN mgt_pre_alc_path_all.pre_alc_lvl IS '配賦レベル // #MA.PRE_ALC_MAX_LVL // Allocation level';


COMMENT ON COLUMN mgt_pre_alc_path_all.fin_flg IS '終了ＦＬＧ // #MA.FLG // Terminate flg.';


COMMENT ON COLUMN mgt_pre_alc_path_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_pre_alc_path_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_pre_alc_path_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_pre_alc_path_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_pre_alc_path_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_pre_alc_path_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_pre_alc_path_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_pre_alc_path_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_pre_alc_path_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_pre_alc_path_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


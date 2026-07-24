\encoding UTF-8

COMMENT ON VIEW mgt_std_alc_rate IS '標準配賦率情報 // Standard allocation rate info.';


COMMENT ON COLUMN mgt_std_alc_rate.alc_ac_cd IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN mgt_std_alc_rate.dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mgt_std_alc_rate.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_std_alc_rate.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_std_alc_rate.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgt_std_alc_rate.ctg_cd IS '品群ＣＤ // #MA.COST_CTG_CD // Item category cd.';


COMMENT ON COLUMN mgt_std_alc_rate.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_std_alc_rate.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_std_alc_rate.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_std_alc_rate.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_std_alc_rate.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mgt_std_alc_rate.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_std_alc_rate.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_std_alc_rate.alc_rate IS '配賦率 // #MA.ALC_RATE // Allocation rate';


COMMENT ON COLUMN mgt_std_alc_rate.fix_flg IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN mgt_std_alc_rate.fix_alc_ptn_cd IS '確定配賦パタンＣＤ // #MA.ALC_PTN_CD // Firm allocation pattern cd.';


COMMENT ON COLUMN mgt_std_alc_rate.fix_expns_cd IS '確定費目ＣＤ // #MA.EXPNS_CD // Firm cost element cd.';


COMMENT ON COLUMN mgt_std_alc_rate.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_std_alc_rate.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_std_alc_rate.rmrks IS '備考 // #MG.STD_ALC_RATE_RMRKS // Remarks';


COMMENT ON COLUMN mgt_std_alc_rate.sub_char1 IS '予備１ // #MG.STD_ALC_RATE_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_std_alc_rate.sub_char2 IS '予備２ // #MG.STD_ALC_RATE_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_std_alc_rate.sub_char3 IS '予備３ // #MG.STD_ALC_RATE_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_std_alc_rate.non_calc_flg IS '計算対象外ＦＬＧ // #MA.FLG // Not to calculate flg.';


COMMENT ON COLUMN mgt_std_alc_rate.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_std_alc_rate.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_std_alc_rate.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_std_alc_rate.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_std_alc_rate.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_std_alc_rate.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_std_alc_rate.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_std_alc_rate.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_std_alc_rate.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_std_alc_rate.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


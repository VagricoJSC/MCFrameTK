\encoding UTF-8

COMMENT ON VIEW mst_wk_act IS '工数実績 // Man-hour result';


COMMENT ON COLUMN mst_wk_act.wk_act_no IS '工数実績ＮＯ // #MA.WK_ACT_NO // Man-hour result No.';


COMMENT ON COLUMN mst_wk_act.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mst_wk_act.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_wk_act.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mst_wk_act.wk_schd_no IS '工数予定ＮＯ // #MA.WK_SCHD_NO // Man-hour schedule No.';


COMMENT ON COLUMN mst_wk_act.div_seq IS '分割連番 // #MS.DIV_SEQ // Split sequence number';


COMMENT ON COLUMN mst_wk_act.wk_cost_cd IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN mst_wk_act.wk_cost IS '工数 // #MA.WK_COST_QTY // Man-hour';


COMMENT ON COLUMN mst_wk_act.st_tm IS '着手時刻 // #MA.TM // Start time';


COMMENT ON COLUMN mst_wk_act.end_tm IS '終了時刻 // #MA.TM // End time';


COMMENT ON COLUMN mst_wk_act.brk_pd IS '中断時間 // #MA.INT4 // Downtime';


COMMENT ON COLUMN mst_wk_act.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_wk_act.wk_rsn_cd IS '工数理由ＣＤ // #MA.WK_RSN_CD // Man-hour reason cd.';


COMMENT ON COLUMN mst_wk_act.wk_cost_calc_ctl_flg IS '自動工数計算更新許可ＦＬＧ // #MA.FLG // Auto man-hour calculation update permission flg.';


COMMENT ON COLUMN mst_wk_act.wk_day_cd IS '勤務種類ＣＤ // #MA.WK_DAY_CD // Work type cd.';


COMMENT ON COLUMN mst_wk_act.dpt_cd IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN mst_wk_act.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_wk_act.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_wk_act.wk_usr_dpt_cd IS '作業者部門ＣＤ // #MA.DPT_CD // Worker dept. cd.';


COMMENT ON COLUMN mst_wk_act.wk_usr_cd IS '作業者ＣＤ // #MA.USR_CD // Worker cd.';


COMMENT ON COLUMN mst_wk_act.fclty IS '設備 // #MA.FCLTY // Equipment';


COMMENT ON COLUMN mst_wk_act.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mst_wk_act.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_wk_act.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_wk_act.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_wk_act.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_wk_act.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_wk_act.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_wk_act.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_wk_act.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_wk_act.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_wk_act.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_wk_act.dpt_wg_cd IS '部門ワーキンググループＣＤ // #MA.WG_CD // Dept. WG cd.';


COMMENT ON COLUMN mst_wk_act.loc_wg_cd IS '場所ワーキンググループＣＤ // #MA.WG_CD // Location WG cd.';


COMMENT ON COLUMN mst_wk_act.mes_flg IS 'ＭＥＳＦＬＧ // #MA.FLG // MES flg.';


COMMENT ON COLUMN mst_wk_act.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_wk_act.ext_wk_act_no IS '外部工数実績ＮＯ // #MA.EXT_WK_ACT_NO // External man-hour result No.';


COMMENT ON COLUMN mst_wk_act.intr_rmrks IS '内部備考 // #MS.WK_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_wk_act.sub_char1 IS '予備１ // #MS.WK_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_wk_act.sub_char2 IS '予備２ // #MS.WK_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_wk_act.sub_char3 IS '予備３ // #MS.WK_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_wk_act.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_wk_act.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_wk_act.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_wk_act.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_wk_act.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_wk_act.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_wk_act.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_wk_act.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_wk_act.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_wk_act.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


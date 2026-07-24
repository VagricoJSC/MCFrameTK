\encoding UTF-8

COMMENT ON VIEW mam_act_io IS '入出庫実績振替マスタ // GR/GI result transfer master';


COMMENT ON COLUMN mam_act_io.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mam_act_io.prio IS '優先順位 // #MA.INT4 // Priority';


COMMENT ON COLUMN mam_act_io.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mam_act_io.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_act_io.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_act_io.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_act_io.itm_jnl_cd IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN mam_act_io.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mam_act_io.ac_rsn_null_flg IS '会計理由無ＦＬＧ // #MA.FLG // No accounting reason flg.';


COMMENT ON COLUMN mam_act_io.tgt_dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mam_act_io.tgt_loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mam_act_io.loc_null_flg IS '場所無ＦＬＧ // #MA.FLG // No location flg.';


COMMENT ON COLUMN mam_act_io.io_trans_typ IS '入出庫振替区分 // #MA.IO_TRANS_TYP // GR/GI transfer type';


COMMENT ON COLUMN mam_act_io.alc_ac_cd IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN mam_act_io.alc_amt_flg IS '配賦振替ＦＬＧ // #MA.FLG // Transfer allocation flg.';


COMMENT ON COLUMN mam_act_io.alc_wg_cd IS '配賦ワーキンググループＣＤ // #MA.WG_CD // Allocation WG cd.';


COMMENT ON COLUMN mam_act_io.dpt_flg IS '部門引継ＦＬＧ // #MA.FLG // Dept. copy flg.';


COMMENT ON COLUMN mam_act_io.dpt_cd IS '配賦先部門ＣＤ // #MA.COST_DPT_CD // Allocation destination dept. cd.';


COMMENT ON COLUMN mam_act_io.loc_flg IS '場所引継ＦＬＧ // #MA.FLG // Location copy flg.';


COMMENT ON COLUMN mam_act_io.loc_cd IS '配賦先場所ＣＤ // #MA.LOC_CD // Allocation destination location cd.';


COMMENT ON COLUMN mam_act_io.oper_flg IS '工程引継ＦＬＧ // #MA.FLG // Operation copy flg.';


COMMENT ON COLUMN mam_act_io.oper_cd IS '配賦先工程ＣＤ // #MA.OPER_CD // Allocation destination operation cd.';


COMMENT ON COLUMN mam_act_io.bp_flg IS '取引先引継ＦＬＧ // #MA.FLG // BP copy flg.';


COMMENT ON COLUMN mam_act_io.bp_cd IS '配賦先取引先ＣＤ // #MA.BP_CD // Allocation destination BP cd.';


COMMENT ON COLUMN mam_act_io.ctg_flg IS '品群引継ＦＬＧ // #MA.FLG // Item category copy flg.';


COMMENT ON COLUMN mam_act_io.ctg_cd IS '配賦先品群ＣＤ // #MA.COST_CTG_CD // Allocation destination item category cd.';


COMMENT ON COLUMN mam_act_io.itm_flg IS '品目引継ＦＬＧ // #MA.FLG // Item copy flg.';


COMMENT ON COLUMN mam_act_io.itm_cd IS '配賦先品目ＣＤ // #MA.ITM_CD // Allocation destination item cd.';


COMMENT ON COLUMN mam_act_io.itm_sub1 IS '配賦先枝番１ // #MA.ITM_SUB1 // Allocation destination branch No. 1';


COMMENT ON COLUMN mam_act_io.itm_sub2 IS '配賦先枝番２ // #MA.ITM_SUB2 // Allocation destination branch No. 2';


COMMENT ON COLUMN mam_act_io.itm_sub3 IS '配賦先枝番３ // #MA.ITM_SUB3 // Allocation destination branch No. 3';


COMMENT ON COLUMN mam_act_io.lot_no_flg IS 'ロットＮＯ引継ＦＬＧ // #MA.FLG // Lot No. copy flg.';


COMMENT ON COLUMN mam_act_io.lot_no IS '配賦先ロットＮＯ // #MA.LOT_NO // Allocation destination lot No.';


COMMENT ON COLUMN mam_act_io.sublot_no_flg IS 'サブロットＮＯ引継ＦＬＧ // #MA.FLG // Sublot No. copy flg.';


COMMENT ON COLUMN mam_act_io.sublot_no IS '配賦先サブロットＮＯ // #MA.SUBLOT_NO // Allocation destination sublot No.';


COMMENT ON COLUMN mam_act_io.sno1_flg IS '手配ＮＯ１引継ＦＬＧ // #MA.FLG // SEIBAN No. 1 copy flg.';


COMMENT ON COLUMN mam_act_io.sno1 IS '配賦先手配ＮＯ１ // #MA.SNO1 // Allocation destination SEIBAN No. 1';


COMMENT ON COLUMN mam_act_io.sno2_flg IS '手配ＮＯ２引継ＦＬＧ // #MA.FLG // SEIBAN No. 2 copy flg.';


COMMENT ON COLUMN mam_act_io.sno2 IS '配賦先手配ＮＯ２ // #MA.SNO2 // Allocation destination SEIBAN No. 2';


COMMENT ON COLUMN mam_act_io.sno3_flg IS '手配ＮＯ３引継ＦＬＧ // #MA.FLG // SEIBAN No. 3 copy flg.';


COMMENT ON COLUMN mam_act_io.sno3 IS '配賦先手配ＮＯ３ // #MA.SNO3 // Allocation destination SEIBAN No. 3';


COMMENT ON COLUMN mam_act_io.sno4_flg IS '手配ＮＯ４引継ＦＬＧ // #MA.FLG // SEIBAN No. 4 copy flg.';


COMMENT ON COLUMN mam_act_io.sno4 IS '配賦先手配ＮＯ４ // #MA.SNO4 // Allocation destination SEIBAN No. 4';


COMMENT ON COLUMN mam_act_io.itm_mfg_inst_no_flg IS '品目指図ＮＯ引継ＦＬＧ // #MA.FLG // Item order No. copy flg.';


COMMENT ON COLUMN mam_act_io.inpt_loc_typ1 IS '投入場所区分１ // #MA.INPT_LOC_TYP // Input location type 1';


COMMENT ON COLUMN mam_act_io.inpt_loc_typ2 IS '投入場所区分２ // #MA.INPT_LOC_TYP // Input location type 2';


COMMENT ON COLUMN mam_act_io.inpt_loc_typ3 IS '投入場所区分３ // #MA.INPT_LOC_TYP // Input location type 3';


COMMENT ON COLUMN mam_act_io.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_act_io.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_act_io.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_act_io.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_act_io.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_act_io.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_act_io.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_act_io.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_act_io.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_act_io.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_act_io.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_act_io.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_act_io.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_act_io.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_act_io.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_act_io.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_act_io.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


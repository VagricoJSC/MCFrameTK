\encoding UTF-8

COMMENT ON VIEW mam_bom IS 'ＢＯＭマスタ // BOM master';


COMMENT ON COLUMN mam_bom.bom_key IS 'ＢＯＭキー // #MA.BOM_KEY // BOM key';


COMMENT ON COLUMN mam_bom.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_bom.par_itm_cd IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN mam_bom.par_itm_sub1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN mam_bom.par_itm_sub2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN mam_bom.par_itm_sub3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN mam_bom.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mam_bom.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mam_bom.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mam_bom.chd_itm_cd IS '子品目ＣＤ // #MA.ITM_CD // Child item cd.';


COMMENT ON COLUMN mam_bom.chd_itm_sub1 IS '子枝番１ // #MA.ITM_SUB1 // Child branch No. 1';


COMMENT ON COLUMN mam_bom.chd_itm_sub2 IS '子枝番２ // #MA.ITM_SUB2 // Child branch No. 2';


COMMENT ON COLUMN mam_bom.chd_itm_sub3 IS '子枝番３ // #MA.ITM_SUB3 // Child branch No. 3';


COMMENT ON COLUMN mam_bom.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mam_bom.ph_flg IS '架空ＦＬＧ // #MA.FLG // Phantom flg.';


COMMENT ON COLUMN mam_bom.ph_bom_ptn IS '架空構成パタン // #MA.BOM_PTN // Phantom BOM pattern';


COMMENT ON COLUMN mam_bom.alt_itm_flg IS '代替品目ＦＬＧ // #MA.FLG // Alternative item flg.';


COMMENT ON COLUMN mam_bom.alt_grp_cd IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN mam_bom.alt_itm_typ IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN mam_bom.alt_itm_ratio IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN mam_bom.alt_alloc_prio IS '引当優先順 // #MA.INT // Allocation priority';


COMMENT ON COLUMN mam_bom.sno_typ1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN mam_bom.sno_typ2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN mam_bom.sno_typ3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN mam_bom.sno_typ4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN mam_bom.min_sno1 IS '下限手配ＮＯ１ // #MA.SNO1 // Min. SEIBAN No. 1';


COMMENT ON COLUMN mam_bom.max_sno1 IS '上限手配ＮＯ１ // #MA.SNO1 // Max. SEIBAN No. 1';


COMMENT ON COLUMN mam_bom.min_sno2 IS '下限手配ＮＯ２ // #MA.SNO2 // Min. SEIBAN No. 2';


COMMENT ON COLUMN mam_bom.max_sno2 IS '上限手配ＮＯ２ // #MA.SNO2 // Max. SEIBAN No. 2';


COMMENT ON COLUMN mam_bom.min_sno3 IS '下限手配ＮＯ３ // #MA.SNO3 // Min. SEIBAN No. 3';


COMMENT ON COLUMN mam_bom.max_sno3 IS '上限手配ＮＯ３ // #MA.SNO3 // Max. SEIBAN No. 3';


COMMENT ON COLUMN mam_bom.min_sno4 IS '下限手配ＮＯ４ // #MA.SNO4 // Min. SEIBAN No. 4';


COMMENT ON COLUMN mam_bom.max_sno4 IS '上限手配ＮＯ４ // #MA.SNO4 // Max. SEIBAN No. 4';


COMMENT ON COLUMN mam_bom.par_inst_qty IS '親指図数量 // #MA.QTY // Parent order qty.';


COMMENT ON COLUMN mam_bom.chd_inpt_qty IS '子投入数量 // #MA.QTY // Child input qty.';


COMMENT ON COLUMN mam_bom.chd_rqmt_qty IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN mam_bom.fxd_chd_rqmt_qty IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN mam_bom.byprod_flg IS '副産品ＦＬＧ // #MA.FLG // By-product flg.';


COMMENT ON COLUMN mam_bom.in_offst_typ IS '投入オフセット区分 // #MA.OFFST_TYP // Input offset type';


COMMENT ON COLUMN mam_bom.in_offst IS '投入オフセット // #MA.OFFST // Input offset';


COMMENT ON COLUMN mam_bom.bkf_typ IS 'バックフラッシュ区分 // #MA.BKF_TYP // Backflush type';


COMMENT ON COLUMN mam_bom.inst_lot_fix_flg IS '指図時ロット指定ＦＬＧ // #MA.FLG // Lot specification at order flg.';


COMMENT ON COLUMN mam_bom.lot_mix_flg IS 'ロット混在ＦＬＧ // #MA.FLG // Lot mixed flg.';


COMMENT ON COLUMN mam_bom.sublot_mix_flg IS 'サブロット混在ＦＬＧ // #MA.FLG // Sublot mixed flg.';


COMMENT ON COLUMN mam_bom.alloc_ctl_typ IS '引当制御区分 // #MA.ALLOC_CTL_TYP // Allocation control type';


COMMENT ON COLUMN mam_bom.main_itm_flg IS '引継対象子品目ＦＬＧ // #MA.FLG // Copy-from child item flg.';


COMMENT ON COLUMN mam_bom.yield_calc_flg IS '収率計算用ＦＬＧ // #MA.FLG // Yield calculation flg.';


COMMENT ON COLUMN mam_bom.inpt_ctl_typ IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN mam_bom.disp_seq IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN mam_bom.chng_no IS '変更ＮＯ // #MA.CHNG_NO // Change No.';


COMMENT ON COLUMN mam_bom.ext_sys_no_bom IS '外部システムＮＯ // #MA.EXT_SYS_NO_BOM // External system No.';


COMMENT ON COLUMN mam_bom.not_cost_flg IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN mam_bom.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_bom.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_bom.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_bom.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_bom.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_bom.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_bom.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_bom.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_bom.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_bom.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_bom.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_bom.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_bom.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_bom.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_bom.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_bom.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_bom.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_bom.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_bom.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


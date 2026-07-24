\encoding UTF-8

COMMENT ON VIEW mam_gp_bom IS '汎用ＢＯＭマスタ // General purpose BOM master';


COMMENT ON COLUMN mam_gp_bom.bom_typ IS 'ＢＯＭ区分 // #MA.BOM_TYP // BOM type';


COMMENT ON COLUMN mam_gp_bom.bom_key IS 'ＢＯＭキー // #MA.BOM_KEY // BOM key';


COMMENT ON COLUMN mam_gp_bom.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_gp_bom.par_itm_cd IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN mam_gp_bom.par_itm_sub1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN mam_gp_bom.par_itm_sub2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN mam_gp_bom.par_itm_sub3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN mam_gp_bom.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mam_gp_bom.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mam_gp_bom.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mam_gp_bom.chd_itm_cd IS '子品目ＣＤ // #MA.ITM_CD // Child item cd.';


COMMENT ON COLUMN mam_gp_bom.chd_itm_sub1 IS '子枝番１ // #MA.ITM_SUB1 // Child branch No. 1';


COMMENT ON COLUMN mam_gp_bom.chd_itm_sub2 IS '子枝番２ // #MA.ITM_SUB2 // Child branch No. 2';


COMMENT ON COLUMN mam_gp_bom.chd_itm_sub3 IS '子枝番３ // #MA.ITM_SUB3 // Child branch No. 3';


COMMENT ON COLUMN mam_gp_bom.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mam_gp_bom.ph_flg IS '架空ＦＬＧ // #MA.FLG // Phantom flg.';


COMMENT ON COLUMN mam_gp_bom.ph_bom_ptn IS '架空構成パタン // #MA.BOM_PTN // Phantom BOM pattern';


COMMENT ON COLUMN mam_gp_bom.alt_itm_flg IS '代替品目ＦＬＧ // #MA.FLG // Alternative item flg.';


COMMENT ON COLUMN mam_gp_bom.alt_grp_cd IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN mam_gp_bom.alt_itm_typ IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN mam_gp_bom.alt_itm_ratio IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN mam_gp_bom.alt_alloc_prio IS '引当優先順 // #MA.INT // Allocation priority';


COMMENT ON COLUMN mam_gp_bom.sno_typ1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN mam_gp_bom.sno_typ2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN mam_gp_bom.sno_typ3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN mam_gp_bom.sno_typ4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN mam_gp_bom.min_sno1 IS '下限手配ＮＯ１ // #MA.SNO1 // Min. SEIBAN No. 1';


COMMENT ON COLUMN mam_gp_bom.max_sno1 IS '上限手配ＮＯ１ // #MA.SNO1 // Max. SEIBAN No. 1';


COMMENT ON COLUMN mam_gp_bom.min_sno2 IS '下限手配ＮＯ２ // #MA.SNO2 // Min. SEIBAN No. 2';


COMMENT ON COLUMN mam_gp_bom.max_sno2 IS '上限手配ＮＯ２ // #MA.SNO2 // Max. SEIBAN No. 2';


COMMENT ON COLUMN mam_gp_bom.min_sno3 IS '下限手配ＮＯ３ // #MA.SNO3 // Min. SEIBAN No. 3';


COMMENT ON COLUMN mam_gp_bom.max_sno3 IS '上限手配ＮＯ３ // #MA.SNO3 // Max. SEIBAN No. 3';


COMMENT ON COLUMN mam_gp_bom.min_sno4 IS '下限手配ＮＯ４ // #MA.SNO4 // Min. SEIBAN No. 4';


COMMENT ON COLUMN mam_gp_bom.max_sno4 IS '上限手配ＮＯ４ // #MA.SNO4 // Max. SEIBAN No. 4';


COMMENT ON COLUMN mam_gp_bom.par_inst_qty IS '親指図数量 // #MA.QTY // Parent order qty.';


COMMENT ON COLUMN mam_gp_bom.chd_inpt_qty IS '子投入数量 // #MA.QTY // Child input qty.';


COMMENT ON COLUMN mam_gp_bom.chd_rqmt_qty IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN mam_gp_bom.fxd_chd_rqmt_qty IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN mam_gp_bom.byprod_flg IS '副産品ＦＬＧ // #MA.FLG // By-product flg.';


COMMENT ON COLUMN mam_gp_bom.in_offst_typ IS '投入オフセット区分 // #MA.OFFST_TYP // Input offset type';


COMMENT ON COLUMN mam_gp_bom.in_offst IS '投入オフセット // #MA.OFFST // Input offset';


COMMENT ON COLUMN mam_gp_bom.bkf_typ IS 'バックフラッシュ区分 // #MA.BKF_TYP // Backflush type';


COMMENT ON COLUMN mam_gp_bom.inst_lot_fix_flg IS '指図時ロット指定ＦＬＧ // #MA.FLG // Lot specification at order flg.';


COMMENT ON COLUMN mam_gp_bom.lot_mix_flg IS 'ロット混在ＦＬＧ // #MA.FLG // Lot mixed flg.';


COMMENT ON COLUMN mam_gp_bom.sublot_mix_flg IS 'サブロット混在ＦＬＧ // #MA.FLG // Sublot mixed flg.';


COMMENT ON COLUMN mam_gp_bom.alloc_ctl_typ IS '引当制御区分 // #MA.ALLOC_CTL_TYP // Allocation control type';


COMMENT ON COLUMN mam_gp_bom.main_itm_flg IS '引継対象子品目ＦＬＧ // #MA.FLG // Copy-from child item flg.';


COMMENT ON COLUMN mam_gp_bom.yield_calc_flg IS '収率計算用ＦＬＧ // #MA.FLG // Yield calculation flg.';


COMMENT ON COLUMN mam_gp_bom.inpt_ctl_typ IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN mam_gp_bom.disp_seq IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN mam_gp_bom.chng_no IS '変更ＮＯ // #MA.CHNG_NO // Change No.';


COMMENT ON COLUMN mam_gp_bom.ext_sys_no_bom IS '外部システムＮＯ // #MA.EXT_SYS_NO_BOM // External system No.';


COMMENT ON COLUMN mam_gp_bom.not_cost_flg IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN mam_gp_bom.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_gp_bom.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_gp_bom.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_gp_bom.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_gp_bom.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_gp_bom.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_gp_bom.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_gp_bom.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_gp_bom.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_gp_bom.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_gp_bom.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_gp_bom.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_gp_bom.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_gp_bom.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_gp_bom.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_gp_bom.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_gp_bom.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_gp_bom.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_gp_bom.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_gp_bom.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.BOM_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mam_gp_bom.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.BOM_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mam_gp_bom.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.BOM_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mam_gp_bom.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.BOM_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mam_gp_bom.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.BOM_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mam_gp_bom.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.BOM_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mam_gp_bom.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.BOM_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mam_gp_bom.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.BOM_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mam_gp_bom.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.BOM_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mam_gp_bom.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.BOM_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mam_gp_bom.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.BOM_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mam_gp_bom.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.BOM_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mam_gp_bom.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.BOM_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mam_gp_bom.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.BOM_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mam_gp_bom.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.BOM_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mam_gp_bom.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.BOM_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mam_gp_bom.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.BOM_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mam_gp_bom.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.BOM_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mam_gp_bom.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.BOM_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mam_gp_bom.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.BOM_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mam_gp_bom.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.BOM_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mam_gp_bom.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.BOM_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mam_gp_bom.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.BOM_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mam_gp_bom.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.BOM_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mam_gp_bom.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.BOM_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mam_gp_bom.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.BOM_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mam_gp_bom.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.BOM_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mam_gp_bom.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.BOM_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mam_gp_bom.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.BOM_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mam_gp_bom.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.BOM_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mam_gp_bom.sub_num1 IS '予備ＮＵＭ項目１ // #MA.BOM_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mam_gp_bom.sub_num2 IS '予備ＮＵＭ項目２ // #MA.BOM_SUB_NUM1 // Spare NUM column 2';


COMMENT ON COLUMN mam_gp_bom.sub_num3 IS '予備ＮＵＭ項目３ // #MA.BOM_SUB_NUM1 // Spare NUM column 3';


COMMENT ON COLUMN mam_gp_bom.sub_num4 IS '予備ＮＵＭ項目４ // #MA.BOM_SUB_NUM1 // Spare NUM column 4';


COMMENT ON COLUMN mam_gp_bom.sub_num5 IS '予備ＮＵＭ項目５ // #MA.BOM_SUB_NUM1 // Spare NUM column 5';


COMMENT ON COLUMN mam_gp_bom.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.BOM_SUB_DT1 // Spare DATE column 1';


COMMENT ON COLUMN mam_gp_bom.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.BOM_SUB_DT2 // Spare DATE column 2';


COMMENT ON COLUMN mam_gp_bom.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.BOM_SUB_DT3 // Spare DATE column 3';


COMMENT ON COLUMN mam_gp_bom.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.BOM_SUB_DT4 // Spare DATE column 4';


COMMENT ON COLUMN mam_gp_bom.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.BOM_SUB_DT5 // Spare DATE column 5';


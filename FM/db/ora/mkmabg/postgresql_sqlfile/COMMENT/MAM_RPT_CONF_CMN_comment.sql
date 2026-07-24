\encoding UTF-8

COMMENT ON TABLE mam_rpt_conf_cmn IS '原価レポート構成マスタ_（共通）_ // Cost report structure master_(Common)_';


COMMENT ON COLUMN mam_rpt_conf_cmn.rpt_ptn_cd IS 'レポートパタンＣＤ // #MA.RPT_PTN_CD // Report pattern cd.';


COMMENT ON COLUMN mam_rpt_conf_cmn.rpt_row_cd IS 'レポート行ＣＤ // #MA.RPT_ROW_CD // Report row cd.';


COMMENT ON COLUMN mam_rpt_conf_cmn.rpt_pre_word IS '接頭語 // #MA.RPT_PRE_WORD // Prefix';


COMMENT ON COLUMN mam_rpt_conf_cmn.rpt_row_nm IS 'レポート行名 // #MA.RPT_ROW_NM // Report row name';


COMMENT ON COLUMN mam_rpt_conf_cmn.rpt_seq IS '表示順 // #MA.INT3 // Display order';


COMMENT ON COLUMN mam_rpt_conf_cmn.sml_flg IS '集計行ＦＬＧ // #MA.FLG // Aggregated row flg.';


COMMENT ON COLUMN mam_rpt_conf_cmn.hdn_flg IS '非表示ＦＬＧ // #MA.FLG // Hide flg.';


COMMENT ON COLUMN mam_rpt_conf_cmn.rpt_tgt_typ IS 'レポート対象区分 // #MA.RPT_TGT_TYP // Report type';


COMMENT ON COLUMN mam_rpt_conf_cmn.cost_io_typ IS '原価入出庫区分 // #MA.COST_IO_TYP // Cost GR/GI type';


COMMENT ON COLUMN mam_rpt_conf_cmn.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mam_rpt_conf_cmn.std_flg IS '標準ＦＬＧ // #MA.FLG // Standard flg.';


COMMENT ON COLUMN mam_rpt_conf_cmn.qty_unit_typ IS '数量単位区分 // #MA.QTY_UNIT_TYP // Quantity unit type';


COMMENT ON COLUMN mam_rpt_conf_cmn.alc_ac_grp_cd1 IS '配賦科目グループ１ // #MA.ALC_AC_GRP_CD // Allocation account group 1';


COMMENT ON COLUMN mam_rpt_conf_cmn.alc_ac_grp_cd2 IS '配賦科目グループ２ // #MA.ALC_AC_GRP_CD // Allocation account group 2';


COMMENT ON COLUMN mam_rpt_conf_cmn.alc_ac_grp_cd3 IS '配賦科目グループ３ // #MA.ALC_AC_GRP_CD // Allocation account group 3';


COMMENT ON COLUMN mam_rpt_conf_cmn.alc_ac_cd IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN mam_rpt_conf_cmn.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mam_rpt_conf_cmn.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mam_rpt_conf_cmn.itm_jnl_cd IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN mam_rpt_conf_cmn.itm_grp_cd1 IS '品目分類ＣＤ１ // #MA.ITM_GRP_CD // Item classification cd. 1';


COMMENT ON COLUMN mam_rpt_conf_cmn.itm_grp_cd2 IS '品目分類ＣＤ２ // #MA.ITM_GRP_CD // Item classification cd. 2';


COMMENT ON COLUMN mam_rpt_conf_cmn.itm_grp_cd3 IS '品目分類ＣＤ３ // #MA.ITM_GRP_CD // Item classification cd. 3';


COMMENT ON COLUMN mam_rpt_conf_cmn.itm_grp_cd4 IS '品目分類ＣＤ４ // #MA.ITM_GRP_CD // Item classification cd. 4';


COMMENT ON COLUMN mam_rpt_conf_cmn.itm_grp_cd5 IS '品目分類ＣＤ５ // #MA.ITM_GRP_CD // Item classification cd. 5';


COMMENT ON COLUMN mam_rpt_conf_cmn.itm_grp_cd6 IS '品目分類ＣＤ６ // #MA.ITM_GRP_CD // Item classification cd. 6';


COMMENT ON COLUMN mam_rpt_conf_cmn.itm_grp_cd7 IS '品目分類ＣＤ７ // #MA.ITM_GRP_CD // Item classification cd. 7';


COMMENT ON COLUMN mam_rpt_conf_cmn.itm_grp_cd8 IS '品目分類ＣＤ８ // #MA.ITM_GRP_CD // Item classification cd. 8';


COMMENT ON COLUMN mam_rpt_conf_cmn.itm_grp_cd9 IS '品目分類ＣＤ９ // #MA.ITM_GRP_CD // Item classification cd. 9';


COMMENT ON COLUMN mam_rpt_conf_cmn.itm_grp_cd10 IS '品目分類ＣＤ１０ // #MA.ITM_GRP_CD // Item classification cd. 10';


COMMENT ON COLUMN mam_rpt_conf_cmn.expns_typ IS '費目区分 // #MA.EXPNS_TYP // Cost element type';


COMMENT ON COLUMN mam_rpt_conf_cmn.direct_typ IS '直間区分 // #MA.DIRECT_TYP // Direct/Indirect type';


COMMENT ON COLUMN mam_rpt_conf_cmn.var_typ IS '固変区分 // #MA.VAR_TYP // Constant/variable type';


COMMENT ON COLUMN mam_rpt_conf_cmn.expns_grp_cd IS '費目グループＣＤ // #MA.EXPNS_GRP_CD // Cost element group cd.';


COMMENT ON COLUMN mam_rpt_conf_cmn.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mam_rpt_conf_cmn.fg_r IS '前景色（Ｒ） // #MA.RGB // Foreground color (R)';


COMMENT ON COLUMN mam_rpt_conf_cmn.fg_g IS '前景色（Ｇ） // #MA.RGB // Foreground color (G)';


COMMENT ON COLUMN mam_rpt_conf_cmn.fg_b IS '前景色（Ｂ） // #MA.RGB // Foreground color (B)';


COMMENT ON COLUMN mam_rpt_conf_cmn.bg_r IS '背景色（Ｒ） // #MA.RGB // Background color (R)';


COMMENT ON COLUMN mam_rpt_conf_cmn.bg_g IS '背景色（Ｇ） // #MA.RGB // Background color (G)';


COMMENT ON COLUMN mam_rpt_conf_cmn.bg_b IS '背景色（Ｂ） // #MA.RGB // Background color (B)';


COMMENT ON COLUMN mam_rpt_conf_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_rpt_conf_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_rpt_conf_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_rpt_conf_cmn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_rpt_conf_cmn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_rpt_conf_cmn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_rpt_conf_cmn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_rpt_conf_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_rpt_conf_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_rpt_conf_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_rpt_conf_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_rpt_conf_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_rpt_conf_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_rpt_conf_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_rpt_conf_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_rpt_conf_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_rpt_conf_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


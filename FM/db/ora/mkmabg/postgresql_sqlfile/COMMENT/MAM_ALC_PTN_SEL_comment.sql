\encoding UTF-8

COMMENT ON VIEW mam_alc_ptn_sel IS '配賦パタン選択マスタ // Allocation pattern selection master';


COMMENT ON COLUMN mam_alc_ptn_sel.alc_ac_cd IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN mam_alc_ptn_sel.dpt_alc_grp IS '部門配賦グループ // #MA.DPT_ALC_GRP // Dept. allocation group';


COMMENT ON COLUMN mam_alc_ptn_sel.loc_alc_grp IS '場所配賦グループ // #MA.LOC_ALC_GRP // Location allocation group';


COMMENT ON COLUMN mam_alc_ptn_sel.oper_alc_grp IS '工程配賦グループ // #MA.OPER_ALC_GRP // Operation allocation group';


COMMENT ON COLUMN mam_alc_ptn_sel.bp_alc_grp IS '取引先配賦グループ // #MA.BP_ALC_GRP // BP allocation group';


COMMENT ON COLUMN mam_alc_ptn_sel.ctg_alc_grp IS '品群配賦グループ // #MA.CTG_ALC_GRP // Item category allocation group';


COMMENT ON COLUMN mam_alc_ptn_sel.itm_alc_grp IS '品目配賦グループ // #MA.ITM_ALC_GRP // Item allocation group';


COMMENT ON COLUMN mam_alc_ptn_sel.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mam_alc_ptn_sel.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mam_alc_ptn_sel.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_alc_ptn_sel.alc_ptn_cd IS '配賦パタンＣＤ // #MA.ALC_PTN_CD // Allocation pattern cd.';


COMMENT ON COLUMN mam_alc_ptn_sel.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mam_alc_ptn_sel.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_alc_ptn_sel.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_alc_ptn_sel.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_alc_ptn_sel.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_alc_ptn_sel.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_alc_ptn_sel.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_alc_ptn_sel.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_alc_ptn_sel.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_alc_ptn_sel.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_alc_ptn_sel.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_alc_ptn_sel.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_alc_ptn_sel.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_alc_ptn_sel.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_alc_ptn_sel.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_alc_ptn_sel.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_alc_ptn_sel.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_alc_ptn_sel.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


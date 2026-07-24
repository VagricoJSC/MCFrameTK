\encoding UTF-8

COMMENT ON TABLE mam_pre_alc_ptn_cmn IS '一次配賦パタンマスタ_（共通）_ // Departmental alloc. pattern master_(Common)_';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.pre_alc_ptn_cd IS '一次配賦パタンＣＤ // #MA.PRE_ALC_PTN_CD // Departmental alloc. pattern cd.';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.pre_alc_ptn_nm IS '一次配賦パタン名 // #MA.PRE_ALC_PTN_NM // Departmental alloc. pattern name';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.dpt_alc_typ IS '部門配賦区分 // #MA.PRE_ALC_TYP // Dept. allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.loc_alc_typ IS '場所配賦区分 // #MA.PRE_ALC_TYP // Location allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.oper_alc_typ IS '工程配賦区分 // #MA.PRE_ALC_TYP // Operation allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.bp_alc_typ IS '取引先配賦区分 // #MA.PRE_ALC_TYP // BP allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.ctg_alc_typ IS '品群配賦区分 // #MA.PRE_ALC_TYP // Item category allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.itm_alc_typ IS '品目配賦区分 // #MA.PRE_ALC_TYP // Item allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.lot_alc_typ IS 'ロットＮＯ配賦区分 // #MA.PRE_ALC_TYP // Lot No. allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.sublot_alc_typ IS 'サブロットＮＯ配賦区分 // #MA.PRE_ALC_TYP // Sublot No. allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.sno1_alc_typ IS '手配ＮＯ１配賦区分 // #MA.PRE_ALC_TYP // SEIBAN No. 1 allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.sno2_alc_typ IS '手配ＮＯ２配賦区分 // #MA.PRE_ALC_TYP // SEIBAN No. 2 allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.sno3_alc_typ IS '手配ＮＯ３配賦区分 // #MA.PRE_ALC_TYP // SEIBAN No. 3 allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.sno4_alc_typ IS '手配ＮＯ４配賦区分 // #MA.PRE_ALC_TYP // SEIBAN No. 4 allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.inst_alc_typ IS '指図配賦区分 // #MA.PRE_ALC_TYP // Order allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.iv_alc_typ IS 'インボイス配賦区分 // #MA.PRE_ALC_TYP // Invoice allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.po_alc_typ IS '発注配賦区分 // #MA.PRE_ALC_TYP // PO allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.slo_alc_typ IS '受注配賦区分 // #MA.PRE_ALC_TYP // Sales order allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.alc_ac_alc_typ IS '配賦科目配賦区分 // #MA.PRE_ALC_TYP // Allocation account allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.wg_alc_typ IS 'ワーキンググループ配賦区分 // #MA.PRE_ALC_TYP // WG allocation type';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_pre_alc_ptn_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


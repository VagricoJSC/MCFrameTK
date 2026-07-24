\encoding UTF-8

COMMENT ON VIEW mam_rsn_ac IS '会計理由科目設定マスタ // Accounting reason account setting master';


COMMENT ON COLUMN mam_rsn_ac.jnl_grp_cd IS '仕訳グループＣＤ // #MA.JNL_GRP_CD // Journal group cd.';


COMMENT ON COLUMN mam_rsn_ac.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mam_rsn_ac.ac_cd IS '勘定科目ＣＤ // #MA.AC_CD // Account cd.';


COMMENT ON COLUMN mam_rsn_ac.sub_ac_cd IS '補助勘定科目ＣＤ // #MA.SUB_AC_CD // Subsidiary account cd.';


COMMENT ON COLUMN mam_rsn_ac.bp_typ IS '取引先区分 // #MA.BP_SET_TYP // BP type';


COMMENT ON COLUMN mam_rsn_ac.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mam_rsn_ac.itm_typ IS '品目区分 // #MA.ITM_SET_TYP // Item type';


COMMENT ON COLUMN mam_rsn_ac.amt_typ IS '金額区分 // #MA.AMT_TYP // Amount type';


COMMENT ON COLUMN mam_rsn_ac.ac_tax_cd IS '会計税ＣＤ // #MA.AC_TAX_CD // Accounting tax cd.';


COMMENT ON COLUMN mam_rsn_ac.abs_typ IS '摘要区分 // #MA.ABS_TYP // Abstract type';


COMMENT ON COLUMN mam_rsn_ac.abstract2 IS '摘要 // #MA.ABSTRACT_M // Abstract';


COMMENT ON COLUMN mam_rsn_ac.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_rsn_ac.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_rsn_ac.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_rsn_ac.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_rsn_ac.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_rsn_ac.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_rsn_ac.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_rsn_ac.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_rsn_ac.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_rsn_ac.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_rsn_ac.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_rsn_ac.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_rsn_ac.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_rsn_ac.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_rsn_ac.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_rsn_ac.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_rsn_ac.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


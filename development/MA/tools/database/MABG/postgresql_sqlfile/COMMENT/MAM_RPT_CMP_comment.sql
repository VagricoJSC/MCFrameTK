\encoding UTF-8

COMMENT ON VIEW mam_rpt_cmp IS '原価レポート比較マスタ // Cost report comparison master';


COMMENT ON COLUMN mam_rpt_cmp.cmp_ptn_cd IS '比較パタンＣＤ // #MA.CMP_PTN_CD // Comparison pattern cd.';


COMMENT ON COLUMN mam_rpt_cmp.cmp_ptn_nm IS '比較パタン名 // #MA.CMP_PTN_NM // Comparison pattern name';


COMMENT ON COLUMN mam_rpt_cmp.base_cmp_ptn_nm IS '比較パタン名（ベース） // #MA.CMP_PTN_NM // Comparison pattern name(Base)';


COMMENT ON COLUMN mam_rpt_cmp.rpt_ptn_cd IS 'レポートパタンＣＤ // #MA.RPT_PTN_CD // Report pattern cd.';


COMMENT ON COLUMN mam_rpt_cmp.rpt_key_cd IS 'レポートキーＣＤ // #MA.RPT_KEY_CD // Report key cd.';


COMMENT ON COLUMN mam_rpt_cmp.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_rpt_cmp.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_rpt_cmp.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_rpt_cmp.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_rpt_cmp.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_rpt_cmp.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_rpt_cmp.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_rpt_cmp.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_rpt_cmp.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_rpt_cmp.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_rpt_cmp.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_rpt_cmp.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_rpt_cmp.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_rpt_cmp.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_rpt_cmp.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_rpt_cmp.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_rpt_cmp.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


\encoding UTF-8

COMMENT ON VIEW mam_rpt_cmp_sml IS '原価レポート比較集計マスタ // Cost report comparison aggregated master';


COMMENT ON COLUMN mam_rpt_cmp_sml.cmp_ptn_cd IS '比較パタンＣＤ // #MA.CMP_PTN_CD // Comparison pattern cd.';


COMMENT ON COLUMN mam_rpt_cmp_sml.sml_col_cd IS '集計項目ＣＤ // #MA.COL_CD // Aggregation column cd.';


COMMENT ON COLUMN mam_rpt_cmp_sml.tgt_col_cd IS '対象項目ＣＤ // #MA.COL_CD // Column cd.';


COMMENT ON COLUMN mam_rpt_cmp_sml.minus_flg IS 'マイナスＦＬＧ // #MA.FLG // Minus flg.';


COMMENT ON COLUMN mam_rpt_cmp_sml.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_rpt_cmp_sml.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_rpt_cmp_sml.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_rpt_cmp_sml.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_rpt_cmp_sml.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_rpt_cmp_sml.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_rpt_cmp_sml.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_rpt_cmp_sml.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_rpt_cmp_sml.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_rpt_cmp_sml.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_rpt_cmp_sml.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_rpt_cmp_sml.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_rpt_cmp_sml.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_rpt_cmp_sml.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_rpt_cmp_sml.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_rpt_cmp_sml.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_rpt_cmp_sml.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


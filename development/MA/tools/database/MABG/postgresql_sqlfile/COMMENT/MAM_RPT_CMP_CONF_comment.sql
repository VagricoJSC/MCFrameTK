\encoding UTF-8

COMMENT ON VIEW mam_rpt_cmp_conf IS '原価レポート比較構成マスタ // Cost report comparison structure master';


COMMENT ON COLUMN mam_rpt_cmp_conf.cmp_ptn_cd IS '比較パタンＣＤ // #MA.CMP_PTN_CD // Comparison pattern cd.';


COMMENT ON COLUMN mam_rpt_cmp_conf.col_cd IS '項目ＣＤ // #MA.COL_CD // Column cd.';


COMMENT ON COLUMN mam_rpt_cmp_conf.col_nm IS '項目名 // #MA.COL_NM // Column name';


COMMENT ON COLUMN mam_rpt_cmp_conf.base_col_nm IS '項目名（ベース） // #MA.COL_NM // Column name(Base)';


COMMENT ON COLUMN mam_rpt_cmp_conf.print_sort IS '出力順 // #MA.INT // Output sequence';


COMMENT ON COLUMN mam_rpt_cmp_conf.sml_flg IS '集計列ＦＬＧ // #MA.FLG // Aggregated column flg.';


COMMENT ON COLUMN mam_rpt_cmp_conf.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mam_rpt_cmp_conf.st_month IS '開始年月 // #MA.YM // Start month';


COMMENT ON COLUMN mam_rpt_cmp_conf.end_month IS '終了年月 // #MA.YM // End month';


COMMENT ON COLUMN mam_rpt_cmp_conf.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_rpt_cmp_conf.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_rpt_cmp_conf.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_rpt_cmp_conf.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_rpt_cmp_conf.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_rpt_cmp_conf.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_rpt_cmp_conf.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_rpt_cmp_conf.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_rpt_cmp_conf.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_rpt_cmp_conf.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_rpt_cmp_conf.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_rpt_cmp_conf.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_rpt_cmp_conf.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_rpt_cmp_conf.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_rpt_cmp_conf.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_rpt_cmp_conf.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_rpt_cmp_conf.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


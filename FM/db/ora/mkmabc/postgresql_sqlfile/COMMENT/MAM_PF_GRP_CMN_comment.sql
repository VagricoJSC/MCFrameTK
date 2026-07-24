\encoding UTF-8

COMMENT ON TABLE mam_pf_grp_cmn IS '購買内示グループマスタ_（共通）_ // Purchase forecast group Master_(Common)_';


COMMENT ON COLUMN mam_pf_grp_cmn.pf_grp_cd IS '購買内示グループＣＤ // #MA.PF_GRP_CD // Purchase forecast group cd.';


COMMENT ON COLUMN mam_pf_grp_cmn.pf_grp_nm IS '購買内示グループ名 // #MA.PF_GRP_NM // Purchase forecast group name';


COMMENT ON COLUMN mam_pf_grp_cmn.weekly_period_num IS '週次内示期間 // #MA.PF_PERIOD // Weekly forecast period';


COMMENT ON COLUMN mam_pf_grp_cmn.weekly_period_st IS '週次開始位置 // #MA.PF_PERIOD // Weekly start position';


COMMENT ON COLUMN mam_pf_grp_cmn.tendays_period_num IS '旬次内示期間 // #MA.PF_PERIOD // By 10 days forecast period';


COMMENT ON COLUMN mam_pf_grp_cmn.tendays_period_st IS '旬次開始位置 // #MA.PF_PERIOD // By 10 days starting position';


COMMENT ON COLUMN mam_pf_grp_cmn.monthly_period_num IS '月次内示期間 // #MA.PF_PERIOD // Monthly forecast period';


COMMENT ON COLUMN mam_pf_grp_cmn.monthly_period_st IS '月次開始位置 // #MA.PF_PERIOD // Monthly starting position';


COMMENT ON COLUMN mam_pf_grp_cmn.fix_period_num IS '確定期間 // #MA.PF_PERIOD // Firm period';


COMMENT ON COLUMN mam_pf_grp_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_pf_grp_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_pf_grp_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_pf_grp_cmn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_pf_grp_cmn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_pf_grp_cmn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_pf_grp_cmn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_pf_grp_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_pf_grp_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_pf_grp_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_pf_grp_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_pf_grp_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_pf_grp_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_pf_grp_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_pf_grp_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_pf_grp_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_pf_grp_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


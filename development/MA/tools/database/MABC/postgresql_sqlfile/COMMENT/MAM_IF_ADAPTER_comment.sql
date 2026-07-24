\encoding UTF-8

COMMENT ON VIEW mam_if_adapter IS 'ＩＦアダプタマスタ // IF adapter master';


COMMENT ON COLUMN mam_if_adapter.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mam_if_adapter.if_proc_typ IS 'ＩＦ処理区分 // #MA.IF_PROC_TYP // IF process type';


COMMENT ON COLUMN mam_if_adapter.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_if_adapter.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_if_adapter.conv_ope IS 'コード変換オペレーション // #MA.OPERATION // Code convert operation';


COMMENT ON COLUMN mam_if_adapter.file_io_ope IS 'ファイル入出力オペレーション // #MA.OPERATION // File I/O operations';


COMMENT ON COLUMN mam_if_adapter.web_api_ope IS 'Ｗｅｂ　ＡＰＩオペレーション // #MA.OPERATION // Web API operation';


COMMENT ON COLUMN mam_if_adapter.cmd_exec_ope IS 'コマンド実行オペレーション // #MA.OPERATION // Command execution operation';


COMMENT ON COLUMN mam_if_adapter.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_if_adapter.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_if_adapter.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_if_adapter.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_if_adapter.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_if_adapter.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_if_adapter.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_if_adapter.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_if_adapter.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_if_adapter.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_if_adapter.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_if_adapter.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_if_adapter.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_if_adapter.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_if_adapter.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_if_adapter.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_if_adapter.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


\encoding UTF-8

COMMENT ON TABLE fcm_delete_binary IS 'バイナリデータ削除対象テーブル // Binary data deletion target table';


COMMENT ON COLUMN fcm_delete_binary.table_name IS 'テーブル名 // #FC.TABLE_NAME // Table name';


COMMENT ON COLUMN fcm_delete_binary.column_name IS 'カラム名 // #FC.COLUMN_NAME // Column name';


COMMENT ON COLUMN fcm_delete_binary.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fcm_delete_binary.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fcm_delete_binary.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fcm_delete_binary.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fcm_delete_binary.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fcm_delete_binary.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fcm_delete_binary.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fcm_delete_binary.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fcm_delete_binary.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fcm_delete_binary.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';


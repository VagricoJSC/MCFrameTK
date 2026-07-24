\encoding UTF-8

COMMENT ON TABLE mbc_bulk_imp_ctl_all IS 'まとめ登録実行管理 // Batch entry execution management';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.table_id IS 'テーブルＩＤ // #MA.TABLE_ID // Table ID';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.table_nm IS 'テーブル名称 // #MA.TABLE_NM // Table name';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.table_ctg IS 'テーブルカテゴリ // #MA.TABLE_CTG // Table category';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.db_class_path IS 'DBコンテナクラスパス // #MA.CLASS_PATH // DB container class path';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.chk_ope IS 'チェックオペレーション // #MA.OPERATION // Check operation';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.upd_ope IS '登録オペレーション // #MA.OPERATION // Entry operation';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.table_seq IS 'テーブル順序 // #MA.INT3 // Table sequence';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbc_bulk_imp_ctl_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


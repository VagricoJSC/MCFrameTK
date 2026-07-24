\encoding UTF-8

COMMENT ON VIEW mat_biz_dat_dl_hst IS '業務データダウンロード実行履歴 // Business data download execution history';


COMMENT ON COLUMN mat_biz_dat_dl_hst.biz_dat_dl_hst_no IS '業務データダウンロード実行履歴ＮＯ // #MA.BIZ_DAT_DL_HST_NO // Business data download execution history No.';


COMMENT ON COLUMN mat_biz_dat_dl_hst.biz_dat_dl_sts_typ IS '業務データダウンロード実行状況区分 // #MA.BIZ_DAT_DL_STS_TYP // Business data download execution status type';


COMMENT ON COLUMN mat_biz_dat_dl_hst.proc_st_tm IS '処理開始日時 // #MA.TM // Process start date and time';


COMMENT ON COLUMN mat_biz_dat_dl_hst.proc_end_tm IS '処理終了日時 // #MA.TM // Process end date';


COMMENT ON COLUMN mat_biz_dat_dl_hst.biz_dat_id IS '業務データＩＤ // #MA.BIZ_DAT_ID // Business data ID';


COMMENT ON COLUMN mat_biz_dat_dl_hst.biz_dat_dl_cond IS '業務データダウンロード検索条件 // #MA.BIZ_DAT_DL_COND // Business data download search criteria';


COMMENT ON COLUMN mat_biz_dat_dl_hst.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mat_biz_dat_dl_hst.file_bin IS 'ファイル // #MA.BIN // File';


COMMENT ON COLUMN mat_biz_dat_dl_hst.file_size IS 'ファイル容量 // #MA.FILE_SIZE // File capacity';


COMMENT ON COLUMN mat_biz_dat_dl_hst.data_cnt IS 'データ件数 // #MA.INT // Number of data items';


COMMENT ON COLUMN mat_biz_dat_dl_hst.dl_tm IS 'ダウンロード日時 // #MA.TM // Download date and time';


COMMENT ON COLUMN mat_biz_dat_dl_hst.dl_file_path IS '出力先 // #MA.FILE_PATH // Output destination';


COMMENT ON COLUMN mat_biz_dat_dl_hst.dl_file_nm IS 'ファイル名 // #MA.FILE_NM // File name';


COMMENT ON COLUMN mat_biz_dat_dl_hst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mat_biz_dat_dl_hst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mat_biz_dat_dl_hst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mat_biz_dat_dl_hst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mat_biz_dat_dl_hst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mat_biz_dat_dl_hst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mat_biz_dat_dl_hst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mat_biz_dat_dl_hst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mat_biz_dat_dl_hst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mat_biz_dat_dl_hst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mat_biz_dat_dl_hst.biz_dat_file_typ IS 'ファイル種類区分 // #MA.BIZ_DAT_FILE_TYP // File classification type';


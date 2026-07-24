\encoding UTF-8

COMMENT ON VIEW mst_spln_usr_vers IS '入力別販売計画バージョン // Sales plan version by input';


COMMENT ON COLUMN mst_spln_usr_vers.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mst_spln_usr_vers.ym IS '計画年月 // #MA.YM // Plan month';


COMMENT ON COLUMN mst_spln_usr_vers.edited_flg IS '編集済 // #MA.FLG // Edited';


COMMENT ON COLUMN mst_spln_usr_vers.intr_rmrks IS '内部備考 // #MS.SPLN_USR_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_spln_usr_vers.sub_char1 IS '予備１ // #MS.SPLN_USR_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_spln_usr_vers.sub_char2 IS '予備２ // #MS.SPLN_USR_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_spln_usr_vers.sub_char3 IS '予備３ // #MS.SPLN_USR_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_spln_usr_vers.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_spln_usr_vers.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_spln_usr_vers.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_spln_usr_vers.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_spln_usr_vers.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_spln_usr_vers.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_spln_usr_vers.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_spln_usr_vers.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_spln_usr_vers.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_spln_usr_vers.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


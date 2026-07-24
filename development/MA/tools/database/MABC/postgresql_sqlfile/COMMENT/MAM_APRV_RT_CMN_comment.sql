\encoding UTF-8

COMMENT ON TABLE mam_aprv_rt_cmn IS '承認ルートマスタ_（共通）_ // Approval route master_(Common)_';


COMMENT ON COLUMN mam_aprv_rt_cmn.aprv_func_typ IS '承認機能区分 // #MA.APRV_FUNC_TYP // Approval function type';


COMMENT ON COLUMN mam_aprv_rt_cmn.aprv_rt_ptn IS '承認ルートパタン // #MA.APRV_RT_PTN // Approval route pattern';


COMMENT ON COLUMN mam_aprv_rt_cmn.aprv_role_cd IS '承認役割ＣＤ // #MA.APRV_ROLE_CD // Approval role cd.';


COMMENT ON COLUMN mam_aprv_rt_cmn.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_aprv_rt_cmn.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_aprv_rt_cmn.aprv_seq IS '承認順 // #MA.INT // Approval order';


COMMENT ON COLUMN mam_aprv_rt_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_aprv_rt_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_aprv_rt_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_aprv_rt_cmn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_aprv_rt_cmn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_aprv_rt_cmn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_aprv_rt_cmn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_aprv_rt_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_aprv_rt_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_aprv_rt_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_aprv_rt_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_aprv_rt_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_aprv_rt_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_aprv_rt_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_aprv_rt_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_aprv_rt_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_aprv_rt_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


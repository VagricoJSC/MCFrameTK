\encoding UTF-8

COMMENT ON VIEW mbt_aprv_d IS '承認情報明細 // Approval info. details';


COMMENT ON COLUMN mbt_aprv_d.aprv_no IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN mbt_aprv_d.aprv_no_seq IS '承認ＮＯ連番 // #MA.APRV_NO_SEQ // Approval sequence number';


COMMENT ON COLUMN mbt_aprv_d.aprv_role_cd IS '承認役割ＣＤ // #MA.APRV_ROLE_CD // Approval role cd.';


COMMENT ON COLUMN mbt_aprv_d.aprv_usr_cd IS '主担当者ＣＤ // #MA.USR_CD // Main PIC cd.';


COMMENT ON COLUMN mbt_aprv_d.aprv_seq IS '承認順序 // #MA.INT // Approved sequence';


COMMENT ON COLUMN mbt_aprv_d.aprv_d_sts_typ IS '承認明細状況区分 // #MA.APRV_D_STS_TYP // Approval details status type';


COMMENT ON COLUMN mbt_aprv_d.aprv_d_tm IS '承認日時 // #MA.TM // Approval date and time';


COMMENT ON COLUMN mbt_aprv_d.deputy_flg IS '代理承認ＦＬＧ // #MA.FLG // Alternate approval flg.';


COMMENT ON COLUMN mbt_aprv_d.deputy_usr_cd IS '代理承認者ＣＤ // #MA.USR_CD // Alternate approver cd.';


COMMENT ON COLUMN mbt_aprv_d.aprv_d_rmrks IS '承認明細備考 // #MA.APRV_D_RMRKS // Approval details remarks';


COMMENT ON COLUMN mbt_aprv_d.not_upd_flg IS '更新不可ＦＬＧ // #MA.FLG // Non-updatable flg.';


COMMENT ON COLUMN mbt_aprv_d.sub_char1 IS '予備１ // #MA.APRV_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mbt_aprv_d.sub_char2 IS '予備２ // #MA.APRV_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mbt_aprv_d.sub_char3 IS '予備３ // #MA.APRV_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mbt_aprv_d.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbt_aprv_d.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbt_aprv_d.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbt_aprv_d.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_aprv_d.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbt_aprv_d.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbt_aprv_d.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbt_aprv_d.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbt_aprv_d.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_aprv_d.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


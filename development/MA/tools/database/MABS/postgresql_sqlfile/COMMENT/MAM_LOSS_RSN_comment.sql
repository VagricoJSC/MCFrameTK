\encoding UTF-8

COMMENT ON VIEW mam_loss_rsn IS 'ロス理由マスタ // Loss reason master';


COMMENT ON COLUMN mam_loss_rsn.itm_typ IS '品目区分 // #MA.ITM_TYP // Item type';


COMMENT ON COLUMN mam_loss_rsn.itm_typ_d_cd IS '品目区分詳細ＣＤ // #MA.ITM_TYP_D_CD // Item type details cd.';


COMMENT ON COLUMN mam_loss_rsn.loss_rsn_cd IS 'ロス理由ＣＤ // #MA.BIZ_RSN_CD // Loss reason cd.';


COMMENT ON COLUMN mam_loss_rsn.def_disp_flg IS '初期表示ＦＬＧ // #MA.FLG // Initial display flg.';


COMMENT ON COLUMN mam_loss_rsn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_loss_rsn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_loss_rsn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_loss_rsn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_loss_rsn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_loss_rsn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_loss_rsn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_loss_rsn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_loss_rsn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_loss_rsn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_loss_rsn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_loss_rsn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_loss_rsn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_loss_rsn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_loss_rsn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_loss_rsn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_loss_rsn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


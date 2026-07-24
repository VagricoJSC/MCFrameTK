\encoding UTF-8

COMMENT ON VIEW mam_trd IS '取引マスタ // Transaction master';


COMMENT ON COLUMN mam_trd.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mam_trd.trd_nm IS '取引名 // #MA.TRD_NM // Transaction name';


COMMENT ON COLUMN mam_trd.base_trd_nm IS '取引名（ベース） // #MA.TRD_NM // Transaction name(Base)';


COMMENT ON COLUMN mam_trd.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mam_trd.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mam_trd.slip_each_lot_typ IS 'ロット明細分割区分 // #MA.SLIP_EACH_LOT_TYP // Lot details split type';


COMMENT ON COLUMN mam_trd.slip_form_cd IS '伝票帳票ＣＤ // #MA.SLIP_FORM_CD // Slip report cd.';


COMMENT ON COLUMN mam_trd.auto_adopt_flg IS '自動時採用ＦＬＧ // #MA.FLG // Adopt at auto flg.';


COMMENT ON COLUMN mam_trd.not_sls_slip_snd_flg IS '売上伝票送信対象外ＦＬＧ // #MA.FLG // Sales slip not to be exported flg.';


COMMENT ON COLUMN mam_trd.not_purc_slip_snd_flg IS '仕入伝票送信対象外ＦＬＧ // #MA.FLG // Purchase slip not to be exported flg.';


COMMENT ON COLUMN mam_trd.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_trd.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_trd.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_trd.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_trd.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_trd.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_trd.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_trd.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_trd.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_trd.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_trd.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_trd.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_trd.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_trd.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_trd.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_trd.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_trd.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


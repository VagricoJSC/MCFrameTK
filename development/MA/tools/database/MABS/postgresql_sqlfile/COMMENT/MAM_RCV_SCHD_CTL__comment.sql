\encoding UTF-8

COMMENT ON VIEW mam_rcv_schd_ctl_ IS '入金予定制御マスタ（マスタ画面用） // Payment receipt schedule control master';


COMMENT ON COLUMN mam_rcv_schd_ctl_.bcst_cd IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN mam_rcv_schd_ctl_.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mam_rcv_schd_ctl_.min_amt IS '下限金額 // #MA.MONEY // Min. amount';


COMMENT ON COLUMN mam_rcv_schd_ctl_.sttl_cd IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN mam_rcv_schd_ctl_.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_rcv_schd_ctl_.rate IS '比率 // #MA.MONEY // Ratio';


COMMENT ON COLUMN mam_rcv_schd_ctl_.crryovr_mons_typ IS 'サイト区分 // #MA.CRRYOVR_MONS_TYP // Site type';


COMMENT ON COLUMN mam_rcv_schd_ctl_.rcv_day1 IS '入金予定日１ // #MA.RCV_DAY // Scheduled payment receipt date 1';


COMMENT ON COLUMN mam_rcv_schd_ctl_.rcv_day2 IS '入金予定日２ // #MA.RCV_DAY // Scheduled payment receipt date 2';


COMMENT ON COLUMN mam_rcv_schd_ctl_.rcv_day3 IS '入金予定日３ // #MA.RCV_DAY // Scheduled payment receipt date 3';


COMMENT ON COLUMN mam_rcv_schd_ctl_.rcv_day4 IS '入金予定日４ // #MA.RCV_DAY // Scheduled payment receipt date 4';


COMMENT ON COLUMN mam_rcv_schd_ctl_.rcv_day5 IS '入金予定日５ // #MA.RCV_DAY // Scheduled payment receipt date 5';


COMMENT ON COLUMN mam_rcv_schd_ctl_.rcv_crryovr_mons1 IS '入金サイト１ // #MA.CRRYOVR_MONS // Account receivable turnover period 1';


COMMENT ON COLUMN mam_rcv_schd_ctl_.rcv_crryovr_mons2 IS '入金サイト２ // #MA.CRRYOVR_MONS // Account receivable turnover period 2';


COMMENT ON COLUMN mam_rcv_schd_ctl_.rcv_crryovr_mons3 IS '入金サイト３ // #MA.CRRYOVR_MONS // Account receivable turnover period 3';


COMMENT ON COLUMN mam_rcv_schd_ctl_.rcv_crryovr_mons4 IS '入金サイト４ // #MA.CRRYOVR_MONS // Account receivable turnover period 4';


COMMENT ON COLUMN mam_rcv_schd_ctl_.rcv_crryovr_mons5 IS '入金サイト５ // #MA.CRRYOVR_MONS // Account receivable turnover period 5';


COMMENT ON COLUMN mam_rcv_schd_ctl_.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_rcv_schd_ctl_.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_rcv_schd_ctl_.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_rcv_schd_ctl_.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_rcv_schd_ctl_.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_rcv_schd_ctl_.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_rcv_schd_ctl_.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_rcv_schd_ctl_.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_rcv_schd_ctl_.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_rcv_schd_ctl_.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_rcv_schd_ctl_.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_rcv_schd_ctl_.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_rcv_schd_ctl_.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_rcv_schd_ctl_.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_rcv_schd_ctl_.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_rcv_schd_ctl_.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_rcv_schd_ctl_.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


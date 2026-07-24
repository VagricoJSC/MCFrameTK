\encoding UTF-8

COMMENT ON TABLE mam_pay_schd_ctl_all IS '支払予定制御マスタ // Payment schedule control master';


COMMENT ON COLUMN mam_pay_schd_ctl_all.bsppl_cd IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN mam_pay_schd_ctl_all.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mam_pay_schd_ctl_all.min_amt IS '下限金額 // #MA.MONEY // Min. amount';


COMMENT ON COLUMN mam_pay_schd_ctl_all.sttl_cd IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN mam_pay_schd_ctl_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_pay_schd_ctl_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mam_pay_schd_ctl_all.rate IS '比率 // #MA.MONEY // Ratio';


COMMENT ON COLUMN mam_pay_schd_ctl_all.crryovr_mons_typ IS 'サイト区分 // #MA.CRRYOVR_MONS_TYP // Site type';


COMMENT ON COLUMN mam_pay_schd_ctl_all.pay_day1 IS '支払予定日１ // #MA.PAY_DAY // Scheduled payment date 1';


COMMENT ON COLUMN mam_pay_schd_ctl_all.pay_day2 IS '支払予定日２ // #MA.PAY_DAY // Scheduled payment date 2';


COMMENT ON COLUMN mam_pay_schd_ctl_all.pay_day3 IS '支払予定日３ // #MA.PAY_DAY // Scheduled payment date 3';


COMMENT ON COLUMN mam_pay_schd_ctl_all.pay_day4 IS '支払予定日４ // #MA.PAY_DAY // Scheduled payment date 4';


COMMENT ON COLUMN mam_pay_schd_ctl_all.pay_day5 IS '支払予定日５ // #MA.PAY_DAY // Scheduled payment date 5';


COMMENT ON COLUMN mam_pay_schd_ctl_all.pay_crryovr_mons1 IS '支払サイト１ // #MA.CRRYOVR_MONS // Account payable turnover period 1';


COMMENT ON COLUMN mam_pay_schd_ctl_all.pay_crryovr_mons2 IS '支払サイト２ // #MA.CRRYOVR_MONS // Account payable turnover period 2';


COMMENT ON COLUMN mam_pay_schd_ctl_all.pay_crryovr_mons3 IS '支払サイト３ // #MA.CRRYOVR_MONS // Account payable turnover period 3';


COMMENT ON COLUMN mam_pay_schd_ctl_all.pay_crryovr_mons4 IS '支払サイト４ // #MA.CRRYOVR_MONS // Account payable turnover period 4';


COMMENT ON COLUMN mam_pay_schd_ctl_all.pay_crryovr_mons5 IS '支払サイト５ // #MA.CRRYOVR_MONS // Account payable turnover period 5';


COMMENT ON COLUMN mam_pay_schd_ctl_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_pay_schd_ctl_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_pay_schd_ctl_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_pay_schd_ctl_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_pay_schd_ctl_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_pay_schd_ctl_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_pay_schd_ctl_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_pay_schd_ctl_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_pay_schd_ctl_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_pay_schd_ctl_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_pay_schd_ctl_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_pay_schd_ctl_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_pay_schd_ctl_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_pay_schd_ctl_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_pay_schd_ctl_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_pay_schd_ctl_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_pay_schd_ctl_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


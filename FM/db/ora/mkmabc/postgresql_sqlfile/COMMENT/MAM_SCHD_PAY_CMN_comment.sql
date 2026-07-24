\encoding UTF-8

COMMENT ON TABLE mam_schd_pay_cmn IS '支払依頼科目マスタ_（共通）_ // Payment request account master_(Common)_';


COMMENT ON COLUMN mam_schd_pay_cmn.pay_ap_typ IS '支払債務区分 // #MA.PAY_AP_TYP // Payment obligation type';


COMMENT ON COLUMN mam_schd_pay_cmn.seq IS '連番 // #MA.INT4 // Sequence number';


COMMENT ON COLUMN mam_schd_pay_cmn.prio IS '優先順 // #MA.INT // Priority';


COMMENT ON COLUMN mam_schd_pay_cmn.cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mam_schd_pay_cmn.foreign_typ IS '国外取引区分 // #MA.FOREIGN_TYP // Foreign transaction type';


COMMENT ON COLUMN mam_schd_pay_cmn.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mam_schd_pay_cmn.dpt_id_flg IS '部門ＩＤ取得ＦＬＧ // #MA.FLG // Dept. ID acquisition flg.';


COMMENT ON COLUMN mam_schd_pay_cmn.slip_cnt_id IS '伝票グループＩＤ // #MA.SLIP_CNT_ID // Slip group ID';


COMMENT ON COLUMN mam_schd_pay_cmn.ac_cd IS '勘定科目ＣＤ // #MA.AC_CD // Account cd.';


COMMENT ON COLUMN mam_schd_pay_cmn.sub_ac_cd IS '補助勘定科目ＣＤ // #MA.SUB_AC_CD // Subsidiary account cd.';


COMMENT ON COLUMN mam_schd_pay_cmn.abs_typ IS '摘要区分 // #MA.ABS_TYP // Abstract type';


COMMENT ON COLUMN mam_schd_pay_cmn.abstract1 IS '摘要 // #MA.ABSTRACT_M // Abstract';


COMMENT ON COLUMN mam_schd_pay_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_schd_pay_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_schd_pay_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_schd_pay_cmn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_schd_pay_cmn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_schd_pay_cmn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_schd_pay_cmn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_schd_pay_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_schd_pay_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_schd_pay_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_schd_pay_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_schd_pay_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_schd_pay_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_schd_pay_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_schd_pay_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_schd_pay_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_schd_pay_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


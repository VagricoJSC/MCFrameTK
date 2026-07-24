\encoding UTF-8

COMMENT ON TABLE mam_dpt_cmn IS '部門マスタ_（共通）_ // Dept. master_(Common)_';


COMMENT ON COLUMN mam_dpt_cmn.dpt_cd IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN mam_dpt_cmn.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_dpt_cmn.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_dpt_cmn.dpt_nm IS '部門名 // #MA.DPT_NM // Dept. name';


COMMENT ON COLUMN mam_dpt_cmn.dpt_lvl_cd IS '部門階層ＣＤ // #MA.DPT_LVL_CD // Dept. hierarchy cd.';


COMMENT ON COLUMN mam_dpt_cmn.up_lv_dpt_cd IS '上位部門ＣＤ // #MA.DPT_CD // Upper dept. cd.';


COMMENT ON COLUMN mam_dpt_cmn.ac_dpt_cd IS '会計部門ＣＤ // #MA.AC_DPT_CD // Accounting dept. cd.';


COMMENT ON COLUMN mam_dpt_cmn.cost_dpt_cd IS '原価部門ＣＤ // #MA.COST_DPT_CD // Cost dept. cd.';


COMMENT ON COLUMN mam_dpt_cmn.new_dpt_cd IS '新部門ＣＤ // #MA.DPT_CD // New dept. cd.';


COMMENT ON COLUMN mam_dpt_cmn.zip_cd IS '郵便番号 // #MA.ZIP_CD // Zip code';


COMMENT ON COLUMN mam_dpt_cmn.addr1 IS '住所１ // #MA.ADDR1 // Address 1';


COMMENT ON COLUMN mam_dpt_cmn.addr2 IS '住所２ // #MA.ADDR2 // Address 2';


COMMENT ON COLUMN mam_dpt_cmn.addr3 IS '住所３ // #MA.ADDR3 // Address 3';


COMMENT ON COLUMN mam_dpt_cmn.addr4 IS '住所４ // #MA.ADDR4 // Address 4';


COMMENT ON COLUMN mam_dpt_cmn.tel IS 'ＴＥＬ // #MA.TEL // TEL';


COMMENT ON COLUMN mam_dpt_cmn.fax IS 'ＦＡＸ // #MA.TEL // FAX';


COMMENT ON COLUMN mam_dpt_cmn.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_dpt_cmn.rcv_bank_ac_cd IS '入金口座ＣＤ // #MA.BANK_AC_CD // Payment received bank account cd.';


COMMENT ON COLUMN mam_dpt_cmn.pay_bank_ac_cd IS '支払口座ＣＤ // #MA.BANK_AC_CD // Payment account cd.';


COMMENT ON COLUMN mam_dpt_cmn.cal_cd IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN mam_dpt_cmn.asst_dpt_flg IS '資産管理部門ＦＬＧ // #MA.FLG // Asset management dept. flg.';


COMMENT ON COLUMN mam_dpt_cmn.ar_dpt_flg IS '債権部門ＦＬＧ // #MA.FLG // AR dept. flg.';


COMMENT ON COLUMN mam_dpt_cmn.ap_dpt_flg IS '債務部門ＦＬＧ // #MA.FLG // AP dept. flg.';


COMMENT ON COLUMN mam_dpt_cmn.sls_dpt_flg IS '営業部門ＦＬＧ // #MA.FLG // Sales dept. flg.';


COMMENT ON COLUMN mam_dpt_cmn.purc_dpt_flg IS '購買部門ＦＬＧ // #MA.FLG // Purchasing dept. flg.';


COMMENT ON COLUMN mam_dpt_cmn.ship_dpt_flg IS '出荷部門ＦＬＧ // #MA.FLG // Shipping dept. flg.';


COMMENT ON COLUMN mam_dpt_cmn.arr_dpt_flg IS '入荷部門ＦＬＧ // #MA.FLG // Receipt dept. flg.';


COMMENT ON COLUMN mam_dpt_cmn.mfg_dpt_flg IS '製造部門ＦＬＧ // #MA.FLG // Mfg. dept. flg.';


COMMENT ON COLUMN mam_dpt_cmn.sd_dpt_flg IS '需給部門ＦＬＧ // #MA.FLG // Demand and supply dept. flg.';


COMMENT ON COLUMN mam_dpt_cmn.insp_dpt_flg IS '検査部門ＦＬＧ // #MA.FLG // Inspection dept. flg.';


COMMENT ON COLUMN mam_dpt_cmn.bd_dpt_flg IS '負担部門ＦＬＧ // #MA.FLG // Charged dept. flg.';


COMMENT ON COLUMN mam_dpt_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_dpt_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_dpt_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_dpt_cmn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_dpt_cmn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_dpt_cmn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_dpt_cmn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_dpt_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_dpt_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_dpt_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_dpt_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_dpt_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_dpt_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_dpt_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_dpt_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_dpt_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_dpt_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


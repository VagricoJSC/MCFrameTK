\encoding UTF-8

COMMENT ON VIEW mavm_dpt_mst IS '部門マスタビュー // Dept. master view';


COMMENT ON COLUMN mavm_dpt_mst.dpt_cd IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN mavm_dpt_mst.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mavm_dpt_mst.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mavm_dpt_mst.dpt_nm IS '部門名 // #MA.DPT_NM // Dept. name';


COMMENT ON COLUMN mavm_dpt_mst.dpt_lvl_cd IS '部門階層ＣＤ // #MA.DPT_LVL_CD // Dept. hierarchy cd.';


COMMENT ON COLUMN mavm_dpt_mst.up_lv_dpt_cd IS '上位部門ＣＤ // #MA.DPT_CD // Upper dept. cd.';


COMMENT ON COLUMN mavm_dpt_mst.ac_dpt_cd IS '会計部門ＣＤ // #MA.AC_DPT_CD // Accounting dept. cd.';


COMMENT ON COLUMN mavm_dpt_mst.cost_dpt_cd IS '原価部門ＣＤ // #MA.COST_DPT_CD // Cost dept. cd.';


COMMENT ON COLUMN mavm_dpt_mst.new_dpt_cd IS '新部門ＣＤ // #MA.DPT_CD // New dept. cd.';


COMMENT ON COLUMN mavm_dpt_mst.zip_cd IS '郵便番号 // #MA.ZIP_CD // Zip code';


COMMENT ON COLUMN mavm_dpt_mst.addr1 IS '住所１ // #MA.ADDR1 // Address 1';


COMMENT ON COLUMN mavm_dpt_mst.addr2 IS '住所２ // #MA.ADDR2 // Address 2';


COMMENT ON COLUMN mavm_dpt_mst.addr3 IS '住所３ // #MA.ADDR3 // Address 3';


COMMENT ON COLUMN mavm_dpt_mst.addr4 IS '住所４ // #MA.ADDR4 // Address 4';


COMMENT ON COLUMN mavm_dpt_mst.tel IS 'ＴＥＬ // #MA.TEL // TEL';


COMMENT ON COLUMN mavm_dpt_mst.fax IS 'ＦＡＸ // #MA.TEL // FAX';


COMMENT ON COLUMN mavm_dpt_mst.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mavm_dpt_mst.rcv_bank_ac_cd IS '入金口座ＣＤ // #MA.BANK_AC_CD // Payment received bank account cd.';


COMMENT ON COLUMN mavm_dpt_mst.pay_bank_ac_cd IS '支払口座ＣＤ // #MA.BANK_AC_CD // Payment account cd.';


COMMENT ON COLUMN mavm_dpt_mst.cal_cd IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN mavm_dpt_mst.asst_dpt_flg IS '資産管理部門ＦＬＧ // #MA.FLG // Asset management dept. flg.';


COMMENT ON COLUMN mavm_dpt_mst.ar_dpt_flg IS '債権部門ＦＬＧ // #MA.FLG // AR dept. flg.';


COMMENT ON COLUMN mavm_dpt_mst.ap_dpt_flg IS '債務部門ＦＬＧ // #MA.FLG // AP dept. flg.';


COMMENT ON COLUMN mavm_dpt_mst.sls_dpt_flg IS '営業部門ＦＬＧ // #MA.FLG // Sales dept. flg.';


COMMENT ON COLUMN mavm_dpt_mst.purc_dpt_flg IS '購買部門ＦＬＧ // #MA.FLG // Purchasing dept. flg.';


COMMENT ON COLUMN mavm_dpt_mst.ship_dpt_flg IS '出荷部門ＦＬＧ // #MA.FLG // Shipping dept. flg.';


COMMENT ON COLUMN mavm_dpt_mst.arr_dpt_flg IS '入荷部門ＦＬＧ // #MA.FLG // Receipt dept. flg.';


COMMENT ON COLUMN mavm_dpt_mst.mfg_dpt_flg IS '製造部門ＦＬＧ // #MA.FLG // Mfg. dept. flg.';


COMMENT ON COLUMN mavm_dpt_mst.sd_dpt_flg IS '需給部門ＦＬＧ // #MA.FLG // Demand and supply dept. flg.';


COMMENT ON COLUMN mavm_dpt_mst.insp_dpt_flg IS '検査部門ＦＬＧ // #MA.FLG // Inspection dept. flg.';


COMMENT ON COLUMN mavm_dpt_mst.bd_dpt_flg IS '負担部門ＦＬＧ // #MA.FLG // Charged dept. flg.';


COMMENT ON COLUMN mavm_dpt_mst.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_dpt_mst.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_dpt_mst.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mavm_dpt_mst.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mavm_dpt_mst.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mavm_dpt_mst.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mavm_dpt_mst.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mavm_dpt_mst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mavm_dpt_mst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mavm_dpt_mst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mavm_dpt_mst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mavm_dpt_mst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mavm_dpt_mst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mavm_dpt_mst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mavm_dpt_mst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mavm_dpt_mst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mavm_dpt_mst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mavm_dpt_mst.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_dpt_mst.dpt_nm_lcl1 IS '部門名（ロケール１） // #MA.DPT_NM // Dept. name';


COMMENT ON COLUMN mavm_dpt_mst.dpt_nm_lcl2 IS '部門名（ロケール２） // #MA.DPT_NM // Dept. name';


COMMENT ON COLUMN mavm_dpt_mst.dpt_nm_lcl3 IS '部門名（ロケール３） // #MA.DPT_NM // Dept. name';


COMMENT ON COLUMN mavm_dpt_mst.dpt_nm_lcl4 IS '部門名（ロケール４） // #MA.DPT_NM // Dept. name';


COMMENT ON COLUMN mavm_dpt_mst.dpt_nm_lcl5 IS '部門名（ロケール５） // #MA.DPT_NM // Dept. name';


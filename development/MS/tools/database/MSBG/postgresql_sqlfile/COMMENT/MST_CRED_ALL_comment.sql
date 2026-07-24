\encoding UTF-8

COMMENT ON TABLE mst_cred_all IS '与信 // Credit';


COMMENT ON COLUMN mst_cred_all.cred_cd IS '与信管理先ＣＤ // #MA.BP_CD // Credit managed BP cd.';


COMMENT ON COLUMN mst_cred_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_cred_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_cred_all.cred_amt IS '与信対象額 // #MA.MONEY // Credit target amount';


COMMENT ON COLUMN mst_cred_all.ap_cred_amt IS '買掛与信対象額 // #MA.MONEY // AP credit amount';


COMMENT ON COLUMN mst_cred_all.ar_cred_amt IS '売掛与信対象額 // #MA.MONEY // AR credit amount';


COMMENT ON COLUMN mst_cred_all.sub_char1 IS '予備１ // #MS.CRED_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_cred_all.sub_char2 IS '予備２ // #MS.CRED_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_cred_all.sub_char3 IS '予備３ // #MS.CRED_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_cred_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_cred_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_cred_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_cred_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_cred_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_cred_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_cred_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_cred_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_cred_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_cred_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


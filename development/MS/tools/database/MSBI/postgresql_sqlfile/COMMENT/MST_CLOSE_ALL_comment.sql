\encoding UTF-8

COMMENT ON TABLE mst_close_all IS '締処理情報 // Closing info.';


COMMENT ON COLUMN mst_close_all.ym IS '年月度 // #MA.DT // Fiscal month';


COMMENT ON COLUMN mst_close_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_close_all.sls_cl_flg IS '売上締ＦＬＧ // #MA.FLG // Sales closing flg.';


COMMENT ON COLUMN mst_close_all.rcv_cl_flg IS '入金締ＦＬＧ // #MA.FLG // Payment received closing flg.';


COMMENT ON COLUMN mst_close_all.purc_cl_flg IS '仕入締ＦＬＧ // #MA.FLG // Purchase closing flg.';


COMMENT ON COLUMN mst_close_all.pay_cl_flg IS '支払締ＦＬＧ // #MA.FLG // Payment closing flg.';


COMMENT ON COLUMN mst_close_all.stk_cl_flg IS '在庫締ＦＬＧ // #MA.FLG // Inventory closing flg.';


COMMENT ON COLUMN mst_close_all.sls_cl_tm IS '売上締実行日時 // #MA.TM // Sales closing execution date and time';


COMMENT ON COLUMN mst_close_all.rcv_cl_tm IS '入金締実行日時 // #MA.TM // Payment received closing execution date and time';


COMMENT ON COLUMN mst_close_all.purc_cl_tm IS '仕入締実行日時 // #MA.TM // Purchase closing execution date and time';


COMMENT ON COLUMN mst_close_all.pay_cl_tm IS '支払締実行日時 // #MA.TM // Payment closing execution date and time';


COMMENT ON COLUMN mst_close_all.stk_cl_tm IS '在庫締実行日時 // #MA.TM // Inventory closing execution date and time';


COMMENT ON COLUMN mst_close_all.ar_pre_cl_tm IS '売掛最終仮締実行日時 // #MA.TM // AR final temporary closing execution date and time';


COMMENT ON COLUMN mst_close_all.ap_pre_cl_tm IS '買掛最終仮締実行日時 // #MA.TM // AP final temporary closing execution date and time';


COMMENT ON COLUMN mst_close_all.sls_cl_usr_cd IS '売上締担当者ＣＤ // #MA.USR_CD // Sales closing PIC cd.';


COMMENT ON COLUMN mst_close_all.rcv_cl_usr_cd IS '入金締担当者ＣＤ // #MA.USR_CD // Payment received closing PIC cd.';


COMMENT ON COLUMN mst_close_all.purc_cl_usr_cd IS '仕入締担当者ＣＤ // #MA.USR_CD // Purchase closing PIC cd.';


COMMENT ON COLUMN mst_close_all.pay_cl_usr_cd IS '支払締担当者ＣＤ // #MA.USR_CD // Payment closing PIC cd.';


COMMENT ON COLUMN mst_close_all.stk_cl_usr_cd IS '在庫締担当者ＣＤ // #MA.USR_CD // Inventory closing PIC cd.';


COMMENT ON COLUMN mst_close_all.ar_pre_cl_usr_cd IS '売掛仮締担当者ＣＤ // #MA.USR_CD // AR temporary closing PIC cd.';


COMMENT ON COLUMN mst_close_all.ap_pre_cl_usr_cd IS '買掛仮締担当者ＣＤ // #MA.USR_CD // AP temporary closing PIC cd.';


COMMENT ON COLUMN mst_close_all.ar_pre_cl_flg IS '売掛仮締ＦＬＧ // #MA.FLG // AR temporary closing flg.';


COMMENT ON COLUMN mst_close_all.ap_pre_cl_flg IS '買掛仮締ＦＬＧ // #MA.FLG // AP temporary closing flg.';


COMMENT ON COLUMN mst_close_all.all_acst_pre_cl_flg IS '全売掛先仮締ＦＬＧ // #MA.FLG // All AR customer temporary closing flg.';


COMMENT ON COLUMN mst_close_all.all_asppl_pre_cl_flg IS '全買掛先仮締ＦＬＧ // #MA.FLG // All AP supplier temporary closing flg.';


COMMENT ON COLUMN mst_close_all.sub_char1 IS '予備１ // #MS.CLOSE_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_close_all.sub_char2 IS '予備２ // #MS.CLOSE_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_close_all.sub_char3 IS '予備３ // #MS.CLOSE_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_close_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_close_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_close_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_close_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_close_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_close_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_close_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_close_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_close_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_close_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


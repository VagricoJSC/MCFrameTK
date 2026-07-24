\encoding UTF-8

COMMENT ON VIEW mst_ap_xrate_rev_his IS '債務為替レート評価替履歴 // AP exchange rate revaluation history';


COMMENT ON COLUMN mst_ap_xrate_rev_his.ap_xrate_rev_his_no IS '債務為替レート評価替履歴ＮＯ // #MA.AP_XRATE_REV_HIST_NO // AP exchange rate revaluation history No.';


COMMENT ON COLUMN mst_ap_xrate_rev_his.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_ap_xrate_rev_his.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mst_ap_xrate_rev_his.ap_dpt_cd IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN mst_ap_xrate_rev_his.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_ap_xrate_rev_his.purc_act_no IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN mst_ap_xrate_rev_his.rcpt_iv_mng_no IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN mst_ap_xrate_rev_his.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_ap_xrate_rev_his.ap_typ IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN mst_ap_xrate_rev_his.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mst_ap_xrate_rev_his.new_xrate IS '変更後為替レート // #MA.MONEY // Exchange rate (Change after)';


COMMENT ON COLUMN mst_ap_xrate_rev_his.old_xrate IS '変更前為替レート // #MA.MONEY // Exchange rate (Before change)';


COMMENT ON COLUMN mst_ap_xrate_rev_his.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mst_ap_xrate_rev_his.exe_dt IS '評価替実行日 // #MA.DT // Revaluation execution date';


COMMENT ON COLUMN mst_ap_xrate_rev_his.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_ap_xrate_rev_his.sub_char1 IS '予備１ // #MS.AP_XRATE_REV_HIST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_ap_xrate_rev_his.sub_char2 IS '予備２ // #MS.AP_XRATE_REV_HIST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_ap_xrate_rev_his.sub_char3 IS '予備３ // #MS.AP_XRATE_REV_HIST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_ap_xrate_rev_his.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ap_xrate_rev_his.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ap_xrate_rev_his.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ap_xrate_rev_his.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ap_xrate_rev_his.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ap_xrate_rev_his.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ap_xrate_rev_his.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ap_xrate_rev_his.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ap_xrate_rev_his.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ap_xrate_rev_his.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


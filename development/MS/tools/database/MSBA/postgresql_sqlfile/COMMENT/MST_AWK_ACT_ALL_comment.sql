\encoding UTF-8

COMMENT ON TABLE mst_awk_act_all IS '作業実績台帳 // Sales forecast aggregated';


COMMENT ON COLUMN mst_awk_act_all.awk_act_no IS '作業実績ＮＯ // #MA.MFG_INST_NO // ';


COMMENT ON COLUMN mst_awk_act_all.co_cd IS '会社ＣＤ // #MA.CO_CD // ';


COMMENT ON COLUMN mst_awk_act_all.wk_usr_cd IS '社員番号 // #MA.USR_CD // ';


COMMENT ON COLUMN mst_awk_act_all.ac_dt IS '作業日 // #MA.DT // ';


COMMENT ON COLUMN mst_awk_act_all.wk_cd IS '作業ＣＤ // #MA.CUR_CD // ';


COMMENT ON COLUMN mst_awk_act_all.wk_typ IS '工数区分 // #MS.WG_RQST_SRC_TYP // ';


COMMENT ON COLUMN mst_awk_act_all.oper_inst_no IS '工程指図ＮＯ // #MA.MFG_INST_NO // ';


COMMENT ON COLUMN mst_awk_act_all.cnstr_no IS '工事番号 // #MA.MFG_INST_NO // ';


COMMENT ON COLUMN mst_awk_act_all.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // ';


COMMENT ON COLUMN mst_awk_act_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // ';


COMMENT ON COLUMN mst_awk_act_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // ';


COMMENT ON COLUMN mst_awk_act_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // ';


COMMENT ON COLUMN mst_awk_act_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // ';


COMMENT ON COLUMN mst_awk_act_all.wk_cost IS '工数 // #MA.IF_SUB_NUM1 // ';


COMMENT ON COLUMN mst_awk_act_all.wk_usr_dpt_cd IS '作業者部門ＣＤ // #MA.DPT_CD // ';


COMMENT ON COLUMN mst_awk_act_all.assit_dpt_cd IS '応援部門ＣＤ // #MA.DPT_CD // ';


COMMENT ON COLUMN mst_awk_act_all.aprv_flg IS '決裁ＦＬＧ // #MA.FLG // ';


COMMENT ON COLUMN mst_awk_act_all.aprv_usr_id IS '決裁担当者 // #MA.FCM_USR_ID // ';


COMMENT ON COLUMN mst_awk_act_all.aprv_usr_nm IS '決裁担当者名 // #MA.FCM_USR_NM // ';


COMMENT ON COLUMN mst_awk_act_all.aprv_ts IS '決裁日時 // #MA.SYS_TS // ';


COMMENT ON COLUMN mst_awk_act_all.aprv_can_usr_id IS '決裁取消担当者 // #MA.FCM_USR_ID // ';


COMMENT ON COLUMN mst_awk_act_all.aprv_can_usr_nm IS '決裁取消担当者名 // #MA.FCM_USR_NM // ';


COMMENT ON COLUMN mst_awk_act_all.aprv_can_ts IS '決裁取消日時 // #MA.SYS_TS // ';


COMMENT ON COLUMN mst_awk_act_all.send_flg IS '送信済みＦＬＧ // #MA.FLG // ';


COMMENT ON COLUMN mst_awk_act_all.sub_char1 IS '予備１ // #MS.WG_RQST_PRMS_SUB_CHAR1 // ';


COMMENT ON COLUMN mst_awk_act_all.sub_char2 IS '予備２ // #MS.WG_RQST_PRMS_SUB_CHAR2 // ';


COMMENT ON COLUMN mst_awk_act_all.sub_char3 IS '予備３ // #MS.WG_RQST_PRMS_SUB_CHAR3 // ';


COMMENT ON COLUMN mst_awk_act_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_awk_act_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_awk_act_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_awk_act_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_awk_act_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_awk_act_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_awk_act_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_awk_act_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_awk_act_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_awk_act_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


\encoding UTF-8

COMMENT ON TABLE mst_std_insp_act_all IS '規格検査実績 // Specific inspection result';


COMMENT ON COLUMN mst_std_insp_act_all.std_insp_act_no IS '規格検査実績ＮＯ // #MA.STD_INSP_ACT_NO // Specific inspection result No.';


COMMENT ON COLUMN mst_std_insp_act_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_std_insp_act_all.std_insp_inst_no IS '規格検査指図ＮＯ // #MA.STD_INSP_INST_NO // Specific inspection order No.';


COMMENT ON COLUMN mst_std_insp_act_all.insp_no IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN mst_std_insp_act_all.qn_insp_val IS '定量検査値 // #MA.QN_INSP_VAL // Quantitative inspection value';


COMMENT ON COLUMN mst_std_insp_act_all.ql_insp_val IS '定性検査値 // #MS.QL_INSP_VAL // Qualitative inspection value';


COMMENT ON COLUMN mst_std_insp_act_all.st_tm IS '開始日時 // #MA.TM // Start date and time';


COMMENT ON COLUMN mst_std_insp_act_all.end_tm IS '終了日時 // #MA.TM // End date and time';


COMMENT ON COLUMN mst_std_insp_act_all.dpt_cd IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN mst_std_insp_act_all.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mst_std_insp_act_all.std_insp_rslt_typ IS '規格検査結果区分 // #MS.STD_INSP_RSLT_TYP // Specific inspection result type';


COMMENT ON COLUMN mst_std_insp_act_all.cnf_flg IS '確認ＦＬＧ // #MA.FLG // Check flg.';


COMMENT ON COLUMN mst_std_insp_act_all.cnf_dt IS '確認日 // #MA.DT // Check date';


COMMENT ON COLUMN mst_std_insp_act_all.cnf_dpt_cd IS '確認部門ＣＤ // #MA.DPT_CD // Check dept. cd.';


COMMENT ON COLUMN mst_std_insp_act_all.cnf_usr_cd IS '確認者ＣＤ // #MA.USR_CD // Check PIC cd.';


COMMENT ON COLUMN mst_std_insp_act_all.act_intr_rmrks IS '実績内部備考 // #MS.STD_INSP_ACT_INTR_RMRKS // Result internal remarks';


COMMENT ON COLUMN mst_std_insp_act_all.cnf_intr_rmrks IS '確認内部備考 // #MS.STD_INSP_CNF_INTR_RMRKS // Check internal remarks';


COMMENT ON COLUMN mst_std_insp_act_all.sub_char1 IS '予備１ // #MS.STD_INSP_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_std_insp_act_all.sub_char2 IS '予備２ // #MS.STD_INSP_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_std_insp_act_all.sub_char3 IS '予備３ // #MS.STD_INSP_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_std_insp_act_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_std_insp_act_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_std_insp_act_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_std_insp_act_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_std_insp_act_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_std_insp_act_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_std_insp_act_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_std_insp_act_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_std_insp_act_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_std_insp_act_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


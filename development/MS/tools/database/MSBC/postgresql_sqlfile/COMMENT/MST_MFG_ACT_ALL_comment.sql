\encoding UTF-8

COMMENT ON TABLE mst_mfg_act_all IS '製造実績 // Mfg. result';


COMMENT ON COLUMN mst_mfg_act_all.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mst_mfg_act_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_mfg_act_all.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_mfg_act_all.div_seq IS '分割連番 // #MS.DIV_SEQ // Split sequence number';


COMMENT ON COLUMN mst_mfg_act_all.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_mfg_act_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_mfg_act_all.st_act_tm IS '着手実績日時 // #MA.TM // Actual start date and time';


COMMENT ON COLUMN mst_mfg_act_all.end_act_tm IS '終了実績日時 // #MA.TM // Actual end date and time';


COMMENT ON COLUMN mst_mfg_act_all.base_unit_yield_qty IS '基準単位良品数量 // #MA.QTY // Base unit conforming qty.';


COMMENT ON COLUMN mst_mfg_act_all.base_unit_dfct_qty IS '基準単位不良数量 // #MA.QTY // Base unit defective qty.';


COMMENT ON COLUMN mst_mfg_act_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_mfg_act_all.st_ac_dt IS '着手計上日 // #MA.DT // Start recording date';


COMMENT ON COLUMN mst_mfg_act_all.end_ac_dt IS '終了計上日 // #MA.DT // End recording date';


COMMENT ON COLUMN mst_mfg_act_all.itm_yield IS '品目実際収率 // #MA.YIELD // Item actual yield';


COMMENT ON COLUMN mst_mfg_act_all.mfg_aprv_sts_typ IS '製造承認状況区分 // #MS.MFG_APRV_STS_TYP // Mfg. approval status type';


COMMENT ON COLUMN mst_mfg_act_all.aprv_dt IS '承認日 // #MA.DT // Approval date';


COMMENT ON COLUMN mst_mfg_act_all.aprv_dpt_cd IS '承認部門ＣＤ // #MA.DPT_CD // Approval dept. cd.';


COMMENT ON COLUMN mst_mfg_act_all.aprv_usr_cd IS '承認者ＣＤ // #MA.USR_CD // Approver cd.';


COMMENT ON COLUMN mst_mfg_act_all.aprv_tm IS '承認日時 // #MA.TM // Approval date and time';


COMMENT ON COLUMN mst_mfg_act_all.aprv_rsn IS '承認理由 // #MS.APRV_RSN // Approval reason';


COMMENT ON COLUMN mst_mfg_act_all.act_prnt_flg IS '製造記録書発行済ＦＬＧ // #MA.FLG // Mfg. record sheet issued flg.';


COMMENT ON COLUMN mst_mfg_act_all.act_prnt_tm IS '製造記録書発行日時 // #MA.TM // Mfg. record sheet issued date and time';


COMMENT ON COLUMN mst_mfg_act_all.seq IS '製造記録書連番 // #MA.PRNT_SEQ // Mfg. record sheet sequence number';


COMMENT ON COLUMN mst_mfg_act_all.act_dpt_cd IS '実績部門ＣＤ // #MA.DPT_CD // Result dept. cd.';


COMMENT ON COLUMN mst_mfg_act_all.act_usr_cd IS '実績責任者ＣＤ // #MA.USR_CD // Result management PIC cd.';


COMMENT ON COLUMN mst_mfg_act_all.arr_purc_auto_reg_flg IS '入荷・仕入時自動作成ＦＬＧ // #MA.FLG // Auto-create flg. at receipt/purchase';


COMMENT ON COLUMN mst_mfg_act_all.intr_rmrks IS '内部備考 // #MS.MFG_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_mfg_act_all.act_rpt_rmrks IS '記録書備考 // #MS.MFG_ACT_RPT_RMRKS // Record sheet remarks';


COMMENT ON COLUMN mst_mfg_act_all.sub_char1 IS '予備１ // #MS.MFG_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_mfg_act_all.sub_char2 IS '予備２ // #MS.MFG_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_mfg_act_all.sub_char3 IS '予備３ // #MS.MFG_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_mfg_act_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_mfg_act_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_mfg_act_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_mfg_act_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_mfg_act_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_mfg_act_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_mfg_act_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_mfg_act_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_mfg_act_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_mfg_act_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


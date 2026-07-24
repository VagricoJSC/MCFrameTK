\encoding UTF-8

COMMENT ON TABLE mst_mfg_inst_all IS '製造指図 // Mfg. order';


COMMENT ON COLUMN mst_mfg_inst_all.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_mfg_inst_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_mfg_inst_all.mfg_inst_rev IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN mst_mfg_inst_all.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_mfg_inst_all.po_d_no IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN mst_mfg_inst_all.base_unit_yield_qty IS '基準単位出来高予定数量 // #MA.QTY // Base unit output scheduled qty.';


COMMENT ON COLUMN mst_mfg_inst_all.base_unit_inst_qty IS '基準単位製造指図数量 // #MA.QTY // Base unit mfg. order qty.';


COMMENT ON COLUMN mst_mfg_inst_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_mfg_inst_all.st_schd_tm IS '着手予定日時 // #MA.TM // Scheduled start date and time';


COMMENT ON COLUMN mst_mfg_inst_all.end_schd_tm IS '終了予定日時 // #MA.TM // Scheduled end date and time';


COMMENT ON COLUMN mst_mfg_inst_all.rqst_dlv_rqst_tm IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN mst_mfg_inst_all.inst_dt IS '指図日 // #MA.DT // Order date';


COMMENT ON COLUMN mst_mfg_inst_all.inst_prnt_tm IS '指図書発行日時 // #MA.TM // Order sheet issued date and time';


COMMENT ON COLUMN mst_mfg_inst_all.inst_prnt_flg IS '指図書発行済ＦＬＧ // #MA.FLG // Order sheet issued flg.';


COMMENT ON COLUMN mst_mfg_inst_all.aprv_flg IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN mst_mfg_inst_all.mfg_aprv_sts_typ IS '製造承認状況区分 // #MS.MFG_APRV_STS_TYP // Mfg. approval status type';


COMMENT ON COLUMN mst_mfg_inst_all.aprv_dt IS '承認日 // #MA.DT // Approval date';


COMMENT ON COLUMN mst_mfg_inst_all.aprv_dpt_cd IS '承認部門ＣＤ // #MA.DPT_CD // Approval dept. cd.';


COMMENT ON COLUMN mst_mfg_inst_all.aprv_usr_cd IS '承認者ＣＤ // #MA.USR_CD // Approver cd.';


COMMENT ON COLUMN mst_mfg_inst_all.aprv_tm IS '承認日時 // #MA.TM // Approval date and time';


COMMENT ON COLUMN mst_mfg_inst_all.aprv_rsn IS '承認理由 // #MS.APRV_RSN // Approval reason';


COMMENT ON COLUMN mst_mfg_inst_all.mfg_aprv_role_cd IS '製造承認役割ＣＤ // #MA.APRV_ROLE_CD // Mfg. approval role cd.';


COMMENT ON COLUMN mst_mfg_inst_all.disp_pd IS '印字用表示期限 // #MS.DISP_PD // Display expiration for print';


COMMENT ON COLUMN mst_mfg_inst_all.inst_dpt_cd IS '指図部門ＣＤ // #MA.DPT_CD // Order dept. cd.';


COMMENT ON COLUMN mst_mfg_inst_all.inst_usr_cd IS '指図担当者ＣＤ // #MA.USR_CD // Order PIC cd.';


COMMENT ON COLUMN mst_mfg_inst_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_mfg_inst_all.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_mfg_inst_all.schd_chg_flg IS '計画変更ＦＬＧ // #MA.FLG // Plan changed flg.';


COMMENT ON COLUMN mst_mfg_inst_all.po_locked_flg IS '発注訂正・取消不可ＦＬＧ // #MA.FLG // Do not allow PO correction/cancel flg.';


COMMENT ON COLUMN mst_mfg_inst_all.po_auto_reg_flg IS '発注時自動作成ＦＬＧ // #MA.FLG // Auto-creation at PO flg.';


COMMENT ON COLUMN mst_mfg_inst_all.mfg_inst_unit_typ IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN mst_mfg_inst_all.intr_rmrks IS '内部備考 // #MS.MFG_INST_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_mfg_inst_all.inst_rpt_rmrks IS '指図書備考 // #MS.MFG_INST_RPT_RMRKS // Order sheet remarks';


COMMENT ON COLUMN mst_mfg_inst_all.inst_po_cnt_rmrks IS '指図・発注連絡備考 // #MS.INST_PO_CNT_RMRKS // Order/PO contact remarks';


COMMENT ON COLUMN mst_mfg_inst_all.sub_char1 IS '予備１ // #MS.MFG_INST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_mfg_inst_all.sub_char2 IS '予備２ // #MS.MFG_INST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_mfg_inst_all.sub_char3 IS '予備３ // #MS.MFG_INST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_mfg_inst_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_mfg_inst_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_mfg_inst_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_mfg_inst_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_mfg_inst_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_mfg_inst_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_mfg_inst_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_mfg_inst_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_mfg_inst_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_mfg_inst_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


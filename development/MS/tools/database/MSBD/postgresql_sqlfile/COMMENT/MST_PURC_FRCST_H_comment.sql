\encoding UTF-8

COMMENT ON VIEW mst_purc_frcst_h IS '購買内示ヘッダ // Purchase forecast header';


COMMENT ON COLUMN mst_purc_frcst_h.purc_frcst_no IS '購買内示ＮＯ // #MA.PURC_FRCST_NO // Purchase forecast No.';


COMMENT ON COLUMN mst_purc_frcst_h.pf_dt IS '内示日 // #MA.DT // Forecast date';


COMMENT ON COLUMN mst_purc_frcst_h.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_purc_frcst_h.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_purc_frcst_h.pf_usr_cd IS '内示担当者ＣＤ // #MA.USR_CD // Forecast PIC cd.';


COMMENT ON COLUMN mst_purc_frcst_h.pf_dpt_cd IS '内示部門ＣＤ // #MA.DPT_CD // Forecast dept. cd.';


COMMENT ON COLUMN mst_purc_frcst_h.pf_rpt_no IS '内示書ＮＯ // #MA.PF_RPT_NO // Forecast list No.';


COMMENT ON COLUMN mst_purc_frcst_h.pf_rpt_id IS '内示書ＩＤ // #MA.PF_RPT_ID // Forecast list ID';


COMMENT ON COLUMN mst_purc_frcst_h.pf_rpt_dt IS '内示書発行日時 // #MA.TM // Forecast issue date and time';


COMMENT ON COLUMN mst_purc_frcst_h.pf_rpt_flg IS '内示書発行済ＦＬＧ // #MA.FLG // Forecast list issued flg.';


COMMENT ON COLUMN mst_purc_frcst_h.del_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_purc_frcst_h.del_pf_rpt_id IS '取消内示書ＩＤ // #MA.PF_RPT_ID // Canceling forecast list ID';


COMMENT ON COLUMN mst_purc_frcst_h.del_pf_rpt_dt IS '取消内示書発行日時 // #MA.TM // Cancellation forecast list issue date and time';


COMMENT ON COLUMN mst_purc_frcst_h.del_pf_rpt_flg IS '取消内示書発行済ＦＬＧ // #MA.FLG // Cancellation forecast list issued flg.';


COMMENT ON COLUMN mst_purc_frcst_h.rpt_rmrks IS '帳票備考 // #MS.PF_HDR_RPT_RMRKS // Report remarks';


COMMENT ON COLUMN mst_purc_frcst_h.intr_rmrks IS '内部備考 // #MS.PF_HDR_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_purc_frcst_h.sub_char1 IS '予備１ // #MS.PF_HDR_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_purc_frcst_h.sub_char2 IS '予備２ // #MS.PF_HDR_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_purc_frcst_h.sub_char3 IS '予備３ // #MS.PF_HDR_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_purc_frcst_h.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_purc_frcst_h.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_purc_frcst_h.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_purc_frcst_h.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_purc_frcst_h.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_purc_frcst_h.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_purc_frcst_h.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_purc_frcst_h.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_purc_frcst_h.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_purc_frcst_h.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


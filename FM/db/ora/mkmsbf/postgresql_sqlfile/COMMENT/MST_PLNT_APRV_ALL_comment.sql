\encoding UTF-8

COMMENT ON TABLE mst_plnt_aprv_all IS '工場出荷承認ヘッダ // Factory release approval header';


COMMENT ON COLUMN mst_plnt_aprv_all.plnt_aprv_no IS '工場出荷承認ＮＯ // #MA.PLNT_APRV_NO // Factory release approval No.';


COMMENT ON COLUMN mst_plnt_aprv_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_plnt_aprv_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_plnt_aprv_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_plnt_aprv_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_plnt_aprv_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_plnt_aprv_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_plnt_aprv_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_plnt_aprv_all.skip_chk_ship_flg IS '出荷時構成チェック不要ＦＬＧ // #MA.FLG // Component check not required at shipping flg.';


COMMENT ON COLUMN mst_plnt_aprv_all.plnt_aprv_sts_typ IS '工場出荷承認状況区分 // #MS.PLNT_APRV_STS_TYP // Factory release approval status type';


COMMENT ON COLUMN mst_plnt_aprv_all.aprv_dt IS '承認日 // #MA.DT // Approval date';


COMMENT ON COLUMN mst_plnt_aprv_all.aprv_tm IS '承認日時 // #MA.TM // Approval date and time';


COMMENT ON COLUMN mst_plnt_aprv_all.plnt_aprv_role_cd IS '工場出荷承認役割ＣＤ // #MA.APRV_ROLE_CD // Factory release approval role cd.';


COMMENT ON COLUMN mst_plnt_aprv_all.aprv_dpt_cd IS '承認部門ＣＤ // #MA.DPT_CD // Approval dept. cd.';


COMMENT ON COLUMN mst_plnt_aprv_all.aprv_usr_cd IS '承認者ＣＤ // #MA.USR_CD // Approver cd.';


COMMENT ON COLUMN mst_plnt_aprv_all.aprv_rsn IS '承認理由 // #MS.PLNT_APRV_RSN // Approval reason';


COMMENT ON COLUMN mst_plnt_aprv_all.plnt_aprv_prnt_flg IS '工場出荷記録書発行済ＦＬＧ // #MA.FLG // Record sheet of factory release issued flg.';


COMMENT ON COLUMN mst_plnt_aprv_all.plnt_aprv_prnt_tm IS '工場出荷記録書発行日時 // #MA.TM // Record sheet of factory release issue date and time';


COMMENT ON COLUMN mst_plnt_aprv_all.seq IS '工場出荷記録書連番 // #MA.PRNT_SEQ // Record sheet of factory release sequence number';


COMMENT ON COLUMN mst_plnt_aprv_all.site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN mst_plnt_aprv_all.intr_rmrks IS '内部備考 // #MS.PLNT_APRV_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_plnt_aprv_all.sub_char1 IS '予備１ // #MS.PLNT_APRV_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_plnt_aprv_all.sub_char2 IS '予備２ // #MS.PLNT_APRV_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_plnt_aprv_all.sub_char3 IS '予備３ // #MS.PLNT_APRV_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_plnt_aprv_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_plnt_aprv_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_plnt_aprv_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_plnt_aprv_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_plnt_aprv_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_plnt_aprv_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_plnt_aprv_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_plnt_aprv_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_plnt_aprv_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_plnt_aprv_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


\encoding UTF-8

COMMENT ON TABLE mst_stktk_all IS '棚卸制御管理 // Inventory count control';


COMMENT ON COLUMN mst_stktk_all.ctrl_tgt_dt IS '制御対象日 // #MA.DT // Control target date';


COMMENT ON COLUMN mst_stktk_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_stktk_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_stktk_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_stktk_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_stktk_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_stktk_all.stktk_typ IS '棚卸種別区分 // #MS.STKTK_TYP // Inventory count classification type';


COMMENT ON COLUMN mst_stktk_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_stktk_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_stktk_all.stktk_sts_typ IS '棚卸状況区分 // #MS.STKTK_STS_TYP // Inventory count status type';


COMMENT ON COLUMN mst_stktk_all.stktk_st_tm IS '棚卸開始日時 // #MA.TM // Inventory count start date and time';


COMMENT ON COLUMN mst_stktk_all.diff_upd_tm IS '在庫確定日時 // #MA.TM // Inventory firm date and time';


COMMENT ON COLUMN mst_stktk_all.act_dpt_cd IS '実施部門ＣＤ // #MA.DPT_CD // Implement dept. cd.';


COMMENT ON COLUMN mst_stktk_all.act_usr_cd IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN mst_stktk_all.io_ctrl_flg IS '入出庫制御中ＦＬＧ // #MA.FLG // GR/GI control flg.';


COMMENT ON COLUMN mst_stktk_all.act_qty_keep_flg IS '実棚数量保持ＦＬＧ // #MA.FLG // Keep counted qty. flg.';


COMMENT ON COLUMN mst_stktk_all.stktk_rpt_prnt_flg IS '棚卸表発行済ＦＬＧ // #MA.FLG // Inventory count sheet issued flg.';


COMMENT ON COLUMN mst_stktk_all.diff_rpt_prnt_flg IS '差異リスト発行済ＦＬＧ // #MA.FLG // Variance list issued flg.';


COMMENT ON COLUMN mst_stktk_all.stktk_rpt_rmrks IS '棚卸表備考 // #MS.STKTK_RPT_RMRKS // Inventory count sheet remarks';


COMMENT ON COLUMN mst_stktk_all.intr_rmrks IS '内部備考 // #MS.STKTK_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_stktk_all.sub_char1 IS '予備１ // #MS.STKTK_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_stktk_all.sub_char2 IS '予備２ // #MS.STKTK_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_stktk_all.sub_char3 IS '予備３ // #MS.STKTK_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_stktk_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_stktk_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_stktk_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_stktk_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_stktk_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_stktk_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_stktk_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_stktk_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_stktk_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_stktk_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';



COMMENT ON TABLE MST_SIM_MRP_ALL IS 'シミュレーション管理情報 // Simulation management info.';


COMMENT ON COLUMN MST_SIM_MRP_ALL.SIM_MRP_NO IS 'シミュレーションＮＯ // #MA.SIM_MRP_NO // Simulation No.';


COMMENT ON COLUMN MST_SIM_MRP_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_SIM_MRP_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_SIM_MRP_ALL.SIM_MRP_TYP IS 'シミュレーションＭＲＰ区分 // #MS.SIM_MRP_TYP // Simulation MRP type';


COMMENT ON COLUMN MST_SIM_MRP_ALL.SIM_USR_CD IS 'シミュレーション担当者ＣＤ // #MA.USR_CD // Simulation PIC cd.';


COMMENT ON COLUMN MST_SIM_MRP_ALL.DLY_RQMT_FLG IS '日次生産依頼 // #MA.FLG // Daily production request';


COMMENT ON COLUMN MST_SIM_MRP_ALL.STK_FLG IS '在庫 // #MA.FLG // Inventory';


COMMENT ON COLUMN MST_SIM_MRP_ALL.GR_FLG IS '入庫予定 // #MA.FLG // GR schedule';


COMMENT ON COLUMN MST_SIM_MRP_ALL.GI_FLG IS '出庫予定(出荷予定除く) // #MA.FLG // GI schedule (Except shipping schedule)';


COMMENT ON COLUMN MST_SIM_MRP_ALL.SHIP_FLG IS '出荷予定 // #MA.FLG // Shipping schedule';


COMMENT ON COLUMN MST_SIM_MRP_ALL.TREE_LVL IS '階層 // #MA.TREE_LVL // Hierarchy';


COMMENT ON COLUMN MST_SIM_MRP_ALL.MRP_PROC_DT IS 'ＭＲＰ実行日 // #MA.DT // MRP run date';


COMMENT ON COLUMN MST_SIM_MRP_ALL.INTR_RMRKS IS '内部備考 // #MS.SIM_MRP_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_SIM_MRP_ALL.SUB_CHAR1 IS '予備１ // #MS.SIM_MRP_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_SIM_MRP_ALL.SUB_CHAR2 IS '予備２ // #MS.SIM_MRP_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_SIM_MRP_ALL.SUB_CHAR3 IS '予備３ // #MS.SIM_MRP_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_SIM_MRP_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SIM_MRP_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SIM_MRP_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SIM_MRP_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SIM_MRP_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SIM_MRP_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SIM_MRP_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SIM_MRP_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SIM_MRP_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SIM_MRP_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


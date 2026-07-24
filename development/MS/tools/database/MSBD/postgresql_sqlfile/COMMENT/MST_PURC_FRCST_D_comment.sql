\encoding UTF-8

COMMENT ON VIEW mst_purc_frcst_d IS '購買内示明細 // Purchase forecast details';


COMMENT ON COLUMN mst_purc_frcst_d.purc_frcst_d_no IS '購買内示明細ＮＯ // #MA.PURC_FRCST_D_NO // Purchase forecast details No.';


COMMENT ON COLUMN mst_purc_frcst_d.purc_frcst_no IS '購買内示ＮＯ // #MA.PURC_FRCST_NO // Purchase forecast No.';


COMMENT ON COLUMN mst_purc_frcst_d.purc_frcst_fix_no IS '購買内示確定ＮＯ // #MA.PURC_FRCST_FIX_NO // Purchase forecast firm No.';


COMMENT ON COLUMN mst_purc_frcst_d.pf_period_typ IS '内示期間区分 // #MA.PERIOD_TYP // Forecast period type';


COMMENT ON COLUMN mst_purc_frcst_d.pf_period_st_dt IS '内示期間開始日 // #MA.DT // Forecast period start date';


COMMENT ON COLUMN mst_purc_frcst_d.pf_period_end_dt IS '内示期間終了日 // #MA.DT // Forecast period end date';


COMMENT ON COLUMN mst_purc_frcst_d.fix_period_flg IS '確定期間ＦＬＧ // #MA.FLG // Firm period flg.';


COMMENT ON COLUMN mst_purc_frcst_d.trd_unit_pf_qty IS '取引単位内示数量 // #MA.QTY // Transaction unit forecast qty.';


COMMENT ON COLUMN mst_purc_frcst_d.base_unit_pf_qty IS '基準単位内示数量 // #MA.QTY // Base unit forecast qty.';


COMMENT ON COLUMN mst_purc_frcst_d.trd_unit_schd_qty IS '取引単位予定数量 // #MA.QTY // Transaction unit scheduled qty.';


COMMENT ON COLUMN mst_purc_frcst_d.base_unit_schd_qty IS '基準単位予定数量 // #MA.QTY // Base unit scheduled qty.';


COMMENT ON COLUMN mst_purc_frcst_d.trd_unit_prms_qty IS '取引単位回答数量 // #MA.QTY // Transaction unit replied qty.';


COMMENT ON COLUMN mst_purc_frcst_d.base_unit_prms_qty IS '基準単位回答数量 // #MA.QTY // Base unit replied qty.';


COMMENT ON COLUMN mst_purc_frcst_d.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_purc_frcst_d.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_purc_frcst_d.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_purc_frcst_d.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_purc_frcst_d.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_purc_frcst_d.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_purc_frcst_d.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_purc_frcst_d.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_purc_frcst_d.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_purc_frcst_d.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


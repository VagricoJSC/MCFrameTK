\encoding UTF-8

COMMENT ON VIEW mam_itm_wg IS '品目マスタ（ＷＧ） // Item master (WG)';


COMMENT ON COLUMN mam_itm_wg.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_itm_wg.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_itm_wg.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_itm_wg.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_itm_wg.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_itm_wg.mfg_inst_unit_typ IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN mam_itm_wg.mrp_proc_typ IS 'ＭＲＰ処理区分 // #MA.MRP_PROC_TYP // MRP process type';


COMMENT ON COLUMN mam_itm_wg.rqmt_typ IS '所要区分 // #MA.RQMT_TYP // Requirements type';


COMMENT ON COLUMN mam_itm_wg.prod_pln_typ IS '生産計画立案区分 // #MA.PROD_PLN_TYP // Production planning type';


COMMENT ON COLUMN mam_itm_wg.dmnd_date_div_mons IS '需要日ばらし月数 // #MA.MONS // Number of months for demand disaggregation by day';


COMMENT ON COLUMN mam_itm_wg.alloc_margin_days IS '引当余裕日数 // #MA.DAYS // Allocation extra days';


COMMENT ON COLUMN mam_itm_wg.mrp_alloc_margin_days IS 'ＭＲＰ引当余裕日数 // #MA.DAYS // MRP allocation extra days';


COMMENT ON COLUMN mam_itm_wg.mrp_opn_xfr_days IS 'ＭＲＰ未確定移送依頼考慮日数 // #MA.DAYS // Days to consider unfirm transport request in MRP';


COMMENT ON COLUMN mam_itm_wg.rqmt_rstr_qty IS '所要抑制量 // #MA.QTY // Requirements restricted qty.';


COMMENT ON COLUMN mam_itm_wg.inpt_itm_add_typ IS '投入品追加許可区分 // #MA.INPT_ITM_ADD_TYP // Input item addition allowed type';


COMMENT ON COLUMN mam_itm_wg.inpt_itm_del_typ IS '投入品削除許可区分 // #MA.INPT_ITM_DEL_TYP // Input item deletion allowed type';


COMMENT ON COLUMN mam_itm_wg.sch_tgt_typ IS 'スケジューラ対象区分 // #MA.SCH_TGT_TYP // Scheduler target type';


COMMENT ON COLUMN mam_itm_wg.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_itm_wg.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_itm_wg.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_itm_wg.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_itm_wg.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_itm_wg.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_itm_wg.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_itm_wg.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_itm_wg.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_itm_wg.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_itm_wg.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_itm_wg.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_itm_wg.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_itm_wg.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_itm_wg.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_itm_wg.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_itm_wg.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_itm_wg.trace_tgt_typ IS 'トレサビ対象区分 // #MA.TRACE_TGT_TYP // Traceability target type';


COMMENT ON COLUMN mam_itm_wg.unit_exp_flg IS 'ユニット展開ＦＬＧ // #MA.FLG // ';


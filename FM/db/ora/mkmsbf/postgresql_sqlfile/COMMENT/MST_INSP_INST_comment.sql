\encoding UTF-8

COMMENT ON VIEW mst_insp_inst IS '検査指図 // Inspection order';


COMMENT ON COLUMN mst_insp_inst.insp_no IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN mst_insp_inst.insp_freq IS '検査回数 // #MS.INSP_FREQ // Number of inspections';


COMMENT ON COLUMN mst_insp_inst.src_no1 IS '作成元ＮＯ１ // #MA.SRC_NO // Source No. 1';


COMMENT ON COLUMN mst_insp_inst.src_no2 IS '作成元ＮＯ２ // #MA.SRC_NO // Source No. 2';


COMMENT ON COLUMN mst_insp_inst.insp_typ IS '検査種類区分 // #MS.INSP_TYP // Inspection classification type';


COMMENT ON COLUMN mst_insp_inst.insp_mtd_typ IS '検査方法区分 // #MA.INSP_MTD_TYP // Inspection method type';


COMMENT ON COLUMN mst_insp_inst.insp_sts_typ IS '検査状況区分 // #MS.INSP_STS_TYP // Inspection status type';


COMMENT ON COLUMN mst_insp_inst.insp_bind_typ IS '検査実施単位区分 // #MA.INSP_BIND_TYP // Inspection implementation unit type';


COMMENT ON COLUMN mst_insp_inst.col_schd_flg IS '予定まとめＦＬＧ // #MA.FLG // Schedule aggregation flg.';


COMMENT ON COLUMN mst_insp_inst.insp_lst_prnt_flg IS '検査指図リスト発行済ＦＬＧ // #MA.FLG // Inspection order list issued flg.';


COMMENT ON COLUMN mst_insp_inst.insp_lst_prnt_tm IS '検査指図リスト発行日時 // #MA.TM // Inspection order list issue date and time';


COMMENT ON COLUMN mst_insp_inst.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_insp_inst.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_insp_inst.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_insp_inst.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_insp_inst.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_insp_inst.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_insp_inst.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_insp_inst.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_insp_inst.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mst_insp_inst.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_insp_inst.from_site_cd IS '出荷元工場・物流倉庫ＣＤ // #MA.SITE_CD // Shipping point factory/distribution warehouse cd.';


COMMENT ON COLUMN mst_insp_inst.to_site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN mst_insp_inst.bp_lot_no IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN mst_insp_inst.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_insp_inst.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_insp_inst.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_insp_inst.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_insp_inst.insp_lst_no IS '検査指図リストＮＯ // #MA.INSP_LST_NO // Inspection order list No.';


COMMENT ON COLUMN mst_insp_inst.inst_dt IS '指図日 // #MA.DT // Order date';


COMMENT ON COLUMN mst_insp_inst.inst_dpt_cd IS '指図部門ＣＤ // #MA.DPT_CD // Order dept. cd.';


COMMENT ON COLUMN mst_insp_inst.inst_usr_cd IS '指図担当者ＣＤ // #MA.USR_CD // Order PIC cd.';


COMMENT ON COLUMN mst_insp_inst.master_dt IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN mst_insp_inst.st_tm IS '開始予定日時 // #MA.TM // Scheduled start date and time';


COMMENT ON COLUMN mst_insp_inst.end_tm IS '終了予定日時 // #MA.TM // Scheduled end date and time';


COMMENT ON COLUMN mst_insp_inst.insp_ptn_cd IS '検査パタンＣＤ // #MA.INSP_PTN_CD // Inspection pattern cd.';


COMMENT ON COLUMN mst_insp_inst.std_req_flg IS '規格検査必須ＦＬＧ // #MA.FLG // Specific inspection required flg.';


COMMENT ON COLUMN mst_insp_inst.std_cnf_req_flg IS '規格実績確認必須ＦＬＧ // #MA.FLG // Specific result check required flg.';


COMMENT ON COLUMN mst_insp_inst.insp_std_no IS '規格書ＮＯ // #MA.INSP_STD_NO // Specific inspection No.';


COMMENT ON COLUMN mst_insp_inst.plnt_aprv_flg IS '工場出荷承認対象ＦＬＧ // #MA.FLG // For factory release approval flg.';


COMMENT ON COLUMN mst_insp_inst.insp_rslt_prnt_flg IS '検査成績書発行済ＦＬＧ // #MA.FLG // Inspection report printed flg.';


COMMENT ON COLUMN mst_insp_inst.insp_rslt_prnt_tm IS '検査成績書発行日時 // #MA.TM // Inspection report printed date and time';


COMMENT ON COLUMN mst_insp_inst.seq IS '検査成績書連番 // #MA.PRNT_SEQ // Inspection report sequence number';


COMMENT ON COLUMN mst_insp_inst.lmt_up_flg IS '期限再検査ＦＬＧ // #MA.FLG // Re-inspection for expiration flg.';


COMMENT ON COLUMN mst_insp_inst.insp_aprv_flg IS '検査承認対象ＦＬＧ // #MA.FLG // For inspection approval flg.';


COMMENT ON COLUMN mst_insp_inst.insp_aprv_sts_typ IS '検査承認状況区分 // #MS.INSP_APRV_STS_TYP // Inspection approval status type';


COMMENT ON COLUMN mst_insp_inst.aprv_dt IS '承認日 // #MA.DT // Approval date';


COMMENT ON COLUMN mst_insp_inst.insp_aprv_role_cd IS '検査承認役割ＣＤ // #MA.APRV_ROLE_CD // Inspection approval role cd.';


COMMENT ON COLUMN mst_insp_inst.aprv_dpt_cd IS '承認部門ＣＤ // #MA.DPT_CD // Approval dept. cd.';


COMMENT ON COLUMN mst_insp_inst.aprv_usr_cd IS '承認者ＣＤ // #MA.USR_CD // Approver cd.';


COMMENT ON COLUMN mst_insp_inst.aprv_tm IS '承認日時 // #MA.TM // Approval date and time';


COMMENT ON COLUMN mst_insp_inst.aprv_rsn IS '承認理由 // #MS.INSP_INST_APRV_RSN // Approval reason';


COMMENT ON COLUMN mst_insp_inst.act_cont_fctr IS '実際有効成分係数 // #MA.ACT_CONT_FCTR // Actual active ingredient coefficient';


COMMENT ON COLUMN mst_insp_inst.intr_rmrks IS '内部備考 // #MS.INSP_INST_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_insp_inst.sub_char1 IS '予備１ // #MS.INSP_INST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_insp_inst.sub_char2 IS '予備２ // #MS.INSP_INST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_insp_inst.sub_char3 IS '予備３ // #MS.INSP_INST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_insp_inst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_insp_inst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_insp_inst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_insp_inst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_insp_inst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_insp_inst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_insp_inst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_insp_inst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_insp_inst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_insp_inst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mst_insp_inst.lims_flg IS 'ＬＩＭＳＦＬＧ // #MA.FLG // LIMS flg.';


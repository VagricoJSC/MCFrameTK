\encoding UTF-8

COMMENT ON TABLE mst_insp_act_all IS '検査実績ヘッダ // Inspection result header';


COMMENT ON COLUMN mst_insp_act_all.insp_act_no IS '検査実績ＮＯ // #MA.INSP_ACT_NO // Inspection result No.';


COMMENT ON COLUMN mst_insp_act_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_insp_act_all.insp_no IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN mst_insp_act_all.insp_freq IS '検査回数 // #MS.INSP_FREQ // Number of inspections';


COMMENT ON COLUMN mst_insp_act_all.src_no1 IS '作成元ＮＯ１ // #MA.SRC_NO // Source No. 1';


COMMENT ON COLUMN mst_insp_act_all.src_no2 IS '作成元ＮＯ２ // #MA.SRC_NO // Source No. 2';


COMMENT ON COLUMN mst_insp_act_all.insp_typ IS '検査種類区分 // #MS.INSP_TYP // Inspection classification type';


COMMENT ON COLUMN mst_insp_act_all.insp_mtd_typ IS '検査方法区分 // #MA.INSP_MTD_TYP // Inspection method type';


COMMENT ON COLUMN mst_insp_act_all.dfct_rsn_cd IS '不良理由ＣＤ // #MA.BIZ_RSN_CD // Defective reason cd.';


COMMENT ON COLUMN mst_insp_act_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_insp_act_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_insp_act_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_insp_act_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_insp_act_all.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_insp_act_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_insp_act_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_insp_act_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_insp_act_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_insp_act_all.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mst_insp_act_all.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_insp_act_all.from_site_cd IS '出荷元工場・物流倉庫ＣＤ // #MA.SITE_CD // Shipping point factory/distribution warehouse cd.';


COMMENT ON COLUMN mst_insp_act_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_insp_act_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_insp_act_all.good_qty IS '良品数量 // #MA.QTY // Conforming qty.';


COMMENT ON COLUMN mst_insp_act_all.dfct_qty IS '不良品数量 // #MA.QTY // Defective qty.';


COMMENT ON COLUMN mst_insp_act_all.st_tm IS '検査開始日時 // #MA.TM // Inspection start date and time';


COMMENT ON COLUMN mst_insp_act_all.end_tm IS '検査終了日時 // #MA.TM // Inspection finish date and time';


COMMENT ON COLUMN mst_insp_act_all.act_usr_cd IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN mst_insp_act_all.act_dpt_cd IS '実施部門ＣＤ // #MA.DPT_CD // Implement dept. cd.';


COMMENT ON COLUMN mst_insp_act_all.judg_dt IS '判定日 // #MA.DT // Decision date';


COMMENT ON COLUMN mst_insp_act_all.judg_tm IS '判定日時 // #MA.TM // Decision date and time';


COMMENT ON COLUMN mst_insp_act_all.insp_judg_rslt_typ IS '検査判定結果区分 // #MS.INSP_JUDG_RSLT_TYP // Inspection decision result type';


COMMENT ON COLUMN mst_insp_act_all.judg_dpt_cd IS '判定部門ＣＤ // #MA.DPT_CD // Decision dept. cd.';


COMMENT ON COLUMN mst_insp_act_all.judg_usr_cd IS '判定者ＣＤ // #MA.USR_CD // Decision PIC cd.';


COMMENT ON COLUMN mst_insp_act_all.judg_rsn IS '判定理由 // #MS.INSP_JUDG_RSN // Decision reason';


COMMENT ON COLUMN mst_insp_act_all.lmt_dt_frm_typ IS '期限起算日区分 // #MA.LMT_DT_FRM_TYP // Expiration base date type';


COMMENT ON COLUMN mst_insp_act_all.lmt_dt_frm IS '起算日 // #MA.DT // Base date';


COMMENT ON COLUMN mst_insp_act_all.vld_dt IS '有効期限 // #MA.DT // Expiration date';


COMMENT ON COLUMN mst_insp_act_all.lmt_dt IS '使用期限 // #MA.DT // Usage expiration date';


COMMENT ON COLUMN mst_insp_act_all.not_upd_stk_flg IS '在庫更新不要ＦＬＧ // #MA.FLG // Inventory update not necessary flg.';


COMMENT ON COLUMN mst_insp_act_all.intr_rmrks IS '内部備考 // #MS.INSP_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_insp_act_all.sub_char1 IS '予備１ // #MS.INSP_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_insp_act_all.sub_char2 IS '予備２ // #MS.INSP_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_insp_act_all.sub_char3 IS '予備３ // #MS.INSP_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_insp_act_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_insp_act_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_insp_act_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_insp_act_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_insp_act_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_insp_act_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_insp_act_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_insp_act_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_insp_act_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_insp_act_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mst_insp_act_all.lims_flg IS 'ＬＩＭＳＦＬＧ // #MA.FLG // LIMS flg.';


COMMENT ON COLUMN mst_insp_act_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_insp_act_all.ext_insp_act_no IS '外部検査実績ＮＯ // #MA.EXT_INSP_ACT_NO // External inspection result No.';


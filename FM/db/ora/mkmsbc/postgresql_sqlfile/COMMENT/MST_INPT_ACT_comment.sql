\encoding UTF-8

COMMENT ON VIEW mst_inpt_act IS '投入実績 // Input result';


COMMENT ON COLUMN mst_inpt_act.inpt_act_no IS '投入実績ＮＯ // #MA.INPT_ACT_NO // Input result No.';


COMMENT ON COLUMN mst_inpt_act.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_inpt_act.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_inpt_act.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_inpt_act.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_inpt_act.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_inpt_act.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mst_inpt_act.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_inpt_act.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mst_inpt_act.inpt_schd_no IS '投入予定ＮＯ // #MA.INPT_SCHD_NO // Input schedule No.';


COMMENT ON COLUMN mst_inpt_act.div_seq IS '分割連番 // #MS.DIV_SEQ // Split sequence number';


COMMENT ON COLUMN mst_inpt_act.inpt_loc_cd IS '投入場所ＣＤ // #MA.LOC_CD // Input location cd.';


COMMENT ON COLUMN mst_inpt_act.inpt_str_ln_cd IS '投入棚・ラインＣＤ // #MA.STR_LN_CD // Input rack/line cd.';


COMMENT ON COLUMN mst_inpt_act.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_inpt_act.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_inpt_act.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_inpt_act.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_inpt_act.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_inpt_act.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_inpt_act.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_inpt_act.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_inpt_act.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_inpt_act.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_inpt_act.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_inpt_act.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_inpt_act.base_unit_inpt_qty IS '基準単位投入数量 // #MA.QTY // Base unit input qty.';


COMMENT ON COLUMN mst_inpt_act.base_unit_loss_qty IS '基準単位ロス数量 // #MA.QTY // Base unit loss qty.';


COMMENT ON COLUMN mst_inpt_act.base_unit_fxd_loss_qty IS '基準単位固定ロス数量 // #MA.QTY // Base unit constant loss qty.';


COMMENT ON COLUMN mst_inpt_act.base_unit_cd IS '投入基準単位ＣＤ // #MA.UNIT_CD // Input base unit cd.';


COMMENT ON COLUMN mst_inpt_act.act_tm IS '実績日時 // #MA.TM // Actual date and time';


COMMENT ON COLUMN mst_inpt_act.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_inpt_act.bkf_ctl_flg IS 'バックフラッシュ更新許可ＦＬＧ // #MA.FLG // Allow backflush update flg.';


COMMENT ON COLUMN mst_inpt_act.base_unit_std_qty IS '基準単位標準投入数量 // #MA.QTY // Base unit standard input qty.';


COMMENT ON COLUMN mst_inpt_act.cont_qty IS '有効成分（投入数量） // #MA.CONT_QTY // Active ingredient (Input qty.)';


COMMENT ON COLUMN mst_inpt_act.cont_loss_qty IS '有効成分（ロス数量） // #MA.CONT_QTY // Active ingredient (Loss qty.)';


COMMENT ON COLUMN mst_inpt_act.cont_fxd_loss_qty IS '有効成分（固定ロス数量） // #MA.CONT_QTY // Active ingredient (Constant loss qty.)';


COMMENT ON COLUMN mst_inpt_act.cont_fctr_unit_cd IS '有効成分単位ＣＤ // #MA.UNIT_CD // Active ingredient unit cd.';


COMMENT ON COLUMN mst_inpt_act.act_cont_fctr IS '実際有効成分係数 // #MA.ACT_CONT_FCTR // Actual active ingredient coefficient';


COMMENT ON COLUMN mst_inpt_act.acxfr_qty IS '他勘定振替数量 // #MA.QTY // Other accounting transfer qty.';


COMMENT ON COLUMN mst_inpt_act.acxfr_rsn_cd IS '他勘定振替理由ＣＤ // #MA.BIZ_RSN_CD // Other accounting transfer reason cd.';


COMMENT ON COLUMN mst_inpt_act.acxfr_bd_dpt_cd IS '他勘定振替負担部門ＣＤ // #MA.DPT_CD // Other accounting transfer charged dept. cd.';


COMMENT ON COLUMN mst_inpt_act.inpt_rsn_cd IS '投入理由ＣＤ // #MA.BIZ_RSN_CD // Input reason cd.';


COMMENT ON COLUMN mst_inpt_act.add_flg IS '追加ＦＬＧ // #MA.FLG // Add flg.';


COMMENT ON COLUMN mst_inpt_act.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_inpt_act.mes_id IS 'ＭＥＳＩＤ // #MS.MES_ID // MES ID';


COMMENT ON COLUMN mst_inpt_act.mes_flg IS 'ＭＥＳＦＬＧ // #MA.FLG // MES flg.';


COMMENT ON COLUMN mst_inpt_act.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_inpt_act.ext_inpt_act_no IS '外部投入実績ＮＯ // #MA.EXT_INPT_ACT_NO // External input result No.';


COMMENT ON COLUMN mst_inpt_act.if_auto_reg_flg IS 'ＩＦ自動作成ＦＬＧ // #MA.FLG // IF auto-create flg.';


COMMENT ON COLUMN mst_inpt_act.intr_rmrks IS '内部備考 // #MS.INPT_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_inpt_act.act_rpt_rmrks IS '記録書備考 // #MS.INPT_ACT_RPT_RMRKS // Record sheet remarks';


COMMENT ON COLUMN mst_inpt_act.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_inpt_act.sub_char1 IS '予備１ // #MS.INPT_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_inpt_act.sub_char2 IS '予備２ // #MS.INPT_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_inpt_act.sub_char3 IS '予備３ // #MS.INPT_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_inpt_act.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_inpt_act.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_inpt_act.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_inpt_act.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_inpt_act.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_inpt_act.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_inpt_act.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_inpt_act.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_inpt_act.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_inpt_act.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


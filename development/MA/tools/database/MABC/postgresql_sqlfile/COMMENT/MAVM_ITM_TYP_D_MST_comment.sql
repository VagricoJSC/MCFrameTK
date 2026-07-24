\encoding UTF-8

COMMENT ON VIEW mavm_itm_typ_d_mst IS '品目区分詳細マスタビュー // Item type details master view';


COMMENT ON COLUMN mavm_itm_typ_d_mst.itm_typ IS '品目区分 // #MA.ITM_TYP // Item type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.itm_typ_d_cd IS '品目区分詳細ＣＤ // #MA.ITM_TYP_D_CD // Item type details cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.itm_typ_d_nm IS '品目区分詳細名 // #MA.ITM_TYP_D_NM // Item type details name';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sls_flg IS '販売ＦＬＧ // #MA.FLG // Sales flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_mfg_flg IS '製造ＦＬＧ // #MA.FLG // Mfg. flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_purc_flg IS '購買ＦＬＧ // #MA.FLG // Purchasing flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_insp_flg IS '検査ＦＬＧ // #MA.FLG // Inspection flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_itm_jnl_cd IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_ac_itm_grp_cd IS '会計品目分類ＣＤ // #MA.AC_ITM_GRP_CD // Accounting item classification cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_minus_stk_flg IS 'マイナス在庫許可ＦＬＧ // #MA.FLG // Allow negative inventory flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_not_new_lot_flg IS '新規ロット入力不可ＦＬＧ // #MA.FLG // Do not allow new lot input flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_gi_alloc_flg IS '出庫引当確認ＦＬＧ // #MA.FLG // GI allocation check flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_pack_alloc_flg IS '荷姿引当ＦＬＧ // #MA.FLG // SKU allocation flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_bp_lot_flg IS '業者ロットＮＯ必須ＦＬＧ // #MA.FLG // Vendor Lot No. required flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_comp_spec_typ IS '構成・仕様管理区分 // #MA.COMP_SPEC_TYP // Configuration/specification management type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_comp_rev_at_slo_flg IS '受注時構成改訂許可ＦＬＧ // #MA.FLG // Allow sales order configuration rev. flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_comp_core_itm_flg IS '構成主品目ＦＬＧ // #MA.FLG // Configuration main item flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_skip_chk_ship_flg IS '出荷時構成チェック不要ＦＬＧ // #MA.FLG // Component check not required at shipping flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_itm_spec_grp_cd IS '品目仕様分類ＣＤ // #MA.ITM_SPEC_GRP_CD // Item specification classification cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sls_upri_grp_cd IS '販売単価分類ＣＤ // #MA.SLS_UPRI_GRP_CD // Sales unit price classification cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_slo_proc_flg IS '受注手配品ＦＬＧ // #MA.FLG // Sales order procurement item flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_slo_proc_typ IS '受注手配区分 // #MA.SLO_PROC_TYP // Sales order procurement type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_ship_inst_typ IS '出荷指図区分 // #MA.SHIP_INST_TYP // Shipping order type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_ship_lot_back_stop_flg IS '出荷ロット逆転禁止ＦＬＧ // #MA.FLG // Shipping lot reverse prohibit flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_itm_ship_grp_cd IS '品目出荷グループＣＤ // #MA.ITM_SHIP_GRP_CD // Item shipping group cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_ship_valid_grp_cd IS '出荷有効期限グループＣＤ // #MA.SHIP_VALID_GRP_CD // Shipping expiration date group cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_arr_skip_flg IS '入荷不要ＦＬＧ // #MA.FLG // Not receipt flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_ship_term_cd IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_stk_lst_flg IS '現品票出力対象ＦＬＧ // #MA.FLG // For identification tag output flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_mfg_inst_unit_typ IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sls_upri_cng_flg IS '販売単価変更許可ＦＬＧ // #MA.FLG // Allow sales unit price change flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_purc_upri_cng_flg IS '購買単価変更許可ＦＬＧ // #MA.FLG // Allow purchasing unit price change flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_prov_upri_cng_flg IS '支給単価変更許可ＦＬＧ // #MA.FLG // Allow supply unit price change flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_mrp_proc_typ IS 'ＭＲＰ処理区分 // #MA.MRP_PROC_TYP // MRP process type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_rqmt_typ IS '所要区分 // #MA.RQMT_TYP // Requirements type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_prod_pln_typ IS '生産計画立案区分 // #MA.PROD_PLN_TYP // Production planning type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_dmnd_date_div_mons IS '需要日ばらし月数 // #MA.MONS // Number of months for demand disaggregation by day';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_alloc_margin_days IS '引当余裕日数 // #MA.DAYS // Allocation extra days';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_mrp_alloc_margin_days IS 'ＭＲＰ引当余裕日数 // #MA.DAYS // MRP allocation extra days';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_mrp_opn_xfr_days IS 'ＭＲＰ未確定移送依頼考慮日数 // #MA.DAYS // Days to consider unfirm transport request in MRP';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_inpt_itm_add_flg IS '投入品追加許可ＦＬＧ // #MA.FLG // Allow input item addition flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_inpt_itm_del_flg IS '投入品削除許可ＦＬＧ // #MA.FLG // Allow input item deletion flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sch_flg IS 'スケジューラＦＬＧ // #MA.FLG // Scheduler flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_lot_mng_typ IS 'ロット管理区分 // #MA.LOT_MNG_TYP // Lot management type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_lot_no_typ IS 'ロットＮＯ発番区分 // #MA.LOT_NO_TYP // Lot No. numbering type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_lot_no_ptn_cd IS 'ロットＮＯ発番パタンＣＤ // #MA.NUM_PTN_CD // Lot No. numbering pattern cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sublot_mng_typ IS 'サブロット管理区分 // #MA.SUBLOT_MNG_TYP // Sublot management type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sublot_no_typ IS 'サブロットＮＯ発番区分 // #MA.LOT_NO_TYP // Sublot No. numbering type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sublot_no_ptn_cd IS 'サブロットＮＯ発番パタンＣＤ // #MA.NUM_PTN_CD // Sublot No. numbering pattern cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno1_mng_typ IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_slo_sno1_flg IS '受注手配ＮＯ１必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 1 required flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_rqmt_sno1_flg IS '所要手配ＮＯ１必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 1 required flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno1_num_typ IS '手配ＮＯ１発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 1 numbering type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno1_ptn_cd IS '手配ＮＯ１発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 1 numbering pattern cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno2_mng_typ IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_slo_sno2_flg IS '受注手配ＮＯ２必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 2 required flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_rqmt_sno2_flg IS '所要手配ＮＯ２必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 2 required flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno2_num_typ IS '手配ＮＯ２発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 2 numbering type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno2_ptn_cd IS '手配ＮＯ２発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 2 numbering pattern cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno3_mng_typ IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_slo_sno3_flg IS '受注手配ＮＯ３必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 3 required flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_rqmt_sno3_flg IS '所要手配ＮＯ３必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 3 required flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno3_num_typ IS '手配ＮＯ３発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 3 numbering type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno3_ptn_cd IS '手配ＮＯ３発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 3 numbering pattern cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno4_mng_typ IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_slo_sno4_flg IS '受注手配ＮＯ４必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 4 required flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_rqmt_sno4_flg IS '所要手配ＮＯ４必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 4 required flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno4_num_typ IS '手配ＮＯ４発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 4 numbering type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno4_ptn_cd IS '手配ＮＯ４発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 4 numbering pattern cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_lmt_ctl_flg IS '期限管理対象ＦＬＧ // #MA.FLG // For expiration management flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_lmt_ctl_categ IS '期限管理種別 // #MA.LMT_CTL_CATEG // Expiration management type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_ver_flg IS '版管理対象ＦＬＧ // #MA.FLG // For version control flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_insp_bind_typ IS '検査実施単位区分 // #MA.INSP_BIND_TYP // Inspection implementation unit type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_mrkt_judg_flg IS '市場出荷判定対象ＦＬＧ // #MA.FLG // For market release decision flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_mrkt_judg_role_cd IS '市場出荷判定承認役割ＣＤ // #MA.APRV_ROLE_CD // Market release decision approval role cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_mrkt_judg_upd_role_cd IS '市場出荷判定更新役割ＣＤ // #MA.APRV_ROLE_CD // Market release decision update role cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_plnt_aprv_flg IS '工場出荷承認対象ＦＬＧ // #MA.FLG // For factory release approval flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_plnt_aprv_role_cd IS '工場出荷承認役割ＣＤ // #MA.APRV_ROLE_CD // Factory release approval role cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_insp_aprv_flg IS '検査承認対象ＦＬＧ // #MA.FLG // For inspection approval flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_insp_aprv_role_cd IS '検査承認役割ＣＤ // #MA.APRV_ROLE_CD // Inspection approval role cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_mfg_aprv_flg IS '製造承認対象ＦＬＧ // #MA.FLG // For mfg. approval flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_mfg_aprv_role_cd IS '製造承認役割ＣＤ // #MA.APRV_ROLE_CD // Mfg. approval role cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno_typ1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno_typ2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno_typ3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sno_typ4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_inst_lot_fix_flg IS '指図時ロット指定ＦＬＧ // #MA.FLG // Lot specification at order flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_lot_mix_flg IS 'ロット混在ＦＬＧ // #MA.FLG // Lot mixed flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_sublot_mix_flg IS 'サブロット混在ＦＬＧ // #MA.FLG // Sublot mixed flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_alloc_ctl_typ IS '引当制御区分 // #MA.ALLOC_CTL_TYP // Allocation control type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_inpt_ctl_typ IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_bkf_typ IS 'バックフラッシュ区分 // #MA.BKF_TYP // Backflush type';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_main_itm_flg IS '引継対象子品目ＦＬＧ // #MA.FLG // Copy-from child item flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_byprod_flg IS '副産品ＦＬＧ // #MA.FLG // By-product flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_not_cost_bom_flg IS '原価対象外ＦＬＧ（ＢＯＭ） // #MA.FLG // Not costing flg. (BOM)';


COMMENT ON COLUMN mavm_itm_typ_d_mst.def_calc_ptn_cd IS '計算パタンＣＤ // #MA.CALC_PTN_CD // Calculation pattern cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_itm_typ_d_mst.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_itm_typ_d_mst.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mavm_itm_typ_d_mst.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mavm_itm_typ_d_mst.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mavm_itm_typ_d_mst.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mavm_itm_typ_d_mst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mavm_itm_typ_d_mst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mavm_itm_typ_d_mst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mavm_itm_typ_d_mst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mavm_itm_typ_d_mst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mavm_itm_typ_d_mst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mavm_itm_typ_d_mst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mavm_itm_typ_d_mst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mavm_itm_typ_d_mst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mavm_itm_typ_d_mst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_itm_typ_d_mst.itm_typ_d_nm_lcl1 IS '品目区分詳細名（ロケール１） // #MA.ITM_TYP_D_NM // Item type details name (Locale1)';


COMMENT ON COLUMN mavm_itm_typ_d_mst.itm_typ_d_nm_lcl2 IS '品目区分詳細名（ロケール２） // #MA.ITM_TYP_D_NM // Item type details name (Locale2)';


COMMENT ON COLUMN mavm_itm_typ_d_mst.itm_typ_d_nm_lcl3 IS '品目区分詳細名（ロケール３） // #MA.ITM_TYP_D_NM // Item type details name (Locale3)';


COMMENT ON COLUMN mavm_itm_typ_d_mst.itm_typ_d_nm_lcl4 IS '品目区分詳細名（ロケール４） // #MA.ITM_TYP_D_NM // Item type details name (Locale4)';


COMMENT ON COLUMN mavm_itm_typ_d_mst.itm_typ_d_nm_lcl5 IS '品目区分詳細名（ロケール５） // #MA.ITM_TYP_D_NM // Item type details name (Locale5)';


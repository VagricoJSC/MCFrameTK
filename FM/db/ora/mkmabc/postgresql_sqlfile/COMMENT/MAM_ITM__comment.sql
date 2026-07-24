\encoding UTF-8

COMMENT ON VIEW mam_itm_ IS '品目マスタ // Item master';


COMMENT ON COLUMN mam_itm_.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_itm_.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_itm_.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_itm_.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_itm_.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mam_itm_.itm_alt_nm1 IS '品目別名１ // #MA.ITM_ALT_NM1 // Item alias name 1';


COMMENT ON COLUMN mam_itm_.itm_alt_nm2 IS '品目別名２ // #MA.ITM_ALT_NM2 // Item alias name 2';


COMMENT ON COLUMN mam_itm_.itm_alt_nm3 IS '品目別名３ // #MA.ITM_ALT_NM3 // Item alias name 3';


COMMENT ON COLUMN mam_itm_.itm_alt_nm4 IS '品目別名４ // #MA.ITM_ALT_NM4 // Item alias name 4';


COMMENT ON COLUMN mam_itm_.base_itm_nm IS '標準品名 // #MA.ITM_NM // Standard Item name';


COMMENT ON COLUMN mam_itm_.base_itm_alt_nm1 IS '標準品目別名１ // #MA.ITM_ALT_NM1 // Standard item alias name 1';


COMMENT ON COLUMN mam_itm_.base_itm_alt_nm2 IS '標準品目別名２ // #MA.ITM_ALT_NM2 // Standard item alias name 2';


COMMENT ON COLUMN mam_itm_.base_itm_alt_nm3 IS '標準品目別名３ // #MA.ITM_ALT_NM3 // Standard item alias name 3';


COMMENT ON COLUMN mam_itm_.base_itm_alt_nm4 IS '標準品目別名４ // #MA.ITM_ALT_NM4 // Standard item alias name 4';


COMMENT ON COLUMN mam_itm_.itm_grp_cd1 IS '品目分類ＣＤ１ // #MA.ITM_GRP_CD // Item classification cd. 1';


COMMENT ON COLUMN mam_itm_.itm_grp_cd2 IS '品目分類ＣＤ２ // #MA.ITM_GRP_CD // Item classification cd. 2';


COMMENT ON COLUMN mam_itm_.itm_grp_cd3 IS '品目分類ＣＤ３ // #MA.ITM_GRP_CD // Item classification cd. 3';


COMMENT ON COLUMN mam_itm_.itm_grp_cd4 IS '品目分類ＣＤ４ // #MA.ITM_GRP_CD // Item classification cd. 4';


COMMENT ON COLUMN mam_itm_.itm_grp_cd5 IS '品目分類ＣＤ５ // #MA.ITM_GRP_CD // Item classification cd. 5';


COMMENT ON COLUMN mam_itm_.itm_grp_cd6 IS '品目分類ＣＤ６ // #MA.ITM_GRP_CD // Item classification cd. 6';


COMMENT ON COLUMN mam_itm_.itm_grp_cd7 IS '品目分類ＣＤ７ // #MA.ITM_GRP_CD // Item classification cd. 7';


COMMENT ON COLUMN mam_itm_.itm_grp_cd8 IS '品目分類ＣＤ８ // #MA.ITM_GRP_CD // Item classification cd. 8';


COMMENT ON COLUMN mam_itm_.itm_grp_cd9 IS '品目分類ＣＤ９ // #MA.ITM_GRP_CD // Item classification cd. 9';


COMMENT ON COLUMN mam_itm_.itm_grp_cd10 IS '品目分類ＣＤ１０ // #MA.ITM_GRP_CD // Item classification cd. 10';


COMMENT ON COLUMN mam_itm_.stk_mng_typ IS '在庫管理区分 // #MA.STK_MNG_TYP // Inventory management type';


COMMENT ON COLUMN mam_itm_.asset_mng_typ IS '資産管理区分 // #MA.ASSET_MNG_TYP // Asset management type';


COMMENT ON COLUMN mam_itm_.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mam_itm_.dscnt_itm_flg IS '値引品目ＦＬＧ // #MA.FLG // Discount item flg.';


COMMENT ON COLUMN mam_itm_.unit_cd IS '単位ＣＤ // #MA.UNIT_CD // Unit cd.';


COMMENT ON COLUMN mam_itm_.dec_place IS '小数部有効桁数 // #MA.DEC_PLACE // Number of decimal places';


COMMENT ON COLUMN mam_itm_.rnd_typ IS '端数処理区分 // #MA.RND_TYP // Rounding type';


COMMENT ON COLUMN mam_itm_.dim_unit_cd IS '容積単位ＣＤ // #MA.UNIT_CD // Volume unit cd.';


COMMENT ON COLUMN mam_itm_.dim IS '容積 // #MA.DIM // Volume';


COMMENT ON COLUMN mam_itm_.wt_unit_cd IS '重量単位ＣＤ // #MA.UNIT_CD // Weight unit cd.';


COMMENT ON COLUMN mam_itm_.wt IS '重量 // #MA.WT // Weight';


COMMENT ON COLUMN mam_itm_.conts_unit_cd IS '入り目単位ＣＤ // #MA.UNIT_CD // Conversion unit cd.';


COMMENT ON COLUMN mam_itm_.conts_qty IS '入り目数 // #MA.QTY // Conversion qty.';


COMMENT ON COLUMN mam_itm_.unit_dim IS '単位容積（ｍ３） // #MA.DIM // Unit volume (m3)';


COMMENT ON COLUMN mam_itm_.unit_wt IS '単位重量（ＫＧ） // #MA.WT // Unit weight (KG)';


COMMENT ON COLUMN mam_itm_.hs_cd IS 'ＨＳ ＣＤ // #MA.HS_CD // HS cd.';


COMMENT ON COLUMN mam_itm_.jan_typ IS 'ＪＡＮ区分 // #MA.JAN_TYP // JAN type';


COMMENT ON COLUMN mam_itm_.jan_cd IS 'ＪＡＮ ＣＤ // #MA.JAN_CD // JAN cd.';


COMMENT ON COLUMN mam_itm_.itf_cd IS 'ＩＴＦ ＣＤ // #MA.ITF_CD // ITF cd.';


COMMENT ON COLUMN mam_itm_.gtin_cd IS 'ＧＴＩＮ ＣＤ // #MA.GTIN_CD // GTIN cd.';


COMMENT ON COLUMN mam_itm_.th_image IS 'サムネイル画像 // #MA.BIN // Thumbnail image';


COMMENT ON COLUMN mam_itm_.sls_itm_grp_cd IS '販売品目体系ＣＤ // #MA.SLS_ITM_GRP_CD // Sales item system cd.';


COMMENT ON COLUMN mam_itm_.memo1_c IS 'メモ１（共通） // #MA.MST_MEMO1 // Memo 1 (Common)';


COMMENT ON COLUMN mam_itm_.memo2_c IS 'メモ２（共通） // #MA.MST_MEMO1 // Memo 2 (Common)';


COMMENT ON COLUMN mam_itm_.memo3_c IS 'メモ３（共通） // #MA.MST_MEMO1 // Memo 3 (Common)';


COMMENT ON COLUMN mam_itm_.ins_usr_id_c IS '登録ユーザＩＤ（共通） // #MA.FCM_USR_ID // Entry user ID (Common)';


COMMENT ON COLUMN mam_itm_.ins_usr_nm_c IS '登録ユーザ名（共通） // #MA.FCM_USR_NM // Entry user name (Common)';


COMMENT ON COLUMN mam_itm_.ins_ts_c IS '登録日時（共通） // #MA.SYS_TS // Entry date and time (Common)';


COMMENT ON COLUMN mam_itm_.ins_func_id_c IS '登録機能ＩＤ（共通） // #MA.SCREEN_ID // Entry function ID (Common)';


COMMENT ON COLUMN mam_itm_.upd_cntr_c IS '更新カウンタ（共通） // #MA.UPD_CNT // Update counter (Common)';


COMMENT ON COLUMN mam_itm_.upd_usr_id_c IS '更新ユーザＩＤ（共通） // #MA.FCM_USR_ID // Update user ID (Common)';


COMMENT ON COLUMN mam_itm_.upd_usr_nm_c IS '登録ユーザ名（共通） // #MA.FCM_USR_NM // Entry user name (Common)';


COMMENT ON COLUMN mam_itm_.upd_ts_c IS '更新日時（共通） // #MA.SYS_TS // Update date and time (Common)';


COMMENT ON COLUMN mam_itm_.upd_func_id_c IS '更新機能ＩＤ（共通） // #MA.FUNC_ID // Update function ID (Common)';


COMMENT ON COLUMN mam_itm_.upd_srv_req_no_c IS '更新リクエストＮＯ（共通） // #MA.SRV_REQ_NO // Update request No. (Common)';


COMMENT ON COLUMN mam_itm_.itm_typ IS '品目区分 // #MA.ITM_TYP // Item type';


COMMENT ON COLUMN mam_itm_.itm_typ_d_cd IS '品目区分詳細ＣＤ // #MA.ITM_TYP_D_CD // Item type details cd.';


COMMENT ON COLUMN mam_itm_.itm_jnl_cd IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN mam_itm_.ac_itm_grp_cd IS '会計品目分類ＣＤ // #MA.AC_ITM_GRP_CD // Accounting item classification cd.';


COMMENT ON COLUMN mam_itm_.minus_stk_flg IS 'マイナス在庫許可ＦＬＧ // #MA.FLG // Allow negative inventory flg.';


COMMENT ON COLUMN mam_itm_.not_new_lot_flg IS '新規ロット入力不可ＦＬＧ // #MA.FLG // Do not allow new lot input flg.';


COMMENT ON COLUMN mam_itm_.gi_alloc_flg IS '出庫引当確認ＦＬＧ // #MA.FLG // GI allocation check flg.';


COMMENT ON COLUMN mam_itm_.sls_tax_cd IS '売上税ＣＤ // #MA.TAX_CD // Sales tax cd.';


COMMENT ON COLUMN mam_itm_.purc_tax_cd IS '仕入税ＣＤ // #MA.TAX_CD // Purchase tax cd.';


COMMENT ON COLUMN mam_itm_.prov_tax_cd IS '支給税ＣＤ // #MA.TAX_CD // Supply tax cd.';


COMMENT ON COLUMN mam_itm_.wtax_rate IS '源泉税率 // #MA.TAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mam_itm_.ship_unit_cd IS '出荷単位ＣＤ // #MA.UNIT_CD // Shipping unit cd.';


COMMENT ON COLUMN mam_itm_.mfg_unit_cd IS '製造単位ＣＤ // #MA.UNIT_CD // Mfg. unit cd.';


COMMENT ON COLUMN mam_itm_.purc_unit_cd IS '発注単位ＣＤ // #MA.UNIT_CD // PO unit cd.';


COMMENT ON COLUMN mam_itm_.po_schd_unit_cd IS '発注予定単位ＣＤ // #MA.UNIT_CD // PO schedule unit cd.';


COMMENT ON COLUMN mam_itm_.pack_alloc_flg IS '荷姿引当ＦＬＧ // #MA.FLG // SKU allocation flg.';


COMMENT ON COLUMN mam_itm_.pckg_unit_cd IS '梱包単位ＣＤ // #MA.UNIT_CD // Packing unit cd.';


COMMENT ON COLUMN mam_itm_.lot_mng_typ IS 'ロット管理区分 // #MA.LOT_MNG_TYP // Lot management type';


COMMENT ON COLUMN mam_itm_.lot_no_typ IS 'ロットＮＯ発番区分 // #MA.LOT_NO_TYP // Lot No. numbering type';


COMMENT ON COLUMN mam_itm_.lot_no_ptn_cd IS 'ロットＮＯ発番パタンＣＤ // #MA.NUM_PTN_CD // Lot No. numbering pattern cd.';


COMMENT ON COLUMN mam_itm_.sublot_mng_typ IS 'サブロット管理区分 // #MA.SUBLOT_MNG_TYP // Sublot management type';


COMMENT ON COLUMN mam_itm_.sublot_no_typ IS 'サブロットＮＯ発番区分 // #MA.LOT_NO_TYP // Sublot No. numbering type';


COMMENT ON COLUMN mam_itm_.sublot_no_ptn_cd IS 'サブロットＮＯ発番パタンＣＤ // #MA.NUM_PTN_CD // Sublot No. numbering pattern cd.';


COMMENT ON COLUMN mam_itm_.bp_lot_flg IS '業者ロットＮＯ必須ＦＬＧ // #MA.FLG // Vendor Lot No. required flg.';


COMMENT ON COLUMN mam_itm_.insp_bind_typ IS '検査実施単位区分 // #MA.INSP_BIND_TYP // Inspection implementation unit type';


COMMENT ON COLUMN mam_itm_.skip_chk_ship_flg IS '出荷時構成チェック不要ＦＬＧ // #MA.FLG // Component check not required at shipping flg.';


COMMENT ON COLUMN mam_itm_.mrkt_judg_flg IS '市場出荷判定対象ＦＬＧ // #MA.FLG // For market release decision flg.';


COMMENT ON COLUMN mam_itm_.mrkt_judg_role_cd IS '市場出荷判定承認役割ＣＤ // #MA.APRV_ROLE_CD // Market release decision approval role cd.';


COMMENT ON COLUMN mam_itm_.mrkt_judg_upd_role_cd IS '市場出荷判定更新役割ＣＤ // #MA.APRV_ROLE_CD // Market release decision update role cd.';


COMMENT ON COLUMN mam_itm_.lmt_ctl_flg IS '期限管理対象ＦＬＧ // #MA.FLG // For expiration management flg.';


COMMENT ON COLUMN mam_itm_.lmt_ctl_categ IS '期限管理種別 // #MA.LMT_CTL_CATEG // Expiration management type';


COMMENT ON COLUMN mam_itm_.cont_fctr_flg IS '有効成分対象ＦＬＧ // #MA.FLG // For active ingredient flg.';


COMMENT ON COLUMN mam_itm_.std_cont_fctr IS '標準有効成分係数 // #MA.STD_CONT_FCTR // Standard active ingredient coefficient';


COMMENT ON COLUMN mam_itm_.cont_fctr_unit_cd IS '有効成分単位ＣＤ // #MA.UNIT_CD // Active ingredient unit cd.';


COMMENT ON COLUMN mam_itm_.cont_fctr_rnd_typ IS '有効成分換算端数処理区分 // #MA.RND_TYP // Rounding type (Active ingredient conversion)';


COMMENT ON COLUMN mam_itm_.cont_fctr_dec_place IS '有効成分小数部有効桁数 // #MA.DEC_PLACE // Active ingredient number of decimal places';


COMMENT ON COLUMN mam_itm_.sno1_mng_typ IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN mam_itm_.slo_sno1_flg IS '受注手配ＮＯ１必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 1 required flg.';


COMMENT ON COLUMN mam_itm_.rqmt_sno1_flg IS '所要手配ＮＯ１必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 1 required flg.';


COMMENT ON COLUMN mam_itm_.sno1_num_typ IS '手配ＮＯ１発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 1 numbering type';


COMMENT ON COLUMN mam_itm_.sno1_ptn_cd IS '手配ＮＯ１発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 1 numbering pattern cd.';


COMMENT ON COLUMN mam_itm_.sno2_mng_typ IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN mam_itm_.slo_sno2_flg IS '受注手配ＮＯ２必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 2 required flg.';


COMMENT ON COLUMN mam_itm_.rqmt_sno2_flg IS '所要手配ＮＯ２必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 2 required flg.';


COMMENT ON COLUMN mam_itm_.sno2_num_typ IS '手配ＮＯ２発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 2 numbering type';


COMMENT ON COLUMN mam_itm_.sno2_ptn_cd IS '手配ＮＯ２発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 2 numbering pattern cd.';


COMMENT ON COLUMN mam_itm_.sno3_mng_typ IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN mam_itm_.slo_sno3_flg IS '受注手配ＮＯ３必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 3 required flg.';


COMMENT ON COLUMN mam_itm_.rqmt_sno3_flg IS '所要手配ＮＯ３必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 3 required flg.';


COMMENT ON COLUMN mam_itm_.sno3_num_typ IS '手配ＮＯ３発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 3 numbering type';


COMMENT ON COLUMN mam_itm_.sno3_ptn_cd IS '手配ＮＯ３発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 3 numbering pattern cd.';


COMMENT ON COLUMN mam_itm_.sno4_mng_typ IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN mam_itm_.slo_sno4_flg IS '受注手配ＮＯ４必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 4 required flg.';


COMMENT ON COLUMN mam_itm_.rqmt_sno4_flg IS '所要手配ＮＯ４必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 4 required flg.';


COMMENT ON COLUMN mam_itm_.sno4_num_typ IS '手配ＮＯ４発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 4 numbering type';


COMMENT ON COLUMN mam_itm_.sno4_ptn_cd IS '手配ＮＯ４発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 4 numbering pattern cd.';


COMMENT ON COLUMN mam_itm_.def_bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mam_itm_.mfg_inst_unit_typ IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN mam_itm_.mrp_proc_typ IS 'ＭＲＰ処理区分 // #MA.MRP_PROC_TYP // MRP process type';


COMMENT ON COLUMN mam_itm_.rqmt_typ IS '所要区分 // #MA.RQMT_TYP // Requirements type';


COMMENT ON COLUMN mam_itm_.prod_pln_typ IS '生産計画立案区分 // #MA.PROD_PLN_TYP // Production planning type';


COMMENT ON COLUMN mam_itm_.dmnd_date_div_mons IS '需要日ばらし月数 // #MA.MONS // Number of months for demand disaggregation by day';


COMMENT ON COLUMN mam_itm_.alloc_margin_days IS '引当余裕日数 // #MA.DAYS // Allocation extra days';


COMMENT ON COLUMN mam_itm_.mrp_alloc_margin_days IS 'ＭＲＰ引当余裕日数 // #MA.DAYS // MRP allocation extra days';


COMMENT ON COLUMN mam_itm_.mrp_opn_xfr_days IS 'ＭＲＰ未確定移送依頼考慮日数 // #MA.DAYS // Days to consider unfirm transport request in MRP';


COMMENT ON COLUMN mam_itm_.rqmt_rstr_qty IS '所要抑制量 // #MA.QTY // Requirements restricted qty.';


COMMENT ON COLUMN mam_itm_.inpt_itm_add_flg IS '投入品追加許可ＦＬＧ // #MA.FLG // Allow input item addition flg.';


COMMENT ON COLUMN mam_itm_.inpt_itm_del_flg IS '投入品削除許可ＦＬＧ // #MA.FLG // Allow input item deletion flg.';


COMMENT ON COLUMN mam_itm_.sch_flg IS 'スケジューラＦＬＧ // #MA.FLG // Scheduler flg.';


COMMENT ON COLUMN mam_itm_.cntry_org_cd IS '原産地ＣＤ // #MA.CNTRY_CD // Place of origin cd.';


COMMENT ON COLUMN mam_itm_.comp_spec_typ IS '仕様管理区分 // #MA.COMP_SPEC_TYP // Specification management type';


COMMENT ON COLUMN mam_itm_.comp_rev_at_slo_flg IS '受注時構成改訂許可ＦＬＧ // #MA.FLG // Allow sales order configuration rev. flg.';


COMMENT ON COLUMN mam_itm_.comp_core_itm_flg IS '構成主品目ＦＬＧ // #MA.FLG // Configuration main item flg.';


COMMENT ON COLUMN mam_itm_.itm_spec_grp_cd IS '品目仕様分類ＣＤ // #MA.ITM_SPEC_GRP_CD // Item specification classification cd.';


COMMENT ON COLUMN mam_itm_.sls_upri_grp_cd IS '販売単価分類ＣＤ // #MA.SLS_UPRI_GRP_CD // Sales unit price classification cd.';


COMMENT ON COLUMN mam_itm_.bill_crryovr_times IS '請求繰越回数 // #MA.CRRYOVR_TIMES // Billing carry-over count';


COMMENT ON COLUMN mam_itm_.pay_crryovr_times IS '支払繰越回数 // #MA.CRRYOVR_TIMES // Payment carry-over count';


COMMENT ON COLUMN mam_itm_.slo_proc_flg IS '受注手配品ＦＬＧ // #MA.FLG // Sales order procurement item flg.';


COMMENT ON COLUMN mam_itm_.slo_proc_typ IS '受注手配区分 // #MA.SLO_PROC_TYP // Sales order procurement type';


COMMENT ON COLUMN mam_itm_.ship_inst_typ IS '出荷指図区分 // #MA.SHIP_INST_TYP // Shipping order type';


COMMENT ON COLUMN mam_itm_.ship_lot_back_stop_flg IS '出荷ロット逆転禁止ＦＬＧ // #MA.FLG // Shipping lot reverse prohibit flg.';


COMMENT ON COLUMN mam_itm_.itm_ship_grp_cd IS '品目出荷グループＣＤ // #MA.ITM_SHIP_GRP_CD // Item shipping group cd.';


COMMENT ON COLUMN mam_itm_.ship_valid_grp_cd IS '出荷有効期限グループＣＤ // #MA.SHIP_VALID_GRP_CD // Shipping expiration date group cd.';


COMMENT ON COLUMN mam_itm_.arr_skip_flg IS '入荷不要ＦＬＧ // #MA.FLG // Not receipt flg.';


COMMENT ON COLUMN mam_itm_.purc_dlv_slip_flg IS '購買納品書対象ＦＬＧ // #MA.FLG // Purchase delivery note target flg.';


COMMENT ON COLUMN mam_itm_.ship_term_cd IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN mam_itm_.exim_xpns_typ IS '輸出入諸掛区分 // #MA.EXIM_XPNS_TYP // Import/export charges type';


COMMENT ON COLUMN mam_itm_.stk_lst_flg IS '現品票出力対象ＦＬＧ // #MA.FLG // For identification tag output flg.';


COMMENT ON COLUMN mam_itm_.ver_flg IS '版管理対象ＦＬＧ // #MA.FLG // For version control flg.';


COMMENT ON COLUMN mam_itm_.sls_upri_cng_flg IS '販売単価変更許可ＦＬＧ // #MA.FLG // Allow sales unit price change flg.';


COMMENT ON COLUMN mam_itm_.purc_upri_cng_flg IS '購買単価変更許可ＦＬＧ // #MA.FLG // Allow purchasing unit price change flg.';


COMMENT ON COLUMN mam_itm_.prov_upri_cng_flg IS '支給単価変更許可ＦＬＧ // #MA.FLG // Allow supply unit price change flg.';


COMMENT ON COLUMN mam_itm_.ref_itm_cd IS '参照品目ＣＤ // #MA.ITM_CD // Reference item cd.';


COMMENT ON COLUMN mam_itm_.ref_itm_sub1 IS '参照枝番１ // #MA.ITM_SUB1 // Reference branch No. 1';


COMMENT ON COLUMN mam_itm_.ref_itm_sub2 IS '参照枝番２ // #MA.ITM_SUB2 // Reference branch No. 2';


COMMENT ON COLUMN mam_itm_.ref_itm_sub3 IS '参照枝番３ // #MA.ITM_SUB3 // Reference branch No. 3';


COMMENT ON COLUMN mam_itm_.ext_sys_no_itm IS '外部システムＮＯ // #MA.EXT_SYS_NO_ITM // External system No.';


COMMENT ON COLUMN mam_itm_.chng_no IS '変更ＮＯ // #MA.CHNG_NO // Change No.';


COMMENT ON COLUMN mam_itm_.calc_ptn_cd IS '計算パタンＣＤ // #MA.CALC_PTN_CD // Calculation pattern cd.';


COMMENT ON COLUMN mam_itm_.cost_std_qty IS '原価基準数 // #MA.QTY // Cost base qty.';


COMMENT ON COLUMN mam_itm_.itm_alc_grp IS '品目配賦グループ // #MA.ITM_ALC_GRP // Item allocation group';


COMMENT ON COLUMN mam_itm_.sls_flg IS '販売ＦＬＧ // #MA.FLG // Sales flg.';


COMMENT ON COLUMN mam_itm_.mfg_flg IS '製造ＦＬＧ // #MA.FLG // Mfg. flg.';


COMMENT ON COLUMN mam_itm_.purc_flg IS '購買ＦＬＧ // #MA.FLG // Purchasing flg.';


COMMENT ON COLUMN mam_itm_.insp_flg IS '検査ＦＬＧ // #MA.FLG // Inspection flg.';


COMMENT ON COLUMN mam_itm_.sls_input_flg IS '販売設定済ＦＬＧ // #MA.FLG // Sales configured flg.';


COMMENT ON COLUMN mam_itm_.mfg_input_flg IS '製造設定済ＦＬＧ // #MA.FLG // Mfg. configured flg.';


COMMENT ON COLUMN mam_itm_.purc_input_flg IS '購買設定済ＦＬＧ // #MA.FLG // Purchase configured flg.';


COMMENT ON COLUMN mam_itm_.insp_input_flg IS '検査設定済ＦＬＧ // #MA.FLG // Inspection configured flg.';


COMMENT ON COLUMN mam_itm_.release_flg IS 'リリースＦＬＧ // #MA.FLG // Release flg.';


COMMENT ON COLUMN mam_itm_.release_usr_cd IS 'リリース担当者ＣＤ // #MA.USR_CD // Release PIC name cd.';


COMMENT ON COLUMN mam_itm_.release_tm IS 'リリース日時 // #MA.TM // Release date and time';


COMMENT ON COLUMN mam_itm_.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_itm_.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_itm_.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_itm_.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_itm_.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_itm_.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_itm_.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_itm_.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_itm_.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_itm_.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_itm_.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_itm_.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_itm_.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_itm_.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_itm_.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_itm_.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_itm_.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


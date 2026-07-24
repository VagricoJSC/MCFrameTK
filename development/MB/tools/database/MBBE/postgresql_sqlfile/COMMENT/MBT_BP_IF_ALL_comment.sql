\encoding UTF-8

COMMENT ON TABLE mbt_bp_if_all IS '取引先マスタ受信ＩＦ // BP master import IF';


COMMENT ON COLUMN mbt_bp_if_all.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mbt_bp_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mbt_bp_if_all.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mbt_bp_if_all.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mbt_bp_if_all.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mbt_bp_if_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mbt_bp_if_all.data_make_dt IS '送信元レコード作成日時 // #MA.TM // Creation date and time of source record';


COMMENT ON COLUMN mbt_bp_if_all.imp_flg IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN mbt_bp_if_all.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mbt_bp_if_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mbt_bp_if_all.bp_nm IS '取引先名 // #MA.BP_NM // BP name';


COMMENT ON COLUMN mbt_bp_if_all.bp_alt_nm1 IS '取引先別名１ // #MA.BP_ALT_NM1 // BP alias name 1';


COMMENT ON COLUMN mbt_bp_if_all.bp_alt_nm2 IS '取引先別名２ // #MA.BP_ALT_NM2 // BP alias name 2';


COMMENT ON COLUMN mbt_bp_if_all.bp_alt_nm3 IS '取引先別名３ // #MA.BP_ALT_NM3 // BP alias name 3';


COMMENT ON COLUMN mbt_bp_if_all.bp_alt_nm4 IS '取引先別名４ // #MA.BP_ALT_NM4 // BP alias name 4';


COMMENT ON COLUMN mbt_bp_if_all.zip_cd IS '郵便番号 // #MA.ZIP_CD // Zip code';


COMMENT ON COLUMN mbt_bp_if_all.addr1 IS '住所１ // #MA.ADDR1 // Address 1';


COMMENT ON COLUMN mbt_bp_if_all.addr2 IS '住所２ // #MA.ADDR2 // Address 2';


COMMENT ON COLUMN mbt_bp_if_all.addr3 IS '住所３ // #MA.ADDR3 // Address 3';


COMMENT ON COLUMN mbt_bp_if_all.addr4 IS '住所４ // #MA.ADDR4 // Address 4';


COMMENT ON COLUMN mbt_bp_if_all.tel IS 'ＴＥＬ // #MA.TEL // TEL';


COMMENT ON COLUMN mbt_bp_if_all.fax IS 'ＦＡＸ // #MA.TEL // FAX';


COMMENT ON COLUMN mbt_bp_if_all.ein IS '法人番号 // #MA.EIN // Corporation number';


COMMENT ON COLUMN mbt_bp_if_all.std_co_cd IS '標準企業コード // #MA.STD_CO_CD // Standard company code';


COMMENT ON COLUMN mbt_bp_if_all.cntry_cd IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN mbt_bp_if_all.area_cd IS '地域ＣＤ // #MA.AREA_CD // Region cd.';


COMMENT ON COLUMN mbt_bp_if_all.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mbt_bp_if_all.prnt_lcl_cd IS '帳票出力ロケールＣＤ // #MA.LCL_CD // Report output locale cd.';


COMMENT ON COLUMN mbt_bp_if_all.bp_grp_cd1 IS '取引先分類ＣＤ１ // #MA.BP_GRP_CD // BP classification cd. 1';


COMMENT ON COLUMN mbt_bp_if_all.bp_grp_cd2 IS '取引先分類ＣＤ２ // #MA.BP_GRP_CD // BP classification cd. 2';


COMMENT ON COLUMN mbt_bp_if_all.bp_grp_cd3 IS '取引先分類ＣＤ３ // #MA.BP_GRP_CD // BP classification cd. 3';


COMMENT ON COLUMN mbt_bp_if_all.bp_grp_cd4 IS '取引先分類ＣＤ４ // #MA.BP_GRP_CD // BP classification cd. 4';


COMMENT ON COLUMN mbt_bp_if_all.bp_grp_cd5 IS '取引先分類ＣＤ５ // #MA.BP_GRP_CD // BP classification cd. 5';


COMMENT ON COLUMN mbt_bp_if_all.bp_grp_cd6 IS '取引先分類ＣＤ６ // #MA.BP_GRP_CD // BP classification cd. 6';


COMMENT ON COLUMN mbt_bp_if_all.bp_grp_cd7 IS '取引先分類ＣＤ７ // #MA.BP_GRP_CD // BP classification cd. 7';


COMMENT ON COLUMN mbt_bp_if_all.bp_grp_cd8 IS '取引先分類ＣＤ８ // #MA.BP_GRP_CD // BP classification cd. 8';


COMMENT ON COLUMN mbt_bp_if_all.bp_grp_cd9 IS '取引先分類ＣＤ９ // #MA.BP_GRP_CD // BP classification cd. 9';


COMMENT ON COLUMN mbt_bp_if_all.bp_grp_cd10 IS '取引先分類ＣＤ１０ // #MA.BP_GRP_CD // BP classification cd. 10';


COMMENT ON COLUMN mbt_bp_if_all.bp_alc_grp IS '取引先配賦グループ // #MA.BP_ALC_GRP // BP allocation group';


COMMENT ON COLUMN mbt_bp_if_all.cst_flg IS '得意先ＦＬＧ // #MA.FLG // Customer flg.';


COMMENT ON COLUMN mbt_bp_if_all.acst_flg IS '売掛先ＦＬＧ // #MA.FLG // AR customer flg.';


COMMENT ON COLUMN mbt_bp_if_all.bcst_flg IS '請求先ＦＬＧ // #MA.FLG // Billing customer flg.';


COMMENT ON COLUMN mbt_bp_if_all.rcst_flg IS '入金先ＦＬＧ // #MA.FLG // Payer flg.';


COMMENT ON COLUMN mbt_bp_if_all.sppl_flg IS '発注先ＦＬＧ // #MA.FLG // Supplier flg.';


COMMENT ON COLUMN mbt_bp_if_all.asppl_flg IS '買掛先ＦＬＧ // #MA.FLG // AP supplier flg.';


COMMENT ON COLUMN mbt_bp_if_all.bsppl_flg IS '支払予定管理先ＦＬＧ // #MA.FLG // Scheduled payee flg.';


COMMENT ON COLUMN mbt_bp_if_all.psppl_flg IS '支払先ＦＬＧ // #MA.FLG // Payee flg.';


COMMENT ON COLUMN mbt_bp_if_all.cred_flg IS '与信管理先ＦＬＧ // #MA.FLG // Credit managed BP flg.';


COMMENT ON COLUMN mbt_bp_if_all.dlv_flg IS '納品先ＦＬＧ // #MA.FLG // Delivery destination flg.';


COMMENT ON COLUMN mbt_bp_if_all.maker_flg IS 'メーカＦＬＧ // #MA.FLG // Maker flg.';


COMMENT ON COLUMN mbt_bp_if_all.dest_flg IS '仕向先ＦＬＧ // #MA.FLG // Distribution channel flg.';


COMMENT ON COLUMN mbt_bp_if_all.all_com_flg IS '全社ＦＬＧ // #MA.FLG // Company-wide flg.';


COMMENT ON COLUMN mbt_bp_if_all.acst_cd IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN mbt_bp_if_all.ar_dpt_typ IS '債権部門区分 // #MA.AR_DPT_TYP // AR dept. type';


COMMENT ON COLUMN mbt_bp_if_all.ar_dpt_cd IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN mbt_bp_if_all.cst_cntct_dpt IS '得意先部署 // #MA.CNTCT_DPT // Customer dept.';


COMMENT ON COLUMN mbt_bp_if_all.cst_cntct_psn IS '得意先担当者 // #MA.CNTCT_PSN // Customer PIC';


COMMENT ON COLUMN mbt_bp_if_all.cst_cntct_psn_title IS '得意先担当者敬称 // #MA.BP_PSN_TITLE // Form of address for Customer PIC';


COMMENT ON COLUMN mbt_bp_if_all.cst_sundry_flg IS '得意先諸口ＦＬＧ // #MA.FLG // Miscellaneous customer flg.';


COMMENT ON COLUMN mbt_bp_if_all.sls_upri_req_typ IS '販売単価取得区分 // #MA.SLS_UPRI_REQ_TYP // Sales unit price acquisition type';


COMMENT ON COLUMN mbt_bp_if_all.sls_upri_cng_flg IS '販売単価変更許可ＦＬＧ // #MA.FLG // Allow sales unit price change flg.';


COMMENT ON COLUMN mbt_bp_if_all.sls_upri_rnd_typ IS '販売単価端数処理区分 // #MA.RND_TYP // Sales unit price rounding type';


COMMENT ON COLUMN mbt_bp_if_all.sls_amt_rnd_typ IS '売上金額端数処理区分 // #MA.RND_TYP // Rounding type (Sales amount)';


COMMENT ON COLUMN mbt_bp_if_all.sls_tax_calc_typ IS '売上税計算区分 // #MA.TAX_CALC_TYP // Sales tax calculation type';


COMMENT ON COLUMN mbt_bp_if_all.sls_tax_rnd_typ IS '売上税額端数処理区分 // #MA.RND_TYP // Sales tax rounding type';


COMMENT ON COLUMN mbt_bp_if_all.sls_basis_typ IS '売上計上区分 // #MA.SLS_BASIS_TYP // Revenue recording type';


COMMENT ON COLUMN mbt_bp_if_all.bill_basis_typ IS '請求起算区分 // #MA.BILL_BASIS_TYP // Billing initial base type';


COMMENT ON COLUMN mbt_bp_if_all.ship_schd_split_typ IS '出荷予定分割区分 // #MA.SHIP_SCHD_SPLIT_TYP // Shipping schedule split type';


COMMENT ON COLUMN mbt_bp_if_all.bill_crryovr_times IS '請求繰越回数 // #MA.CRRYOVR_TIMES // Billing carry-over count';


COMMENT ON COLUMN mbt_bp_if_all.lot_back_stop_typ IS 'ロット逆転禁止区分 // #MA.LOT_BACK_STOP_TYP // Lot reverse prohibit type';


COMMENT ON COLUMN mbt_bp_if_all.slip_each_lot_typ IS 'ロット明細分割区分 // #MA.SLIP_EACH_LOT_TYP // Lot details split type';


COMMENT ON COLUMN mbt_bp_if_all.cst_ship_form_cd IS '得意先納品書ＣＤ // #MA.SLIP_FORM_CD // Customer delivery note cd.';


COMMENT ON COLUMN mbt_bp_if_all.stk_lst_issue_flg IS '現品票発行ＦＬＧ // #MA.FLG // Identification tag issue flg.';


COMMENT ON COLUMN mbt_bp_if_all.stk_lst_form_cd IS '現品票ＣＤ // #MA.SLIP_FORM_CD // Identification tag cd.';


COMMENT ON COLUMN mbt_bp_if_all.sls_tax_cd IS '売上税ＣＤ // #MA.TAX_CD // Sales tax cd.';


COMMENT ON COLUMN mbt_bp_if_all.sls_tax_cd_prio_flg IS '売上税優先ＦＬＧ // #MA.FLG // Sales tax priority flg.';


COMMENT ON COLUMN mbt_bp_if_all.wrk_ar_flg IS '案件別債権管理ＦＬＧ // #MA.FLG // AR management by sales project flg.';


COMMENT ON COLUMN mbt_bp_if_all.cst_iv_flg IS '得意先インボイス取引ＦＬＧ // #MA.FLG // Customer invoice transaction flg.';


COMMENT ON COLUMN mbt_bp_if_all.ship_lt IS '出荷ＬＴ（需要情報用） // #MA.LT // Shipping LT (For demand)';


COMMENT ON COLUMN mbt_bp_if_all.cst_tterm_cd1 IS '得意先取引条件ＣＤ１ // #MA.TTERM_CD // Customer transaction terms cd. 1';


COMMENT ON COLUMN mbt_bp_if_all.cst_tterm_cd2 IS '得意先取引条件ＣＤ２ // #MA.TTERM_CD // Customer transaction terms cd. 2';


COMMENT ON COLUMN mbt_bp_if_all.cst_tterm_cd3 IS '得意先取引条件ＣＤ３ // #MA.TTERM_CD // Customer transaction terms cd. 3';


COMMENT ON COLUMN mbt_bp_if_all.sls_anly_cd1 IS '販売分析ＣＤ１ // #MA.SLS_ANLY_CD // Sales analysis cd. 1';


COMMENT ON COLUMN mbt_bp_if_all.sls_anly_cd2 IS '販売分析ＣＤ２ // #MA.SLS_ANLY_CD // Sales analysis cd. 2';


COMMENT ON COLUMN mbt_bp_if_all.sls_anly_cd3 IS '販売分析ＣＤ３ // #MA.SLS_ANLY_CD // Sales analysis cd. 3';


COMMENT ON COLUMN mbt_bp_if_all.bcst_cd IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN mbt_bp_if_all.rcst_cd IS '入金先ＣＤ // #MA.BP_CD // Payer cd.';


COMMENT ON COLUMN mbt_bp_if_all.ar_cred_cd IS '債権与信管理先ＣＤ // #MA.BP_CD // AR credit managed BP cd.';


COMMENT ON COLUMN mbt_bp_if_all.bill_dpt_typ IS '請求部門区分 // #MA.BILL_DPT_TYP // Billing dept. type';


COMMENT ON COLUMN mbt_bp_if_all.bcst_dpt_cd IS '請求先担当部門ＣＤ // #MA.DPT_CD // Billing customer dept. in charge cd.';


COMMENT ON COLUMN mbt_bp_if_all.bill_cl_typ IS '請求締処理区分 // #MA.BILL_CL_TYP // Billing closing type';


COMMENT ON COLUMN mbt_bp_if_all.bill_cl_day1 IS '請求締日１ // #MA.CL_DAY // Billing closing day 1';


COMMENT ON COLUMN mbt_bp_if_all.bill_cl_day2 IS '請求締日２ // #MA.CL_DAY // Billing closing day 2';


COMMENT ON COLUMN mbt_bp_if_all.bill_cl_day3 IS '請求締日３ // #MA.CL_DAY // Billing closing day 3';


COMMENT ON COLUMN mbt_bp_if_all.bill_cl_day4 IS '請求締日４ // #MA.CL_DAY // Billing closing day 4';


COMMENT ON COLUMN mbt_bp_if_all.bill_cl_day5 IS '請求締日５ // #MA.CL_DAY // Billing closing day 5';


COMMENT ON COLUMN mbt_bp_if_all.tax_on_bill_flg IS '請求税計算ＦＬＧ // #MA.FLG // Billing tax calculation flg.';


COMMENT ON COLUMN mbt_bp_if_all.bill_tax_rnd_typ IS '請求税額端数処理区分 // #MA.RND_TYP // Billing tax rounding type';


COMMENT ON COLUMN mbt_bp_if_all.bill_cl_delay_days IS '請求締遅延日数 // #MA.DELAY_DAYS // Delayed days (Billing closing day)';


COMMENT ON COLUMN mbt_bp_if_all.bill_cl_ba_typ IS '請求締前後区分 // #MA.BA_TYP // Billing closing before/after type';


COMMENT ON COLUMN mbt_bp_if_all.sls_interim_cl_flg IS '売上仮単価締ＦＬＧ // #MA.FLG // Sales temporary unit price closing flg.';


COMMENT ON COLUMN mbt_bp_if_all.bill_cal_cd IS '請求先カレンダＣＤ // #MA.CAL_CD // Billing customer calendar cd.';


COMMENT ON COLUMN mbt_bp_if_all.rcv_ba_typ IS '入金予定前後区分 // #MA.BA_TYP // Payment receipt schedule before/after type';


COMMENT ON COLUMN mbt_bp_if_all.bill_zip_cd IS '請求書送付郵便番号 // #MA.ZIP_CD // Invoice send-to zip code';


COMMENT ON COLUMN mbt_bp_if_all.bill_addr1 IS '請求書送付住所１ // #MA.ADDR1 // Invoice send-to address 1';


COMMENT ON COLUMN mbt_bp_if_all.bill_addr2 IS '請求書送付住所２ // #MA.ADDR2 // Invoice send-to address 2';


COMMENT ON COLUMN mbt_bp_if_all.bill_addr3 IS '請求書送付住所３ // #MA.ADDR3 // Invoice send-to address 3';


COMMENT ON COLUMN mbt_bp_if_all.bill_addr4 IS '請求書送付住所４ // #MA.ADDR4 // Invoice send-to address 4';


COMMENT ON COLUMN mbt_bp_if_all.bill_tel IS '請求書送付ＴＥＬ // #MA.TEL // Invoice send-to TEL';


COMMENT ON COLUMN mbt_bp_if_all.bill_bcst_nm IS '請求書宛先 // #MA.BILL_BCST_NM // Invoice destination';


COMMENT ON COLUMN mbt_bp_if_all.bill_bcst_dpt IS '請求書送付部署 // #MA.BP_CNTCT_DPT // Invoice send-to dept.';


COMMENT ON COLUMN mbt_bp_if_all.bill_bcst_psn IS '請求書送付担当者 // #MA.BP_CNTCT_PSN // Invoice send-to PIC';


COMMENT ON COLUMN mbt_bp_if_all.bill_bcst_psn_title IS '請求書送付担当者敬称 // #MA.BP_PSN_TITLE // Invoice send-to PIC honorific';


COMMENT ON COLUMN mbt_bp_if_all.bfw_bal_disp_flg IS '請求書前月残高表示ＦＬＧ // #MA.FLG // Display balance of previous month on invoice flg.';


COMMENT ON COLUMN mbt_bp_if_all.sls_dtl_outp_typ IS '売上明細書出力区分 // #MA.SLS_DTL_OUTP_TYP // Sales details output type';


COMMENT ON COLUMN mbt_bp_if_all.bill_prnt_typ IS '請求書発行区分 // #MA.BILL_PRNT_TYP // Invoice issue type';


COMMENT ON COLUMN mbt_bp_if_all.bill_dtl_outp_flg IS '請求書明細出力ＦＬＧ // #MA.FLG // Invoice details output flg.';


COMMENT ON COLUMN mbt_bp_if_all.bill_dtl_adv_flg IS '請求書前受金表示ＦＬＧ // #MA.FLG // Display advance received on invoice';


COMMENT ON COLUMN mbt_bp_if_all.bill_dtl_rcv_flg IS '請求書入金予定表示ＦＬＧ // #MA.FLG // Display payment receipt schedule in invoice flg.';


COMMENT ON COLUMN mbt_bp_if_all.bill_dtl_subttl_typ IS '請求書明細小計区分 // #MA.BILL_DTL_SUBTTL_TYP // Invoice details subtotal type';


COMMENT ON COLUMN mbt_bp_if_all.bill_dtl_brk_typ IS '請求書明細改頁区分 // #MA.BILL_DTL_BRK_TYP // Invoice details page break type';


COMMENT ON COLUMN mbt_bp_if_all.bill_dtl_sort_typ IS '請求書明細並順区分 // #MA.BILL_DTL_SORT_TYP // Invoice details sorting order type';


COMMENT ON COLUMN mbt_bp_if_all.bill_can_slip_typ IS '請求書取消伝票表示区分 // #MA.BILL_CAN_SLIP_TYP // Invoice cancel slip display type';


COMMENT ON COLUMN mbt_bp_if_all.auto_line_appl_flg IS '自動明細消込ＦＬＧ // #MA.FLG // Details auto-reconciliation flg.';


COMMENT ON COLUMN mbt_bp_if_all.ar_setoff_grp_cd IS '債権相殺グループＣＤ // #MA.SETOFF_GRP_CD // AR offset group cd.';


COMMENT ON COLUMN mbt_bp_if_all.xfr_psn IS '振込人名 // #MA.XFR_PSN // Payment person name';


COMMENT ON COLUMN mbt_bp_if_all.rcv_auto_appl_tgt_flg IS '入金自動消込対象ＦＬＧ // #MA.FLG // For auto-reconciliation flg.';


COMMENT ON COLUMN mbt_bp_if_all.rcv_amt_match_flg IS '金額考慮ＦＬＧ // #MA.FLG // Match amount flg.';


COMMENT ON COLUMN mbt_bp_if_all.ar_sttl_typ_match_flg IS '金種考慮ＦＬＧ // #MA.FLG // Match payment option flg.';


COMMENT ON COLUMN mbt_bp_if_all.calc_com_paid_flg IS '手数料計算ＦＬＧ // #MA.FLG // Fee calculation flg.';


COMMENT ON COLUMN mbt_bp_if_all.auto_appl_delay_days IS '自動消込基準日遅延日数 // #MA.DELAY_DAYS // Delayed days (Auto-reconciliation base date)';


COMMENT ON COLUMN mbt_bp_if_all.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mbt_bp_if_all.vmi_purc_dpt_cd IS 'ＶＭＩ購買部門ＣＤ // #MA.DPT_CD // VMI purchasing dept. cd.';


COMMENT ON COLUMN mbt_bp_if_all.subcon_flg IS '下請対象ＦＬＧ // #MA.FLG // For subcontract flg.';


COMMENT ON COLUMN mbt_bp_if_all.po_print_cd IS '注文書表示ＣＤ // #MA.PO_PRINT_CD // Display PO sheet cd.';


COMMENT ON COLUMN mbt_bp_if_all.sppl_ship_form_cd IS '発注先納品書ＣＤ // #MA.SLIP_FORM_CD // Supplier delivery note cd.';


COMMENT ON COLUMN mbt_bp_if_all.po_dlv_slip_flg IS '発注時納品書ＦＬＧ // #MA.FLG // Delivery note at P/O flg.';


COMMENT ON COLUMN mbt_bp_if_all.dlv_inst_dlv_slip_flg IS '納入指示時納品書ＦＬＧ // #MA.FLG // Delivery note at delivery order flg.';


COMMENT ON COLUMN mbt_bp_if_all.prms_rcpt_dlv_slip_flg IS '納期回答受領時納品書ＦＬＧ // #MA.FLG // Delivery note at receipt of order promising result flg.';


COMMENT ON COLUMN mbt_bp_if_all.pay_crryovr_times IS '支払繰越回数 // #MA.CRRYOVR_TIMES // Payment carry-over count';


COMMENT ON COLUMN mbt_bp_if_all.sppl_cntct_dpt IS '発注先部署 // #MA.CNTCT_DPT // Supplier dept.';


COMMENT ON COLUMN mbt_bp_if_all.sppl_cntct_psn IS '発注先担当者 // #MA.CNTCT_PSN // Supplier PIC';


COMMENT ON COLUMN mbt_bp_if_all.sppl_cntct_psn_title IS '発注先担当者敬称 // #MA.BP_PSN_TITLE // Supplier PIC form of address';


COMMENT ON COLUMN mbt_bp_if_all.purc_upri_req_typ IS '購買単価取得区分 // #MA.PURC_UPRI_REQ_TYP // Purchase unit price acquisition type';


COMMENT ON COLUMN mbt_bp_if_all.purc_upri_cng_flg IS '購買単価変更許可ＦＬＧ // #MA.FLG // Allow purchasing unit price change flg.';


COMMENT ON COLUMN mbt_bp_if_all.purc_amt_rnd_typ IS '仕入金額端数処理区分 // #MA.RND_TYP // Rounding type (Purchase amount)';


COMMENT ON COLUMN mbt_bp_if_all.purc_tax_rnd_typ IS '仕入税額端数処理区分 // #MA.RND_TYP // Rounding type (Purchase tax)';


COMMENT ON COLUMN mbt_bp_if_all.purc_tax_calc_typ IS '仕入税計算区分 // #MA.TAX_CALC_TYP // Purchase tax calculation type';


COMMENT ON COLUMN mbt_bp_if_all.purc_tax_cd IS '仕入税ＣＤ // #MA.TAX_CD // Purchase tax cd.';


COMMENT ON COLUMN mbt_bp_if_all.purc_tax_cd_prio_flg IS '仕入税優先ＦＬＧ // #MA.FLG // Purchase tax priority flg.';


COMMENT ON COLUMN mbt_bp_if_all.wrk_po_flg IS '案件別注文書ＦＬＧ // #MA.FLG // PO sheet by sales project flg.';


COMMENT ON COLUMN mbt_bp_if_all.wrk_ap_flg IS '案件別債務管理ＦＬＧ // #MA.FLG // AP management by sales project flg.';


COMMENT ON COLUMN mbt_bp_if_all.purc_slip_each_lot_typ IS '仕入ロット明細分割区分 // #MA.SLIP_EACH_LOT_TYP // Purchase lot details split type';


COMMENT ON COLUMN mbt_bp_if_all.prov_rcv_typ IS '支給積送管理区分 // #MA.PROV_RCV_TYP // In-transit supply management type';


COMMENT ON COLUMN mbt_bp_if_all.onr_prsppl_flg IS '有償支給先ＦＬＧ // #MA.FLG // Chargeable supplier flg.';


COMMENT ON COLUMN mbt_bp_if_all.outsrc_upri_typ IS '外注単価区分 // #MA.OUTSRC_UPRI_TYP // Subcontracting unit price type';


COMMENT ON COLUMN mbt_bp_if_all.prov_basis_typ IS '支給計上区分 // #MA.PROV_BASIS_TYP // Supply recording type';


COMMENT ON COLUMN mbt_bp_if_all.prov_upri_cng_flg IS '支給単価変更許可ＦＬＧ // #MA.FLG // Allow supply unit price change flg.';


COMMENT ON COLUMN mbt_bp_if_all.prov_amt_rnd_typ IS '支給金額端数処理区分 // #MA.RND_TYP // Supply amount rounding type';


COMMENT ON COLUMN mbt_bp_if_all.prov_tax_rnd_typ IS '支給税額端数処理区分 // #MA.RND_TYP // Supply tax rounding type';


COMMENT ON COLUMN mbt_bp_if_all.prov_tax_calc_typ IS '支給税計算区分 // #MA.TAX_CALC_TYP // Supply tax calculation type';


COMMENT ON COLUMN mbt_bp_if_all.prov_tax_cd IS '支給税ＣＤ // #MA.TAX_CD // Supply tax cd.';


COMMENT ON COLUMN mbt_bp_if_all.prov_tax_cd_prio_flg IS '支給税優先ＦＬＧ // #MA.FLG // Supply tax priority flg.';


COMMENT ON COLUMN mbt_bp_if_all.sppl_cal_cd IS '発注先カレンダＣＤ // #MA.CAL_CD // Supplier calendar cd.';


COMMENT ON COLUMN mbt_bp_if_all.sppl_iv_flg IS '発注先インボイス取引ＦＬＧ // #MA.FLG // Supplier invoice transaction flg.';


COMMENT ON COLUMN mbt_bp_if_all.rcpt_iv_dup_flg IS '受領インボイス重複許可ＦＬＧ // #MA.FLG // Allow purchase invoice duplication flg.';


COMMENT ON COLUMN mbt_bp_if_all.prms_recv_flg IS '納期回答確認ＦＬＧ // #MA.FLG // Order promising check flg.';


COMMENT ON COLUMN mbt_bp_if_all.sppl_tterm_cd1 IS '発注先取引条件ＣＤ１ // #MA.TTERM_CD // Supplier transaction terms cd. 1';


COMMENT ON COLUMN mbt_bp_if_all.sppl_tterm_cd2 IS '発注先取引条件ＣＤ２ // #MA.TTERM_CD // Supplier transaction terms cd. 2';


COMMENT ON COLUMN mbt_bp_if_all.sppl_tterm_cd3 IS '発注先取引条件ＣＤ３ // #MA.TTERM_CD // Supplier transaction terms cd. 3';


COMMENT ON COLUMN mbt_bp_if_all.purc_basis_typ IS '仕入計上区分 // #MA.PURC_BASIS_TYP // Purchase recording type';


COMMENT ON COLUMN mbt_bp_if_all.repurc_obli_flg IS '買戻義務ＦＬＧ // #MA.FLG // Repurchase obligation flg.';


COMMENT ON COLUMN mbt_bp_if_all.bsppl_cd IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN mbt_bp_if_all.ap_dpt_cd IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN mbt_bp_if_all.psppl_cd IS '支払先ＣＤ // #MA.BP_CD // Payee cd.';


COMMENT ON COLUMN mbt_bp_if_all.ap_cred_cd IS '債務与信管理先ＣＤ // #MA.BP_CD // AP credit managed BP cd.';


COMMENT ON COLUMN mbt_bp_if_all.bsppl_dpt_cd IS '支払予定管理先担当部門ＣＤ // #MA.DPT_CD // Cd. of dept. in charge of scheduled payee';


COMMENT ON COLUMN mbt_bp_if_all.pay_spot_flg IS '都度支払ＦＬＧ // #MA.FLG // Payment per transaction flg.';


COMMENT ON COLUMN mbt_bp_if_all.psppl_cl_day1 IS '支払締日１ // #MA.CL_DAY // Payment closing date 1';


COMMENT ON COLUMN mbt_bp_if_all.psppl_cl_day2 IS '支払締日２ // #MA.CL_DAY // Payment closing date 2';


COMMENT ON COLUMN mbt_bp_if_all.psppl_cl_day3 IS '支払締日３ // #MA.CL_DAY // Payment closing date 3';


COMMENT ON COLUMN mbt_bp_if_all.psppl_cl_day4 IS '支払締日４ // #MA.CL_DAY // Payment closing date 4';


COMMENT ON COLUMN mbt_bp_if_all.psppl_cl_day5 IS '支払締日５ // #MA.CL_DAY // Payment closing date 5';


COMMENT ON COLUMN mbt_bp_if_all.purc_interim_cl_flg IS '仕入仮単価締ＦＬＧ // #MA.FLG // Purchase temporary unit price closing flg.';


COMMENT ON COLUMN mbt_bp_if_all.ap_setoff_grp_cd IS '債務相殺グループＣＤ // #MA.SETOFF_GRP_CD // AP offset group cd.';


COMMENT ON COLUMN mbt_bp_if_all.pay_bank_ac_cd IS '支払先口座ＣＤ // #MA.BANK_AC_CD // Payee account cd.';


COMMENT ON COLUMN mbt_bp_if_all.pay_schd_ba_typ IS '支払予定前後区分 // #MA.BA_TYP // Payment schedule before/after type';


COMMENT ON COLUMN mbt_bp_if_all.tax_on_pay_flg IS '支払税計算ＦＬＧ // #MA.FLG // Payment tax calculation flg.';


COMMENT ON COLUMN mbt_bp_if_all.pay_tax_rnd_typ IS '支払税額端数処理区分 // #MA.RND_TYP // Payment tax amount rounding type';


COMMENT ON COLUMN mbt_bp_if_all.batch_pay_schd_cl_flg IS 'バッチ支払予定締ＦＬＧ // #MA.FLG // Batch payment schedule closing flg.';


COMMENT ON COLUMN mbt_bp_if_all.pay_schd_cl_delay_days IS '支払予定締遅延日数 // #MA.DELAY_DAYS // Payment schedule closing delay days';


COMMENT ON COLUMN mbt_bp_if_all.pay_schd_cl_ba_typ IS '支払予定締前後区分 // #MA.BA_TYP // Payment schedule closing before/after type';


COMMENT ON COLUMN mbt_bp_if_all.biz_co_no IS '事業者ＮＯ // #MA.BIZ_CO_NO // Business No.';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_prnt_flg IS '支払通知書発行対象ＦＬＧ // #MA.FLG // Payment notice to be issued flg.';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_zip_cd IS '支払通知書送付郵便番号 // #MA.ZIP_CD // Payment notice send-to zip code';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_addr1 IS '支払通知書送付住所１ // #MA.ADDR1 // Payment notice send-to address 1';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_addr2 IS '支払通知書送付住所２ // #MA.ADDR2 // Payment notice send-to address 2';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_addr3 IS '支払通知書送付住所３ // #MA.ADDR3 // Payment notice send-to address 3';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_addr4 IS '支払通知書送付住所４ // #MA.ADDR4 // Payment notice send-to address 4';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_bsppl_nm IS '支払通知書宛先 // #MA.PAY_NTC_BSPPL_NM // Payment notice destination';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_bsppl_dpt IS '支払通知書送付部署 // #MA.PAY_NTC_BSPPL_DPT // Payment notice send-to dept.';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_bsppl_psn IS '支払通知書送付担当者 // #MA.PAY_NTC_BSPPL_PSN // Payment notice send-to PIC';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_bsppl_psn_title IS '支払通知書送付担当者敬称 // #MA.BP_PSN_TITLE // Payment notice send-to PIC honorific title';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_tel IS '支払通知書送付ＴＥＬ // #MA.TEL // Payment notice send-to TEL';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_dtl_outp_flg IS '支払通知書明細出力ＦＬＧ // #MA.FLG // Output payment notice details flg.';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_bfw_bal_disp_flg IS '支払通知書前月残高表示ＦＬＧ // #MA.FLG // Display balance of previous month on payment notice flg.';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_adv_pay_flg IS '支払通知書前渡金表示ＦＬＧ // #MA.FLG // Display advance payment on payment notice flg.';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_dtl_pay_flg IS '支払通知書支払予定表示ＦＬＧ // #MA.FLG // Display payment schedule on payment notice flg.';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_dtl_subttl_typ IS '支払通知書明細小計区分 // #MA.PAY_NTC_DTL_SUBTTL_TYP // Payment notice details subtotal type';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_dtl_brk_typ IS '支払通知書明細改頁区分 // #MA.PAY_NTC_DTL_BRK_TYP // Payment notice details page break type';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_dtl_sort_typ IS '支払通知書明細並順区分 // #MA.PAY_NTC_DTL_SORT_TYP // Payment notice details sorting order type';


COMMENT ON COLUMN mbt_bp_if_all.pay_ntc_can_slip_typ IS '支払通知書取消伝票表示区分 // #MA.PAY_NTC_CAN_SLIP_TYP // Payment notice cancel slip display type';


COMMENT ON COLUMN mbt_bp_if_all.psppl_rmrks IS '支払先備考 // #MA.PSPPL_RMRKS // Payee remarks';


COMMENT ON COLUMN mbt_bp_if_all.note_days IS '手形サイト上限 // #MA.DAYS // Note sight upper limit';


COMMENT ON COLUMN mbt_bp_if_all.pay_dpt_cd IS '支払部門ＣＤ // #MA.DPT_CD // Payment dept. cd.';


COMMENT ON COLUMN mbt_bp_if_all.dlv_sundry_flg IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mbt_bp_if_all.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mbt_bp_if_all.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mbt_bp_if_all.dlv_cntct_psn_title IS '納品先担当者敬称 // #MA.BP_PSN_TITLE // Delivery destination PIC honorific';


COMMENT ON COLUMN mbt_bp_if_all.pri_prnt_flg IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN mbt_bp_if_all.cnsgn_stktk_flg IS '貸出在庫棚卸対象ＦＬＧ // #MA.FLG // For consignment inventory count flg.';


COMMENT ON COLUMN mbt_bp_if_all.tdlv_flg IS '配送先ＦＬＧ // #MA.FLG // Receiving point flg.';


COMMENT ON COLUMN mbt_bp_if_all.via_dlv_typ IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN mbt_bp_if_all.tdlv_req_flg IS '配送先必須ＦＬＧ // #MA.FLG // Receiving point required flg.';


COMMENT ON COLUMN mbt_bp_if_all.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mbt_bp_if_all.dlv_cal_cd IS '納品先カレンダＣＤ // #MA.CAL_CD // Delivery destination calendar cd.';


COMMENT ON COLUMN mbt_bp_if_all.dlv_chnnl1 IS '納品先チャネル１ // #MA.DLV_CHNNL1 // Delivery destination channel 1';


COMMENT ON COLUMN mbt_bp_if_all.dlv_chnnl2 IS '納品先チャネル２ // #MA.DLV_CHNNL2 // Delivery destination channel 2';


COMMENT ON COLUMN mbt_bp_if_all.dlv_chnnl3 IS '納品先チャネル３ // #MA.DLV_CHNNL3 // Delivery destination channel 3';


COMMENT ON COLUMN mbt_bp_if_all.cst_prnt_typ IS '帳票発行区分（得意先） // #MA.PRNT_TYP // Slip issue type (Customer)';


COMMENT ON COLUMN mbt_bp_if_all.acst_prnt_typ IS '帳票発行区分（売掛先） // #MA.PRNT_TYP // Slip issue type (AR customer)';


COMMENT ON COLUMN mbt_bp_if_all.bcst_prnt_typ IS '帳票発行区分（請求先） // #MA.PRNT_TYP // Slip issue type (Billing customer)';


COMMENT ON COLUMN mbt_bp_if_all.rcst_prnt_typ IS '帳票発行区分（入金先） // #MA.PRNT_TYP // Slip issue type (Payer)';


COMMENT ON COLUMN mbt_bp_if_all.sppl_prnt_typ IS '帳票発行区分（発注先） // #MA.PRNT_TYP // Slip issue type (Supplier)';


COMMENT ON COLUMN mbt_bp_if_all.asppl_prnt_typ IS '帳票発行区分（買掛先） // #MA.PRNT_TYP // Slip issue type (AP supplier)';


COMMENT ON COLUMN mbt_bp_if_all.bsppl_prnt_typ IS '帳票発行区分（支払予定管理先） // #MA.PRNT_TYP // Slip issue type (Scheduled payee)';


COMMENT ON COLUMN mbt_bp_if_all.psppl_prnt_typ IS '帳票発行区分（支払先） // #MA.PRNT_TYP // Slip issue type (Payee)';


COMMENT ON COLUMN mbt_bp_if_all.dlv_prnt_typ IS '帳票発行区分（納品先） // #MA.PRNT_TYP // Slip issue type (Delivery destination)';


COMMENT ON COLUMN mbt_bp_if_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mbt_bp_if_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mbt_bp_if_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char1 IS 'ＩＦ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // IF spare CHAR column 1';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char2 IS 'ＩＦ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // IF spare CHAR column 2';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char3 IS 'ＩＦ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // IF spare CHAR column 3';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char4 IS 'ＩＦ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // IF spare CHAR column 4';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char5 IS 'ＩＦ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // IF spare CHAR column 5';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char6 IS 'ＩＦ予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // IF spare CHAR column 6';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char7 IS 'ＩＦ予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // IF spare CHAR column 7';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char8 IS 'ＩＦ予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // IF spare CHAR column 8';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char9 IS 'ＩＦ予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // IF spare CHAR column 9';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char10 IS 'ＩＦ予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // IF spare CHAR column 10';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char11 IS 'ＩＦ予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // IF spare CHAR column 11';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char12 IS 'ＩＦ予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // IF spare CHAR column 12';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char13 IS 'ＩＦ予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // IF spare CHAR column 13';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char14 IS 'ＩＦ予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // IF spare CHAR column 14';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char15 IS 'ＩＦ予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // IF spare CHAR column 15';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char16 IS 'ＩＦ予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // IF spare CHAR column 16';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char17 IS 'ＩＦ予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // IF spare CHAR column 17';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char18 IS 'ＩＦ予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // IF spare CHAR column 18';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char19 IS 'ＩＦ予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // IF spare CHAR column 19';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char20 IS 'ＩＦ予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // IF spare CHAR column 20';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char21 IS 'ＩＦ予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // IF spare CHAR column 21';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char22 IS 'ＩＦ予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // IF spare CHAR column 22';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char23 IS 'ＩＦ予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // IF spare CHAR column 23';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char24 IS 'ＩＦ予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // IF spare CHAR column 24';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char25 IS 'ＩＦ予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // IF spare CHAR column 25';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char26 IS 'ＩＦ予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // IF spare CHAR column 26';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char27 IS 'ＩＦ予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // IF spare CHAR column 27';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char28 IS 'ＩＦ予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // IF spare CHAR column 28';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char29 IS 'ＩＦ予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // IF spare CHAR column 29';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_char30 IS 'ＩＦ予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // IF spare CHAR column 30';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_num1 IS 'ＩＦ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // IF spare NUM column 1';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_num2 IS 'ＩＦ予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // IF spare NUM column 2';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_num3 IS 'ＩＦ予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // IF spare NUM column 3';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_num4 IS 'ＩＦ予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // IF spare NUM column 4';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_num5 IS 'ＩＦ予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // IF spare NUM column 5';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_dt1 IS 'ＩＦ予備ＤＡＴＥ項目１ // #MA.DT // IF spare DATE column 1';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_dt2 IS 'ＩＦ予備ＤＡＴＥ項目２ // #MA.DT // IF spare DATE column 2';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_dt3 IS 'ＩＦ予備ＤＡＴＥ項目３ // #MA.DT // IF spare DATE column 3';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_dt4 IS 'ＩＦ予備ＤＡＴＥ項目４ // #MA.DT // IF spare DATE column 4';


COMMENT ON COLUMN mbt_bp_if_all.if_sub_dt5 IS 'ＩＦ予備ＤＡＴＥ項目５ // #MA.DT // IF spare DATE column 5';


COMMENT ON COLUMN mbt_bp_if_all.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mbt_bp_if_all.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mbt_bp_if_all.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mbt_bp_if_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbt_bp_if_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbt_bp_if_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbt_bp_if_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_bp_if_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbt_bp_if_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbt_bp_if_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbt_bp_if_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbt_bp_if_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_bp_if_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mbt_bp_if_all.memo4 IS 'メモ４ // #MA.MST_MEMO4 // Memo 4';


COMMENT ON COLUMN mbt_bp_if_all.memo5 IS 'メモ５ // #MA.MST_MEMO5 // Memo 5';


COMMENT ON COLUMN mbt_bp_if_all.memo6 IS 'メモ６ // #MA.MST_MEMO6 // Memo 6';


COMMENT ON COLUMN mbt_bp_if_all.memo7 IS 'メモ７ // #MA.MST_MEMO7 // Memo 7';


COMMENT ON COLUMN mbt_bp_if_all.memo8 IS 'メモ８ // #MA.MST_MEMO8 // Memo 8';


COMMENT ON COLUMN mbt_bp_if_all.memo9 IS 'メモ９ // #MA.MST_MEMO9 // Memo 9';


COMMENT ON COLUMN mbt_bp_if_all.memo10 IS 'メモ１０ // #MA.MST_MEMO10 // Memo 10';


COMMENT ON COLUMN mbt_bp_if_all.memo11 IS 'メモ１１ // #MA.MST_MEMO11 // Memo 11';


COMMENT ON COLUMN mbt_bp_if_all.memo12 IS 'メモ１２ // #MA.MST_MEMO12 // Memo 12';


COMMENT ON COLUMN mbt_bp_if_all.memo13 IS 'メモ１３ // #MA.MST_MEMO13 // Memo 13';


COMMENT ON COLUMN mbt_bp_if_all.memo14 IS 'メモ１４ // #MA.MST_MEMO14 // Memo 14';


COMMENT ON COLUMN mbt_bp_if_all.memo15 IS 'メモ１５ // #MA.MST_MEMO15 // Memo 15';


COMMENT ON COLUMN mbt_bp_if_all.memo16 IS 'メモ１６ // #MA.MST_MEMO16 // Memo 16';


COMMENT ON COLUMN mbt_bp_if_all.memo17 IS 'メモ１７ // #MA.MST_MEMO17 // Memo 17';


COMMENT ON COLUMN mbt_bp_if_all.memo18 IS 'メモ１８ // #MA.MST_MEMO18 // Memo 18';


COMMENT ON COLUMN mbt_bp_if_all.memo19 IS 'メモ１９ // #MA.MST_MEMO19 // Memo 19';


COMMENT ON COLUMN mbt_bp_if_all.memo20 IS 'メモ２０ // #MA.MST_MEMO20 // Memo 20';


COMMENT ON COLUMN mbt_bp_if_all.not_lg_mix_flg IS '物流グループ混在不可ＦＬＧ // #MA.FLG // Prohibit mixed distribution group flg.';


COMMENT ON COLUMN mbt_bp_if_all.not_lot_mix_flg IS 'ロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed lots flg.';


COMMENT ON COLUMN mbt_bp_if_all.not_sublot_mix_flg IS 'サブロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed sublots flg.';


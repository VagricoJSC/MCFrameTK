\encoding UTF-8

COMMENT ON VIEW mst_dlv_slip IS '納品伝票ヘッダ // Delivery slip header';


COMMENT ON COLUMN mst_dlv_slip.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_dlv_slip.dlv_slip_seq IS '納品書連番 // #MA.SLIP_SEQ // Delivery note sequence number';


COMMENT ON COLUMN mst_dlv_slip.dlv_slip_rev IS '納品書改訂番号 // #MA.SLIP_REV // Delivery note rev. number';


COMMENT ON COLUMN mst_dlv_slip.slip_sts_typ IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN mst_dlv_slip.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_dlv_slip.trn_typ IS 'トランザクション区分 // #MS.TRN_TYP // Transaction type';


COMMENT ON COLUMN mst_dlv_slip.dlv_slip_inst_no IS '納品伝票指図ＮＯ // #MA.DLV_SLIP_INST_NO // Delivery slip order No.';


COMMENT ON COLUMN mst_dlv_slip.dlv_slip_act_no IS '納品伝票実績ＮＯ // #MA.DLV_SLIP_ACT_NO // Delivery slip result No.';


COMMENT ON COLUMN mst_dlv_slip.sls_act_no IS '売上実績ＮＯ // #MA.SLS_ACT_NO // Sales result No.';


COMMENT ON COLUMN mst_dlv_slip.ship_dlv_slip_no IS '出荷時納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No. at shipping';


COMMENT ON COLUMN mst_dlv_slip.dpt_cd IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN mst_dlv_slip.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mst_dlv_slip.ship_tm IS '出荷日時 // #MA.TM // Shipping date and time';


COMMENT ON COLUMN mst_dlv_slip.dlv_tm IS '納品日時 // #MA.TM // Delivery date and time';


COMMENT ON COLUMN mst_dlv_slip.dlv_rqst_tm IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN mst_dlv_slip.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_dlv_slip.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_dlv_slip.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_dlv_slip.tax_calc_typ IS '税計算区分 // #MA.TAX_CALC_TYP // Tax calculation type';


COMMENT ON COLUMN mst_dlv_slip.cst_po_no IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN mst_dlv_slip.pri_prnt_flg IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN mst_dlv_slip.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_dlv_slip.trd_cur_nm IS '取引通貨名 // #MA.CUR_NM // Transaction currency name';


COMMENT ON COLUMN mst_dlv_slip.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_dlv_slip.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_dlv_slip.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_dlv_slip.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mst_dlv_slip.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mst_dlv_slip.base_cur_dscnt_amt IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN mst_dlv_slip.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_dlv_slip.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mst_dlv_slip.slip_line_max IS '伝票行数最大値 // #MA.INT // Slip rows max number';


COMMENT ON COLUMN mst_dlv_slip.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mst_dlv_slip.bp_nm IS '取引先名 // #MA.BP_NM // BP name';


COMMENT ON COLUMN mst_dlv_slip.bp_zip_cd IS '取引先郵便番号 // #MA.ZIP_CD // BP zip code';


COMMENT ON COLUMN mst_dlv_slip.bp_addr1 IS '取引先住所１ // #MA.ADDR // BP address 1';


COMMENT ON COLUMN mst_dlv_slip.bp_addr2 IS '取引先住所２ // #MA.ADDR // BP address 2';


COMMENT ON COLUMN mst_dlv_slip.bp_addr3 IS '取引先住所３ // #MA.ADDR // BP address 3';


COMMENT ON COLUMN mst_dlv_slip.bp_addr4 IS '取引先住所４ // #MA.ADDR // BP address 4';


COMMENT ON COLUMN mst_dlv_slip.bp_cntct_dpt IS '取引先部署 // #MA.BP_CNTCT_DPT // BP dept.';


COMMENT ON COLUMN mst_dlv_slip.bp_cntct_psn IS '取引先担当者 // #MA.BP_CNTCT_PSN // BP PIC';


COMMENT ON COLUMN mst_dlv_slip.bp_tel IS '取引先ＴＥＬ // #MA.TEL // BP TEL';


COMMENT ON COLUMN mst_dlv_slip.bp_fax IS '取引先ＦＡＸ // #MA.TEL // BP FAX';


COMMENT ON COLUMN mst_dlv_slip.dlv_id_typ IS '納品先識別区分 // #MS.DLV_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN mst_dlv_slip.dlv_id_cd IS '納品先識別ＣＤ // #MS.DLV_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN mst_dlv_slip.dlv_id_nm IS '納品先識別名 // #MS.DLV_ID_NM // Delivery destination identification name';


COMMENT ON COLUMN mst_dlv_slip.dlv_sundry_flg IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN mst_dlv_slip.dlv_zip_cd IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN mst_dlv_slip.dlv_addr1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN mst_dlv_slip.dlv_addr2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN mst_dlv_slip.dlv_addr3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN mst_dlv_slip.dlv_addr4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN mst_dlv_slip.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_dlv_slip.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_dlv_slip.dlv_tel IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN mst_dlv_slip.dlv_fax IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN mst_dlv_slip.xfr_loc_cd IS '振替場所ＣＤ // #MA.LOC_CD // Transfer location cd.';


COMMENT ON COLUMN mst_dlv_slip.ship_fr_lg_grp_cd IS '出荷元物流グループＣＤ // #MA.LG_GRP_CD // Shipping point distribution group cd.';


COMMENT ON COLUMN mst_dlv_slip.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_dlv_slip.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_dlv_slip.sls_basis_typ IS '売上計上区分 // #MA.SLS_BASIS_TYP // Revenue recording type';


COMMENT ON COLUMN mst_dlv_slip.slip_prnt_flg IS '伝票発行済ＦＬＧ // #MA.FLG // Slip issued flg.';


COMMENT ON COLUMN mst_dlv_slip.ship_adv_prnt_flg IS '出荷案内書発行済ＦＬＧ // #MA.FLG // Shipping guide issued flg.';


COMMENT ON COLUMN mst_dlv_slip.sls_prnt_flg IS '売上伝票発行済ＦＬＧ // #MA.FLG // Sales slip issued flg.';


COMMENT ON COLUMN mst_dlv_slip.sync_flg IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN mst_dlv_slip.adjst_slip_flg IS '調整伝票ＦＬＧ // #MA.FLG // Adjustment slip flg.';


COMMENT ON COLUMN mst_dlv_slip.edi_flg IS 'ＥＤＩ　ＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN mst_dlv_slip.sub_char1 IS '予備１ // #MS.DLV_SLIP_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_dlv_slip.sub_char2 IS '予備２ // #MS.DLV_SLIP_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_dlv_slip.sub_char3 IS '予備３ // #MS.DLV_SLIP_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_dlv_slip.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_dlv_slip.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_dlv_slip.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_dlv_slip.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_dlv_slip.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_dlv_slip.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_dlv_slip.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_dlv_slip.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_dlv_slip.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_dlv_slip.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


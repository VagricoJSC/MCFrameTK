\encoding UTF-8

COMMENT ON VIEW mst_purc_dlv_slip IS '購買納品伝票ヘッダ // Purchase delivery slip header';


COMMENT ON COLUMN mst_purc_dlv_slip.dlv_slip_mng_no IS '納品書管理ＮＯ // #MS.DLV_SLIP_MNG_NO // Delivery note management No.';


COMMENT ON COLUMN mst_purc_dlv_slip.dlv_slip_mng_seq IS '納品書管理連番 // #MA.SLIP_SEQ // Delivery note management sequence number';


COMMENT ON COLUMN mst_purc_dlv_slip.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_purc_dlv_slip.dlv_slip_seq IS '納品書連番 // #MA.SLIP_SEQ // Delivery note sequence number';


COMMENT ON COLUMN mst_purc_dlv_slip.dlv_slip_rev IS '納品書改訂番号 // #MA.SLIP_REV // Delivery note rev. number';


COMMENT ON COLUMN mst_purc_dlv_slip.slip_sts_typ IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN mst_purc_dlv_slip.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mst_purc_dlv_slip.po_rev IS '発注改訂番号 // #MA.SLIP_REV // PO rev. number';


COMMENT ON COLUMN mst_purc_dlv_slip.last_po_rev IS '最新発注改訂番号 // #MA.SLIP_REV // Latest PO rev. number';


COMMENT ON COLUMN mst_purc_dlv_slip.dlv_inst_grp_no IS '納入指示ＧＮＯ // #MS.DLV_INST_GRP_NO // Delivery order G No.';


COMMENT ON COLUMN mst_purc_dlv_slip.prms_rcpt_grp_no IS '納期回答受領ＧＮＯ // #MS.PRMS_RCPT_GRP_NO // Order promising result received G No.';


COMMENT ON COLUMN mst_purc_dlv_slip.purc_dlv_slip_src_typ IS '購買納品書作成元区分 // #MS.PURC_DLV_SLIP_SRC_TYP // Purchase delivery note creating source type';


COMMENT ON COLUMN mst_purc_dlv_slip.dpt_cd IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN mst_purc_dlv_slip.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mst_purc_dlv_slip.dlv_rqst_tm IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN mst_purc_dlv_slip.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_purc_dlv_slip.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_purc_dlv_slip.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_purc_dlv_slip.trd_cur_nm IS '取引通貨名 // #MA.CUR_NM // Transaction currency name';


COMMENT ON COLUMN mst_purc_dlv_slip.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_purc_dlv_slip.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_purc_dlv_slip.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_purc_dlv_slip.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mst_purc_dlv_slip.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mst_purc_dlv_slip.base_cur_dscnt_amt IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN mst_purc_dlv_slip.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_purc_dlv_slip.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mst_purc_dlv_slip.slip_line_max IS '伝票行数最大値 // #MA.INT // Slip rows max number';


COMMENT ON COLUMN mst_purc_dlv_slip.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mst_purc_dlv_slip.arr_loc_cd IS '入荷場所ＣＤ // #MA.LOC_CD // Receipt location cd.';


COMMENT ON COLUMN mst_purc_dlv_slip.arr_loc_nm IS '入荷場所名 // #MA.LOC_NM // Receipt location name';


COMMENT ON COLUMN mst_purc_dlv_slip.arr_loc_zip_cd IS '入荷場所郵便番号 // #MA.ZIP_CD // Receipt location zip code';


COMMENT ON COLUMN mst_purc_dlv_slip.arr_loc_addr1 IS '入荷場所住所１ // #MA.ADDR // Receipt location address 1';


COMMENT ON COLUMN mst_purc_dlv_slip.arr_loc_addr2 IS '入荷場所住所２ // #MA.ADDR // Receipt location address 2';


COMMENT ON COLUMN mst_purc_dlv_slip.arr_loc_addr3 IS '入荷場所住所３ // #MA.ADDR // Receipt location address 3';


COMMENT ON COLUMN mst_purc_dlv_slip.arr_loc_addr4 IS '入荷場所住所４ // #MA.ADDR // Receipt location address 4';


COMMENT ON COLUMN mst_purc_dlv_slip.bp_cntct_dpt IS '取引先部署 // #MA.BP_CNTCT_DPT // BP dept.';


COMMENT ON COLUMN mst_purc_dlv_slip.bp_cntct_psn IS '取引先担当者 // #MA.BP_CNTCT_PSN // BP PIC';


COMMENT ON COLUMN mst_purc_dlv_slip.arr_loc_tel IS '入荷場所ＴＥＬ // #MA.TEL // Receipt location TEL';


COMMENT ON COLUMN mst_purc_dlv_slip.arr_loc_fax IS '入荷場所ＦＡＸ // #MA.TEL // Receipt location FAX';


COMMENT ON COLUMN mst_purc_dlv_slip.sppl_id_typ IS '発注先識別区分 // #MS.DLV_ID_TYP // Supplier identification type';


COMMENT ON COLUMN mst_purc_dlv_slip.sppl_id_cd IS '発注先識別ＣＤ // #MS.DLV_ID_CD // Supplier identification cd.';


COMMENT ON COLUMN mst_purc_dlv_slip.sppl_id_nm IS '発注先識別名 // #MS.DLV_ID_NM // Supplier identification name';


COMMENT ON COLUMN mst_purc_dlv_slip.sppl_sundry_flg IS '発注先諸口ＦＬＧ // #MA.FLG // Miscellaneous supplier flg.';


COMMENT ON COLUMN mst_purc_dlv_slip.sppl_zip_cd IS '発注先郵便番号 // #MA.ZIP_CD // Supplier zip code';


COMMENT ON COLUMN mst_purc_dlv_slip.sppl_addr1 IS '発注先住所１ // #MA.ADDR // Supplier address 1';


COMMENT ON COLUMN mst_purc_dlv_slip.sppl_addr2 IS '発注先住所２ // #MA.ADDR // Supplier address 2';


COMMENT ON COLUMN mst_purc_dlv_slip.sppl_addr3 IS '発注先住所３ // #MA.ADDR // Supplier address 3';


COMMENT ON COLUMN mst_purc_dlv_slip.sppl_addr4 IS '発注先住所４ // #MA.ADDR // Supplier address 4';


COMMENT ON COLUMN mst_purc_dlv_slip.sppl_cntct_dpt IS '発注先部署 // #MA.BP_CNTCT_DPT // Supplier dept.';


COMMENT ON COLUMN mst_purc_dlv_slip.sppl_cntct_psn IS '発注先担当者 // #MA.BP_CNTCT_PSN // Supplier PIC';


COMMENT ON COLUMN mst_purc_dlv_slip.sppl_tel IS '発注先ＴＥＬ // #MA.TEL // Supplier TEL';


COMMENT ON COLUMN mst_purc_dlv_slip.sppl_fax IS '発注先ＦＡＸ // #MA.TEL // Supplier FAX';


COMMENT ON COLUMN mst_purc_dlv_slip.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_purc_dlv_slip.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_purc_dlv_slip.slip_prnt_flg IS '伝票発行済ＦＬＧ // #MA.FLG // Slip issued flg.';


COMMENT ON COLUMN mst_purc_dlv_slip.sub_char1 IS '予備１ // #MS.DLV_SLIP_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_purc_dlv_slip.sub_char2 IS '予備２ // #MS.DLV_SLIP_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_purc_dlv_slip.sub_char3 IS '予備３ // #MS.DLV_SLIP_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_purc_dlv_slip.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_purc_dlv_slip.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_purc_dlv_slip.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_purc_dlv_slip.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_purc_dlv_slip.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_purc_dlv_slip.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_purc_dlv_slip.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_purc_dlv_slip.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_purc_dlv_slip.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_purc_dlv_slip.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


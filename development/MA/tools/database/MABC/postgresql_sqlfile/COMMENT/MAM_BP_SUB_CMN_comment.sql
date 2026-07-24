\encoding UTF-8

COMMENT ON TABLE mam_bp_sub_cmn IS '取引先補助マスタ_（共通）_ // BP auxiliary master_(Common)_';


COMMENT ON COLUMN mam_bp_sub_cmn.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mam_bp_sub_cmn.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_bp_sub_cmn.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_bp_sub_cmn.zip_cd IS '郵便番号 // #MA.ZIP_CD // Zip code';


COMMENT ON COLUMN mam_bp_sub_cmn.addr1 IS '住所１ // #MA.ADDR1 // Address 1';


COMMENT ON COLUMN mam_bp_sub_cmn.addr2 IS '住所２ // #MA.ADDR2 // Address 2';


COMMENT ON COLUMN mam_bp_sub_cmn.addr3 IS '住所３ // #MA.ADDR3 // Address 3';


COMMENT ON COLUMN mam_bp_sub_cmn.addr4 IS '住所４ // #MA.ADDR4 // Address 4';


COMMENT ON COLUMN mam_bp_sub_cmn.tel IS 'ＴＥＬ // #MA.TEL // TEL';


COMMENT ON COLUMN mam_bp_sub_cmn.fax IS 'ＦＡＸ // #MA.TEL // FAX';


COMMENT ON COLUMN mam_bp_sub_cmn.ar_dpt_cd IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN mam_bp_sub_cmn.cst_cntct_dpt IS '得意先部署 // #MA.CNTCT_DPT // Customer dept.';


COMMENT ON COLUMN mam_bp_sub_cmn.cst_cntct_psn IS '得意先担当者 // #MA.CNTCT_PSN // Customer PIC';


COMMENT ON COLUMN mam_bp_sub_cmn.cst_cntct_psn_title IS '得意先担当者敬称 // #MA.BP_PSN_TITLE // Form of address for Customer PIC';


COMMENT ON COLUMN mam_bp_sub_cmn.sls_tax_cd IS '売上税ＣＤ // #MA.TAX_CD // Sales tax cd.';


COMMENT ON COLUMN mam_bp_sub_cmn.sls_anly_cd1 IS '販売分析ＣＤ１ // #MA.SLS_ANLY_CD // Sales analysis cd. 1';


COMMENT ON COLUMN mam_bp_sub_cmn.sls_anly_cd2 IS '販売分析ＣＤ２ // #MA.SLS_ANLY_CD // Sales analysis cd. 2';


COMMENT ON COLUMN mam_bp_sub_cmn.sls_anly_cd3 IS '販売分析ＣＤ３ // #MA.SLS_ANLY_CD // Sales analysis cd. 3';


COMMENT ON COLUMN mam_bp_sub_cmn.bcst_dpt_cd IS '請求先担当部門ＣＤ // #MA.DPT_CD // Billing customer dept. in charge cd.';


COMMENT ON COLUMN mam_bp_sub_cmn.bill_zip_cd IS '請求書送付郵便番号 // #MA.ZIP_CD // Invoice send-to zip code';


COMMENT ON COLUMN mam_bp_sub_cmn.bill_addr1 IS '請求書送付住所１ // #MA.ADDR1 // Invoice send-to address 1';


COMMENT ON COLUMN mam_bp_sub_cmn.bill_addr2 IS '請求書送付住所２ // #MA.ADDR2 // Invoice send-to address 2';


COMMENT ON COLUMN mam_bp_sub_cmn.bill_addr3 IS '請求書送付住所３ // #MA.ADDR3 // Invoice send-to address 3';


COMMENT ON COLUMN mam_bp_sub_cmn.bill_addr4 IS '請求書送付住所４ // #MA.ADDR4 // Invoice send-to address 4';


COMMENT ON COLUMN mam_bp_sub_cmn.bill_tel IS '請求書送付ＴＥＬ // #MA.TEL // Invoice send-to TEL';


COMMENT ON COLUMN mam_bp_sub_cmn.bill_bcst_nm IS '請求書宛先 // #MA.BILL_BCST_NM // Invoice destination';


COMMENT ON COLUMN mam_bp_sub_cmn.bill_bcst_dpt IS '請求書送付部署 // #MA.BP_CNTCT_DPT // Invoice send-to dept.';


COMMENT ON COLUMN mam_bp_sub_cmn.bill_bcst_psn IS '請求書送付担当者 // #MA.BP_CNTCT_PSN // Invoice send-to PIC';


COMMENT ON COLUMN mam_bp_sub_cmn.bill_bcst_psn_title IS '請求書送付担当者敬称 // #MA.BP_PSN_TITLE // Invoice send-to PIC honorific';


COMMENT ON COLUMN mam_bp_sub_cmn.vmi_purc_dpt_cd IS 'ＶＭＩ購買部門ＣＤ // #MA.DPT_CD // VMI purchasing dept. cd.';


COMMENT ON COLUMN mam_bp_sub_cmn.sppl_cntct_dpt IS '発注先部署 // #MA.CNTCT_DPT // Supplier dept.';


COMMENT ON COLUMN mam_bp_sub_cmn.sppl_cntct_psn IS '発注先担当者 // #MA.CNTCT_PSN // Supplier PIC';


COMMENT ON COLUMN mam_bp_sub_cmn.sppl_cntct_psn_title IS '発注先担当者敬称 // #MA.BP_PSN_TITLE // Supplier PIC form of address';


COMMENT ON COLUMN mam_bp_sub_cmn.purc_tax_cd IS '仕入税ＣＤ // #MA.TAX_CD // Purchase tax cd.';


COMMENT ON COLUMN mam_bp_sub_cmn.prov_tax_cd IS '支給税ＣＤ // #MA.TAX_CD // Supply tax cd.';


COMMENT ON COLUMN mam_bp_sub_cmn.ap_dpt_cd IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN mam_bp_sub_cmn.bsppl_dpt_cd IS '支払予定管理先担当部門ＣＤ // #MA.DPT_CD // Cd. of dept. in charge of scheduled payee';


COMMENT ON COLUMN mam_bp_sub_cmn.pay_dpt_cd IS '支払部門ＣＤ // #MA.DPT_CD // Payment dept. cd.';


COMMENT ON COLUMN mam_bp_sub_cmn.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mam_bp_sub_cmn.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mam_bp_sub_cmn.dlv_cntct_psn_title IS '納品先担当者敬称 // #MA.BP_PSN_TITLE // Delivery destination PIC honorific';


COMMENT ON COLUMN mam_bp_sub_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_bp_sub_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_bp_sub_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_bp_sub_cmn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_bp_sub_cmn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_bp_sub_cmn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_bp_sub_cmn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_bp_sub_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_bp_sub_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_bp_sub_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_bp_sub_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_bp_sub_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_bp_sub_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_bp_sub_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_bp_sub_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_bp_sub_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_bp_sub_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_bp_sub_cmn.memo4 IS 'メモ４ // #MA.MST_MEMO4 // Memo 4';


COMMENT ON COLUMN mam_bp_sub_cmn.memo5 IS 'メモ５ // #MA.MST_MEMO5 // Memo 5';


COMMENT ON COLUMN mam_bp_sub_cmn.memo6 IS 'メモ６ // #MA.MST_MEMO6 // Memo 6';


COMMENT ON COLUMN mam_bp_sub_cmn.memo7 IS 'メモ７ // #MA.MST_MEMO7 // Memo 7';


COMMENT ON COLUMN mam_bp_sub_cmn.memo8 IS 'メモ８ // #MA.MST_MEMO8 // Memo 8';


COMMENT ON COLUMN mam_bp_sub_cmn.memo9 IS 'メモ９ // #MA.MST_MEMO9 // Memo 9';


COMMENT ON COLUMN mam_bp_sub_cmn.memo10 IS 'メモ１０ // #MA.MST_MEMO10 // Memo 10';


COMMENT ON COLUMN mam_bp_sub_cmn.memo11 IS 'メモ１１ // #MA.MST_MEMO11 // Memo 11';


COMMENT ON COLUMN mam_bp_sub_cmn.memo12 IS 'メモ１２ // #MA.MST_MEMO12 // Memo 12';


COMMENT ON COLUMN mam_bp_sub_cmn.memo13 IS 'メモ１３ // #MA.MST_MEMO13 // Memo 13';


COMMENT ON COLUMN mam_bp_sub_cmn.memo14 IS 'メモ１４ // #MA.MST_MEMO14 // Memo 14';


COMMENT ON COLUMN mam_bp_sub_cmn.memo15 IS 'メモ１５ // #MA.MST_MEMO15 // Memo 15';


COMMENT ON COLUMN mam_bp_sub_cmn.memo16 IS 'メモ１６ // #MA.MST_MEMO16 // Memo 16';


COMMENT ON COLUMN mam_bp_sub_cmn.memo17 IS 'メモ１７ // #MA.MST_MEMO17 // Memo 17';


COMMENT ON COLUMN mam_bp_sub_cmn.memo18 IS 'メモ１８ // #MA.MST_MEMO18 // Memo 18';


COMMENT ON COLUMN mam_bp_sub_cmn.memo19 IS 'メモ１９ // #MA.MST_MEMO19 // Memo 19';


COMMENT ON COLUMN mam_bp_sub_cmn.memo20 IS 'メモ２０ // #MA.MST_MEMO20 // Memo 20';


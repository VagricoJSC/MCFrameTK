\encoding UTF-8

COMMENT ON VIEW mavm_tax_if_all IS '税マスタ送信ＩＦ // Tax master export IF';


COMMENT ON COLUMN mavm_tax_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_tax_if_all.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mavm_tax_if_all.tax_nm IS '税名 // #MA.TAX_NM // Tax name';


COMMENT ON COLUMN mavm_tax_if_all.tax_nm_lcl1 IS '税名（ロケール１） // #MA.TAX_NM // Tax name (Locale 1)';


COMMENT ON COLUMN mavm_tax_if_all.tax_nm_lcl2 IS '税名（ロケール２） // #MA.TAX_NM // Tax name (Locale 2)';


COMMENT ON COLUMN mavm_tax_if_all.tax_nm_lcl3 IS '税名（ロケール３） // #MA.TAX_NM // Tax name (Locale 3)';


COMMENT ON COLUMN mavm_tax_if_all.tax_nm_lcl4 IS '税名（ロケール４） // #MA.TAX_NM // Tax name (Locale 4)';


COMMENT ON COLUMN mavm_tax_if_all.tax_nm_lcl5 IS '税名（ロケール５） // #MA.TAX_NM // Tax name (Locale 5)';


COMMENT ON COLUMN mavm_tax_if_all.tax_typ IS '税区分 // #MA.TAX_TYP // Tax type';


COMMENT ON COLUMN mavm_tax_if_all.inc_tax_flg IS '内税ＦＬＧ // #MA.FLG // Tax inclusive flg.';


COMMENT ON COLUMN mavm_tax_if_all.tax_rate IS '税率 // #MA.TAX_RATE // Tax rate';


COMMENT ON COLUMN mavm_tax_if_all.sls_flg IS '売上ＦＬＧ // #MA.FLG // Sales flg.';


COMMENT ON COLUMN mavm_tax_if_all.purc_flg IS '仕入ＦＬＧ // #MA.FLG // Purchase flg.';


COMMENT ON COLUMN mavm_tax_if_all.prov_flg IS '支給ＦＬＧ // #MA.FLG // Supply flg.';


COMMENT ON COLUMN mavm_tax_if_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_tax_if_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_tax_if_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


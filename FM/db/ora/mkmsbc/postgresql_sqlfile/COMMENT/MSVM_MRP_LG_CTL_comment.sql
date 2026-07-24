\encoding UTF-8

COMMENT ON VIEW msvm_mrp_lg_ctl IS 'ＭＲＰ用物流制御マスタ // Distribution control master for MRP';


COMMENT ON COLUMN msvm_mrp_lg_ctl.fr_lg_grp_cd IS '出荷元物流グループＣＤ // #MA.LG_GRP_CD // Shipping point distribution group cd.';


COMMENT ON COLUMN msvm_mrp_lg_ctl.to_lg_grp_cd IS '出荷先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN msvm_mrp_lg_ctl.ship_term_cd IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN msvm_mrp_lg_ctl.xfr_lt IS '移動ＬＴ // #MA.LT // Movement LT';


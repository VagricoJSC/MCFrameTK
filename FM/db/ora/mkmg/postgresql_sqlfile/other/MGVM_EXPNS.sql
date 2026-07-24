\encoding UTF-8

CREATE OR REPLACE VIEW mgvm_expns(
expns_cd,
expns_typ,
direct_typ,
var_typ
)
AS
SELECT	mgvm_expns_mam_expns_m.expns_cd,
	mgvm_expns_mam_expns_m.expns_typ,
	mgvm_expns_mam_expns_m.direct_typ,
	mgvm_expns_mam_expns_m.var_typ
FROM	mam_expns mgvm_expns_mam_expns_m
WHERE	0=0
;;


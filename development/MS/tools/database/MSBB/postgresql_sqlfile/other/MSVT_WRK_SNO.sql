\encoding UTF-8

CREATE OR REPLACE VIEW msvt_wrk_sno(
sno1,
wrk_no,
wrk_nm,
st_dt,
end_dt,
can_flg
)
AS
SELECT
	msvt_wrk_sno_mst_wrk_sno_t1.sno1,
	msvt_wrk_sno_mst_wrk_sno_t1.wrk_no,
	msvt_wrk_sno_mst_wrk_t2.wrk_nm,
	msvt_wrk_sno_mst_wrk_t2.st_dt,
	msvt_wrk_sno_mst_wrk_t2.end_dt,
	msvt_wrk_sno_mst_wrk_t2.can_flg
FROM
	mst_wrk_sno msvt_wrk_sno_mst_wrk_sno_t1
	JOIN mst_wrk msvt_wrk_sno_mst_wrk_t2 ON (msvt_wrk_sno_mst_wrk_sno_t1.wrk_no = msvt_wrk_sno_mst_wrk_t2.wrk_no)
WHERE 
	0=0
;;


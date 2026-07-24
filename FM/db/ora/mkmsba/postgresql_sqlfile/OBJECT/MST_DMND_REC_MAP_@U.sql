\encoding UTF-8

CREATE OR REPLACE VIEW mst_dmnd_rec_map_$u(
	fr_dmnd_no,
	to_dmnd_no,
	rec_qty,
	sub_char1,
	sub_char2,
	sub_char3,
	ins_usr_id,
	ins_usr_nm,
	ins_ts,
	ins_func_id,
	upd_cntr,
	upd_usr_id,
	upd_usr_nm,
	upd_ts,
	upd_func_id,
	upd_srv_req_no
	)
AS
SELECT
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.fr_dmnd_no,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.to_dmnd_no,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.rec_qty,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.sub_char1,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.sub_char2,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.sub_char3,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.ins_usr_id,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.ins_usr_nm,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.ins_ts,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.ins_func_id,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.upd_cntr,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.upd_usr_id,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.upd_usr_nm,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.upd_ts,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.upd_func_id,
	mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.upd_srv_req_no
FROM
	mst_dmnd_rec_map_all mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org
WHERE
	0 = 0
	AND mst_dmnd_rec_map_$u_mst_dmnd_rec_map_all_org.co_cd = fcpa_context$f_get_co_cd()
;


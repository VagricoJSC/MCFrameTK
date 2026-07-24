\encoding UTF-8

CREATE OR REPLACE VIEW pft_sdrv_if_file_$s(
	data_no,
	file_id,
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
	pft_sdrv_if_file_$s_pft_sdrv_if_file_all_org.data_no,
	pft_sdrv_if_file_$s_pft_sdrv_if_file_all_org.file_id,
	pft_sdrv_if_file_$s_pft_sdrv_if_file_all_org.ins_usr_id,
	pft_sdrv_if_file_$s_pft_sdrv_if_file_all_org.ins_usr_nm,
	pft_sdrv_if_file_$s_pft_sdrv_if_file_all_org.ins_ts,
	pft_sdrv_if_file_$s_pft_sdrv_if_file_all_org.ins_func_id,
	pft_sdrv_if_file_$s_pft_sdrv_if_file_all_org.upd_cntr,
	pft_sdrv_if_file_$s_pft_sdrv_if_file_all_org.upd_usr_id,
	pft_sdrv_if_file_$s_pft_sdrv_if_file_all_org.upd_usr_nm,
	pft_sdrv_if_file_$s_pft_sdrv_if_file_all_org.upd_ts,
	pft_sdrv_if_file_$s_pft_sdrv_if_file_all_org.upd_func_id,
	pft_sdrv_if_file_$s_pft_sdrv_if_file_all_org.upd_srv_req_no
FROM
	pft_sdrv_if_file_all pft_sdrv_if_file_$s_pft_sdrv_if_file_all_org
WHERE
	0 = 0
	AND pft_sdrv_if_file_$s_pft_sdrv_if_file_all_org.co_cd = (SELECT co_cd FROM fct_context pft_sdrv_if_file_$s_fct_context WHERE pid = pg_backend_pid())
;


\encoding UTF-8

CREATE OR REPLACE VIEW pft_if_file_$s(
	file_id,
	file_path,
	file_nm,
	fproc_typ,
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
	pft_if_file_$s_pft_if_file_all_org.file_id,
	pft_if_file_$s_pft_if_file_all_org.file_path,
	pft_if_file_$s_pft_if_file_all_org.file_nm,
	pft_if_file_$s_pft_if_file_all_org.fproc_typ,
	pft_if_file_$s_pft_if_file_all_org.ins_usr_id,
	pft_if_file_$s_pft_if_file_all_org.ins_usr_nm,
	pft_if_file_$s_pft_if_file_all_org.ins_ts,
	pft_if_file_$s_pft_if_file_all_org.ins_func_id,
	pft_if_file_$s_pft_if_file_all_org.upd_cntr,
	pft_if_file_$s_pft_if_file_all_org.upd_usr_id,
	pft_if_file_$s_pft_if_file_all_org.upd_usr_nm,
	pft_if_file_$s_pft_if_file_all_org.upd_ts,
	pft_if_file_$s_pft_if_file_all_org.upd_func_id,
	pft_if_file_$s_pft_if_file_all_org.upd_srv_req_no
FROM
	pft_if_file_all pft_if_file_$s_pft_if_file_all_org
WHERE
	0 = 0
	AND pft_if_file_$s_pft_if_file_all_org.co_cd = (SELECT co_cd FROM fct_context pft_if_file_$s_fct_context WHERE pid = pg_backend_pid())
;


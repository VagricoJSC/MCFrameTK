\encoding UTF-8

CREATE OR REPLACE VIEW mgvt_pat_cal(
nx_fy,
nx_gtd,
ym,
rmrks,
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
	null::numeric (4,0) AS nx_fy,
	null::numeric (2,0) AS nx_gtd,
	null::timestamp (0) AS ym,
	null::varchar (100) AS rmrks,
	null::varchar (20) AS sub_char1,
	null::varchar (20) AS sub_char2,
	null::varchar (20) AS sub_char3,
	null::varchar (500) AS ins_usr_id,
	null::varchar (100) AS ins_usr_nm,
	null::timestamp(3) AS ins_ts,
	null::varchar (50) AS ins_func_id,
	null::numeric (9,0) AS upd_cntr,
	null::varchar (500) AS upd_usr_id,
	null::varchar (100) AS upd_usr_nm,
	null::timestamp(3) AS upd_ts,
	null::varchar (50) AS upd_func_id,
	null::varchar (50) AS upd_srv_req_no
;;


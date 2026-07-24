DECLARE
/************************************************************************/
/* SYNOPSIS :								*/
/*	改訂履歴テーブルから登録担当者登録用トリガを削除します。。	*/
/************************************************************************/
	CURSOR CUR_SQL IS
		SELECT
			tbl.TABLE_NAME,
			tbl.TABLE_NAME  || '_TR_U' TRG_NAME,
			'DROP TRIGGER ' || tbl.TABLE_NAME || '_TR_U' DROP_TRG_SQL
		FROM (
			SELECT t.TABLE_NAME
			FROM USER_TABLES t
			WHERE 0=0
			AND t.TABLE_NAME IN ('MST_SLO_P_ALL'
								,'MST_SLO_D_P_ALL'
								,'MST_SLO_PRMS_P_ALL'
								,'MST_ITM_MFG_INST_P_ALL'
								,'MST_MFG_INST_P_ALL'
								,'MST_OPER_INST_P_ALL'
								,'MST_YIELD_SCHD_P_ALL'
								,'MST_INPT_SCHD_P_ALL'
								,'MST_WK_SCHD_P_ALL'
								,'MST_PO_P_ALL'
								,'MST_PO_D_P_ALL'
								,'MST_PURC_RET_ACT_P_ALL'
								,'MST_PURC_RET_ACT_D_P_ALL'
								,'MST_PURC_RET_ACT_IO_P_ALL'
								,'MST_ACXFR_ACT_P_ALL'
								,'MST_ACXFR_ACT_D_P_ALL'
								,'MST_SHIP_ALLOC_STS_P_ALL'
								,'MST_SHIP_INST_P_ALL'
								,'MST_SHIP_INST_D_P_ALL'
								,'MST_SHIP_ACT_P_ALL'
								,'MST_SHIP_ACT_D_P_ALL')
			AND EXISTS (SELECT 'X' FROM USER_TRIGGERS u WHERE t.TABLE_NAME || '_TR_U' = u.trigger_name)
			ORDER BY t.TABLE_NAME
			) tbl
		WHERE 0=0
	;

BEGIN
	FOR x IN CUR_SQL LOOP
		DBMS_OUTPUT.PUT_LINE(x.TABLE_NAME || ' DROP TRIGGER(' || x.TRG_NAME || ')' ) ;
		DBMS_UTILITY.EXEC_DDL_STATEMENT(x.DROP_TRG_SQL) ;
		DBMS_OUTPUT.PUT_LINE(x.TABLE_NAME || ' SUCCEED DROP TRIGGER(' || x.TRG_NAME || ')') ;
	END LOOP ;

EXCEPTION
WHEN OTHERS THEN
	DBMS_OUTPUT.PUT_LINE('ERROR !!'||SQLCODE) ;
	DBMS_OUTPUT.PUT_LINE(SQLERRM) ;
END ;
/

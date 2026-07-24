WHENEVER SQLERROR CONTINUE

conn &1/&2@&3

@.\FCT_MSG_INS_CORE_FC_FW.sql
@.\FCT_MSG_INS_FS_FW.sql
@.\FCM_MENU_INS_CORE.sql
@.\FCM_CONST_NM_INS_FS_FW.sql
@.\make3.sql
@.\makeHistoryTrigg.sql
@.\makeExctrlTrigg_FC.sql
@.\makeExctrlUpdTrigg_FC.sql

EXIT
/


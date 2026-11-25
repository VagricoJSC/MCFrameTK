\set ON_ERROR_STOP on
\echo 'Starting PostgreSQL migration script...'

\encoding UTF8

\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAM_CNTRY_SIGN.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAM_CNTRY_SIGN_@S.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAM_CNTRY_SIGN_@U.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAM_CNTRY_SIGN_ALL.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAW_CNTRY_SIGN_KEY.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/HST_TAB/MAM_CNTRY_SIGN_ALL_R.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/HST_TR/MAM_CNTRY_SIGN_ALL_TR_R.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/U_TR/MAM_CNTRY_SIGN_ALL_TR_U.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/CHECK/MAM_CNTRY_SIGN_ALL_CK01.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/COMMENT/MAM_CNTRY_SIGN_ALL_comment.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/COMMENT/MAM_CNTRY_SIGN_comment.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/CO_VT/MAM_CNTRY_SIGN_ALL_TR_K.sql

\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAM_MRKT_ALL.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAM_MRKT.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAM_MRKT_@S.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAM_MRKT_@U.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAW_MRKT_KEY.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/CHECK/MAM_MRKT_ALL_CK01.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/HST_TAB/MAM_MRKT_ALL_R.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/HST_TR/MAM_MRKT_ALL_TR_R.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/CO_VT/MAM_MRKT_ALL_TR_K.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/U_TR/MAM_MRKT_ALL_TR_U.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/COMMENT/MAM_MRKT_ALL_comment.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/COMMENT/MAM_MRKT_comment.sql

\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAM_SHIPYARD_ALL.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAM_SHIPYARD.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAM_SHIPYARD_@S.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAM_SHIPYARD_@U.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/OBJECT/MAW_SHIPYARD_KEY.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/HST_TAB/MAM_SHIPYARD_ALL_R.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/HST_TR/MAM_SHIPYARD_ALL_TR_R.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/CHECK/MAM_SHIPYARD_ALL_CK01.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/COMMENT/MAM_SHIPYARD_ALL_comment.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/COMMENT/MAM_SHIPYARD_comment.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/CO_VT/MAM_SHIPYARD_ALL_TR_K.sql
\i development/MA/tools/database/MABS/postgresql_sqlfile/U_TR/MAM_SHIPYARD_ALL_TR_U.sql


COMMIT;
\echo 'PostgreSQL migration script completed successfully.'

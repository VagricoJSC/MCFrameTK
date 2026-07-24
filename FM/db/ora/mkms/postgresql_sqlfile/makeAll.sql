\encoding UTF-8

\i ./make1MS.sql

\i ./make1MS-s.sql

\i ./make2MS.sql

\i ./make3MS.sql

\i ./makeComment_MS.sql

\i ./makeHistoryTab_MS.sql

\i ./makeHistoryTrigger_MS.sql

\i ./makeExctrlTrigg_MS.sql

\i ./makeLayout_ms.sql

\i ./makeLayout_ms_en_US.sql

delete from FCT_DBVERSION where PRODUCT_ID = 'MS';

insert into FCT_DBVERSION values ('MS','mcframe 7 SCM','MS','7.0.3', 50);

\i ./make5MS_MENU.sql

\i ./make5MS_MSG.sql

\i ./make5MS_CONST.sql

\i ./make5MS.sql

\i ./makeAll_PJ.sql


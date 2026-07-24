\encoding UTF-8

\i ./make1MA.sql

\i ./make1MA-s.sql

\i ./make2MA.sql

\i ./make3MA.sql

\i ./makeComment_MA.sql

\i ./makeHistoryTab_MA.sql

\i ./makeHistoryTrigger_MA.sql

\i ./makeExctrlTrigg_MA.sql

\i ./makeLayout_ma.sql

\i ./makeLayout_ma_en_US.sql

delete from FCT_DBVERSION where PRODUCT_ID = 'MA';

insert into FCT_DBVERSION values ('MA','mcframe 7 Master management','MA','7.0.3', 20);

\i ./make5MA_MSG.sql

\i ./make5MA_CONST.sql

\i ./makeAll_PJ.sql


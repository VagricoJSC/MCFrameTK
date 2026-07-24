\encoding UTF-8

\i ./make1MG.sql

\i ./make1MG-s.sql

\i ./make2MG.sql

\i ./make3MG.sql

\i ./makeComment_MG.sql

\i ./makeHistoryTab_MG.sql

\i ./makeHistoryTrigger_MG.sql

\i ./makeExctrlTrigg_MG.sql

\i ./makeLayout_mg.sql

\i ./makeLayout_mg_en_US.sql

delete from FCT_DBVERSION where PRODUCT_ID = 'MG';

insert into FCT_DBVERSION values ('MG','mcframe 7 PCM','MG','7.0.3', 40);

\i ./make5MG_MENU.sql

\i ./make5MG_MSG.sql

\i ./make5MG_CONST.sql

\i ./make5MG.sql

\i ./makeAll_PJ.sql


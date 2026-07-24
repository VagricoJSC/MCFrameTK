\encoding UTF-8

\i ./make1PF.sql

\i ./make1PF-s.sql

\i ./make2PF.sql

\i ./make3PF.sql

\i ./makeComment_PF.sql

\i ./makeHistoryTab_PF.sql

\i ./makeHistoryTrigger_PF.sql

\i ./makeExctrlTrigg_PF.sql

\i ./makeLayout_pf.sql

\i ./makeLayout_pf_en_US.sql

delete from FCT_DBVERSION where PRODUCT_ID = 'PF';

insert into FCT_DBVERSION values ('PF','mcframe 7 ESB adapter','PF','7.0.3', 70);

\i ./make5PF_MENU.sql

\i ./make5PF_MSG.sql

\i ./make5PF.sql

\i ./makeAll_PJ.sql


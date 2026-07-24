SET DEFINE OFF
SET ESCCHAR @

@".\make1MS.sql"

@".\make1MS-s.sql"

@".\make2MS.sql"

@".\make3MS.sql"

@".\makeComment_MS.sql"

@".\makeHistoryTab_MS.sql"

@".\makeHistoryTrigger_MS.sql"

@".\makeExctrlTrigg_MS.sql"

@".\makeLayout_ms.sql"

@".\makeLayout_ms_en_US.sql"

delete from FCT_DBVERSION where PRODUCT_ID = 'MS';

insert into FCT_DBVERSION values ('MS','mcframe 7 SCM','MS','7.0.3', 50);

@".\make5MS_MENU.sql"

@".\make5MS_MSG.sql"

@".\make5MS_CONST.sql"

@".\make5MS.sql"

@".\makeAll_PJ.sql"

SET DEFINE ON

SET DEFINE OFF
SET ESCCHAR @

@".\make1MG.sql"

@".\make1MG-s.sql"

@".\make2MG.sql"

@".\make3MG.sql"

@".\makeComment_MG.sql"

@".\makeHistoryTab_MG.sql"

@".\makeHistoryTrigger_MG.sql"

@".\makeExctrlTrigg_MG.sql"

@".\makeLayout_mg.sql"

@".\makeLayout_mg_en_US.sql"

delete from FCT_DBVERSION where PRODUCT_ID = 'MG';

insert into FCT_DBVERSION values ('MG','mcframe 7 PCM','MG','7.0.3', 40);

@".\make5MG_MENU.sql"

@".\make5MG_MSG.sql"

@".\make5MG_CONST.sql"

@".\make5MG.sql"

@".\makeAll_PJ.sql"

SET DEFINE ON

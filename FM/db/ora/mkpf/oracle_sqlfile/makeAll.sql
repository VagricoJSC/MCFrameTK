SET DEFINE OFF
SET ESCCHAR @

@".\make1PF.sql"

@".\make1PF-s.sql"

@".\make2PF.sql"

@".\make3PF.sql"

@".\makeComment_PF.sql"

@".\makeHistoryTab_PF.sql"

@".\makeHistoryTrigger_PF.sql"

@".\makeExctrlTrigg_PF.sql"

@".\makeLayout_pf.sql"

@".\makeLayout_pf_en_US.sql"

delete from FCT_DBVERSION where PRODUCT_ID = 'PF';

insert into FCT_DBVERSION values ('PF','mcframe 7 ESB adapter','PF','7.0.3', 70);

@".\make5PF_MENU.sql"

@".\make5PF_MSG.sql"

@".\make5PF.sql"

@".\makeAll_PJ.sql"

SET DEFINE ON

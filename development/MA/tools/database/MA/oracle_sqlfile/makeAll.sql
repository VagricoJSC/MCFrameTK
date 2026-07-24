SET DEFINE OFF
SET ESCCHAR @

@".\make1MA.sql"

@".\make1MA-s.sql"

@".\make2MA.sql"

@".\make3MA.sql"

@".\makeComment_MA.sql"

@".\makeHistoryTab_MA.sql"

@".\makeHistoryTrigger_MA.sql"

@".\makeExctrlTrigg_MA.sql"

@".\makeLayout_ma.sql"

@".\makeLayout_ma_en_US.sql"

delete from FCT_DBVERSION where PRODUCT_ID = 'MA';

insert into FCT_DBVERSION values ('MA','mcframe 7 Master management','MA','7.0.3', 20);

@".\make5MA_MSG.sql"

@".\make5MA_CONST.sql"

@".\makeAll_PJ.sql"

SET DEFINE ON

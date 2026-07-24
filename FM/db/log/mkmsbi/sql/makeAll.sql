SET DEFINE OFF
SET ESCCHAR @

@".\make1MSBI.sql"

@".\make1MSBI-s.sql"

@".\make2MSBI.sql"

@".\make3MSBI.sql"

@".\makeComment_MSBI.sql"

@".\makeHistoryTab_MSBI.sql"

@".\makeHistoryTrigger_MSBI.sql"

@".\makeExctrlTrigg_MSBI.sql"

@".\makeAll_PJ.sql"

SET DEFINE ON
